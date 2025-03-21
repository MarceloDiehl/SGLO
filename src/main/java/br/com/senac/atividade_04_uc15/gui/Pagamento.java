package br.com.senac.atividade_04_uc15.gui;

//import atividade_03_uc15.ListaCompras;
import br.com.senac.atividade_04_uc15.ListaCompras;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Pagamento extends javax.swing.JFrame {

    private Double vlrTotal;

    public Pagamento() {
        initComponents();

    }

    public void setValorTotal(Double valorTotal) {
        this.vlrTotal = valorTotal;
        atualizarValor();
    }

    public void atualizarValor() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        double valor = vlrTotal;
        txtValorPagamento.setText(formatoMoeda.format(valor));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTituloInicial = new javax.swing.JLabel();
        lblTituloInicialTop = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtValorPagamento = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        chkDinheiro = new javax.swing.JCheckBox();
        chkCredito = new javax.swing.JCheckBox();
        chkDebito = new javax.swing.JCheckBox();
        chkPIX = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento - SGLO");

        jPanel1.setBackground(new java.awt.Color(231, 234, 239));

        jPanel2.setBackground(new java.awt.Color(189, 194, 213));

        lblTituloInicial.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTituloInicial.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloInicial.setText("Pagamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloInicial)
                .addGap(294, 294, 294))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblTituloInicial)
                .addGap(27, 27, 27))
        );

        lblTituloInicialTop.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        lblTituloInicialTop.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloInicialTop.setText("Escolha a forma de Pagamento");

        jPanel3.setBackground(new java.awt.Color(231, 234, 239));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(426, 257));

        txtValorPagamento.setBackground(new java.awt.Color(255, 255, 255));
        txtValorPagamento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtValorPagamento.setToolTipText("Informa o valor total a pagar.");
        txtValorPagamento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtValorPagamento.setEnabled(false);
        txtValorPagamento.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtValorPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPagamentoActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(51, 51, 51));
        lblCPF.setText("Valor total a pagar:");

        chkDinheiro.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        chkDinheiro.setForeground(new java.awt.Color(51, 51, 51));
        chkDinheiro.setText("Dinheiro");
        chkDinheiro.setToolTipText("Selecione para pagar em dinheiro.");
        chkDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDinheiroActionPerformed(evt);
            }
        });

        chkCredito.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        chkCredito.setForeground(new java.awt.Color(51, 51, 51));
        chkCredito.setText("Crédito");
        chkCredito.setToolTipText("Selecione para pagar no crédito.");
        chkCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCreditoActionPerformed(evt);
            }
        });

        chkDebito.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        chkDebito.setForeground(new java.awt.Color(51, 51, 51));
        chkDebito.setText("Débito");
        chkDebito.setToolTipText("Selecione para pagar no débito.");
        chkDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDebitoActionPerformed(evt);
            }
        });

        chkPIX.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        chkPIX.setForeground(new java.awt.Color(51, 51, 51));
        chkPIX.setText("PIX");
        chkPIX.setToolTipText("Selecione para pagar com PIX.");
        chkPIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPIXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblCPF))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkPIX)
                            .addComponent(chkDebito)
                            .addComponent(chkCredito)
                            .addComponent(chkDinheiro))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(chkDinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkPIX)
                .addGap(18, 18, 18)
                .addComponent(lblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnVoltar.setBackground(new java.awt.Color(197, 202, 222));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(51, 51, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("Clique para voltar à tela anterior.");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConcluir.setBackground(new java.awt.Color(197, 202, 222));
        btnConcluir.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnConcluir.setForeground(new java.awt.Color(51, 51, 51));
        btnConcluir.setText("Concluir Venda");
        btnConcluir.setToolTipText("Clique para finalizar a venda.");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloInicialTop)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTituloInicialTop)
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPagamentoActionPerformed

    private void chkDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDinheiroActionPerformed
        // TODO add your handling code here:
        chkDinheiro.setSelected(true);
        chkDebito.setSelected(false);
        chkCredito.setSelected(false);
        chkPIX.setSelected(false);

    }//GEN-LAST:event_chkDinheiroActionPerformed

    private void chkCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCreditoActionPerformed
        // TODO add your handling code here:
        chkDinheiro.setSelected(false);
        chkDebito.setSelected(false);
        chkCredito.setSelected(true);
        chkPIX.setSelected(false);
    }//GEN-LAST:event_chkCreditoActionPerformed

    private void chkDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDebitoActionPerformed
        // TODO add your handling code here:
        chkDinheiro.setSelected(false);
        chkDebito.setSelected(true);
        chkCredito.setSelected(false);
        chkPIX.setSelected(false);
    }//GEN-LAST:event_chkDebitoActionPerformed

    private void chkPIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPIXActionPerformed
        // TODO add your handling code here:
        chkDinheiro.setSelected(false);
        chkDebito.setSelected(false);
        chkCredito.setSelected(false);
        chkPIX.setSelected(true);
    }//GEN-LAST:event_chkPIXActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        ConclusaoVenda conclusao = new ConclusaoVenda();
        conclusao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        // TODO add your handling code here:

        String metodoPagamento;
        boolean testeDinheiro = chkDinheiro.isSelected();
        boolean testeDebito = chkDebito.isSelected();
        boolean testeCredito = chkCredito.isSelected();
        boolean testePix = chkPIX.isSelected();

        if (testeDinheiro == true || testeDebito == true || testeCredito == true || testePix == true) {
            if (testeDinheiro == true) {
                metodoPagamento = "1";
                ListaCompras.setMetodoPagamento(metodoPagamento);
                ListaCompras.concluirVendaItem();
            } else if (testeDebito == true) {
                metodoPagamento = "2";
                ListaCompras.setMetodoPagamento(metodoPagamento);
                ListaCompras.concluirVendaItem();
            } else if (testeCredito == true) {
                metodoPagamento = "3";
                ListaCompras.setMetodoPagamento(metodoPagamento);
                ListaCompras.concluirVendaItem();
            } else if (testePix == true) {
                metodoPagamento = "4";
                ListaCompras.setMetodoPagamento(metodoPagamento);
                ListaCompras.concluirVendaItem();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção de pagamento selecionada.");
            return;
        }
        VendaConcluida venda = new VendaConcluida();
        venda.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConcluirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chkCredito;
    private javax.swing.JCheckBox chkDebito;
    private javax.swing.JCheckBox chkDinheiro;
    private javax.swing.JCheckBox chkPIX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblTituloInicial;
    private javax.swing.JLabel lblTituloInicialTop;
    private javax.swing.JTextField txtValorPagamento;
    // End of variables declaration//GEN-END:variables
}
