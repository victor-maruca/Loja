package modeloConnection;

import java.sql.*;

import javax.swing.JOptionPane;

public class DBCon {
  
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost/loja";
    private String usuario = "root";
    private String senha = "";
    
    public void conexao() {
        try {
            System.setProperty("jdbc.Driver", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n"+ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no executaSql!\n"+ex);
        }
       
    }
    
    public void executaUpdate(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            int retorno = stm.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no executaUpdate!\n"+ex);
        }
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao encerrar conexao com o BD");
        }
    }
    
}
