package Interfaces;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;

public class FormIndicarVendedor extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    String CPF;
    
    public FormIndicarVendedor(String cpf) {
        initComponents();
        preencherTabela("SELECT * FROM funcionarios ORDER BY id");
        CPF=cpf;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtVendedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtVendedor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtVendedor.setForeground(new java.awt.Color(52, 52, 52));
        txtVendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });
        txtVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVendedorKeyReleased(evt);
            }
        });

        jTableFuncionarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableFuncionarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVendedor)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        setSize(new java.awt.Dimension(514, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVendedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendedorKeyReleased
        preencherTabela("SELECT * FROM funcionarios WHERE nome LIKE '%"+txtVendedor.getText().toUpperCase()+"%'");
        if(jTableFuncionarios.getRowCount() != 0){
            jTableFuncionarios.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_txtVendedorKeyReleased

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        int funcionario=-1;
        conex.conexao();
        conex.executaSql("SELECT * FROM funcionarios WHERE nome LIKE '%"+txtVendedor.getText().toUpperCase()+"%'");
        try{
            conex.rs.first();
            funcionario = conex.rs.getInt("id");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar funcionário no servidor!");
        }
        conex.desconectar();
            if(escreveDados(""+funcionario)){
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                dispose();
            }
        
    }//GEN-LAST:event_txtVendedorActionPerformed

    public boolean escreveDados(String fun){
        ArrayList<String> lines = new ArrayList();
        lines.add(CPF);
        lines.add(fun);
        
        Path file = Paths.get("src/files/venda.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao escrever CPF e vendedor na nota.");
            return false;
        }
    }
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getInt("id"),  conex.rs.getString("nome")});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableFuncionarios.setModel(modelo);
        jTableFuncionarios.setRowHeight(23);
        jTableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(440);
        jTableFuncionarios.getColumnModel().getColumn(1).setResizable(false);
        jTableFuncionarios.getTableHeader().setReorderingAllowed(false);
        jTableFuncionarios.setAutoResizeMode(jTableFuncionarios.AUTO_RESIZE_OFF);
        jTableFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(FormIndicarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormIndicarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormIndicarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormIndicarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String cpf="Erro";
                new FormIndicarVendedor(cpf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
