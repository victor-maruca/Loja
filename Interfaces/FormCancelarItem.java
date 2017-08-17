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

public class FormCancelarItem extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    
    public FormCancelarItem(int num) {
        initComponents();
        preencherTabela("SELECT * FROM vendas WHERE numero = "+num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancelar item");

        jTableItens.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTableItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableItens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(507, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensMouseClicked
        String id = ""+jTableItens.getValueAt(jTableItens.getSelectedRow(), 0);
        String qtd = ""+jTableItens.getValueAt(jTableItens.getSelectedRow(), 2);
        String produto = ""+jTableItens.getValueAt(jTableItens.getSelectedRow(), 1);
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cancelar a venda de "+qtd+" "+produto+" ?")==JOptionPane.YES_OPTION){
            escreveDados(id);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            dispose();
        } 
    }//GEN-LAST:event_jTableItensMouseClicked

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Produto", "Qtd.", "Total"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("produto"), conex.rs.getInt("quantidade"), conex.rs.getString("total")});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableItens.setModel(modelo);
        jTableItens.setRowHeight(21);
        jTableItens.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableItens.getColumnModel().getColumn(0).setResizable(false);
        jTableItens.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableItens.getColumnModel().getColumn(1).setResizable(false);
        jTableItens.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTableItens.getColumnModel().getColumn(2).setResizable(false);
         jTableItens.getColumnModel().getColumn(3).setPreferredWidth(85);
        jTableItens.getColumnModel().getColumn(3).setResizable(false);
        jTableItens.getTableHeader().setReorderingAllowed(false);
        jTableItens.setAutoResizeMode(jTableItens.AUTO_RESIZE_OFF);
        jTableItens.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconectar();
    }
    
    public boolean escreveDados(String str){
        ArrayList<String> lines = new ArrayList();
        lines.add(str);
        
        Path file = Paths.get("src/files/temp.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
            return true;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao escrever dados de cancelamento do item!");
            return false;
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
            java.util.logging.Logger.getLogger(FormCancelarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCancelarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCancelarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCancelarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int num=0;
                new FormCancelarItem(num).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableItens;
    // End of variables declaration//GEN-END:variables
}
