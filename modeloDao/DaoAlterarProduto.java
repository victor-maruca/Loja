package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloConnection.DBCon;

public class DaoAlterarProduto {
    
    DBCon conex = new DBCon();
    
    public void alterar(int id, int col, String value){
        String coluna;
        switch(col){
            case 0:
                coluna = "codigo";
                break;
            case 1:
                coluna = "nome";
                break;
            case 2:
                coluna = "precoCusto";
                break;
            case 3:
                coluna = "precoVenda";
                break;
            case 4:
                coluna = "quantidade";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro ao alterar valor (id="+id+")!\ncol="+col);
                return;
        }
        String sql = "UPDATE produtos SET "+coluna+" = '"+value+"' WHERE produtos.id = "+id;
  
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement(sql);
            pst.execute();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao alterar produto!\n"+ex);
        }
        conex.desconectar();
    }
}
