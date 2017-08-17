package Codigo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloConnection.DBCon;

public class RelatorioFechamento {
    
    DBCon conex = new DBCon();
    Utilitarios utili = new Utilitarios();
     
    String caixaNum= "";
    int caixaID;
    ArrayList sellNums = new ArrayList();
    
    public void enviaDados(){
        conex.conexao();
        truncate();
        enviaStatic();
        enviaEntradas();
        enviaSaidas();
        conex.desconectar();
    }
    
    private void truncate(){
        conex.executaUpdate("TRUNCATE TABLE fechamentostatic");
        conex.executaUpdate("TRUNCATE TABLE fechamentoentradas");
        conex.executaUpdate("TRUNCATE TABLE fechamentosaidas");
    }
    
    private void enviaStatic(){
        String data="", operador="", turno="", abertura="", totalEntrada="", totalSaida="";
        String total="";
        int operadorID;
        
        try {
            FileReader arq = new FileReader("src/files/caixa.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            caixaNum = lerArq.readLine();       //caixaNum OK
            
            if(caixaNum.isEmpty()){
                JOptionPane.showMessageDialog(null, "Erro ao ler arquivo caixa.txt");
                return;
            }
            
            arq = new FileReader("src/files/atual.txt");
            lerArq = new BufferedReader(arq);
            
            operadorID = Integer.parseInt(lerArq.readLine());
            turno = lerArq.readLine();                  //TURNO OK
            lerArq.readLine();
            caixaID = Integer.parseInt(lerArq.readLine());
            
            
            
            conex.executaSql("SELECT * FROM usuarios WHERE id ="+operadorID);
            conex.rs.first();
            operadorID = conex.rs.getInt("funcID");         
            conex.executaSql("SELECT * FROM funcionarios WHERE id ="+operadorID);
            conex.rs.first();
            operador = conex.rs.getString("nome");                       //OPERADOR OK
            
            
            conex.executaSql("SELECT * FROM caixas WHERE id = "+caixaID);
            conex.rs.first();
            abertura = conex.rs.getString("abertura").substring(11,19);   //ABERTURA OK
            data = conex.rs.getString("abertura").substring(0, 10);     
            data = utili.sqlToDate(data);                                  //DATA OK
            
            //CALCULO DOS VALORES DO CAIXA
            double totEntrada=0, totSaida=0, tot=0;
            conex.executaSql("SELECT * FROM vendas WHERE caixa = "+caixaID);
            if(conex.rs.first()){
                do{
                    if(!sellNums.contains(conex.rs.getInt("sellNum"))){
                        sellNums.add(conex.rs.getInt("sellNum"));
                    }
                }while(conex.rs.next());
            }
            
            for(int i=0 ; i<sellNums.size() ; i++){
                conex.executaSql("SELECT * FROM pgto WHERE sellNum = "+sellNums.get(i));
                conex.rs.first();
                totEntrada += conex.rs.getDouble("dinheiro")+
                              conex.rs.getDouble("credito")+
                              conex.rs.getDouble("debito")+
                              conex.rs.getDouble("cheque")+
                              conex.rs.getDouble("nota");
            }                                                          
            totalEntrada = String.format("%.2f", totEntrada).replace(',','.');   //ENTRADAS OK
            
            conex.executaSql("SELECT * FROM despesas WHERE caixa = "+caixaNum);
            if(conex.rs.first()){
                do{
                    totSaida += conex.rs.getDouble("valor");
                }while(conex.rs.next());
            }
            totalSaida = String.format("%.2f", totSaida).replace(',','.');     //SAÍDAS OK
            
            tot = totEntrada - totSaida;
            total = String.format("%.2f", tot).replace(',','.');               //TOTAL OK
            
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO fechamentostatic (caixaNum"
                    + ",data,operador,turno,abertura,totalEntrada,totalSaida,total) VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1, caixaNum);
            pst.setString(2, data);
            pst.setString(3, operador);
            pst.setString(4, turno);
            pst.setString(5, abertura);
            pst.setString(6, totalEntrada);
            pst.setString(7, totalSaida);
            pst.setString(8, total);
            pst.execute();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo caixa.txt ou atual.txt não encontrado!");
            return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Impossível acessar o arquivo caixa.txt ou atual.txt!");
            return;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Erro ao ler caixaID ou usuarioID em atual.txt");
            return;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com banco de dados!\n"+ex);
            return;
        }
    }
    
    private void enviaEntradas(){
        double dinheiro=0, credito=0, debito=0, cheque=0, nota=0;
        
        try{
            for(int i=0 ; i<sellNums.size() ; i++){
                conex.executaSql("SELECT * FROM pgto WHERE sellNum = "+sellNums.get(i));
                conex.rs.first();
                dinheiro += conex.rs.getDouble("dinheiro");
                credito += conex.rs.getDouble("credito");
                debito += conex.rs.getDouble("debito");
                cheque += conex.rs.getDouble("cheque");
                nota += conex.rs.getDouble("nota");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados!\n"+ex);
            return;
        }
        
        String din, cred, deb, cheq, not;
        din = String.format("%.2f", dinheiro);
        cred = String.format("%.2f", credito);
        deb = String.format("%.2f", debito);
        cheq = String.format("%.2f", cheque);
        not = String.format("%.2f", nota);
        
        try{
            PreparedStatement sql = conex.con.prepareStatement("INSERT INTO fechamentoentradas (dinheiro,"
                    + "credito, debito, cheque, nota) VALUES (?,?,?,?,?)");
            sql.setDouble(1, dinheiro);
            sql.setDouble(2, credito);
            sql.setDouble(3, debito);
            sql.setDouble(4, cheque);
            sql.setDouble(5, nota);
            sql.execute();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro do preparedStatemenr das entradas!\n"+ex);
            return;
        }
    }
    
    private void enviaSaidas(){
        ArrayList valores = new ArrayList();
        
        try{
            conex.executaSql("SELECT * FROM despesas WHERE caixa = "+caixaID);
            if(conex.rs.first()){
                do{
                    valores.add(new Object [] {conex.rs.getInt("tipo"), 
                                               String.format("%.2f", conex.rs.getDouble("valor")).replace(',', '.'),
                                               conex.rs.getInt("responsavel"),
                                               conex.rs.getString("descricao")}); 
                }while(conex.rs.next());
                
                Object [] aux;
                for(int i=0 ; i<valores.size() ; i++){
                    aux = (Object [])valores.get(i);
                    conex.executaSql("SELECT * FROM tiposdespesas WHERE id = "+aux[0]);
                    conex.rs.first();
                    aux[0] = conex.rs.getString("tipo");
                    valores.set(i, aux);
                    
                    aux = (Object [])valores.get(i);
                    conex.executaSql("SELECT * FROM funcionarios WHERE id = "+aux[2]);
                    conex.rs.first();
                    aux[2] = conex.rs.getString("nome");
                    valores.set(i, aux);
                }
                
                Object [] vet;
                String comando;
                PreparedStatement pst;
                for(int i=0 ; i<valores.size() ; i++){
                    vet = (Object []) valores.get(i);
                    comando = "INSERT INTO fechamentosaidas (tipo,valor,responsavel,descricao) VALUES "
                            +"(?,?,?,?)";
                    pst=conex.con.prepareStatement(comando);
                    pst.setString(1, ""+vet[0]);
                    pst.setDouble(2, Double.parseDouble(""+vet[1]));
                    pst.setString(3, ""+vet[2]);
                    pst.setString(4, ""+vet[3]);
                    pst.execute();
                }
            }else{
                PreparedStatement pst = conex.con.prepareStatement("INSERT INTO fechamentosaidas (tipo,"
                        + "valor,responsavel,descricao) VALUES (?,?,?,?)");
                pst.setString(1, "-");
                pst.setDouble(2, 0.00);
                pst.setString(3, "-");
                pst.setString(4, "NENHUMA DESPESA");
                pst.execute();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados!\n"+ex);
        }
    }
}

