package Interfaces;

import Codigo.RelatorioFechamento;
import Codigo.Utilitarios;
import Codigo.Venda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import modeloBeans.BeansProduto;
import modeloBeans.BeansVenda;
import modeloConnection.DBCon;
import modeloDao.DaoProduto;
import modeloDao.DaoVenda;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class Main2 extends javax.swing.JFrame {

    Utilitarios utili = new Utilitarios();
    DBCon conex = new DBCon();
    Venda venda = new Venda();
    BeansProduto mod = new BeansProduto();
    BeansVenda Bvenda = new BeansVenda();
    DaoProduto dao = new DaoProduto();
    DaoVenda daoVenda = new DaoVenda();
    
    String previous = "";
    
    String turno="";        //<--CONFIGURADO NO leAtual()
    String usuario="";      //<--CONFIGURADO NO leAtual()
    int ID;                 //<--CONFIGURADO NO leAtual()
    
    boolean inVenda=false;
    int sellNum;
    
    public Main2(int id) {
        initComponents();
        
        //setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        ClockPane();
        leAtual();
        criaKeyBindings();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtProduto = new javax.swing.JTextField();
        jLabelSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOperador = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnFinalizarVenda = new javax.swing.JButton();
        btnCancelarVenda = new javax.swing.JButton();
        btnConsultarPreco = new javax.swing.JButton();
        btnCancelarItem = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnFechamento = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saphira v1.0");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtProduto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
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
        });

        jLabelSubtotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabelSubtotal.setForeground(new java.awt.Color(250, 156, 78));
        jLabelSubtotal.setText("Subtotal: ");

        txtSubtotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 17)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(52, 52, 52));
        txtSubtotal.setText("R$ 0,00");

        txtNota.setColumns(20);
        txtNota.setFont(new java.awt.Font("TeXGyreCursor", 0, 15)); // NOI18N
        txtNota.setForeground(new java.awt.Color(52, 52, 52));
        txtNota.setLineWrap(true);
        txtNota.setRows(5);
        txtNota.setFocusable(false);
        jScrollPane1.setViewportView(txtNota);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 52, 52));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");

        txtQuantidade.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(52, 52, 52));
        txtQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidade.setFocusable(false);
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyReleased(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Button Search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSubtotal)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSubtotal)
                        .addComponent(txtSubtotal))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Operador: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 120, 30);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Turno: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 0, 80, 30);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Hora: ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(770, 0, 80, 30);

        txtOperador.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        txtOperador.setForeground(new java.awt.Color(52, 52, 52));
        jPanel1.add(txtOperador);
        txtOperador.setBounds(150, 0, 430, 30);

        txtTurno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(52, 52, 52));
        jPanel1.add(txtTurno);
        txtTurno.setBounds(670, 0, 90, 30);

        labelHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        labelHora.setForeground(new java.awt.Color(52, 52, 52));
        jPanel1.add(labelHora);
        labelHora.setBounds(850, 0, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/upperbar.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 30);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Btn Finalizar Venda.png"))); // NOI18N
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        btnCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Btn Cancelar venda.png"))); // NOI18N
        btnCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVendaActionPerformed(evt);
            }
        });

        btnConsultarPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Btn Consultar Preço.png"))); // NOI18N
        btnConsultarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPrecoActionPerformed(evt);
            }
        });

        btnCancelarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Btn Cancelar Item.png"))); // NOI18N
        btnCancelarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btnCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Clientes.png"))); // NOI18N
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Produtos.png"))); // NOI18N
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Relatorios.png"))); // NOI18N
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Usuarios.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnFechamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao Fechamento.png"))); // NOI18N
        btnFechamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        txtTotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(54, 54, 54));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal.setText("R$ 0,00");
        jPanel9.add(txtTotal);
        txtTotal.setBounds(150, 10, 150, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Frame Total.png"))); // NOI18N
        jPanel9.add(jLabel4);
        jLabel4.setBounds(10, 10, 300, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rede99 logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(936, 941));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        FormClientes tela = new FormClientes(ID);
        tela.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        FormProdutos tela = new FormProdutos(ID);
        tela.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        FormRelatorios tela = new FormRelatorios();
        tela.setVisible(true);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        FormUsuarios tela = new FormUsuarios(ID);
        tela.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnFechamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechamentoActionPerformed
        
        //ENVIA OS DADOS PARA O SERVIDOR
        RelatorioFechamento fechamento = new RelatorioFechamento();
        fechamento.enviaDados();
        
        
        //PRINTA O RELATÓRIO NA TELA
        conex.conexao();
        try{
            JasperPrint jp = JasperFillManager.fillReport("src\\MyReports\\RelatorioFechamento.jasper", new HashMap(),conex.con);
            JasperViewer.viewReport(jp, false);
        }catch(JRException e){
            JOptionPane.showMessageDialog(null, e);
        } 
        conex.desconectar();
        
        FormFechamento tela = new FormFechamento();
        tela.setVisible(true);
    }//GEN-LAST:event_btnFechamentoActionPerformed

    private void txtProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdutoKeyReleased
        
        //AUTO-COMPLETE DO TXTPRODUTO
        if(!txtProduto.getText().isEmpty()){
            if(!txtProduto.getText().equals(previous)){    
                previous = txtProduto.getText();
               
                try{     
                    Integer.parseInt(txtProduto.getText());
                }catch(NumberFormatException e){
                    conex.conexao();        
                    conex.executaSql("SELECT * FROM produtos WHERE nome LIKE '"+txtProduto.getText().toUpperCase()+"%'");

                    try {
                        conex.rs.first();
                        String retorno = conex.rs.getString("nome");

                        int pos = txtProduto.getText().length();

                        txtProduto.setText(retorno);
                        txtProduto.select(pos, retorno.length());

                    }catch(SQLException ex){}    
                }  
            }else{
                previous = previous.substring(0, previous.length()-1);
            }    
            conex.desconectar();
        }else{
            txtProduto.setText("");
        }
    }//GEN-LAST:event_txtProdutoKeyReleased

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        conex.conexao();
        conex.executaSql("SELECT * FROM produtos WHERE nome = '"+txtProduto.getText()+"'");
        try{
            conex.rs.first();
            conex.rs.getString("nome");
          
            txtQuantidade.setFocusable(true);
            txtQuantidade.requestFocus();
            txtQuantidade.setText("1");
            txtQuantidade.selectAll();
            txtProduto.setFocusable(false);
            mod.setVenda(conex.rs.getDouble("precoVenda"));
            mod.setNome(conex.rs.getString("nome"));
            txtSubtotal.setText("R$ "+String.format("%.2f", mod.getVenda()).replace('.',','));
        }catch(SQLException ex){
            txtProduto.setText("");
        }
        conex.desconectar();
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyReleased
        try{
            txtSubtotal.setText("R$ " + String.format("%.2f", Integer.parseInt(txtQuantidade.getText())*mod.getVenda()).replace('.', ','));
        }catch(NumberFormatException e){
            txtQuantidade.setText("1");
            txtSubtotal.setText("R$ " + String.format("%.2f", Integer.parseInt(txtQuantidade.getText())*mod.getVenda()).replace('.', ','));
        }
    }//GEN-LAST:event_txtQuantidadeKeyReleased

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        
        if(!inVenda){
            inVenda=true;
            
            FormIniciarVenda form = new FormIniciarVenda();
            form.setVisible(true);
            
            form.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e)
                {
                    iniciaVenda();
                    e.getWindow().dispose();
                }
            });
        }else{ 
            BeansVenda modv;
            modv = setMod();
            
            if(!modv.isSuccess()){
                return;
            }
            
            if(venda.add(modv)){
                printItem(modv);
            }
            
            conex.conexao();
            conex.executaSql("SELECT * FROM produtos WHERE id = "+modv.getProduto());
                       
            atualizaTotal(mod.getVenda());
             
            txtProduto.setText("");
            txtProduto.setFocusable(true);
            txtProduto.requestFocus();
            txtQuantidade.setText("");
            txtQuantidade.setFocusable(false);
            txtSubtotal.setText("R$ 0,00");
        }  
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        FormBuscarProduto tela = new FormBuscarProduto(ID);
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
                txtProdutoActionPerformed(evt);
                e.getWindow().dispose();
            }
        });
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnConsultarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPrecoActionPerformed
        FrameConsultarPreco tela = new FrameConsultarPreco();
        tela.setVisible(true);
    }//GEN-LAST:event_btnConsultarPrecoActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        FormFormaDePagamento tela = new FormFormaDePagamento(sellNum, txtTotal.getText());
        tela.setVisible(true);
        
        
        final Timer timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    ArrayList<String> lines = new ArrayList();
                    FileReader arq = new FileReader("src/files/temp.txt");
                    BufferedReader lerArq = new BufferedReader(arq);
                    Path file = Paths.get("src/files/temp.txt");
                    
                    if(lerArq.readLine().equals("success")){
                        Timer newTimer = new Timer(3000, new ActionListener(){
                            public void actionPerformed(ActionEvent Ev){
                                txtProduto.setText("");
                                txtQuantidade.setText("");
                                txtNota.setText("");
                                txtTotal.setText("R$ 0,00");
                                txtProduto.setFocusable(true);
                                txtQuantidade.setFocusable(false);
                                txtProduto.requestFocus();
                            }
                        });
                        newTimer.setRepeats(false);
                        newTimer.start();
                        inVenda=false;
                        
                        lines.add("");
                        Files.write(file, lines, Charset.forName("UTF-8"));
                        
                        ((Timer)e.getSource()).stop();
                    }

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Arquivo temp.txt não encontrado!\n"+ex);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo temp.txt!\n"+ex);
                }
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start(); 
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void btnCancelarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarItemActionPerformed
        if(inVenda){
            FormCancelarItem form = new FormCancelarItem(sellNum);
            form.setVisible(true);
            form.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e)
                {
                    try {
                        //DECLARAÇÕES
                        FileReader arq = new FileReader("src/files/temp.txt");
                        BufferedReader lerArq = new BufferedReader(arq);
                        Path file = Paths.get("src/files/temp.txt");

                        ArrayList<String> lines = new ArrayList();
                        String partialId=lerArq.readLine();
                        int excludeID;
                       
                        //APAGA TUDO EM TEMP.TXT
                        lines.add("-");
                        Files.write(file, lines, Charset.forName("UTF-8"));
                        
                        //ATRIBUI O ID DO ITEM A SER EXCLUIDO
                        if(utili.isInt(partialId)){
                            excludeID=Integer.parseInt(partialId);
                        }else{
                            return;
                        }
                        
                        //PEGA OS VALORES DO BD PARA IMPRIMIR
                        conex.conexao();
                        int pdt;
                        double vlr;
                        int qtd;
                        double ttl;
                        String nome;
                        conex.executaSql("SELECT * FROM vendas WHERE id = "+excludeID);
                        conex.rs.first();
                        pdt=conex.rs.getInt("produto");
                        qtd=-conex.rs.getInt("quantidade");
                        
                        conex.executaSql("SELECT * FROM produtos WHERE id = "+pdt);
                        conex.rs.first();
                        vlr=conex.rs.getDouble("precoVenda");
                        nome=conex.rs.getString("nome");
                        conex.desconectar();
                        
                        ttl = vlr*qtd;
                        
                        //EXCLUI O ITEM
                        venda.remove(excludeID);
                        
                        //IMPRIME A EXCLUSÃO
                        
                        mod.setNome(nome);
                        mod.setVenda(vlr);
                        Bvenda.setQuantidade(qtd);
                        printItem(Bvenda);
                        
                        //ATUALIZA O TOTAL
                        atualizaTotal(-ttl);
                        
                        txtProduto.setText("");
                        txtQuantidade.setText("");
                        txtProduto.setFocusable(true);
                        txtQuantidade.setFocusable(false);
                        txtProduto.requestFocus();
                        
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Arquivo caixa.txt não encontrado!\n"+ex);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo atual.txt!\n"+ex);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao conectar com o Banco de Dados!");
                    }
                    e.getWindow().dispose();
                }
            });
        }else{
            JOptionPane.showMessageDialog(rootPane, "Não há nenhuma venda em andamento!");
        }
    }//GEN-LAST:event_btnCancelarItemActionPerformed

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        String texto = "Deseja realmente cancelar a venda numero "+sellNum+"?";
        
        if(JOptionPane.showConfirmDialog(rootPane, texto) == JOptionPane.YES_OPTION){
            if(venda.cancel(sellNum)){
                JOptionPane.showMessageDialog(rootPane, "Venda cancelada!");
                
                inVenda=false;
                
                txtTotal.setText("R$ 0,00");
                txtNota.setText("");
                txtProduto.setText("");
                txtQuantidade.setText("");
                txtProduto.setFocusable(true);
                txtQuantidade.setFocusable(false);
                txtProduto.requestFocus();
            }
        }
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private BeansVenda setMod(){
        int produto;
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        int caixa;
        int vendedor;
        String time="";
        
        //SETA O CARIMBO TEMPORAL
        time = DateFormat.getDateTimeInstance().format(new Date());
        String dia = time.substring(0, 2);
        String mes = time.substring(3, 5);
        String ano = time.substring(6, 10);
        time = ano+"-"+mes+"-"+dia+" "+time.substring(11);
        
        BeansVenda modv = new BeansVenda();
        
        
        //SETA O NUMERO DO CAIXA E O VENDEDOR
        try {
            FileReader arq = new FileReader("src/files/atual.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            caixa=Integer.parseInt(lerArq.readLine());
            
            arq = new FileReader("src/files/venda.txt");
            lerArq = new BufferedReader(arq);
            
            lerArq.readLine();
            String parc = lerArq.readLine();
            
            //RECUPERA O ID DO PRÓPRIO OPERADOR
            conex.conexao();
            conex.executaSql("SELECT * FROM usuarios WHERE id = "+ID);
            conex.rs.first();
            int funcID = conex.rs.getInt("funcID");
            conex.desconectar();
            
            if(parc.equals("-")){
                vendedor = funcID;
            }else{
                vendedor = Integer.parseInt(parc);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arquivo atual.txt ou venda.txt não encontrado!\n"+ex);
            modv.setSuccess(false);
            return modv;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo atual.txt ou venda.txt!\n"+ex);
            modv.setSuccess(false);
            return modv;
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao converter dados lidos em caixa.txt e venda.txr para inteiros!\n"+ex);
            modv.setSuccess(false);
            return modv;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar com o servidor!\n"+ex);
            modv.setSuccess(false);
            return modv;
        }

        //SETA O ID DO PRODUTO
        conex.conexao();
        conex.executaSql("SELECT * FROM produtos WHERE nome = '"+txtProduto.getText()+"'");
        try{
            conex.rs.first();
            produto = conex.rs.getInt("id");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar id do produto.\n"+ex);
            modv.setSuccess(false);
            return modv;
        }
        conex.desconectar();
        
        modv.setProduto(produto);
        modv.setQuantidade(quantidade);
        modv.setTime(time);
        modv.setCaixa(caixa);
        modv.setVendedor(vendedor);
        modv.setSellNum(sellNum);
        modv.setSuccess(true);
        return modv;
    }
    
    public void ClockPane() {
        tickTock();
     
        Timer timer = new Timer(500, new ActionListener(){
            public void actionPerformed(ActionEvent e){
            tickTock();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }  

    public void tickTock() {
        labelHora.setText("  "+DateFormat.getDateTimeInstance().format(new Date()).substring(11, 16));
    }
    
    public void leAtual(){
        try {
            FileReader arq = new FileReader("src/files/atual.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            ID=Integer.parseInt(lerArq.readLine());
            turno = lerArq.readLine();
            
            txtTurno.setText(turno);
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arquivo caixa.txt não encontrado!\n"+ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo atual.txt!\n"+ex);
        }
        
        try {
            conex.conexao();
            conex.executaSql("SELECT * FROM usuarios WHERE id = "+ID);
            conex.rs.first();
            int funcID = conex.rs.getInt("funcID");
            usuario = conex.rs.getString("username");
            conex.executaSql("SELECT * FROM funcionarios WHERE id = "+funcID);
            conex.rs.first();
            txtOperador.setText(conex.rs.getString("nome"));
            conex.desconectar();
        }catch(SQLException ex){JOptionPane.showMessageDialog(rootPane, ex);}
    }
    
    public void printHeader(){
        String cpf = "";
        String vendedor = "";
        String data = DateFormat.getDateTimeInstance().format(new Date()).substring(0, 10);
        String cliente = "";
        
        try {
            FileReader arq = new FileReader("src/files/venda.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            cpf = lerArq.readLine();
            if(!cpf.isEmpty()){
                cpf = cpf.substring(0, 3)+cpf.substring(4, 7)+cpf.substring(8, 11)+cpf.substring(12, 14);
            }
            vendedor = lerArq.readLine();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arquivo venda.txt não encontrado!\n"+ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo venda.txt!\n"+ex);
        }
        
        if(vendedor.equals("-")){
            vendedor = txtOperador.getText();
        }
        
        if(!cpf.isEmpty()){
            conex.conexao();
            conex.executaSql("SELECT * FROM clientes WHERE cpf = "+cpf);
            try{
                if(conex.rs.first()){
                    cliente = conex.rs.getString("nome");
                }else{
                    cliente = "Cliente não cadastrado.";
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Erro ao conectar com o servidor"+ex);
            }
            conex.desconectar();
        }
        
        
        String header ="---------------------CUPOM FISCAL--------------------"+"\n"
                      +"Cliente: " + cliente + "\n"
                      +"CPF: " + cpf + "\n"
                      +"Data: " + data + "\n"
                      +"Vendedor: " + vendedor + "\n"
                      +"====================================================="+"\n"
                      +"DESCRIÇÃO DO PRODUTO | VL UNITÁRIO |QUANTIDADE| TOTAL"+"\n"
                      +"====================================================="+"\n";
        
        txtNota.setText(header);
    }
    
    public void printItem(BeansVenda item){         //PRECISA CONSIDERAR CASO QUANTO LENGTH É MAIOR QUE 53!!!
        String print;
        
        String tudo = mod.getNome()+"R$ "+String.format("%.2f", mod.getVenda())+item.getQuantidade()+
                     "R$ "+String.format("%.2f", mod.getVenda()*item.getQuantidade());
        int numSpaces = 53-tudo.length();
        
        if(numSpaces>0){
            int spaces = numSpaces/3;
            String space="";
            for(int i=0 ; i<spaces ; i++){
                space = space+" ";
            }

            print = txtNota.getText()+mod.getNome()+space+"R$ "+String.format("%.2f", mod.getVenda())+space+item.getQuantidade()+
                           space+"R$ "+String.format("%.2f", mod.getVenda()*item.getQuantidade()).replace('.',',')+"\n";
        }else{
            print = txtNota.getText()+mod.getNome()+" R$ "+String.format("%.2f", mod.getVenda())+" "+item.getQuantidade()+
                           " R$ "+String.format("%.2f", mod.getVenda()*item.getQuantidade()).replace('.',',')+"\n";
        }
        txtNota.setText(print);
    }
    
    public void iniciaVenda(){
        BeansVenda modv;
        
        printHeader();
        sellNum = venda.start();
        
        modv = setMod();
        
        if(!modv.isSuccess()){
            return;
        }
        
        if(venda.add(modv)){
            printItem(modv);
        }
        
        txtProduto.setText("");
        txtProduto.setFocusable(true);
        txtProduto.requestFocus();
        txtQuantidade.setText("");
        txtQuantidade.setFocusable(false);
        txtSubtotal.setText("R$ 0,00");
        txtTotal.setText("R$ "+String.format("%.2f", modv.getQuantidade()*mod.getVenda()));   
    }
    
    public void atualizaTotal(double total){
        double preTotal = Double.parseDouble(txtTotal.getText().substring(3).replace(',', '.'));
        double totalFinal = total + preTotal;
        String valor = "R$ "+String.format("%.2f", totalFinal).replace('.', ',');
        txtTotal.setText(valor);
    }
    
    public void criaKeyBindings() {
       
        //ABRIR FORM CLIENTES
        Action openClientes = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClientesActionPerformed(e);
            }
        };
        
        btnClientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F2"),"f2");
        btnClientes.getActionMap().put("f2", openClientes);
        
        //ABRIR FORM DESPESAS
        Action openDespesas = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormSangria tela = new FormSangria();
                tela.setVisible(true);
            }
        };
        
        jLabelSubtotal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("control S"),"ctrl+s");
        jLabelSubtotal.getActionMap().put("ctrl+s", openDespesas);
        
        Action FinVenda = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnFinalizarVendaActionPerformed(e);
            }
        };
        
        jPanel1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F9"),"fin");
        jPanel1.getActionMap().put("fin", FinVenda);
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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int id=0;
                new Main2(id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarItem;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConsultarPreco;
    private javax.swing.JButton btnFechamento;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelSubtotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHora;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JLabel txtOperador;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
