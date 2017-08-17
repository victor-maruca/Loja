package Interfaces;

import Codigo.Utilitarios;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;

public class FormSangria extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    Utilitarios utili = new Utilitarios();
    
    public FormSangria() {
        initComponents();
        preencherTabela("SELECT * FROM funcionarios");
        preencheCombo();
        jTableFuncionariosMouseClicked(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioSangria = new javax.swing.JRadioButton();
        radioDespesa = new javax.swing.JRadioButton();
        comboDespesas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtResponsavel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sangria e despesa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        radioSangria.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioSangria);
        radioSangria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        radioSangria.setForeground(new java.awt.Color(52, 52, 52));
        radioSangria.setSelected(true);
        radioSangria.setText("Sangria");
        radioSangria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSangriaActionPerformed(evt);
            }
        });

        radioDespesa.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioDespesa);
        radioDespesa.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        radioDespesa.setForeground(new java.awt.Color(52, 52, 52));
        radioDespesa.setText("Despesa");
        radioDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDespesaActionPerformed(evt);
            }
        });

        comboDespesas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDespesas.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 52, 52));
        jLabel1.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtResponsavel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtResponsavel.setFocusable(false);
        txtResponsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResponsavelKeyReleased(evt);
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
        jTableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionarios);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 52, 52));
        jLabel2.setText("Responsável: ");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 52, 52));
        jLabel3.setText("Descrição: ");

        txtDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDescricao.setToolTipText("máx 40 caracteres");
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyReleased(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioSangria)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(radioSangria)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioDespesa)
                            .addComponent(comboDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        setSize(new java.awt.Dimension(694, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
            btnConfirmarActionPerformed(evt);
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtResponsavelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsavelKeyReleased
        preencherTabela("SELECT * FROM funcionarios WHERE nome LIKE '"+txtResponsavel.getText().toUpperCase()+"%'");
    }//GEN-LAST:event_txtResponsavelKeyReleased

    private void radioSangriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSangriaActionPerformed
        if(radioSangria.isSelected()){
            comboDespesas.setSelectedIndex(0);
            comboDespesas.setEnabled(false);
        }
    }//GEN-LAST:event_radioSangriaActionPerformed

    private void radioDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDespesaActionPerformed
        if(radioDespesa.isSelected()){
            comboDespesas.setSelectedIndex(0);
            comboDespesas.setEnabled(true);
        }
    }//GEN-LAST:event_radioDespesaActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
        txtResponsavel.setText(String.valueOf(jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(),0)));
    }//GEN-LAST:event_jTableFuncionariosMouseClicked

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        if(utili.isDouble(txtValor.getText().replace(',', '.'))){
            txtValor.setText(utili.formataPreco(txtValor.getText().replace(',', '.')));
        }
    }//GEN-LAST:event_txtValorFocusLost

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        //DECLARAÇÕES
        int tipo=1;
        double valor;
        int caixa;
        int responsavel;
        String descricao;
        String hora;
        
        //ATRIBUIÇÕES
        String time = DateFormat.getDateTimeInstance().format(new Date());
        String dia = time.substring(0, 2);
        String mes = time.substring(3, 5);
        String ano = time.substring(6, 10);
        time = ano+"-"+mes+"-"+dia+" "+time.substring(11);
        
        descricao = txtDescricao.getText();
        
        try {
            FileReader arq = new FileReader("src/files/atual.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            lerArq.readLine();lerArq.readLine();lerArq.readLine();
            caixa = Integer.parseInt(lerArq.readLine());
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arquivo caixa.txt não encontrado!\n"+ex);
            return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo atual.txt!\n"+ex);
            return;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao ler numero do caixa(turno) no arquivo atual.txt.\n"+ex);
            return;
        }
        
        try{
            valor = Double.parseDouble(txtValor.getText().substring(3).replace(',', '.'));
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "Valor digitado é inválido!");
            return;
        }
        
        conex.conexao();
        if(radioDespesa.isSelected()){
            conex.executaSql("SELECT * FROM tiposdespesas WHERE tipo = '"+comboDespesas.getSelectedItem()+"'");
            try{
                conex.rs.first();
                tipo = conex.rs.getInt("id");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Erro ao buscar id do tipo de despesa no banco. \n"+ex);
                return;
            }
        }
        
        
        conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+txtResponsavel.getText()+"'");
        try{
            if(conex.rs.first()){
                responsavel = conex.rs.getInt("id");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Funcionário responsável não encontrado no banco  de dados.");
                return;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar funcionario responsável no banco de dados!\n"+ex);
            return;
        }
        
        String motivo;
        if(radioDespesa.isSelected()){
            motivo = ""+comboDespesas.getSelectedItem();
        }else{
            motivo = "SANGRIA";
        }
        
        String texto = "Deseja confirmar a seguinte sangria?\n"
                     + "Valor: "+txtValor.getText()
                     + "\nResponsável: "+txtResponsavel.getText()
                     + "\nMotivo: "+motivo;
        
        if(JOptionPane.showConfirmDialog(rootPane, texto)==JOptionPane.YES_OPTION){
            PreparedStatement pst;
            try{
                pst = conex.con.prepareStatement("INSERT INTO despesas (tipo, valor, caixa, responsavel, descricao, hora) VALUES (?,?,?,?,?,?)");
                pst.setInt(1, tipo);
                pst.setDouble(2, valor);
                pst.setInt(3, caixa);
                pst.setInt(4, responsavel);
                pst.setString(5, descricao);
                pst.setString(6, time);
                pst.execute();
                dispose();
                JOptionPane.showMessageDialog(rootPane, "Sangria realizada com sucesso!");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Erro ao enviar dados para o banco de dados!\n"+ex);
            }
            conex.desconectar();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyReleased
        if(txtDescricao.getText().length()>40){
            txtDescricao.setText(txtDescricao.getText().substring(0,40));
        }
    }//GEN-LAST:event_txtDescricaoKeyReleased

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        btnConfirmarActionPerformed(evt);
    }//GEN-LAST:event_txtValorActionPerformed

    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"Nome"}; 
        conex.conexao();
        conex.executaSql(Sql);
        
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
        
        jTableFuncionarios.setModel(modelo);
        jTableFuncionarios.setRowHeight(21);
        jTableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(291);
        jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncionarios.getTableHeader().setReorderingAllowed(false);
        jTableFuncionarios.setAutoResizeMode(jTableFuncionarios.AUTO_RESIZE_OFF);
        jTableFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconectar();
        
        if(jTableFuncionarios.getRowCount()!=0){
            jTableFuncionarios.setRowSelectionInterval(0, 0);
        }
    }
    
    public void preencheCombo(){
        conex.conexao();
        conex.executaSql("SELECT * FROM tiposdespesas WHERE tipo != 'VALE' AND tipo != 'SANGRIA'");
        try{
            conex.rs.first();
            do{
                comboDespesas.addItem(conex.rs.getString("tipo"));
            }while(conex.rs.next());
        }catch(SQLException ex){}
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
            java.util.logging.Logger.getLogger(FormSangria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSangria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSangria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSangria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSangria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboDespesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JRadioButton radioDespesa;
    private javax.swing.JRadioButton radioSangria;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
