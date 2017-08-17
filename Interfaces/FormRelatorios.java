package Interfaces;

import Codigo.Utilitarios;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloConnection.DBCon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class FormRelatorios extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    Utilitarios utili = new Utilitarios();
    
        //DECLARAÇÕES
        String dataInicial;
        String dataFinal;
        String produto;
        String vendedor;
        double dinheiro=0;
        double credito=0;
        double debito=0;
        double cheque=0;
        double nota=0;
        double despesa=0;
        int itensTotal=0;
        double total;
        ArrayList Adin = new ArrayList();
        ArrayList Acred = new ArrayList();
        ArrayList Adeb = new ArrayList();
        ArrayList Acheque = new ArrayList();
        ArrayList Anota = new ArrayList();
        ArrayList datas = new ArrayList();
        ArrayList Adespesa = new ArrayList();
        ArrayList Atotal = new ArrayList();
        
        ArrayList sellNums = new ArrayList();  
        
    
    public FormRelatorios() {
        initComponents();
        preencherTabelaFuncionarios("SELECT * FROM funcionarios ORDER BY nome");
        preencherTabelaProdutos("SELECT * FROM produtos ORDER BY NOME");
        keyBindings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JTextField();
        txtDataFinal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        radioResumido = new javax.swing.JRadioButton();
        radioCompleto = new javax.swing.JRadioButton();
        btnGerarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(250, 185, 92));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel2.setText("Data inicial:");

        txtDataInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDataInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataInicialKeyReleased(evt);
            }
        });

        txtDataFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataFinalKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel3.setText("Data final:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel4.setText("Produto: ");

        txtProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProdutoKeyReleased(evt);
            }
        });

        jTableProdutos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel5.setText("Vendedor:");

        txtVendedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVendedorKeyReleased(evt);
            }
        });

        jTableFuncionarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
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
        jScrollPane2.setViewportView(jTableFuncionarios);

        radioResumido.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioResumido);
        radioResumido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        radioResumido.setSelected(true);
        radioResumido.setText("Resumido");
        radioResumido.setFocusable(false);

        radioCompleto.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioCompleto);
        radioCompleto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        radioCompleto.setText("Completo");

        btnGerarRelatorio.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioCompleto)
                            .addComponent(radioResumido))
                        .addGap(32, 32, 32)
                        .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtVendedor))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(txtDataFinal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioResumido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioCompleto)
                                    .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(661, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataInicialKeyReleased
        txtDataInicial.setText(utili.formataData(txtDataInicial.getText()));
    }//GEN-LAST:event_txtDataInicialKeyReleased

    private void txtDataFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataFinalKeyReleased
        txtDataFinal.setText(utili.formataData(txtDataFinal.getText()));
    }//GEN-LAST:event_txtDataFinalKeyReleased

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        txtProduto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() != KeyEvent.VK_UP && e.getKeyCode() != KeyEvent.VK_DOWN) {
                    preencherTabelaProdutos("SELECT * FROM produtos WHERE nome like '"+txtProduto.getText().toUpperCase()+"%'");
                }else if(jTableProdutos.getRowCount()!=0){
                    txtProduto.setText(""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
                }    
            }
        });
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void txtVendedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendedorKeyReleased
        txtVendedor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() != KeyEvent.VK_UP && e.getKeyCode() != KeyEvent.VK_DOWN) {
                    preencherTabelaFuncionarios("SELECT * FROM funcionarios WHERE nome like '"+txtVendedor.getText().toUpperCase()+"%'");
                }else if(jTableFuncionarios.getRowCount()!=0){
                    txtVendedor.setText(""+jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 0));
                }
            }
        });
    }//GEN-LAST:event_txtVendedorKeyReleased

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        if(!utili.isData(txtDataInicial.getText())){
            JOptionPane.showMessageDialog(null, "Data inicial inválida! Utilize o dormato dd/mm/aaaa.");
            txtDataInicial.requestFocus();
            txtDataInicial.selectAll();
            return;
        }else if(!utili.isData(txtDataFinal.getText()) && !txtDataFinal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data final inválida! Utilize o dormato dd/mm/aaaa.");
            txtDataFinal.requestFocus();
            txtDataFinal.selectAll();
            return;
        }
        
        conex.conexao();
        if(!txtProduto.getText().isEmpty()){
            conex.executaSql("SELECT * FROM produtos WHERE nome = '"+txtProduto.getText()+"'");
            try{
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    txtProduto.requestFocus();
                    txtProduto.selectAll();
                    return;
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
                return;
            }
        }
                
        if(!txtVendedor.getText().isEmpty()){
            conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+txtVendedor.getText()+"'");
            try{
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    txtVendedor.requestFocus();
                    txtVendedor.selectAll();
                    return;
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
                return;
            }
        }
        conex.desconectar();
        
        if(radioResumido.isSelected()){
            if(enviaDadosResumido()){
                gerarRelatorioResumido();
            }
        }else if(enviaDadosCompleto()){
            gerarRelatorioCompleto();
        }
        
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

    public void preencherTabelaProdutos(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"Produto"}; 
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
        
        jTableProdutos.setModel(modelo);
        jTableProdutos.setRowHeight(20);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(283);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconectar();
        
        if(jTableProdutos.getRowCount()!=0){
            jTableProdutos.setRowSelectionInterval(0, 0);
        }
    }
    
    public void preencherTabelaFuncionarios(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"Vendedor"}; 
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
        jTableFuncionarios.setRowHeight(20);
        jTableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(283);
        jTableFuncionarios.getColumnModel().getColumn(0).setResizable(false);
        jTableFuncionarios.getTableHeader().setReorderingAllowed(false);
        jTableFuncionarios.setAutoResizeMode(jTableFuncionarios.AUTO_RESIZE_OFF);
        jTableFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconectar();
        
        if(jTableFuncionarios.getRowCount()!=0){
            jTableFuncionarios.setRowSelectionInterval(0, 0);
        }
    }
    
    public void keyBindings(){
        //PARA TABELA PRODUTOS
        Action downKeyP = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTableProdutos.getSelectedRow() != jTableProdutos.getRowCount()-1){
                    jTableProdutos.setRowSelectionInterval(jTableProdutos.getSelectedRow()+1, jTableProdutos.getSelectedRow()+1);
                }
            }
        };
        
        Action upKeyP = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTableProdutos.getSelectedRow() != 0){
                    jTableProdutos.setRowSelectionInterval(jTableProdutos.getSelectedRow()-1, jTableProdutos.getSelectedRow()-1);
                }
            }
        };
        
        txtProduto.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("UP"),"up");
        txtProduto.getActionMap().put("up", upKeyP);
        txtProduto.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("DOWN"),"down");
        txtProduto.getActionMap().put("down", downKeyP);
        
        //PARA TABELA FUNCIONARIOS
        Action downKeyF = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTableFuncionarios.getSelectedRow() != jTableFuncionarios.getRowCount()-1){
                    jTableFuncionarios.setRowSelectionInterval(jTableFuncionarios.getSelectedRow()+1, jTableFuncionarios.getSelectedRow()+1);
                }
            }
        };
        
        Action upKeyF = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTableFuncionarios.getSelectedRow() != 0){
                    jTableFuncionarios.setRowSelectionInterval(jTableFuncionarios.getSelectedRow()-1, jTableFuncionarios.getSelectedRow()-1);
                }
            }
        };
        
        txtVendedor.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("UP"),"up");
        txtVendedor.getActionMap().put("up", upKeyF);
        txtVendedor.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("DOWN"),"down");
        txtVendedor.getActionMap().put("down", downKeyF);
       
    }
    
    public boolean enviaDadosResumido(){
        //SETANDO AS VARIAVEIS
        dataInicial = txtDataInicial.getText();
        
        if(txtDataFinal.getText().isEmpty()){
            dataFinal = dataInicial;
        }else{
            dataFinal = txtDataFinal.getText();
        }
        
        if(txtProduto.getText().isEmpty()){
            produto = "TODOS";
        }else{
            produto = txtProduto.getText();
        }
        
        if(txtVendedor.getText().isEmpty()){
            vendedor = "TODOS";
        }else{
            vendedor = txtVendedor.getText();
        }
        
        conex.conexao();
        
        if(dataInicial.equals(dataFinal) && produto.equals("TODOS") && vendedor.equals("TODOS")){
            
            conex.executaSql("SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"'");   
            
        }else if(dataInicial.equals(dataFinal) && produto.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+vendedor+"'");
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    return false;
                } 
               
                String str = "SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"' AND vendedor = '"+conex.rs.getInt("id")+"'";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "2-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(dataInicial.equals(dataFinal) && vendedor.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM produtos WHERE nome = '"+produto+"'");
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    return false;
                } 
               
                String str = "SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"' AND produto = '"+conex.rs.getInt("id")+"'";
                conex.executaSql(str);
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "3-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(produto.equals("TODOS") && vendedor.equals("TODOS")){
           
            conex.executaSql("SELECT * FROM vendas WHERE DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"+utili.dateToSql(dataFinal)+"'");

        }else if(dataInicial.equals(dataFinal)){
            try{  
                conex.executaSql("SELECT * FROM produtos WHERE nome = '"+produto+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    return false;
                }
                String prod = conex.rs.getInt("id")+"";
                
                conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+vendedor+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    return false;
                }
                String vend = conex.rs.getInt("id")+"";
                
                String str = "SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"' AND produto='"+prod+"' AND vendedor = '"+vend+"'";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "5-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(vendedor.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM produtos WHERE nome = '"+produto+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    return false;
                }
                
                String str = "SELECT * FROM vendas WHERE (DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"
                        +utili.dateToSql(dataFinal)+"') AND produto = '"+conex.rs.getInt("id")+"'";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "6-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(produto.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+vendedor+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    return false;
                }
                
                String str = "SELECT * FROM vendas WHERE (DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"+utili.dateToSql(dataFinal)
                        +"') AND vendedor = '"+conex.rs.getInt("id")+"')";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "7-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }
       
        try{
            if(conex.rs.first()){   
                do{
                    if(!sellNums.contains(conex.rs.getInt("sellNum"))){
                        sellNums.add(conex.rs.getInt("sellNum"));
                        itensTotal = itensTotal + conex.rs.getInt("quantidade");
                    }
                }while(conex.rs.next());
            }else{
                JOptionPane.showMessageDialog(null, "Não há nenhuma venda no período selecionado.");
                return false;
            }
           
            String sql = "SELECT * FROM pgto WHERE sellNum = ";
            for(int i=0; i<sellNums.size() ; i++){
                sql = sql + sellNums.get(i) +" OR ";
            }
            sql = sql.substring(0, sql.length()-4);
            
            conex.executaSql(sql);
            if(conex.rs.first()){
                do{
                    dinheiro = dinheiro + conex.rs.getDouble("dinheiro");
                    credito = credito + conex.rs.getDouble("credito");
                    debito = debito + conex.rs.getDouble("debito");
                    cheque = cheque + conex.rs.getDouble("cheque");
                    nota = nota + conex.rs.getDouble("nota");
                }while(conex.rs.next());
            }else{
                JOptionPane.showMessageDialog(null, "Há um problema com a sincronização do banco de dados!");
                return false;
            }
            
            //SETA A DESPESA
            if(dataInicial.equals(dataFinal)){
                conex.executaSql("SELECT * FROM despesas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"'");
            }else{
                conex.executaSql("SELECT * FROM despesas WHERE DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"+utili.dateToSql(dataFinal)+"'");
            }
            if(conex.rs.first()){
                do{
                    despesa = despesa + conex.rs.getDouble("valor");
                }while(conex.rs.next());
            }
            
            total = dinheiro + credito + debito + cheque + nota - despesa;
            
            //FORMATA E ENVIA PARA O BANCO
            String dinF = "R$ "+String.format("%.2f", dinheiro).replace('.',',');
            String credF = "R$ "+String.format("%.2f", credito).replace('.',',');
            String debF = "R$ "+String.format("%.2f", debito).replace('.',',');
            String chequeF = "R$ "+String.format("%.2f", cheque).replace('.',',');
            String notaF = "R$ "+String.format("%.2f", nota).replace('.',',');
            String totalF = "R$ "+String.format("%.2f", total).replace('.',',');
            String despesaF = "R$ "+String.format("%.2f", despesa).replace('.',',');
            
            conex.executaUpdate("TRUNCATE TABLE relatorioresumido");
            
            PreparedStatement pst;
            pst = conex.con.prepareStatement("INSERT INTO relatorioresumido (dataInicial,dataFinal,produto,vendedor,dinheiro,credito,"
                     + "debito,cheque,nota,despesa,itensTotal,total) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, dataInicial);
            pst.setString(2, dataFinal);
            pst.setString(3, produto);
            pst.setString(4, vendedor);
            pst.setString(5, dinF);
            pst.setString(6, credF);
            pst.setString(7, debF);
            pst.setString(8, chequeF);
            pst.setString(9, notaF);
            pst.setString(10, despesaF);
            pst.setString(11, ""+itensTotal);
            pst.setString(12, totalF);
            pst.execute();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "8-Erro ao conectar com o BD.\n"+ex);
            return false;
        }
        
        conex.desconectar();
        return true;
    }
    
    public void gerarRelatorioResumido(){
        try{
            
            conex.conexao();

            JasperPrint jp = JasperFillManager.fillReport("src\\MyReports\\RelatorioResumido.jasper", new HashMap(),conex.con);
            JasperViewer.viewReport(jp, false);

        }catch(JRException e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
        conex.desconectar();
    }
    
    public boolean enviaDadosCompleto(){
        //SETANDO AS VARIAVEIS
        dataInicial = txtDataInicial.getText();
        
        if(txtDataFinal.getText().isEmpty()){
            dataFinal = dataInicial;
        }else{
            dataFinal = txtDataFinal.getText();
        }
        
        if(txtProduto.getText().isEmpty()){
            produto = "TODOS";
        }else{
            produto = txtProduto.getText();
        }
        
        if(txtVendedor.getText().isEmpty()){
            vendedor = "TODOS";
        }else{
            vendedor = txtVendedor.getText();
        }
        
        conex.conexao();
        
        if(dataInicial.equals(dataFinal) && produto.equals("TODOS") && vendedor.equals("TODOS")){
            
            conex.executaSql("SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"'");   
            
        }else if(dataInicial.equals(dataFinal) && produto.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+vendedor+"'");
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    return false;
                } 
               
                String str = "SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"' AND vendedor = '"+conex.rs.getInt("id")+"'";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "2-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(dataInicial.equals(dataFinal) && vendedor.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM produtos WHERE nome = '"+produto+"'");
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    return false;
                } 
               
                String str = "SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"' AND produto = '"+conex.rs.getInt("id")+"'";
                conex.executaSql(str);
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "3-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(produto.equals("TODOS") && vendedor.equals("TODOS")){
           
            conex.executaSql("SELECT * FROM vendas WHERE DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"+utili.dateToSql(dataFinal)+"'");

        }else if(dataInicial.equals(dataFinal)){
            try{  
                conex.executaSql("SELECT * FROM produtos WHERE nome = '"+produto+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    return false;
                }
                String prod = conex.rs.getInt("id")+"";
                
                conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+vendedor+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    return false;
                }
                String vend = conex.rs.getInt("id")+"";
                
                String str = "SELECT * FROM vendas WHERE DATE(hora) = '"+utili.dateToSql(dataInicial)+"' AND produto='"+prod+"' AND vendedor = '"+vend+"'";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "5-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(vendedor.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM produtos WHERE nome = '"+produto+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    return false;
                }
                
                String str = "SELECT * FROM vendas WHERE (DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"
                        +utili.dateToSql(dataFinal)+"') AND produto = '"+conex.rs.getInt("id")+"'";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "6-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }else if(produto.equals("TODOS")){
            try{
                conex.executaSql("SELECT * FROM funcionarios WHERE nome = '"+vendedor+"'"); 
                if(!conex.rs.first()){
                    JOptionPane.showMessageDialog(null, "Vendedor não encontrado!");
                    return false;
                }
                
                String str = "SELECT * FROM vendas WHERE (DATE(hora) BETWEEN '"+utili.dateToSql(dataInicial)+"' AND '"+utili.dateToSql(dataFinal)
                        +"') AND vendedor = '"+conex.rs.getInt("id")+"')";
                conex.executaSql(str);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "7-Problema ao conectar com o BD.\n"+ex);
                return false;
            }
        }
        
        //-----------------------------------------------------------------------//
        
        try{
            //ADICIONA TODAS AS DATAS NO PERIODO SELECIONADO
            if(conex.rs.first()){   
                do{
                    if(!datas.contains(conex.rs.getString("hora").substring(0,10))){
                        datas.add(conex.rs.getString("hora").substring(0,10));
                        itensTotal = itensTotal + conex.rs.getInt("quantidade");
                    }
                }while(conex.rs.next());
            }else{
                JOptionPane.showMessageDialog(null, "Não há nenhuma venda no período selecionado.");
                return false;
            }
            
            //ZERA TODOS ARRAYLIST
            for(int i=0 ; i<datas.size() ; i++){
                Adin.add(i, 0);
                Acred.add(i, 0);
                Adeb.add(i, 0);
                Acheque.add(i, 0);
                Anota.add(i, 0);
                Adespesa.add(i, 0);
            }
            
            double totDin=0, totCred=0, totDeb=0, totCheque=0, totNota=0, totDesp=0, totTot=0;
            
            //ADICIONA DINHEIRO, CREDITO, DEBITO, CHEQUE E NOTA
            for(int i=0 ; i<datas.size() ; i++){
                conex.executaSql("SELECT * FROM vendas WHERE DATE(hora) = '"+datas.get(i)+"'");
                if(conex.rs.first()){
                    sellNums.removeAll(sellNums);
                    do{ 
                        if(!sellNums.contains(conex.rs.getInt("sellNum"))){
                            sellNums.add(conex.rs.getInt("sellNum"));
                        }
                    }while(conex.rs.next());
                    
                    for(int j=0 ; j<sellNums.size() ; j++){
                        conex.executaSql("SELECT * FROM pgto WHERE sellNum = "+sellNums.get(j));
                        if(conex.rs.first()){
                            do{
                                Adin.add(i, Double.parseDouble(Adin.get(i)+"")+conex.rs.getDouble("dinheiro"));
                                Acred.add(i, Double.parseDouble(Acred.get(i)+"")+conex.rs.getDouble("credito"));
                                Adeb.add(i, Double.parseDouble(Adeb.get(i)+"")+conex.rs.getDouble("debito"));
                                Acheque.add(i, Double.parseDouble(Acheque.get(i)+"")+conex.rs.getDouble("cheque"));
                                Anota.add(i, Double.parseDouble(Anota.get(i)+"")+conex.rs.getDouble("nota"));
                            }while(conex.rs.next());
                        }else{
                            JOptionPane.showMessageDialog(null, "Problema de sincronização do banco.");
                            return false;
                        }
                    }
                }
            }
            
            //ADICIONA DESPESA
            for(int i=0 ; i<datas.size() ; i++){
                conex.executaSql("SELECT * FROM despesas WHERE DATE(hora) = '"+datas.get(i)+"'");
                if(conex.rs.first()){
                    do{
                        Adespesa.add(i, Double.parseDouble(Adespesa.get(i)+"")+conex.rs.getDouble("valor"));
                    }while(conex.rs.next());
                }
            }
            
            //ADICIONA O TOTAL
            for(int i=0 ; i<datas.size() ; i++){
                Atotal.add(i, Double.parseDouble(Adin.get(i)+"")
                             +Double.parseDouble(Acred.get(i)+"")
                             +Double.parseDouble(Adeb.get(i)+"")
                             +Double.parseDouble(Acheque.get(i)+"")
                             +Double.parseDouble(Anota.get(i)+"")
                             -Double.parseDouble(Adespesa.get(i)+"")
                );
                totDin += Double.parseDouble(Adin.get(i)+"");
                totCred += Double.parseDouble(Acred.get(i)+"");
                totDeb += Double.parseDouble(Adeb.get(i)+"");
                totCheque += Double.parseDouble(Acheque.get(i)+"");
                totNota += Double.parseDouble(Anota.get(i)+"");
                totDesp += Double.parseDouble(Adespesa.get(i)+"");
            }
            totTot = totDin + totCred + totDeb + totCheque + totNota - totDesp;
            
            //ENVIA PARA O BANCO
            PreparedStatement pst;
            conex.executaUpdate("TRUNCATE TABLE relatoriocompleto");
            conex.executaUpdate("TRUNCATE TABLE relatorioheader");
            for(int i=0 ; i<datas.size() ; i++){
                pst = conex.con.prepareStatement("INSERT INTO relatoriocompleto (dia,dinheiro,credito,debito,"
                + "cheque,nota,despesa, total) VALUES (?,?,?,?,?,?,?,?)");
                pst.setString(1, utili.sqlToDate(datas.get(i)+""));
                pst.setDouble(2, Double.parseDouble(Adin.get(i)+""));
                pst.setDouble(3, Double.parseDouble(Acred.get(i)+""));
                pst.setDouble(4, Double.parseDouble(Adeb.get(i)+""));
                pst.setDouble(5, Double.parseDouble(Acheque.get(i)+""));
                pst.setDouble(6, Double.parseDouble(Anota.get(i)+""));
                pst.setDouble(7, Double.parseDouble(Adespesa.get(i)+""));
                pst.setDouble(8, Double.parseDouble(Atotal.get(i)+""));
                pst.execute();
            }
            
            pst = conex.con.prepareStatement("INSERT INTO relatorioheader (vendedor,produto,dataInicial,"
                    +"dataFinal, dinheiroTotal, creditoTotal, debitoTotal, chequeTotal, notaTotal,"
                    + "despesaTotal, totalTotal) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, vendedor);
            pst.setString(2, produto);
            pst.setString(3, dataInicial);
            pst.setString(4, dataFinal);
            pst.setDouble(5 , totDin);
            pst.setDouble(6 , totCred);
            pst.setDouble(7 , totDeb);
            pst.setDouble(8 , totCheque);
            pst.setDouble(9 , totNota);
            pst.setDouble(10 , totDesp);
            pst.setDouble(11 , totTot);
            pst.execute();
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro ao enviar os dados para o servidor!"+ex);
            return false;
        }    
    }
    
    public void gerarRelatorioCompleto(){
        try{
            conex.conexao();

            JasperPrint jp = JasperFillManager.fillReport("src\\MyReports\\RelatorioCompleto.jasper" , new HashMap(),conex.con);
            JasperViewer.viewReport(jp, false);
            
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
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
            java.util.logging.Logger.getLogger(FormRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JRadioButton radioCompleto;
    private javax.swing.JRadioButton radioResumido;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
