package Interfaces;

import Codigo.Utilitarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConnection.DBCon;

public class TurnoInterface extends javax.swing.JFrame {

    Utilitarios utili = new Utilitarios();
    DBCon conex = new DBCon();
    
    int ID;
    String numCaixa;
    String funcID;
    
    public TurnoInterface(int id) {
        initComponents();
        leCaixa();
        txtTroco.requestFocus();
        txtTroco.setText("R$ 0,00");
        txtTroco.selectAll();
        ID=id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboTurno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rede99 logo.png"))); // NOI18N

        comboTurno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        comboTurno.setForeground(new java.awt.Color(52, 52, 52));
        comboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã\t", "Tarde", "Noite" }));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 52, 52));
        jLabel2.setText("Turno: ");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 52, 52));
        jLabel3.setText("Troco Inicial: ");

        txtTroco.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtTroco.setForeground(new java.awt.Color(52, 52, 52));
        txtTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrocoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnConfirmar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        jPanel2.add(btnConfirmar);
        btnConfirmar.setBounds(290, 10, 80, 30);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(52, 52, 52));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/General Orange Rectangle.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(280, 10, 100, 34);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTroco)
                            .addComponent(comboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(comboTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(656, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtTrocoActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrocoActionPerformed
        txtTroco.setText(utili.formataPreco(txtTroco.getText().replace(',', '.')));
        
        if(!utili.isPreco(txtTroco.getText())){
            JOptionPane.showMessageDialog(rootPane, "Valor de troco inicial inválido!");
            txtTroco.requestFocus();
            txtTroco.selectAll();
            return;
        }

        String operador;
        
        conex.conexao();
        conex.executaSql("SELECT * FROM usuarios WHERE id = "+ID);
        try{
            if(conex.rs.first()){
               funcID = conex.rs.getString("funcID");
            }else{
                JOptionPane.showMessageDialog(rootPane, "1-Problema ao autenticar usuario no banco de dados.");
                return;
            }
            
            conex.executaSql("SELECT * FROM funcionarios WHERE id = "+funcID);
            if(conex.rs.first()){
                operador = conex.rs.getString("nome");
            }else{
                JOptionPane.showMessageDialog(rootPane, "2-Problema ao autenticar usuario no banco de dados.");
                return;
            }
            
        }catch(SQLException ex){
            System.out.println(ID);
            JOptionPane.showMessageDialog(rootPane, "Problema ao tentar se comunicar com o banco de dados.");
            return;
        }
        conex.desconectar();
        
        String turno = String.valueOf(comboTurno.getSelectedItem());
        String troco = txtTroco.getText();
        
        String texto = "Deseja confirmar a abertura do seguinte caixa?\n"
                     + "Operador: "+operador+"\n"
                     + "Turno: "+turno+"\n"
                     + "Troco inicial: "+troco+"\n";
        
        if(JOptionPane.showConfirmDialog(rootPane, texto) == JOptionPane.YES_OPTION){
            if(atualizaBanco()){
                if(escreveDados()){
                    Main2 tela = new Main2(ID);
                    tela.setVisible(true);
                    dispose();
                }else{
                    conex.conexao();
                    conex.executaUpdate("DELETE * FROM logs WHERE status = "+numCaixa);
                    conex.desconectar();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao enviar dados de abertura para o banco de dados!");
            }
        }
    }//GEN-LAST:event_txtTrocoActionPerformed

    public boolean escreveDados(){
        int idCaixa;
        conex.conexao();
        conex.executaSql("SELECT * FROM idcaixa");
        try {
            conex.rs.first();
            idCaixa = conex.rs.getInt("id")+1;
            conex.executaUpdate("TRUNCATE TABLE idcaixa");
            conex.executaUpdate("INSERT INTO idcaixa (id) VALUES ("+idCaixa+")");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar com servidor!");
            return false;
        }
        
        
        ArrayList<String> lines = new ArrayList();
        lines.add(""+ID);
        lines.add(""+comboTurno.getSelectedItem());
        lines.add(txtTroco.getText());
        lines.add(""+idCaixa);
        
        Path file = Paths.get("src/files/atual.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao escrever dados de abertura do caixa.");
            return false;
        }
    }
    
    public boolean atualizaBanco(){
        String usuario;
        conex.conexao();
        conex.executaSql("SELECT * FROM usuarios WHERE id = "+ID);
        try{
            if(conex.rs.first()){
                usuario = conex.rs.getString("username");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao buscar usuário no banco de dados.");
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar usuário no banco de dados.\n"+e);
            return false;
        }
        
        conex.executaUpdate("INSERT INTO logs (usuario, status) VALUES ('"+usuario+"',"+numCaixa+")");
        conex.desconectar();

        return true;
    }
    
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
            java.util.logging.Logger.getLogger(TurnoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TurnoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TurnoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TurnoInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id=0;
                new TurnoInterface(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConfirmar;
    private javax.swing.JComboBox<String> comboTurno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables
}
