package Interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import modeloConnection.DBCon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginInterface extends javax.swing.JFrame {
    DBCon conex = new DBCon();  
       
    String numCaixa="";
    String usuario="";
    int id;
    
    public LoginInterface() {
        initComponents();
        leCaixa();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saphira - Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 140, 60, 30);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(360, 140, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 180, 50, 30);

        txtSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(360, 180, 240, 30);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar);
        btnEntrar.setBounds(420, 230, 130, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saphira.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 20, 240, 280);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 360);

        setSize(new java.awt.Dimension(656, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM usuarios WHERE username='"+txtUsuario.getText()+"'");
            if(conex.rs.first()){
                if(conex.rs.getString("senha").equals(txtSenha.getText())){
                    usuario = txtUsuario.getText();
                    id = conex.rs.getInt("id");
                    testaLogin();
                }else{
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                    txtSenha.setText("");
                    txtSenha.requestFocus();
                }    
                conex.desconectar();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuário incorreto!");
                txtUsuario.setText("");
                txtUsuario.requestFocus();
                txtSenha.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
            dispose();
            conex.desconectar();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        btnEntrarActionPerformed(evt);
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void leCaixa(){
        try {
            FileReader arq = new FileReader("src/files/caixa.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            numCaixa = lerArq.readLine();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arquivo caixa.txt não encontrado!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Impossível acessar o arquivo caixa.txt!");
        }
    }
    
    private void testaLogin(){
        String usuarioLogado;
        
        conex.conexao();
        conex.executaSql("SELECT * FROM logs WHERE status = "+numCaixa);
        try{
            if(conex.rs.first() && !conex.rs.getString("usuario").equals(usuario)){
                usuarioLogado=conex.rs.getString("usuario");
                
                JOptionPane.showMessageDialog(rootPane, "O usuário '"+usuarioLogado+"' ainda não realizou o fechamento de caixa!");
            }else{
                conex.executaSql("SELECT * FROM logs WHERE usuario = '"+usuario+"'");
                if(conex.rs.first() && !String.valueOf(conex.rs.getInt("status")).equals(numCaixa)){
                    JOptionPane.showMessageDialog(rootPane, "O usuario '"+usuario+"' já está logado no caixa "+conex.rs.getInt("status")+"!");
                }else{
                    iniciaSistema();
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar se comunicar com o banco de dados.\n"+ex);
        }
        conex.desconectar();
        dispose();
    }
    
    public void iniciaSistema(){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM logs WHERE usuario = '"+usuario+"'");
            if(conex.rs.first()){
                Main2 main = new Main2(id);
                main.setVisible(true);
                dispose();
            }else{
                TurnoInterface tela = new TurnoInterface(id);
                tela.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problema ao autenticar usuario no banco de dados!\n"+ex);
        }
        conex.desconectar();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
