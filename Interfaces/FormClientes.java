package Interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;

public class FormClientes extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    
    String previous;
    
    public FormClientes(int id) {
        initComponents();
        preencherTabela("SELECT * FROM clientes ORDER BY nome");
        try {
            conex.conexao();
            conex.executaSql("SELECT * FROM usuarios WHERE id = "+id);
            conex.rs.first();
            txtOperador.setText(conex.rs.getString("nome"));
            conex.desconectar();
        }catch(SQLException ex){}
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Operador: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno: ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 0, 70, 30);

        txtOperador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtOperador.setForeground(new java.awt.Color(52, 52, 52));
        jPanel1.add(txtOperador);
        txtOperador.setBounds(150, 0, 430, 30);

        txtTurno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(52, 52, 52));
        txtTurno.setText("Tarde");
        jPanel1.add(txtTurno);
        txtTurno.setBounds(680, 0, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/upperbar clientes.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 30);

        txtCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(52, 52, 52));
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });

        jTableClientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTableClientes.setForeground(new java.awt.Color(52, 52, 52));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo rede99 pequeno.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Novo Cliente.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCliente)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(607, 607, 607)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 753, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 579, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(769, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        
        //PREENCHEDOR DA TABELA
        preencherTabela("SELECT * FROM clientes WHERE nome like '"+txtCliente.getText().toUpperCase()+"%'");
        if(jTableClientes.getRowCount() != 0){
            jTableClientes.setRowSelectionInterval(0, 0);
        }
        
    }//GEN-LAST:event_txtClienteKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormCadastroClientes tela = new FormCadastroClientes();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("nome")});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableClientes.setModel(modelo);
        jTableClientes.setRowHeight(21);
        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(453);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id = 0;
                new FormClientes(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JLabel txtOperador;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
