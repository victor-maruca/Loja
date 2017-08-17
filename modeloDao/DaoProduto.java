package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansProduto;
import modeloConnection.DBCon;

public class DaoProduto {
    DBCon conex = new DBCon();
    
    public void cadastrar(BeansProduto mod){
        conex.conexao();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareStatement("insert into produtos (codigo, nome, unidade, quantidade, precoCusto, precoVenda, fornecedor) values (?,?,?,?,?,?,?)");
            pst.setString(1, mod.getCodigo());
            pst.setString(2, mod.getNome());
            pst.setString(3, mod.getUnidade());
            pst.setInt(4, mod.getQuantidade());
            pst.setDouble(5, mod.getCusto());
            pst.setDouble(6, mod.getVenda());
            pst.setInt(7, mod.getFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto.\n"+ex);
        }
        conex.desconectar();
    }
    
     public BeansProduto buscaProduto(BeansProduto mod){
        conex.conexao();
        conex.executaSql("select *from produtos where codigo like '%"+mod.getBuscaPorCodigo()+"%'OR nome like '"+mod.getBuscaPorNome()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getString("codigo"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setId(conex.rs.getInt("id"));
            mod.setFornecedor(conex.rs.getInt("fornecedor"));
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setUnidade(conex.rs.getString("unidade"));
            mod.setCusto(conex.rs.getDouble("precoCusto"));
            mod.setVenda(conex.rs.getDouble("precoVenda"));
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro no buscaProduto!\nErro: "+ex);
        }
        
        conex.desconectar();
        return mod;
    }
}
