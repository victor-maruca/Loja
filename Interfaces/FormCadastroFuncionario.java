package Interfaces;

import Codigo.Utilitarios;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modeloBeans.BeansFuncionario;
import modeloConnection.DBCon;
import modeloDao.DaoFuncionario;

public class FormCadastroFuncionario extends javax.swing.JFrame {

    DBCon conex = new DBCon();
    Utilitarios utili = new Utilitarios();
    BeansFuncionario mod = new BeansFuncionario();
    DaoFuncionario dao = new DaoFuncionario();
    
    public FormCadastroFuncionario() {
        initComponents();
        populaCombo("SELECT * FROM cargos ORDER BY cargo", comboCargo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFone1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFone2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboCargo = new javax.swing.JComboBox<>();
        btnNovoCargo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtLimNotas = new javax.swing.JTextField();
        txtLimCheques = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtLimVales = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel9.setText("Endereço:");

        txtEndereco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel1.setText("Número:");

        txtNumero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel10.setText("Complemento:*");

        txtComplemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel11.setText("Telefone 1:");

        txtFone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFone1.setToolTipText("Utilize apenas números.");
        txtFone1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFone1FocusLost(evt);
            }
        });
        txtFone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFone1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel12.setText("Telefone 2:*");

        txtFone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFone2.setToolTipText("Utilize apenas números.");
        txtFone2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFone2FocusLost(evt);
            }
        });
        txtFone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFone2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEndereco))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFone2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel2.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setToolTipText("O nome deve ter entre 4 e 35 caracteres.");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel3.setText("Cargo:");

        comboCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboCargo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboCargoFocusLost(evt);
            }
        });
        comboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCargoActionPerformed(evt);
            }
        });

        btnNovoCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNovoCargo.setText("Novo Cargo");
        btnNovoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCargoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel4.setText("Data de admissão:");

        txtData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setToolTipText("dd/mm/aaaa");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDataKeyReleased(evt);
            }
        });

        txtRG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtRG.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRG.setToolTipText("Utilize apenas números");
        txtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRGFocusLost(evt);
            }
        });
        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel5.setText("RG: *");

        txtSalario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalarioFocusLost(evt);
            }
        });
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel6.setText("Salário:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 147, 86));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOVO FUNCIONÁRIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(250, 156, 78));
        jLabel8.setText("Endereço e contatos");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 156, 78));
        jLabel13.setText("Limites");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 156, 78), new java.awt.Color(250, 156, 78)));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel14.setText("Limite de Notas:");

        txtLimNotas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLimNotas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimNotas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLimNotasFocusLost(evt);
            }
        });
        txtLimNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimNotasActionPerformed(evt);
            }
        });

        txtLimCheques.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLimCheques.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimCheques.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLimChequesFocusLost(evt);
            }
        });
        txtLimCheques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimChequesActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel15.setText("Limite de Cheques:");

        txtLimVales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLimVales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimVales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLimValesFocusLost(evt);
            }
        });
        txtLimVales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimValesActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel16.setText("Limite de Vales:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtLimNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(243, 243, 243)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLimCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtLimVales, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtLimCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLimVales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel17.setText("Os campos marcados com * não são obrigatórios.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNome)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(comboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNovoCargo)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(txtData)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jLabel6)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel17)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboCargo)
                    .addComponent(btnNovoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(798, 591));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCargoActionPerformed
        comboCargo.hidePopup();
        comboCargo.setEditable(true);
        comboCargo.requestFocus();
        comboCargo.getEditor().setItem("");
    }//GEN-LAST:event_btnNovoCargoActionPerformed

    private void comboCargoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboCargoFocusLost

    }//GEN-LAST:event_comboCargoFocusLost

    private void comboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCargoActionPerformed
        comboCargo.setEditable(false);
        txtRG.requestFocus();
    }//GEN-LAST:event_comboCargoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        txtData.requestFocus();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        comboCargo.requestFocus();
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        txtSalario.requestFocus();
    }//GEN-LAST:event_txtRGActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        txtEndereco.requestFocus();
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        txtNumero.requestFocus();
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        txtComplemento.requestFocus();
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        txtFone1.requestFocus();
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtFone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFone1ActionPerformed
        txtFone2.requestFocus();
    }//GEN-LAST:event_txtFone1ActionPerformed

    private void txtFone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFone2ActionPerformed
        txtLimNotas.requestFocus();
    }//GEN-LAST:event_txtFone2ActionPerformed

    private void txtLimChequesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimChequesActionPerformed
        txtLimVales.requestFocus();
    }//GEN-LAST:event_txtLimChequesActionPerformed

    private void txtLimNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimNotasActionPerformed
        txtLimCheques.requestFocus();
    }//GEN-LAST:event_txtLimNotasActionPerformed

    private void txtLimValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimValesActionPerformed
        btnCadastrar.requestFocus();
    }//GEN-LAST:event_txtLimValesActionPerformed

    private void txtDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyReleased
        txtData.setText(utili.formataData(txtData.getText()));
    }//GEN-LAST:event_txtDataKeyReleased

    private void txtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyPressed

    }//GEN-LAST:event_txtDataKeyPressed

    private void txtSalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioFocusLost
        txtSalario.setText(utili.formataPreco(txtSalario.getText().replace(',', '.')));
    }//GEN-LAST:event_txtSalarioFocusLost

    private void txtLimNotasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLimNotasFocusLost
        txtLimNotas.setText(utili.formataPreco(txtLimNotas.getText().replace(',', '.')));
    }//GEN-LAST:event_txtLimNotasFocusLost

    private void txtLimChequesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLimChequesFocusLost
        txtLimCheques.setText(utili.formataPreco(txtLimCheques.getText().replace(',', '.')));
    }//GEN-LAST:event_txtLimChequesFocusLost

    private void txtLimValesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLimValesFocusLost
        txtLimVales.setText(utili.formataPreco(txtLimVales.getText().replace(',', '.')));
    }//GEN-LAST:event_txtLimValesFocusLost

    private void txtRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRGFocusLost
       txtRG.setText(utili.formataRG(txtRG.getText()));
    }//GEN-LAST:event_txtRGFocusLost

    private void txtFone1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFone1FocusLost
        txtFone1.setText(utili.formataFone(txtFone1.getText()));
    }//GEN-LAST:event_txtFone1FocusLost

    private void txtFone2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFone2FocusLost
       txtFone2.setText(utili.formataFone(txtFone2.getText()));
    }//GEN-LAST:event_txtFone2FocusLost

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(txtNome.getText().length()<4 || txtNome.getText().length()>35){
            JOptionPane.showMessageDialog(rootPane, "O campo Nome deve ter entre 4 e 35 caracteres!");
            txtNome.requestFocus();
            txtNome.selectAll();
        }else if(!utili.isData(txtData.getText())){
            JOptionPane.showMessageDialog(rootPane, "Data de admissão inválida! Utilize o formato dd/mm/aaaa.");
            txtData.requestFocus();
            txtData.selectAll();
        }else if(!txtRG.getText().isEmpty() && !utili.isRG(txtRG.getText())){
            JOptionPane.showMessageDialog(rootPane, "RG inválido! Digite todos os 9 dígitos sem pontuação.");
            txtRG.requestFocus();
            txtRG.selectAll();
        }else if(!utili.isPreco(txtSalario.getText())){
            JOptionPane.showMessageDialog(rootPane, "Salário inválido! Utilize o formato XXX,XX.");
            txtSalario.requestFocus();
            txtSalario.selectAll();
        }else if(txtEndereco.getText().length()<4 || txtEndereco.getText().length()>25){
            JOptionPane.showMessageDialog(rootPane, "O campo Endereço deve ter entre 4 e 25 caracteres!");
            txtEndereco.requestFocus();
            txtEndereco.selectAll();
        }else if(!utili.isInt(txtNumero.getText())){
            JOptionPane.showMessageDialog(rootPane, "Número inválido! Insira apenas números.");
            txtNumero.requestFocus();
            txtNumero.selectAll();
        }else if(txtComplemento.getText().length()>15){
            JOptionPane.showMessageDialog(rootPane, "O campo Complemento deve ter no máximo 15 caracteres!");
            txtComplemento.requestFocus();
            txtComplemento.selectAll();
        }else if(!utili.isFone(txtFone1.getText())){
            JOptionPane.showMessageDialog(rootPane, "Telefone 1 inválido! Insira apenas números e não se esqueça do DDD.");
            txtFone1.requestFocus();
            txtFone1.selectAll();
        }else if(!txtFone2.getText().isEmpty() && !utili.isFone(txtFone2.getText())){
            JOptionPane.showMessageDialog(rootPane, "Telefone 2 inválido! Insira apenas números e não se esqueça do DDD.");
            txtFone2.requestFocus();
            txtFone2.selectAll();
        }else if(!utili.isPreco(txtLimNotas.getText())){
            JOptionPane.showMessageDialog(rootPane, "Limite de Notas inválido! Utilize o formato XXX,XX.");
            txtLimNotas.requestFocus();
            txtLimNotas.selectAll();
        }else if(!utili.isPreco(txtLimCheques.getText())){
            JOptionPane.showMessageDialog(rootPane, "Limite de Cheques inválido! Utilize o formato XXX,XX.");
            txtLimCheques.requestFocus();
            txtLimCheques.selectAll();
        }else if(!utili.isPreco(txtLimVales.getText())){
            JOptionPane.showMessageDialog(rootPane, "Limite de Cheques inválido! Utilize o formato XXX,XX.");
            txtLimCheques.requestFocus();
            txtLimCheques.selectAll();
        }else{
           
            //CHECA SE É NECESSÁRIO FAZER O CADASTRO DE NOVO CARGO E FAZ
            conex.conexao();
            conex.executaSql("SELECT * FROM cargos WHERE cargo = '"+comboCargo.getSelectedItem()+"'");
            try{
                if(!conex.rs.first()){
                    
                    if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cadastrar o novo cargo '"+
                                                                        String.valueOf(comboCargo.getSelectedItem()).toUpperCase()+"'?")==JOptionPane.YES_OPTION){
                        
                   
                     conex.executaUpdate("INSERT INTO cargos (cargo) VALUES ('"+String.valueOf(comboCargo.getSelectedItem()).toUpperCase()+"')");
                    }  
                }else{
                    comboCargo.setSelectedIndex(0);
                    comboCargo.requestFocus();
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Erro ao inserir novo cargo.\nErro: "+ex);
            }    
            conex.desconectar();
            
            //ATRIBUIÇÕES
            String nome = txtNome.getText().toUpperCase();
            String data = txtData.getText().substring(6, 10)+"-"+txtData.getText().substring(3, 5)+"-"+txtData.getText().substring(0, 2);
            String cargo = String.valueOf(comboCargo.getSelectedItem()).toUpperCase();
            double salario = Double.parseDouble(txtSalario.getText().substring(3).replace(',', '.'));
            String endereco = txtEndereco.getText().toUpperCase();
            int numero = Integer.parseInt(txtNumero.getText());
            String fone1 = utili.foneToInteger(txtFone1.getText());
            double limNotas = Double.parseDouble(txtLimNotas.getText().substring(3).replace(',', '.'));
            double limCheques = Double.parseDouble(txtLimCheques.getText().substring(3).replace(',', '.'));
            double limVales = Double.parseDouble(txtLimVales.getText().substring(3).replace(',', '.'));
            String rg="";
            String complemento="";
            String fone2="";
            
            if(!txtRG.getText().isEmpty()){
                rg=txtRG.getText().substring(0, 2)+txtRG.getText().substring(3, 6)+txtRG.getText().substring(7, 10)+txtRG.getText().charAt(11);
            }
            if(!txtComplemento.getText().isEmpty()){
               complemento=txtComplemento.getText().toUpperCase();
            }
            if(!txtFone2.getText().isEmpty()){
                fone2=utili.foneToInteger(txtFone2.getText());
            }
        
            //CADASTRO
            mod.setNome(nome);
            mod.setCargo(cargo);
            mod.setData(data);
            mod.setSalario(salario);
            mod.setEndereco(endereco);
            mod.setNumero(numero);
            mod.setFone1(fone1);
            mod.setFone2(fone2);
            mod.setLimNotas(limNotas);
            mod.setLimCheques(limCheques);
            mod.setLimVales(limVales);
            mod.setRg(rg);
            mod.setComplemento(complemento);
            mod.setCredito(0);
            dao.cadastrar(mod);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FormCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovoCargo;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFone1;
    private javax.swing.JTextField txtFone2;
    private javax.swing.JTextField txtLimCheques;
    private javax.swing.JTextField txtLimNotas;
    private javax.swing.JTextField txtLimVales;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
