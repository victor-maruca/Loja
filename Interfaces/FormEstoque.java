package Interfaces;

import Codigo.TableCellListener;
import Codigo.Utilitarios;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabelaEditavel;
import modeloConnection.DBCon;
import modeloDao.DaoAlterarProduto;

public class FormEstoque extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    Utilitarios utili = new Utilitarios();
    DaoAlterarProduto dao = new DaoAlterarProduto();
    
    ArrayList dados;
    ArrayList dadosID;
    ArrayList dadosNovo = new ArrayList();
    String [] colunas = new String [] {"Código","Produto", "Custo", "Venda","Qtd."}; 
    
    boolean alterou = false;
    ArrayList alterados = new ArrayList();
    
    public FormEstoque() {
        initComponents();
        preencherTabela("SELECT * FROM produtos ORDER BY nome");
        editListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnFornecedor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnProduto = new javax.swing.JButton();
        radioMinimo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        btnConfirmar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Correções de estoque e alterações");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtFornecedor.setEditable(false);
        txtFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFornecedor.setText("TODOS");
        txtFornecedor.setEnabled(false);
        txtFornecedor.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel1.setText("Fornecedor:");

        btnFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnFornecedor.setText("+");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel2.setText("Produto:");

        txtProduto.setEditable(false);
        txtProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProduto.setText("TODOS");
        txtProduto.setEnabled(false);
        txtProduto.setFocusable(false);
        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        btnProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnProduto.setText("+");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        radioMinimo.setBackground(new java.awt.Color(255, 255, 255));
        radioMinimo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        radioMinimo.setText("Somente abaixo do estoque mínimo");
        radioMinimo.setEnabled(false);

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

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnConfirmar.setText("Confirmar alterações");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnRestaurar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioMinimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnRestaurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFornecedor)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProduto)
                    .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioMinimo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(589, 624));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
  
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        String confirm = "Tem certeza que deseja atualizar a tabela? Isso fará com que todas as"
                + " alterações sejam perdidas.";
        if(!alterou || (alterou && JOptionPane.showConfirmDialog(rootPane, confirm)==JOptionPane.YES_OPTION)){
            dadosNovo = new ArrayList();
            alterou = false;
            
            FormBuscaTabela tela = new FormBuscaTabela("fornecedores");
            tela.setVisible(true);

            tela.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e)
                {
                    //LE O ARQUIVO BUSCA
                    try {
                        FileReader arq = new FileReader("src/files/busca.txt");
                        BufferedReader lerArq = new BufferedReader(arq);

                        txtFornecedor.setText(lerArq.readLine());
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Arquivo busca.txt não encontrado!");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Impossível acessar o arquivo busca.txt!");
                    }

                    //DEIXA O ARQUIVO BUSCA EM BRANCO NOVAMENTE
                    ArrayList<String> lines = new ArrayList();
                    lines.add("");
                    Path file = Paths.get("src/files/busca.txt");
                    try {
                        Files.write(file, lines, Charset.forName("UTF-8")); 
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex);
                    }

                    if(txtFornecedor.getText().isEmpty()){
                        txtFornecedor.setText("TODOS");
                    }
                    atualizaTabela(0);
                    e.getWindow().dispose();
                }
            });
        }

        
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        String confirm = "Tem certeza que deseja atualizar a tabela? Isso fará com que todas as"
                + " alterações sejam perdidas.";
        if(!alterou || (alterou && JOptionPane.showConfirmDialog(rootPane, confirm)==JOptionPane.YES_OPTION)){
            dadosNovo = new ArrayList();
            alterou = false;
       
            FormBuscaTabela tela = new FormBuscaTabela("produtos");
            tela.setVisible(true);

            tela.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e)
                {
                    //LE O ARQUIVO BUSCA
                    try {
                        FileReader arq = new FileReader("src/files/busca.txt");
                        BufferedReader lerArq = new BufferedReader(arq);

                        txtProduto.setText(lerArq.readLine());
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Arquivo busca.txt não encontrado!");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Impossível acessar o arquivo busca.txt!");
                    }

                    //DEIXA O ARQUIVO BUSCA EM BRANCO NOVAMENTE
                    ArrayList<String> lines = new ArrayList();
                    lines.add("");
                    Path file = Paths.get("src/files/busca.txt");
                    try {
                        Files.write(file, lines, Charset.forName("UTF-8")); 
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex);
                    }

                    if(txtProduto.getText().isEmpty()){
                        txtProduto.setText("TODOS");
                    }
                    atualizaTabela(1);
                    e.getWindow().dispose();
                }
            });
        }
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        String txt = "Tem certeza que deseja descartar todas as alterações realizadas?";
        
        if(alterou && JOptionPane.showConfirmDialog(rootPane, txt) == JOptionPane.YES_OPTION){
            alterou = false;
            dadosNovo = new ArrayList();
            atualizaTabela(1);
        }
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(confirmar()){
            Object [] dadosNovos;
            
            for(int i=0 ; i<alterados.size() ; i++){
                dadosNovos = (Object []) alterados.get(i);
                dao.alterar(Integer.parseInt(String.valueOf(dadosID.get(Integer.parseInt(String.valueOf(dadosNovos[0]))))), Integer.parseInt(String.valueOf(dadosNovos[1])), String.valueOf(dadosNovos[2]));
            }
            alterou = false;
            dadosNovo = new ArrayList();
            atualizaTabela(1);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public void preencherTabela(String Sql){
        dadosID = new ArrayList();
        dados = new ArrayList();
        alterados = new ArrayList();
        alterou = false;
        
        conex.conexao();
        conex.executaSql(Sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(new Object[]{conex.rs.getString("codigo"), conex.rs.getString("nome"), "R$ "+String.format("%.2f", conex.rs.getDouble("precoCusto")).replace('.',','), "R$ "+String.format("%.2f", conex.rs.getDouble("precoVenda")).replace('.',','), conex.rs.getInt("quantidade")});
                    dadosID.add(conex.rs.getInt("id"));
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        conex.desconectar();
       
        ModeloTabelaEditavel modelo = new ModeloTabelaEditavel(dados, colunas);
        
        jTableProdutos.setModel(modelo);
        jTableProdutos.setRowHeight(23);
        
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(290);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
        jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
         jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(45);
        jTableProdutos.getColumnModel().getColumn(4).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void atualizaTabela(int flag){
        conex.conexao();
        if(flag==0 && !txtFornecedor.getText().equals("TODOS")){
           
            txtProduto.setText("TODOS");
            conex.executaSql("SELECT * FROM fornecedores WHERE nome = '"+txtFornecedor.getText()+"'");
            try{
                conex.rs.first();
                int fornID = conex.rs.getInt("id");
                preencherTabela("SELECT * FROM produtos WHERE fornecedor = "+fornID);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Erro ao buscar fornecedor no banco de dados!"+e);
            }
        }else if(flag==0 && txtFornecedor.getText().equals("TODOS")){
            
            preencherTabela("SELECT * FROM produtos ORDER BY nome");
            txtProduto.setText("TODOS");
            
        }else if(flag==1 && !txtProduto.getText().equals("TODOS")){ 
           
            preencherTabela("SELECT * FROM produtos WHERE nome = '"+txtProduto.getText()+"'");
            txtFornecedor.setText("TODOS");
            
        }else if(flag==1 && txtProduto.getText().equals("TODOS")){ 
            
            atualizaTabela(0);
            
        }
        conex.desconectar();
    }
    
    public void editListener(){
        Action action = new AbstractAction(){
            public void actionPerformed(ActionEvent e){
                TableCellListener tcl = (TableCellListener)e.getSource();
                
                if(!tcl.getOldValue().equals(tcl.getNewValue())){
                    testaAtualiza(tcl.getRow(), tcl.getColumn(), tcl.getOldValue(), tcl.getNewValue());
                }
            }
        };

        TableCellListener tcl = new TableCellListener(jTableProdutos, action);
    }
    
    public void testaAtualiza(int lin, int col, Object oldV, Object newV){
        String valorNovo = String.valueOf(newV);
   
        switch (col) {
        //CODIGO
            case 0:
                if(valorNovo.length()>20){
                    JOptionPane.showMessageDialog(rootPane, "O código deve ter no máximo 20 caracteres!");
                    jTableProdutos.setValueAt(oldV, lin, 0);
                    return;
                }
                
                for(int i=0 ; i<valorNovo.length() ; i++){
                    if(!utili.isInt(valorNovo.charAt(i)+"")){
                        JOptionPane.showMessageDialog(rootPane, "Código inválido! Utilize apenas números.");
                        jTableProdutos.setValueAt(oldV, lin, 0);
                        return;
                    }
                }
                
                alterou = true;
                alterados.add(new Object [] {lin, col, valorNovo});
                break;
        //PRODUTO
            case 1:
                if(valorNovo.length()>60){
                    JOptionPane.showMessageDialog(rootPane, "O produto deve ter no máximo 60 caracteres!");
                    jTableProdutos.setValueAt(oldV, lin, 1);
                    return;
                }
                
                alterou = true;
                alterados.add(new Object [] {lin, col, valorNovo});
                break;
        //PRECO DE CUSTO
            case 2:
                if(!utili.isDouble(valorNovo.replace(',', '.')) && !utili.isPreco(valorNovo)){
                    JOptionPane.showMessageDialog(rootPane, "Valor inválido! Utilize o formato XX,xx.");
                    jTableProdutos.setValueAt(oldV, lin, 2);
                    return;
                }
                
                alterou = true;
                alterados.add(new Object [] {lin, col, valorNovo.replace(',', '.').replace("R$ ", "")});
                jTableProdutos.setValueAt(utili.formataPreco(valorNovo.replace(',', '.').replace("R$ ", "")), lin, col);
                break;       
        //PRECO DE VENDA
            case 3:
                if(!utili.isDouble(valorNovo.replace(',', '.')) && !utili.isPreco(valorNovo)){
                    JOptionPane.showMessageDialog(rootPane, "Valor inválido! Utilize o formato XX,xx.");
                    jTableProdutos.setValueAt(oldV, lin, 3);
                    return;
                }
                
                alterou = true;
                alterados.add(new Object [] {lin, col, valorNovo.replace(',', '.').replace("R$ ", "")});
                jTableProdutos.setValueAt(utili.formataPreco(valorNovo.replace(',', '.').replace("R$ ", "")), lin, col);
                break;       
        //QUANTIDADE
            case 4:
                if(!utili.isInt(valorNovo)){
                    JOptionPane.showMessageDialog(rootPane, "Valor inválido!");
                    jTableProdutos.setValueAt(oldV, lin, 4);
                    return;
                }
                
                alterou = true;
                alterados.add(new Object [] {lin, col, valorNovo});
                break;    
        }
    }
    
    public boolean confirmar(){
        String texto = "Tem certeza que deseja confirmar as alterações realizadas?\n";
        return JOptionPane.showConfirmDialog(rootPane, texto)==JOptionPane.YES_OPTION;
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
            java.util.logging.Logger.getLogger(FormEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JRadioButton radioMinimo;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
