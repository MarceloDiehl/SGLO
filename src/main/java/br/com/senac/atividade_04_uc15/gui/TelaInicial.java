/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.senac.atividade_04_uc15.gui;

/**
 *
 * @author Marcelo
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        estadoBotoes();
    }

    public static int operador = 0;

    public void setOperador(int numero) {
        this.operador = numero;
    }

    public void estadoBotoes() {
        if (this.operador == 1) {
            btnCadastroFuncionarios.setEnabled(false);
            btnCadastroProdutos.setEnabled(false);
            btnPesquisarFuncionarios.setEnabled(false);
        } else if (this.operador == 3) {
            btnCadastroFuncionarios.setEnabled(false);
            btnCadastroProdutos.setEnabled(true);
            btnPesquisarFuncionarios.setEnabled(false);
        } else if (this.operador == 2) {
            btnCadastroFuncionarios.setEnabled(true);
            btnCadastroProdutos.setEnabled(true);
            btnPesquisarFuncionarios.setEnabled(true);
        }

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
        btnPainelVendas = new javax.swing.JButton();
        btnPainelPesquisa = new javax.swing.JButton();
        btnCadastroFuncionarios = new javax.swing.JButton();
        btnCadastroProdutos = new javax.swing.JButton();
        btnListarProdutos = new javax.swing.JButton();
        btnControleVendas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnPesquisarFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle - Loja Orion");

        jPanel1.setBackground(new java.awt.Color(230, 233, 238));

        jPanel2.setBackground(new java.awt.Color(189, 194, 213));

        lblTituloInicial.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTituloInicial.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloInicial.setText("Sistema Integrado de  Gestão de Loja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloInicial)
                .addGap(398, 398, 398))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lblTituloInicial)
                .addGap(38, 38, 38))
        );

        lblTituloInicialTop.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        lblTituloInicialTop.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloInicialTop.setText("Boas-vindas ao Sistema de Controle da Loja Orion!");

        btnPainelVendas.setBackground(new java.awt.Color(197, 202, 222));
        btnPainelVendas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPainelVendas.setForeground(new java.awt.Color(51, 51, 51));
        btnPainelVendas.setText("Painel de Vendas");
        btnPainelVendas.setToolTipText("Clique para iniciar tela de vendas.");
        btnPainelVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelVendasActionPerformed(evt);
            }
        });

        btnPainelPesquisa.setBackground(new java.awt.Color(197, 202, 222));
        btnPainelPesquisa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPainelPesquisa.setForeground(new java.awt.Color(51, 51, 51));
        btnPainelPesquisa.setText("Painel de Pesquisa Fixa");
        btnPainelPesquisa.setToolTipText("Clique para abrir tela de consulta de produtos.");
        btnPainelPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelPesquisaActionPerformed(evt);
            }
        });

        btnCadastroFuncionarios.setBackground(new java.awt.Color(197, 202, 222));
        btnCadastroFuncionarios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCadastroFuncionarios.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastroFuncionarios.setText("Cadastro de Funcionários");
        btnCadastroFuncionarios.setToolTipText("Clique para cadastrar novos funcionários.");
        btnCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncionariosActionPerformed(evt);
            }
        });

        btnCadastroProdutos.setBackground(new java.awt.Color(197, 202, 222));
        btnCadastroProdutos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCadastroProdutos.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastroProdutos.setText("Cadastro de Produtos");
        btnCadastroProdutos.setToolTipText("Clique para cadastrar produtos.");
        btnCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutosActionPerformed(evt);
            }
        });

        btnListarProdutos.setBackground(new java.awt.Color(197, 202, 222));
        btnListarProdutos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnListarProdutos.setForeground(new java.awt.Color(51, 51, 51));
        btnListarProdutos.setText("Pesquisar Produtos");
        btnListarProdutos.setToolTipText("Clique para listar produtos.");
        btnListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdutosActionPerformed(evt);
            }
        });

        btnControleVendas.setBackground(new java.awt.Color(197, 202, 222));
        btnControleVendas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnControleVendas.setForeground(new java.awt.Color(51, 51, 51));
        btnControleVendas.setText("Controle de Vendas");
        btnControleVendas.setToolTipText("Clique para abrir o controle de produtos vendidos.");
        btnControleVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControleVendasActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(197, 202, 222));
        btnSair.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(51, 51, 51));
        btnSair.setText("Sair");
        btnSair.setToolTipText("Clique para retornar à tela de login.");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnPesquisarFuncionarios.setBackground(new java.awt.Color(197, 202, 222));
        btnPesquisarFuncionarios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnPesquisarFuncionarios.setForeground(new java.awt.Color(51, 51, 51));
        btnPesquisarFuncionarios.setText("Pesquisar Funcionarios");
        btnPesquisarFuncionarios.setToolTipText("Clique para abrir o controle de produtos vendidos.");
        btnPesquisarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTituloInicialTop)
                        .addGap(347, 347, 347))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPainelVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnControleVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPainelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(610, 610, 610))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(lblTituloInicialTop)
                .addGap(73, 73, 73)
                .addComponent(btnPainelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPainelPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnCadastroFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnControleVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 136, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPainelPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelPesquisaActionPerformed
        // TODO add your handling code here:
        PainelPesquisaFixa painel = new PainelPesquisaFixa();
        painel.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPainelPesquisaActionPerformed

    private void btnPainelVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelVendasActionPerformed
        // TODO add your handling code here:
        PainelVendas painelVendas = new PainelVendas();
        painelVendas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPainelVendasActionPerformed

    private void btnCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncionariosActionPerformed
        // TODO add your handling code here:
        CadastrarFuncionarios cadastroFuncionarios = new CadastrarFuncionarios();
        cadastroFuncionarios.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnCadastroFuncionariosActionPerformed

    private void btnListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdutosActionPerformed
        // TODO add your handling code here:
        PesquisarProdutos pesquisarProdutos = new PesquisarProdutos();
        pesquisarProdutos.setVisible(true);

    }//GEN-LAST:event_btnListarProdutosActionPerformed

    private void btnCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutosActionPerformed
        // TODO add your handling code here:
        CadastrarProdutos cadastrarProdutos = new CadastrarProdutos();
        cadastrarProdutos.setVisible(true);
    }//GEN-LAST:event_btnCadastroProdutosActionPerformed

    private void btnControleVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControleVendasActionPerformed
        // TODO add your handling code here:
        TelaControleVendas controleVendas = new TelaControleVendas();
        controleVendas.setVisible(true);

    }//GEN-LAST:event_btnControleVendasActionPerformed

    private void btnPesquisarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFuncionariosActionPerformed
        // TODO add your handling code here:
        PesquisarFuncionarios pesquisarFuncionarios = new PesquisarFuncionarios();
        pesquisarFuncionarios.setVisible(true);

    }//GEN-LAST:event_btnPesquisarFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) { // <-- Removido o ponto e vírgula
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroFuncionarios;
    private javax.swing.JButton btnCadastroProdutos;
    private javax.swing.JButton btnControleVendas;
    private javax.swing.JButton btnListarProdutos;
    private javax.swing.JButton btnPainelPesquisa;
    private javax.swing.JButton btnPainelVendas;
    private javax.swing.JButton btnPesquisarFuncionarios;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTituloInicial;
    private javax.swing.JLabel lblTituloInicialTop;
    // End of variables declaration//GEN-END:variables
}
