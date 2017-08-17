package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;

public class FormBuscaTabela extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    
    String table;
    
    public FormBuscaTabela(String tabela) {
        initComponents();
        table = tabela;
        
        preencherTabela("SELECT * FROM "+table);
        KeyBindings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtBusca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtBusca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaKeyReleased(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(459, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyReleased
        txtBusca.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() != KeyEvent.VK_UP && e.getKeyCode() != KeyEvent.VK_DOWN) {
                    preencherTabela("SELECT * FROM "+table+" WHERE nome like '"+txtBusca.getText().toUpperCase()+"%'");
                }
            }
        });
        
        if(jTable.getSelectedRow()!=0 && jTable.getRowCount()!=0){
            txtBusca.setEditable(false);
            jPanel1.requestFocus();
        }
    }//GEN-LAST:event_txtBuscaKeyReleased

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        String prod = String.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0));
        
        ArrayList<String> lines = new ArrayList();
        lines.add(prod);
        
        Path file = Paths.get("src/files/busca.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao escrever dados de busca.\n"+ex);
        }
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        dispose();
    }//GEN-LAST:event_txtBuscaActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"Nome"}; 
        conex.conexao();
        conex.executaSql(Sql);
        dados.add(new Object [] {"TODOS"});
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getString("nome")});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTable.setModel(modelo);
        jTable.setRowHeight(23);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(425);
        jTable.getColumnModel().getColumn(0).setResizable(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.setAutoResizeMode(jTable.AUTO_RESIZE_OFF);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        jTable.setRowSelectionInterval(0, 0);
        
        conex.desconectar();
    }
    
    public void KeyBindings(){
        
        Action downKey = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arrow("D");
            }
        };
        
        Action upKey = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arrow("U");
            }
        };
        
        Action enter = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtBuscaActionPerformed(e);
            }
        };
        
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("UP"),"up");
        jPanel1.getActionMap().put("up", upKey);
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"),"down");
        jPanel1.getActionMap().put("down", downKey);
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"),"enter");
        jPanel1.getActionMap().put("enter", enter);
    }
    
    public void arrow(String ar){
        if(ar.equals("U")){
            if(jTable.getSelectedRow() != 0){
                jTable.setRowSelectionInterval(jTable.getSelectedRow()-1, jTable.getSelectedRow()-1);
            }
        }else{
            if(jTable.getSelectedRow() != jTable.getRowCount()-1){
                jTable.setRowSelectionInterval(jTable.getSelectedRow()+1, jTable.getSelectedRow()+1);
            }
        }
        txtBusca.setText(""+jTable.getValueAt(jTable.getSelectedRow(), 0));
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
            java.util.logging.Logger.getLogger(FormBuscaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String tabela="";
                new FormBuscaTabela(tabela).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
