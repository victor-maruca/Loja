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
import javafx.scene.input.KeyCode;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansProduto;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;

public class FormBuscarProduto extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    String result = "";
    String usuario = "";
    int ID;
    
    public FormBuscarProduto(int id) {
        initComponents();
        preencherTabela("SELECT * FROM produtos");
        jTableProdutos.setRowSelectionInterval(0, 0);
        ID=id;
        KeyBindings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        txtProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableProdutos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        txtProduto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtProduto.setForeground(new java.awt.Color(52, 52, 52));
        txtProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProdutoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(txtProduto))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(514, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyTyped
        
    }//GEN-LAST:event_txtProdutoKeyTyped

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        txtProduto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() != KeyEvent.VK_UP && e.getKeyCode() != KeyEvent.VK_DOWN) {
                    preencherTabela("SELECT * FROM produtos WHERE nome like '"+txtProduto.getText().toUpperCase()+"%'");
                }
            }
        });
        
        if(jTableProdutos.getSelectedRow()!=0 && jTableProdutos.getRowCount()!=0){
            txtProduto.setEditable(false);
            jPanel1.requestFocus();
        }
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        String prod = String.valueOf(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
        
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
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"Nome", "Preço"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getString("nome"), "R$ "+String.format("%.2f", conex.rs.getDouble("precoVenda")).replace('.',',')});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableProdutos.setModel(modelo);
        jTableProdutos.setRowHeight(23);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(380);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconectar();
        
        if(jTableProdutos.getRowCount() != 0){
            jTableProdutos.setRowSelectionInterval(0, 0);
        }
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
                txtProdutoActionPerformed(e);
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
            if(jTableProdutos.getSelectedRow() != 0){
                jTableProdutos.setRowSelectionInterval(jTableProdutos.getSelectedRow()-1, jTableProdutos.getSelectedRow()-1);
            }
        }else{
            if(jTableProdutos.getSelectedRow() != jTableProdutos.getRowCount()-1){
                jTableProdutos.setRowSelectionInterval(jTableProdutos.getSelectedRow()+1, jTableProdutos.getSelectedRow()+1);
            }
        }
        txtProduto.setText(""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
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
            java.util.logging.Logger.getLogger(FormBuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id=0;
                new FormBuscarProduto(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
