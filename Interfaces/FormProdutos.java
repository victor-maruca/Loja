package Interfaces;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;


public class FormProdutos extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    
    public FormProdutos(int id) {
        initComponents();
        preencherTabela("SELECT * FROM produtos ORDER BY NOME");
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
        txtProdutos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        btnNovoProduto = new javax.swing.JButton();
        btnCadastrarNota = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Operador: ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 130, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Turno: ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(580, 0, 80, 30);

        txtOperador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtOperador.setForeground(new java.awt.Color(32, 32, 32));
        jPanel2.add(txtOperador);
        txtOperador.setBounds(140, 0, 430, 30);
        jPanel2.add(txtTurno);
        txtTurno.setBounds(670, 0, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/upperbar clientes.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-6, 0, 760, 30);

        txtProdutos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtProdutos.setForeground(new java.awt.Color(52, 52, 52));
        txtProdutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutosKeyReleased(evt);
            }
        });

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

        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Novo Produto.png"))); // NOI18N
        btnNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        btnCadastrarNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Cadastrar Nota.png"))); // NOI18N
        btnCadastrarNota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarNotaActionPerformed(evt);
            }
        });

        btnAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtProdutos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        setSize(new java.awt.Dimension(769, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        FormCadastroProdutos tela = new FormCadastroProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnCadastrarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarNotaActionPerformed
        FormCadastroNotas tela = new FormCadastroNotas();
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarNotaActionPerformed

    private void txtProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutosKeyReleased
        preencherTabela("SELECT * FROM produtos WHERE nome like '"+txtProdutos.getText().toUpperCase()+"%'");
        if(jTableProdutos.getRowCount() != 0){
            jTableProdutos.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_txtProdutosKeyReleased

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        FormEstoque tela = new FormEstoque();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"ID", "Nome", "Preço", "Estoque"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getInt("id"), conex.rs.getString("nome"), "R$ "+String.format("%.2f", conex.rs.getDouble("precoVenda")).replace('.',','), conex.rs.getInt("quantidade")});
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        jTableProdutos.setModel(modelo);
        jTableProdutos.setRowHeight(23);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(394);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(85);
        jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id=0;
                new FormProdutos(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrarNota;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel txtOperador;
    private javax.swing.JTextField txtProdutos;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
