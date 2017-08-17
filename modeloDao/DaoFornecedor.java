package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansFornecedor;
import modeloConnection.DBCon;

public class DaoFornecedor {
    
    DBCon conex = new DBCon();
    
    public int cadastrar(BeansFornecedor mod){
        conex.conexao();
        PreparedStatement pst;
        try{
            pst = conex.con.prepareStatement("INSERT INTO fornecedores (nome, endereco, cnpj, cidade, uf, telefone1, telefone2) VALUES (?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEnd());
            pst.setString(3, mod.getCnpj());
            pst.setString(4, mod.getCidade());
            pst.setString(5, mod.getUf());
            pst.setString(6, mod.getFone1());
            pst.setString(7, mod.getFone2());
            pst.execute(); 
            conex.desconectar();
            return 1;       //SUCESSO
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar fornecedor!\nErro: "+e);
            conex.desconectar();
            return 0;       //FALHA
        } 
    }
    
     public boolean fornecedorJaCadastrado(String nome){
        conex.conexao();
        conex.executaSql("SELECT * FROM fornecedores WHERE nome = '"+nome+"'");
        try {
            if(conex.rs.first()){
                conex.desconectar();
                return true;
            }else{
                conex.desconectar();
                return false;
            }
        } catch (SQLException ex) {
            conex.desconectar();
            return false;
        }
    }
    
}
