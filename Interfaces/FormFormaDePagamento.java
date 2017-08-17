package Interfaces;

import Codigo.Utilitarios;
import Codigo.Venda;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modeloBeans.BeansPgto;

public class FormFormaDePagamento extends javax.swing.JFrame {

    Utilitarios utili = new Utilitarios();
    BeansPgto mod = new BeansPgto();
    Venda venda = new Venda();
    
    int numVenda;
    double Total;
    double pgtos[] = {0,0,0,0,0};
    int posDinheiro = 0;
    int posCredito = 1;
    int posDebito = 2;
    int posCheque = 3;
    int posNota = 4;
    double troco = 0;
    String cpf = "";
    int cheque = 0;
    boolean temNota = false;
    
    
    public FormFormaDePagamento(int sellNum, String total) {
        initComponents();
        txtValor.setText(total);
        txtValor.requestFocus();
        txtValor.selectAll();
        
        Total=Double.parseDouble(total.substring(3).replace(',','.'));
        numVenda = sellNum;
        
        zeraTemp();
        leCpf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();
        btnCheque = new javax.swing.JButton();
        btnCartao = new javax.swing.JButton();
        btnDinheiro = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma de Pagamento");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_0.png"))); // NOI18N
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_1.png"))); // NOI18N
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_2.png"))); // NOI18N
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_3.png"))); // NOI18N
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_6.png"))); // NOI18N
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_4.png"))); // NOI18N
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_7.png"))); // NOI18N
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_5.png"))); // NOI18N
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_8.png"))); // NOI18N
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Numero_9.png"))); // NOI18N
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao nota.png"))); // NOI18N
        btnNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaActionPerformed(evt);
            }
        });

        btnCheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao cheque.png"))); // NOI18N
        btnCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChequeActionPerformed(evt);
            }
        });

        btnCartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao cartao.png"))); // NOI18N
        btnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoActionPerformed(evt);
            }
        });

        btnDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao dinheiro.png"))); // NOI18N
        btnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDinheiroActionPerformed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        txtValor.setForeground(new java.awt.Color(52, 52, 52));
        txtValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNota, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtValor)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCartao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDinheiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNota, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDinheiroActionPerformed
        txtValor.setText(utili.formataPreco(txtValor.getText().replace(',', '.')));
       
        if(utili.isPreco(txtValor.getText())){
            if(Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))<Total){
                Total=Total-Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
               
                pgtos[posDinheiro] = pgtos[posDinheiro] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                JOptionPane.showMessageDialog(rootPane, "Foi registrado o pagamento de "+txtValor.getText()+" em dinheiro.");
                
                txtValor.setText("R$ "+String.format("%.2f", Total).replace('.',','));
                txtValor.requestFocus();
                txtValor.selectAll();
            }else{
                troco = Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))-Total;
                pgtos[posDinheiro] = pgtos[posDinheiro] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                setMod();
                if(venda.finish(mod)){
                    dispose();
                    mostraTroco();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Valor digitado é inválido! Utilize o formato XX,XX.");
        }
    }//GEN-LAST:event_btnDinheiroActionPerformed

    private void btnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoActionPerformed
        boolean credito=false, debito=false;
        String options[] = {"Crédito", "Débito"};

        txtValor.setText(utili.formataPreco(txtValor.getText().replace(',', '.')));
       
        if(utili.isPreco(txtValor.getText())){
            if(JOptionPane.showOptionDialog(rootPane, "", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0])==1){
                credito = true;
            }else{
                debito=true;
            }
            
            if(Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))<Total){
                Total=Total-Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
               
                if(credito){
                    pgtos[posCredito] = pgtos[posCredito] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                    JOptionPane.showMessageDialog(rootPane, "Foi registrado o pagamento de "+txtValor.getText()+" em cartão de crédito.");

                    txtValor.setText("R$ "+String.format("%.2f", Total).replace('.',','));
                    txtValor.requestFocus();
                    txtValor.selectAll();
                }else if(debito){
                    pgtos[posDebito] = pgtos[posDebito] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                    JOptionPane.showMessageDialog(rootPane, "Foi registrado o pagamento de "+txtValor.getText()+" em cartão de débito.");

                    txtValor.setText("R$ "+String.format("%.2f", Total).replace('.',','));
                    txtValor.requestFocus();
                    txtValor.selectAll();
                }
            }else{
                troco = Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))-Total;
                
                if(credito){
                    pgtos[posCredito] = pgtos[posCredito] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                }else if(debito){
                    pgtos[posDebito] = pgtos[posDebito] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                }
                
                setMod();
                if(venda.finish(mod)){
                    dispose();
                    mostraTroco();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Valor digitado é inválido! Utilize o formato XX,XX.");
        }
    }//GEN-LAST:event_btnCartaoActionPerformed

    private void btnChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChequeActionPerformed
        txtValor.setText(utili.formataPreco(txtValor.getText().replace(',','.')));
       
        if(utili.isPreco(txtValor.getText())){
            if(Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))<Total){
                Total=Total-Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                cheque++;
                
                pgtos[posCheque] = pgtos[posCheque] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                JOptionPane.showMessageDialog(rootPane, "Foi registrado o pagamento de "+txtValor.getText()+" em cheque.");
                
                txtValor.setText("R$ "+String.format("%.2f", Total).replace('.',','));
                txtValor.requestFocus();
                txtValor.selectAll();
            }else{
                troco = Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))-Total;
                pgtos[posCheque] = pgtos[posCheque] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                cheque++;
                
                setMod();
                if(venda.finish(mod)){
                    dispose();
                    mostraTroco();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Valor digitado é inválido! Utilize o formato XX,XX.");
        }
    }//GEN-LAST:event_btnChequeActionPerformed

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed
       txtValor.setText(utili.formataPreco(txtValor.getText().replace(',','.')));
       
        if(utili.isPreco(txtValor.getText())){
            if(Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))<Total){
                Total=Total-Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                temNota = true;
                
                pgtos[posNota] = pgtos[posNota] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                JOptionPane.showMessageDialog(rootPane, "Foi registrado o pagamento de "+txtValor.getText()+" em nota a cobrar.");
                
                txtValor.setText("R$ "+String.format("%.2f", Total).replace('.',','));
                txtValor.requestFocus();
                txtValor.selectAll();
            }else{
                troco = Double.parseDouble(txtValor.getText().substring(3).replace(',','.'))-Total;
                pgtos[posNota] = pgtos[posNota] + Double.parseDouble(txtValor.getText().substring(3).replace(',','.'));
                temNota = true;
                
                setMod();
                if(venda.finish(mod)){
                    dispose();
                    mostraTroco();
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Valor digitado é inválido! Utilize o formato XX,XX.");
        }
    }//GEN-LAST:event_btnNotaActionPerformed

    public void leCpf(){
        try {
            FileReader arq = new FileReader("src/files/venda.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            cpf=lerArq.readLine();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arquivo venda.txt não encontrado!\n"+ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Impossível ler arquivo venda.txt!\n"+ex);
        }
    }
    
    public void zeraTemp(){
        ArrayList<String> lines = new ArrayList();
        lines.add("");
        
        Path file = Paths.get("src/files/temp.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao zerar temp.txt.");
        }
    }
    
    public void setMod(){
        mod.setDinheiro(pgtos[posDinheiro]);
        mod.setCredito(pgtos[posCredito]);
        mod.setDebito(pgtos[posDebito]);
        mod.setCheque(pgtos[posCheque]);
        mod.setNota(pgtos[posNota]);
        mod.setTroco(troco);
        mod.setCpf(cpf);
        mod.setSellNum(numVenda);
    } 
    
    public void mostraTroco(){
        ArrayList<String> lines = new ArrayList();
        lines.add("success");
        
        Path file = Paths.get("src/files/temp.txt");
        try {
            Files.write(file, lines, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao printar success em temp.txt.");
        }
        
        FormMostraTroco tela = new FormMostraTroco(troco);
        tela.setVisible(true);
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
            java.util.logging.Logger.getLogger(FormFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int sellNum=0;
                String total="";
                new FormFormaDePagamento(sellNum, total).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCartao;
    private javax.swing.JButton btnCheque;
    private javax.swing.JButton btnDinheiro;
    private javax.swing.JButton btnNota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
