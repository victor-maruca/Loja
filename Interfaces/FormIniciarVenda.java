package Interfaces;

import Codigo.Utilitarios;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormIniciarVenda extends javax.swing.JFrame {

    Utilitarios utili = new Utilitarios();
    
    
    public FormIniciarVenda() {
        initComponents();
        txtCPF.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        txtCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVendedor = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iniciar nova venda?");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtCPF.setFont(new java.awt.Font("Arial", 1, 19)); // NOI18N
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        jPanel1.add(txtCPF);
        txtCPF.setBounds(60, 90, 311, 38);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Iniciar Venda");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 150, 100, 30);

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/General Orange Rectangle.png"))); // NOI18N
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar);
        btnIniciar.setBounds(100, 150, 99, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 70, 28, 15);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Outro vendedor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 150, 120, 30);

        btnVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/General Orange Rectangle.png"))); // NOI18N
        btnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnVendedor);
        btnVendedor.setBounds(230, 150, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(448, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        txtCPF.setText(utili.formataCPF(txtCPF.getText()));
        
        if(!utili.isCPF(txtCPF.getText()) && !txtCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "CPF inválido!");
            txtCPF.requestFocus();
            txtCPF.selectAll();
            return;
        }
        
        if(escreveCPF()){
           this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
           dispose();
        }
    }//GEN-LAST:event_txtCPFActionPerformed

    private void btnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorActionPerformed
        txtCPF.setText(utili.formataCPF(txtCPF.getText()));
        
        if(!utili.isCPF(txtCPF.getText()) && !txtCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "CPF inválido!");
            txtCPF.requestFocus();
            txtCPF.selectAll();
        }else{
            FormIndicarVendedor tela = new FormIndicarVendedor(txtCPF.getText());
            tela.setVisible(true);
            
            tela.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e)
                {
                    fechar();
                    e.getWindow().dispose();
                }
            });
            
        }
        
    }//GEN-LAST:event_btnVendedorActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        txtCPFActionPerformed(evt);
    }//GEN-LAST:event_btnIniciarActionPerformed

    public boolean escreveCPF(){
        ArrayList<String> lines = new ArrayList();
        lines.add(txtCPF.getText());
        lines.add("-");
        
        Path file = Paths.get("src/files/venda.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao escrever CPF na nota.");
            return false;
        }
    }
    
    public void fechar(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        dispose();
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
            java.util.logging.Logger.getLogger(FormIniciarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIniciarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIniciarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIniciarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormIniciarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVendedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtCPF;
    // End of variables declaration//GEN-END:variables
}
