package Interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;

public class FormFuncionarios extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    
    public FormFuncionarios(int id) {
        initComponents();
        preencherTabela("SELECT * FROM funcionarios ORDER BY nome");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        txtFuncionario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turno:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(580, 0, 80, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Operador: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 120, 30);
        jPanel2.add(txtOperador);
        txtOperador.setBounds(140, 0, 430, 30);
        jPanel2.add(txtTurno);
        txtTurno.setBounds(664, 0, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/upperbar clientes.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-6, 0, 760, 30);

        jTableFuncionarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jTableFuncionarios.setForeground(new java.awt.Color(52, 52, 52));
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

        txtFuncionario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtFuncionario.setForeground(new java.awt.Color(52, 52, 52));
        txtFuncionario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFuncionarioKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Novo Funcionario.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Vale.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFuncionario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        setSize(new java.awt.Dimension(769, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormCadastroFuncionario tela = new FormCadastroFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncionarioKeyReleased
        preencherTabela("SELECT * FROM funcionarios WHERE nome like '"+txtFuncionario.getText().toUpperCase()+"%'");
        if(jTableFuncionarios.getRowCount() != 0){
            jTableFuncionarios.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_txtFuncionarioKeyReleased

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome", "Cargo"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("nome"), conex.rs.getString("cargo")});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableFuncionarios.setModel(modelo);
        jTableFuncionarios.setRowHeight(21);
        jTableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(416);
        jTableFuncionarios.getColumnModel().getColumn(1).setResizable(false);
        jTableFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(176);
        jTableFuncionarios.getColumnModel().getColumn(2).setResizable(false);
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
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id = 0;
                new FormFuncionarios(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JLabel txtOperador;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
