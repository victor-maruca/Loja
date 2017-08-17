package Interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modeloBeans.BeansProduto;
import Codigo.Utilitarios;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import modeloBeans.BeansFornecedor;
import modeloConnection.DBCon;
import modeloDao.DaoFornecedor;
import modeloDao.DaoProduto;

public class FormCadastroProdutos extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    Utilitarios utili = new Utilitarios();
    BeansProduto  mod = new BeansProduto();
    BeansFornecedor forn = new BeansFornecedor();
    DaoProduto dao = new DaoProduto();
    DaoFornecedor daoForn = new DaoFornecedor();
    
    ArrayList<String> tipos = new ArrayList();
    ArrayList<String> tiposCod = new ArrayList();
    ArrayList<String> tiposEst = new ArrayList();
    
    public FormCadastroProdutos() {
        initComponents();
        populaCombo("SELECT * FROM unidades ORDER BY un", comboUnidade);
        populaCombo("SELECT * FROM fornecedores ORDER BY nome", comboFornecedores);
        preencheFornecedor();
        selecionaSemFornecedor();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        radioUnico = new javax.swing.JRadioButton();
        radioMultiplos = new javax.swing.JRadioButton();
        txtDescricao = new javax.swing.JTextField();
        comboUnidade = new javax.swing.JComboBox<>();
        btnNovaUnidade = new javax.swing.JButton();
        txtAddTipos = new javax.swing.JTextField();
        comboTipos = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCusto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPorcentagem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtVenda = new javax.swing.JTextField();
        txtEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboTiposEstoque = new javax.swing.JComboBox<>();
        btnConfirmar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtFornecedor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        comboUF = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtFone1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtFone2 = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        comboFornecedores = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        comboTiposCod = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("NOVO PRODUTO");
        jPanel2.add(jLabel8);

        radioUnico.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioUnico);
        radioUnico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        radioUnico.setForeground(new java.awt.Color(52, 52, 52));
        radioUnico.setSelected(true);
        radioUnico.setText("Produto Único");
        radioUnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUnicoActionPerformed(evt);
            }
        });

        radioMultiplos.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioMultiplos);
        radioMultiplos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        radioMultiplos.setForeground(new java.awt.Color(52, 52, 52));
        radioMultiplos.setText("Produtos Múltiplos");
        radioMultiplos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMultiplosActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });

        comboUnidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboUnidade.setMaximumRowCount(20);
        comboUnidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboUnidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboUnidadeFocusLost(evt);
            }
        });
        comboUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUnidadeActionPerformed(evt);
            }
        });

        btnNovaUnidade.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnNovaUnidade.setText("Nova unidade");
        btnNovaUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaUnidadeActionPerformed(evt);
            }
        });

        txtAddTipos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAddTipos.setEnabled(false);
        txtAddTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddTiposActionPerformed(evt);
            }
        });

        comboTipos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTipos.setMaximumRowCount(10);
        comboTipos.setEnabled(false);
        comboTipos.setMaximumSize(new java.awt.Dimension(32, 23));

        txtCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel1.setText("Descrição");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel2.setText("Adicionar tipos*");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel3.setText("Unidade");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel4.setText("Tipos*");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel5.setText("Código*");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        txtCusto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustoFocusLost(evt);
            }
        });
        txtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel6.setText("Preço de custo");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");

        txtPorcentagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPorcentagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentagemFocusLost(evt);
            }
        });
        txtPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentagemActionPerformed(evt);
            }
        });
        txtPorcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorcentagemKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel7.setText("%");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel9.setText("%");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel11.setText("=");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel12.setText("Preço de venda");

        txtVenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVendaFocusLost(evt);
            }
        });
        txtVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVendaKeyReleased(evt);
            }
        });

        txtEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel13.setText("Estoque inicial");

        comboTiposEstoque.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTiposEstoque.setMaximumRowCount(10);
        comboTiposEstoque.setEnabled(false);

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel23.setText("Tipo*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTiposEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtCusto)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPorcentagem)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVenda)
                    .addComponent(txtEstoque)
                    .addComponent(comboTiposEstoque))
                .addGap(31, 31, 31))
        );

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 156, 78));
        jLabel14.setText("Preço e Estoque");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        txtFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFornecedor.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel16.setText("Nome");

        txtCNPJ.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCNPJ.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel17.setText("CNPJ*");

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEndereco.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel18.setText("Endereço*");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCidade.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel19.setText("Cidade*");

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel20.setText("UF*");

        comboUF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUF.setEnabled(false);
        comboUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUFActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel21.setText("Telefone 1*");

        txtFone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFone1.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel22.setText("Telefone 2*");

        txtFone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFone2.setEnabled(false);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFornecedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 199, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addContainerGap())))
        );

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(250, 156, 78));
        jLabel15.setText("Fornecedor");

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.setEnabled(false);
        btnAdd.setPreferredSize(new java.awt.Dimension(23, 23));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.setEnabled(false);
        btnSub.setPreferredSize(new java.awt.Dimension(23, 23));
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        comboFornecedores.setMaximumRowCount(15);
        comboFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFornecedoresActionPerformed(evt);
            }
        });

        jLabel24.setText("Os campos marcados com um  *  não são obrigatórios.");

        comboTiposCod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTiposCod.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel25.setText("Tipo*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5))
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNovaUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioMultiplos)
                                            .addComponent(radioUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(txtAddTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboTiposCod, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioUnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioMultiplos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTiposCod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 740);

        setSize(new java.awt.Dimension(907, 774));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddTiposActionPerformed
        btnAddActionPerformed(evt);
    }//GEN-LAST:event_txtAddTiposActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if(comboTiposCod.isEnabled()){
            if(utili.isInt(txtCodigo.getText())){
                if(comboTiposCod.getSelectedIndex()==-1){
                    JOptionPane.showMessageDialog(rootPane, "Não há nenhum tipo selecionado!");
                    comboTiposCod.requestFocus();
                    return;
                }
                
                String item = String.valueOf(comboTiposCod.getSelectedItem());
                
                if(item.charAt(0)=='(' && utili.isInt(String.valueOf(item.charAt(1)))){
                    JOptionPane.showMessageDialog(rootPane, "Este item já possui um codigo definido.\n"
                        + "Para alterá-lo, remova o item com o botão ' - ' e adicione novamente.");
                    txtCodigo.setText("");
                    return;
                }
                
                if(txtCodigo.getText().isEmpty()) { 
                    JOptionPane.showMessageDialog(rootPane, "O campo codigo não pode ficar em branco!");
                    txtCodigo.requestFocus();
                    return;
                }
                
                tiposCod.remove(comboTiposCod.getSelectedIndex());
                tiposCod.add(comboTiposCod.getSelectedIndex(), "("+txtCodigo.getText()+") "+item);
                comboTiposCod.setModel(new DefaultComboBoxModel(tiposCod.toArray()));
                
                txtCodigo.requestFocus();
                txtCodigo.setText("");
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Código digitado é inválido!");
                txtCodigo.requestFocus();
                txtCodigo.selectAll();
            }
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentagemActionPerformed

    private void comboUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUnidadeActionPerformed
        conex.conexao();
        if(comboUnidade.isEditable()){    
            if(!String.valueOf(comboUnidade.getEditor().getItem()).isEmpty()){    
                try {
                    conex.executaSql("SELECT * FROM unidades WHERE un = '"+String.valueOf(comboUnidade.getEditor().getItem()).toUpperCase()+"'");
                    
                    if(conex.rs.first()){
                        comboUnidade.setSelectedItem(String.valueOf(comboUnidade.getEditor().getItem()).toUpperCase());
                        comboUnidade.setEditable(false);
                        txtCusto.requestFocus();

                    }else{
                        conex.executaUpdate("INSERT INTO unidades (un) VALUES ('"+String.valueOf(comboUnidade.getEditor().getItem()).toUpperCase()
                                +"')");
                        
                        String novaUn = String.valueOf(comboUnidade.getEditor().getItem()).toUpperCase();
                        populaCombo("SELECT * FROM unidades ORDER BY un", comboUnidade);

                        comboUnidade.setSelectedItem(novaUn);
                        comboUnidade.setEditable(false);
                        txtCusto.requestFocus();
                    }
                }catch(SQLException ex) {}
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Não é possível cadastrar uma nova unidade em branco!");
                comboUnidade.setEditable(false);
                comboUnidade.setSelectedIndex(1);
            }    
        }else{
            txtCusto.requestFocus();
        }    
        conex.desconectar();
    }//GEN-LAST:event_comboUnidadeActionPerformed

    private void radioUnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUnicoActionPerformed
        txtAddTipos.setEnabled(false);
        comboTipos.setEnabled(false);
        comboTiposEstoque.setEnabled(false);
        comboTiposCod.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnAdd.setEnabled(false);
        btnSub.setEnabled(false);
    }//GEN-LAST:event_radioUnicoActionPerformed

    private void radioMultiplosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMultiplosActionPerformed
        txtAddTipos.setEnabled(true);
        comboTipos.setEnabled(true);
        comboTiposEstoque.setEnabled(true);
        comboTiposCod.setEnabled(true);
        btnConfirmar.setEnabled(true);
        btnAdd.setEnabled(true);
        btnSub.setEnabled(true);
    }//GEN-LAST:event_radioMultiplosActionPerformed

    private void btnNovaUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaUnidadeActionPerformed
        comboUnidade.hidePopup();
        comboUnidade.setEditable(true);
        comboUnidade.requestFocus();
        comboUnidade.getEditor().setItem("");
    }//GEN-LAST:event_btnNovaUnidadeActionPerformed

    private void comboUnidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboUnidadeFocusLost
       
    }//GEN-LAST:event_comboUnidadeFocusLost

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtAddTipos.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "O campo adicionar tipos está em branco!");
            txtAddTipos.requestFocus();
        }else{
            boolean add = false;
            for(int i=0 ; i<comboTipos.getItemCount() ; i++){
                if(txtAddTipos.getText().toUpperCase().equals(comboTipos.getItemAt(i))){
                    JOptionPane.showMessageDialog(rootPane, "Este tipo já foi adicionado!");
                    txtAddTipos.setText("");
                    txtAddTipos.requestFocus();
                    add = true;
                    break;
                }
            }
            
            if(!add){
                tipos.add(txtAddTipos.getText().toUpperCase());
                tiposCod.add(txtAddTipos.getText().toUpperCase());
                tiposEst.add(txtAddTipos.getText().toUpperCase());
                
                comboTipos.setModel(new DefaultComboBoxModel(tipos.toArray()));
                comboTiposEstoque.setModel(new DefaultComboBoxModel(tiposEst.toArray()));
                comboTiposCod.setModel(new DefaultComboBoxModel(tiposCod.toArray()));
                comboTipos.setSelectedItem(txtAddTipos.getText().toUpperCase());
                txtAddTipos.setText("");
                txtAddTipos.requestFocus();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void comboUnidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboUnidadeFocusGained
    
    }//GEN-LAST:event_comboUnidadeFocusGained

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        if(comboTipos.getItemCount()==0){
            JOptionPane.showMessageDialog(rootPane, "Não há nenhum tipo adicionado na lista!");
        }else{
            int index = comboTipos.getSelectedIndex();
            tipos.remove(index);
            tiposCod.remove(index);
            tiposEst.remove(index);
            
            comboTipos.setModel(new DefaultComboBoxModel(tipos.toArray()));
            comboTiposEstoque.setModel(new DefaultComboBoxModel(tiposEst.toArray()));
            comboTiposCod.setModel(new DefaultComboBoxModel(tiposCod.toArray()));
        }
    }//GEN-LAST:event_btnSubActionPerformed

    private void txtPorcentagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentagemKeyReleased
        if(!txtCusto.getText().isEmpty()){
            String Custo = (String.valueOf(txtCusto.getText()).replace(',','.')).substring(3);
            String Perc = String.valueOf(txtPorcentagem.getText()).replace(',','.');
            
            if(!utili.isDouble(Custo)){return;}
            if(!utili.isDouble(Perc)){return;}
            
            double custo = Double.parseDouble(Custo);
            double perc = Double.parseDouble(Perc)/100;
            
            txtVenda.setText("R$ "+String.format("%.2f", custo*perc).replace('.',','));
        }
    }//GEN-LAST:event_txtPorcentagemKeyReleased

    private void txtCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustoFocusLost
        if(utili.isDouble(String.valueOf(txtCusto.getText()).replace(',','.'))){
            txtCusto.setText("R$ "+String.format("%.2f", Double.valueOf(String.valueOf(txtCusto.getText()).replace(',','.'))).replace('.', ','));
        }         
    }//GEN-LAST:event_txtCustoFocusLost

    private void txtVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendaKeyReleased
        if(!txtCusto.getText().isEmpty()){
            String Custo = (String.valueOf(txtCusto.getText()).replace(',','.')).substring(3);
            String Venda = String.valueOf(txtVenda.getText()).replace(',','.');
            
            if(!utili.isDouble(Custo)){return;}
            if(!utili.isDouble(Venda)){return;}
            
            double custo = Double.parseDouble(Custo);
            double venda = Double.parseDouble(Venda);
            
            txtPorcentagem.setText(String.format("%.2f", 100*venda/custo).replace('.',','));
        }
    }//GEN-LAST:event_txtVendaKeyReleased

    private void txtPorcentagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentagemFocusLost
        if(utili.isDouble(String.valueOf(txtPorcentagem.getText()).replace(',','.'))){
            txtPorcentagem.setText(String.format("%.2f", Double.valueOf(txtPorcentagem.getText().replace(',', '.'))).replace('.', ','));
        }   
        txtPorcentagemKeyReleased(new KeyEvent(this, WIDTH, WIDTH, ICONIFIED, ERROR));
    }//GEN-LAST:event_txtPorcentagemFocusLost

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(utili.isInt(txtEstoque.getText()) || txtEstoque.getText().isEmpty()){ 
            if(comboTiposEstoque.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(rootPane, "Não há nenhum tipo selecionado!");
                comboTiposEstoque.requestFocus();
                return;
            }
            
            String item = String.valueOf(comboTiposEstoque.getSelectedItem());
            
            if(item.charAt(0)=='(' && utili.isInt(String.valueOf(item.charAt(1)))){
                JOptionPane.showMessageDialog(rootPane, "Este item já possui um valor de estoque inicial definido.\n"
                        + "Para alterá-lo, remova o item com o botão ' - ' e adicione novamente.");
                return;
            }
            
            if(txtEstoque.getText().isEmpty()) { 
                txtEstoque.setText("0");
            }
            
            tiposEst.remove(comboTiposEstoque.getSelectedIndex());
            tiposEst.add(comboTiposEstoque.getSelectedIndex(), "("+txtEstoque.getText()+") "+item);
            comboTiposEstoque.setModel(new DefaultComboBoxModel(tiposEst.toArray()));
            
            txtEstoque.requestFocus();
            txtEstoque.selectAll();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Valor digitado é inválido!");
            txtEstoque.setText("");
            txtEstoque.requestFocus();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueActionPerformed
        if(btnConfirmar.isEnabled()){
            btnConfirmarActionPerformed(evt);
        }
    }//GEN-LAST:event_txtEstoqueActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtFornecedor.setEnabled(true);
        txtCNPJ.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtCidade.setEnabled(true);
        txtFone1.setEnabled(true);
        txtFone2.setEnabled(true);
        comboUF.setEnabled(true);
        txtFornecedor.requestFocus();
        
        txtFornecedor.setText("");
        txtCNPJ.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtFone1.setText("");
        txtFone2.setText("");
        comboUF.setSelectedItem("-");
        
        for(int i=0 ; i<comboFornecedores.getItemCount() ; i++){
            if(String.valueOf(comboFornecedores.getItemAt(i)).equals("Novo fornecedor")){
                break;
            }
            if(i==comboFornecedores.getItemCount()-1){
                comboFornecedores.addItem("Novo fornecedor");
            }
        }
        comboFornecedores.setSelectedItem("Novo fornecedor");  
    }//GEN-LAST:event_btnNovoActionPerformed

    private void comboUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUFActionPerformed

    private void comboFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFornecedoresActionPerformed
        if(String.valueOf(comboFornecedores.getSelectedItem()).equals("Novo fornecedor")){
            btnNovoActionPerformed(evt);
        }else{
            preencheFornecedor();
            txtFornecedor.setEnabled(false);
            txtCNPJ.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtCidade.setEnabled(false);
            txtFone1.setEnabled(false);
            txtFone2.setEnabled(false);
            comboUF.setEnabled(false);
        }
    }//GEN-LAST:event_comboFornecedoresActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(txtDescricao.getText().isEmpty()){                                                               //TESTA SE É VAZIO
            JOptionPane.showMessageDialog(rootPane, "O campo 'Descrição' não pode ficar em branco!");
        }else if(txtCusto.getText().isEmpty()){                                                             //TESTA SE É VAZIO
             JOptionPane.showMessageDialog(rootPane, "O campo 'Preço de custo' não pode ficar em branco!");
        }else if(txtVenda.getText().isEmpty()){                                                             //TESTA SE É VAZIO
             JOptionPane.showMessageDialog(rootPane, "O campo 'Preço de venda' não pode ficar em branco!");
        }else if(txtEstoque.getText().isEmpty() && radioUnico.isSelected()){                                //TESTA SE É VAZIO
             JOptionPane.showMessageDialog(rootPane, "O campo 'Estoque inicial' não pode ficar em branco!");
        }else if(txtFornecedor.getText().isEmpty()){                                                        //TESTA SE É VAZIO
             JOptionPane.showMessageDialog(rootPane, "O campo 'Fornecedor' não pode ficar em branco!");
        }else{
            String nome= txtDescricao.getText().toUpperCase();
            String codigo = txtCodigo.getText();
            String fornecedor = txtFornecedor.getText().toUpperCase();
            String unidade = String.valueOf(comboUnidade.getSelectedItem());
            String cnpj = txtCNPJ.getText();
            String cidade = txtCidade.getText().toUpperCase();
            String uf = String.valueOf(comboUF.getSelectedItem());
            String end = txtEndereco.getText().toUpperCase();
            String fone1 = txtFone1.getText();
            String fone2 = txtFone2.getText();
            double custo, venda;
            int estoque;
            
            //TESTA SE A DESCRIÇÃO NÃO É MUITO GRANDE
            if(nome.length()>60){
                JOptionPane.showMessageDialog(rootPane, "A descrição do produto não pode ter mais que 60 caracteres!");
                txtDescricao.requestFocus();
                txtDescricao.selectAll();
                return;
            }
            
            //TESTA SE O CÓDIGO NÃO É MUITO GRANDE
            if(codigo.length()>20){
                JOptionPane.showMessageDialog(rootPane, "O código do produto não pode ter mais que 20 caracteres!");
                txtCodigo.requestFocus();
                txtCodigo.selectAll();
                return;
            }
            
            //TESTA SE O CÓDIGO É INTEIRO
            if(!utili.isInt(codigo) && !codigo.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Código inválido!");
                txtCodigo.requestFocus();
                txtCodigo.selectAll();
                return;
            }
            
            //TESTA SE O CUSTO É VALIDO
            if(!utili.isDouble(String.valueOf(txtCusto.getText()).substring(3).replace(',','.'))){
                JOptionPane.showMessageDialog(rootPane, "Valor de custo inválido! Utilize o formato XX,XX");
                txtCusto.requestFocus();
                txtCusto.selectAll();
                return;
            }else{
                custo = Double.parseDouble(String.valueOf(txtCusto.getText()).substring(3).replace(',','.'));
            }
            
            //TESTA SE A VENDA É VALIDA
            if(!utili.isDouble(String.valueOf(txtVenda.getText()).substring(3).replace(',','.'))){
                JOptionPane.showMessageDialog(rootPane, "Valor de venda inválido! Utilize o formato XX,XX");
                txtVenda.requestFocus();
                txtVenda.selectAll();
                return;
            }else{
                venda = Double.parseDouble(String.valueOf(txtVenda.getText()).substring(3).replace(',','.'));
            }
            
            //TESTA SE O ESTOQUE É VÁLIDO
            if(!utili.isInt(txtEstoque.getText()) && radioUnico.isSelected()){
                JOptionPane.showMessageDialog(rootPane, "Valor de estoque inicial inválido!");
                txtEstoque.requestFocus();
                txtEstoque.selectAll();
                return;
            }else if(radioMultiplos.isSelected()){
                estoque=0;
            }else{
                estoque=Integer.parseInt(txtEstoque.getText());
            }
            
            //TESTA SE O FORNECEDOR NÃO É MUITO GRANDE
            if(txtFornecedor.getText().length()>35){
                JOptionPane.showMessageDialog(rootPane, "Nome do fornecedor não pode exceder 35 caracteres!");
                txtFornecedor.requestFocus();
                txtFornecedor.selectAll();
                return;
            }
            
            //TESTA SE O CNPJ É VÁLIDO
            if(!utili.testaCnpj(txtCNPJ.getText()) && !txtCNPJ.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "CNPJ inválido! Utilize apenas números.");
                txtCNPJ.requestFocus();
                txtCNPJ.selectAll();
                return;
            }
            
            //TESTA SE O ENDEREÇO NÃO É MUITO GRANDE
            if(txtEndereco.getText().length()>50){
                JOptionPane.showMessageDialog(rootPane, "O campo endereço não pode exceder 50 caracteres!");
                txtEndereco.requestFocus();
                txtEndereco.selectAll();
                return;
            }
            
            //TESTA SE A CIDADE NÃO É MUITO GRANDE
            if(txtCidade.getText().length()>25){
                JOptionPane.showMessageDialog(rootPane, "O campo cidade não pode exceder 25 caracteres!");
                txtCidade.requestFocus();
                txtCidade.selectAll();
                return;
            }
            
            //TESTA SE O TELEFONE 1 NÃO É MUITO GRANDE OU INVÁLIDO
            if((!utili.testaFone(txtFone1.getText()) || txtFone1.getText().length()>15) && !txtFone1.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Telefone 1 inválido! Utilize o formato (xx)'x' xxxx-xxxx ou apenas numeros (Necessário DDD!).");
                txtFone1.requestFocus();
                txtFone1.selectAll();
                return;
            }
            
            //TESTA SE O TELEFONE 2 NÃO É MUITO GRANDE OU INVÁLIDO
            if((!utili.testaFone(txtFone2.getText()) || txtFone2.getText().length()>15) && !txtFone2.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Telefone 2 inválido! Utilize o formato (xx)'x' xxxx-xxxx ou apenas numeros (Necessário DDD!).");
                txtFone2.requestFocus();
                txtFone2.selectAll();
                return;
            }
            
            //TESTA, SE O BOTAO MULTIPLOS ESTIVER SELECIONADO, SE FORAM ATRIBUIDOS VALORES PARA TODOS OS ITENS
            if(radioMultiplos.isSelected()){
                int k;
                
                for(k=0 ; k<comboTipos.getItemCount() ; k++){
                    if(String.valueOf(comboTiposEstoque.getItemAt(k)).charAt(0) != '(' || !utili.isInt(String.valueOf((String.valueOf(comboTiposEstoque.getItemAt(k)).charAt(1))))){
                        JOptionPane.showMessageDialog(rootPane, "É necessário especificar o estoque inicial para todos os tipos!");
                        txtEstoque.requestFocus();
                        return;
                    }
                }
            }
            
//-------------------------------------COMEÇA O CADASTRO---------------------------------------------------------------//----------------------------------------//

            //FORNECEDOR
            int ret=1;
            if(comboFornecedores.getSelectedItem().equals("Novo fornecedor")){
                if(!daoForn.fornecedorJaCadastrado(fornecedor)){
                    forn.setNome(fornecedor);
                    forn.setCnpj(cnpj);
                    forn.setEnd(end);
                    forn.setCidade(cidade);
                    forn.setUf(uf);
                    forn.setFone1(fone1);
                    forn.setFone2(fone2);
                    ret = daoForn.cadastrar(forn);
                }
            }
            if(ret==0){
                JOptionPane.showMessageDialog(rootPane, "Problema ao cadastrar fornecedor!");
                return;
            }
            
            //A PARTIR DAQUI ---> FORNECEDOR OK! ----------------------------------------------
            int fornecedorID;
            conex.conexao();
            conex.executaSql("SELECT * FROM fornecedores WHERE nome = '"+fornecedor+"'");
            try{
                conex.rs.first();
                fornecedorID = conex.rs.getInt("id");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "Problema ao buscar fornecedor.");
                return;
            }
            
            if(radioMultiplos.isSelected()){
                mod.setCusto(custo);
                mod.setVenda(venda);
                mod.setUnidade(unidade);
                mod.setFornecedor(fornecedorID);
                
                int numTipos = comboTipos.getItemCount();
                String codTipo, nomeTipo;
                int quantTipo;

                
                for(int j=0 ; j<numTipos ; j++){
                    nomeTipo = nome + " - " + comboTipos.getItemAt(j);
                    if(comboTiposCod.getItemAt(j).charAt(0) == '('){
                        codTipo = String.valueOf(comboTiposCod.getItemAt(j)).substring(1, achaParentese(comboTiposCod.getItemAt(j)));
                    }else{
                        codTipo = "";
                    }    
                    quantTipo = Integer.parseInt(String.valueOf(comboTiposEstoque.getItemAt(j)).substring(1, achaParentese(comboTiposCod.getItemAt(j))));
                   
                    
                    mod.setNome(nomeTipo);
                    mod.setCodigo(codTipo);
                    mod.setQuantidade(quantTipo);
                    dao.cadastrar(mod);
                }
                
            }else{
                mod.setNome(nome);
                mod.setCusto(custo);
                mod.setVenda(venda);
                mod.setUnidade(unidade);
                mod.setCodigo(codigo);
                mod.setQuantidade(estoque);
                mod.setFornecedor(fornecedorID);
                dao.cadastrar(mod);
            }
            FormCadastroProdutos tela = new FormCadastroProdutos();
            tela.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoActionPerformed

    private void txtVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVendaFocusLost
        if(utili.isDouble(String.valueOf(txtVenda.getText()).replace(',','.'))){
            txtVenda.setText("R$ "+String.format("%.2f", Double.valueOf(String.valueOf(txtVenda.getText()).replace(',','.'))).replace('.', ','));
        }         
    }//GEN-LAST:event_txtVendaFocusLost

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        txtDescricao.setText(txtDescricao.getText().toUpperCase());
    }//GEN-LAST:event_txtDescricaoFocusLost

    public void populaCombo(String sql, JComboBox combo){
        ArrayList<String> dados = new ArrayList();
        conex.conexao();
        conex.executaSql(sql);
        
        try{
            if(conex.rs.first()){
                do{
                    dados.add(conex.rs.getString(2));
                }while(conex.rs.next());
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList!\n"+ex);
        }
        combo.setModel(new DefaultComboBoxModel(dados.toArray()));
    }
    
    public void preencheFornecedor(){
        try {
            conex.conexao();
            conex.executaSql("SELECT * FROM fornecedores WHERE nome = '"+String.valueOf(comboFornecedores.getSelectedItem())+"'");
            
            conex.rs.first();
            
            txtFornecedor.setText(conex.rs.getString("nome"));
            txtCNPJ.setText(conex.rs.getString("cnpj"));
            txtEndereco.setText(conex.rs.getString("endereco"));
            txtCidade.setText(conex.rs.getString("cidade"));
            comboUF.setSelectedItem(conex.rs.getString("uf"));
            txtFone1.setText(conex.rs.getString("telefone1"));
            txtFone2.setText(conex.rs.getString("telefone2"));
            
            conex.desconectar();
        } catch (SQLException ex) {}
    }
    
    public void selecionaSemFornecedor(){
        if(comboFornecedores.getItemCount()==0){
            conex.conexao();
            conex.executaUpdate("INSERT INTO fornecedores (nome) VALUES ('Sem fornecedor')");
            conex.desconectar();
            populaCombo("SELECT * FROM fornecedores", comboFornecedores);
            selecionaSemFornecedor();
            return;
        }
        
        for(int i=0 ; i<comboFornecedores.getItemCount() ; i++){
            if(String.valueOf(comboFornecedores.getItemAt(i)).equals("Sem fornecedor")){
                comboFornecedores.setSelectedIndex(i);
                preencheFornecedor();
                return;
            }
            if(i==comboFornecedores.getItemCount()-1){
                conex.conexao();
                conex.executaUpdate("INSERT INTO fornecedores (nome) VALUES ('Sem fornecedor')");
                conex.desconectar();
                populaCombo("SELECT * FROM fornecedores", comboFornecedores);
                selecionaSemFornecedor();
            }
        }
    }
    
    public int achaParentese(String str){
        for(int i=1 ; i<str.length() ; i++){
            if(str.charAt(i)==')'){
                return i;
            }
        }
        return 0;
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
            java.util.logging.Logger.getLogger(FormCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnNovaUnidade;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSub;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboFornecedores;
    private javax.swing.JComboBox<String> comboTipos;
    private javax.swing.JComboBox<String> comboTiposCod;
    private javax.swing.JComboBox<String> comboTiposEstoque;
    private javax.swing.JComboBox<String> comboUF;
    private javax.swing.JComboBox<String> comboUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton radioMultiplos;
    private javax.swing.JRadioButton radioUnico;
    private javax.swing.JTextField txtAddTipos;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtFone1;
    private javax.swing.JTextField txtFone2;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtPorcentagem;
    private javax.swing.JTextField txtVenda;
    // End of variables declaration//GEN-END:variables
}
