package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConnection.DBCon;

public class DaoUsuario {
    
    DBCon conex = new DBCon();
    
    public void cadastrar(BeansUsuario mod){
        conex.conexao();
        PreparedStatement pst;
        try {
            pst = conex.con.prepareStatement("INSERT INTO usuarios (username, senha, permissao, nome) VALUES (?,?,?,?)");
            pst.setString(1, mod.getUsername());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getPermissao());
            pst.setString(4, mod.getNome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário.\nErro: "+ex);
        }
        conex.desconectar();
    }
    
    public boolean buscar(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("SELECT * FROM usuarios WHERE username ='"+mod.getUsername()+"'");
        try {
            if(conex.rs.first()){
                mod.setNome(conex.rs.getString("nome"));
                mod.setUsername(conex.rs.getString("username"));
                mod.setSenha(conex.rs.getString("senha"));
                mod.setPermissao(conex.rs.getString("permissao"));
                conex.desconectar();
                return true;
            }else{
                conex.desconectar();
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro buscar buscar usuario.\nErro: "+ex);
            conex.desconectar();
            return false;
        }
        
    }
}
