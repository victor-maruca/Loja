package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansPgto;
import modeloBeans.BeansVenda;
import modeloConnection.DBCon;

public class DaoVenda {
    
    DBCon conex = new DBCon();
    
    public void inserir(BeansVenda mod){
        conex.conexao();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareStatement("INSERT INTO vendas (produtoID, quantidade, vendedor, caixa, hora, sellNum) VALUES"
                                         + "(?,?,?,?,?,?)");
            pst.setInt(1, mod.getProduto());
            pst.setInt(2, mod.getQuantidade());
            pst.setInt(3, mod.getVendedor());
            pst.setInt(4, mod.getCaixa());
            pst.setString(5, mod.getTime());
            pst.setInt(6, mod.getSellNum());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados da venda no servidor.\n"+ex);
        }
        conex.desconectar();
    }
    
    public void remover(int id){
        conex.conexao();
        PreparedStatement pst;
        try{
            pst=conex.con.prepareStatement("DELETE FROM vendas WHERE id = ?");
            pst.setInt(1, id);
            pst.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao remover item do banco de dados.");
        }
        conex.desconectar();
    }
    
     public void cancel(int num){
        conex.conexao();
        PreparedStatement pst;
        try{
            pst=conex.con.prepareStatement("DELETE FROM vendas WHERE numero = ?");
            pst.setInt(1, num);
            pst.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao remover venda do banco de dados.");
        }
        conex.desconectar();
    }
    
    public void finalizar(BeansPgto mod){
        conex.conexao();
        PreparedStatement pst;
        try{
            pst=conex.con.prepareStatement("INSERT INTO pgto (dinheiro, credito, debito, cheque, nota, troco, cpf, sellNum) VALUES (?,?,?,?,?,?,?,?)");
            pst.setDouble(1, mod.getDinheiro());
            pst.setDouble(2, mod.getCredito());
            pst.setDouble(3, mod.getDebito());
            pst.setDouble(4, mod.getCheque());
            pst.setDouble(5, mod.getNota());
            pst.setDouble(6, mod.getTroco());
            pst.setString(7, mod.getCpf());
            pst.setInt(8, mod.getSellNum());
            pst.execute();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados do pagamento no banco de dados!");
        }
        conex.desconectar();
    } 
}
