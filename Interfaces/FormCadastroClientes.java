package Interfaces;

import Codigo.Utilitarios;
import javax.swing.JOptionPane;
import modeloBeans.BeansCliente;
import modeloDao.DaoCliente;

public class FormCadastroClientes extends javax.swing.JFrame {

    Utilitarios utili = new Utilitarios();
    BeansCliente mod = new BeansCliente();
    DaoCliente dao = new DaoCliente();
    
    public FormCadastroClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCelPessoal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFonePessoal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFoneComercial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLimCheques = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLimNotas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        comboUF = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 147, 86));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOVO CLIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel1.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setToolTipText("O nome deve ter entre 4 e 40 caracteres. Use abreviações se necessário.");

        txtData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel3.setText("Data de nascimento:*");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 156, 78));
        jLabel4.setText("Contato e Limites");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel5.setText("Celular Pessoal:");

        txtCelPessoal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCelPessoal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelPessoalFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel6.setText("Telefone Pessoal:*");

        txtFonePessoal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFonePessoal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFonePessoalFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel7.setText("Telefone comercial:*");

        txtFoneComercial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFoneComercial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFoneComercialFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel9.setText("Limite de Cheques:");

        txtLimCheques.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLimCheques.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLimChequesFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel10.setText("Limite de Notas:");

        txtLimNotas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLimNotas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLimNotasFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCelPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFonePessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLimCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLimNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelPessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFonePessoal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 156, 78));
        jLabel11.setText("Endereço");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel12.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEndereco.setToolTipText("O endereço deve ter entre 4 e 35 caracteres.");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel13.setText("Número:");

        txtNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel15.setText("Cidade:");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel16.setText("UF:");

        comboUF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboUF.setMaximumRowCount(20);
        comboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel14.setText("Bairro:*");

        txtBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBairro.setToolTipText("O campo bairro deve ter até 25 caracteres.");

        txtComplemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtComplemento.setToolTipText("O campo complemento pode ter até 15 caracteres.");

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel17.setText("Complemento:*");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel18.setText("CEP:*");

        txtCEP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
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
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEndereco))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtBairro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel19.setText("RG:*");

        txtRG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRGFocusLost(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel20.setText("CPF:");

        txtCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel21.setText("Os campos marcados com * não são obrigatórios.");

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
                            .addComponent(txtNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11)))
                        .addGap(577, 577, 577))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel21)
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

        setSize(new java.awt.Dimension(775, 701));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyReleased
        txtData.setText(utili.formataData(txtData.getText()));
    }//GEN-LAST:event_txtDataKeyReleased

    private void txtRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRGFocusLost
        txtRG.setText(utili.formataRG(txtRG.getText()));
    }//GEN-LAST:event_txtRGFocusLost

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        txtCPF.setText(utili.formataCPF(txtCPF.getText()));
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtCelPessoalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelPessoalFocusLost
        txtCelPessoal.setText(utili.formataFone(txtCelPessoal.getText()));
    }//GEN-LAST:event_txtCelPessoalFocusLost

    private void txtFonePessoalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFonePessoalFocusLost
        txtFonePessoal.setText(utili.formataFone(txtFonePessoal.getText()));
    }//GEN-LAST:event_txtFonePessoalFocusLost

    private void txtFoneComercialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFoneComercialFocusLost
        txtFoneComercial.setText(utili.formataFone(txtFoneComercial.getText()));
    }//GEN-LAST:event_txtFoneComercialFocusLost

    private void txtLimChequesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLimChequesFocusLost
        txtLimCheques.setText(utili.formataPreco(txtLimCheques.getText().replace(',','.')));
    }//GEN-LAST:event_txtLimChequesFocusLost

    private void txtLimNotasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLimNotasFocusLost
         txtLimNotas.setText(utili.formataPreco(txtLimNotas.getText().replace(',','.')));
    }//GEN-LAST:event_txtLimNotasFocusLost

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        txtCEP.setText(utili.formataCEP(txtCEP.getText()));
    }//GEN-LAST:event_txtCEPFocusLost

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //-------------------------TESTES--------------------------------------
        if(txtNome.getText().length()<4 || txtNome.getText().length()>40){
            JOptionPane.showMessageDialog(rootPane, "O campo nome deve ter entre 4 e 40 caracteres! Use abreviações se necessário.");
            txtNome.requestFocus();
            txtNome.selectAll();
        }else if(!utili.isData(txtData.getText()) && !txtData.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Data inválida! Utilize o formato dd/mm/aaaa.");
            txtData.requestFocus();
            txtData.selectAll();
        }else if(!utili.isRG(txtRG.getText()) && !txtRG.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "RG inválido! Insira todos os dígitos sem utilizar pontuação.");
            txtRG.requestFocus();
            txtRG.selectAll();
        }else if(!utili.isCPF(txtCPF.getText())){
            JOptionPane.showMessageDialog(rootPane, "CPF inválido! Utilize apenas números.");
            txtCPF.requestFocus();
            txtCPF.selectAll();
        }else if(!utili.isFone(txtCelPessoal.getText())){
            JOptionPane.showMessageDialog(rootPane, "Celular pessoal inválido! Utilize apenas números e inclua o DDD.");
            txtCelPessoal.requestFocus();
            txtCelPessoal.selectAll();
        }else if(!utili.isFone(txtFonePessoal.getText()) && !txtFonePessoal.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Telefone pessoal inválido! Utilize apenas números e inclua o DDD.");
            txtFonePessoal.requestFocus();
            txtFonePessoal.selectAll();
        }else if(!utili.isFone(txtFoneComercial.getText()) && !txtFoneComercial.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Telefone comercial inválido! Utilize apenas números e inclua o DDD.");
            txtFoneComercial.requestFocus();
            txtFoneComercial.selectAll();
        }else if(!utili.isPreco(txtLimCheques.getText())){
            JOptionPane.showMessageDialog(rootPane, "Limite de cheques inválido! Utilize o formato XXX,xx.");
            txtLimCheques.requestFocus();
            txtLimCheques.selectAll();
        }else if(!utili.isPreco(txtLimNotas.getText())){
            JOptionPane.showMessageDialog(rootPane, "Limite de notas inválido! Utilize o formato XXX,xx.");
            txtLimNotas.requestFocus();
            txtLimNotas.selectAll();
        }else if(txtEndereco.getText().length()<4 || txtEndereco.getText().length()>35){
            JOptionPane.showMessageDialog(rootPane, "O campo endereço deve ter entre 4 e 35 caracteres! Use abreviações se necessário.");
            txtEndereco.requestFocus();
            txtEndereco.selectAll();
        }else if(!utili.isInt(txtNumero.getText())){
            JOptionPane.showMessageDialog(rootPane, "Número inválido!");
            txtNumero.requestFocus();
            txtNumero.selectAll();
        }else if(txtBairro.getText().length()>25){
            JOptionPane.showMessageDialog(rootPane, "O campo bairro deve ter no máximo 25 caracteres! Use abreviações se necessário.");
            txtBairro.requestFocus();
            txtBairro.selectAll();
        }else if(txtComplemento.getText().length()>15){
            JOptionPane.showMessageDialog(rootPane, "O campo bairro deve ter no máximo 15 caracteres! Use abreviações se necessário.");
            txtComplemento.requestFocus();
            txtComplemento.selectAll();
        }else if(txtCidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "O campo cidade não pode ficar em branco.");
            txtCidade.requestFocus();
        }else if(comboUF.getSelectedItem().equals("-")){
            JOptionPane.showMessageDialog(rootPane, "Você não selecionou nenhum estado!");
            comboUF.requestFocus();
            comboUF.showPopup();
        }else if(!utili.isCEP(txtCEP.getText()) && !txtCEP.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "CEP digitado inválido! Utilize apenas números.");
            txtCEP.requestFocus();
            txtCEP.selectAll();
        }else{

            //--------------------ATRIBUIÇÕES-----------------------------
            String nome = txtNome.getText().toUpperCase();
            String data = "";
            String rg = "";
            String cpf = txtCPF.getText().substring(0, 3)+txtCPF.getText().substring(4, 7)+txtCPF.getText().substring(8, 11)+txtCPF.getText().substring(12);
            String celPessoal = utili.foneToInteger(txtCelPessoal.getText());
            String fonePessoal = "";
            String foneComercial = "";
            double limCheques = Double.parseDouble(txtLimCheques.getText().substring(3).replace(',', '.'));
            double limNotas = Double.parseDouble(txtLimNotas.getText().substring(3).replace(',', '.'));
            String endereco = txtEndereco.getText().toUpperCase();
            int numero = Integer.parseInt(txtNumero.getText());
            String bairro = txtBairro.getText().toUpperCase();
            String complemento = txtComplemento.getText().toUpperCase();
            String cidade = txtCidade.getText().toUpperCase();
            String uf = String.valueOf(comboUF.getSelectedItem());
            String cep = txtCEP.getText();
        
            if(!txtData.getText().isEmpty()){
                data = txtData.getText().substring(6)+"-"+txtData.getText().substring(3,5)+"-"+txtData.getText().substring(0,2);
            }
            if(!txtRG.getText().isEmpty()){
                rg = txtRG.getText().substring(0, 2)+txtRG.getText().substring(3, 6)+txtRG.getText().substring(7, 10)+txtRG.getText().charAt(11);
            }
            if(!txtFonePessoal.getText().isEmpty()){
                fonePessoal = utili.foneToInteger(txtFonePessoal.getText());
            }
            if(!txtFoneComercial.getText().isEmpty()){
                foneComercial = utili.foneToInteger(txtFoneComercial.getText());
            }
            
            //--------------------CADASTRO---------------------------------------,
            mod.setNome(nome);
            mod.setData(data);
            mod.setRG(rg);
            mod.setCPF(cpf);
            mod.setCelPessoal(celPessoal);
            mod.setFonePessoal(fonePessoal);
            mod.setFoneComercial(foneComercial);
            mod.setLimiteCheques(limCheques);
            mod.setLimiteNotas(limNotas);
            mod.setEndereco(endereco);
            mod.setNumero(numero);
            mod.setBairro(bairro);
            mod.setComplemento(complemento);
            mod.setCidade(cidade);
            mod.setUf(uf);
            mod.setCEP(cep);
            mod.setCredito(0);
            dao.cadastrar(mod);
            
            dispose();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> comboUF;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelPessoal;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFoneComercial;
    private javax.swing.JTextField txtFonePessoal;
    private javax.swing.JTextField txtLimCheques;
    private javax.swing.JTextField txtLimNotas;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
