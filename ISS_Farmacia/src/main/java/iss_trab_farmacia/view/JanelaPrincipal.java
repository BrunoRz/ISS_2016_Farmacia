/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.view;

/**
 *
 * @author guest-a2ok8M
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCliente = new javax.swing.JMenu();
        btnCadastrarPessoa = new javax.swing.JMenuItem();
        btnBuscarPessoa = new javax.swing.JMenuItem();
        mnProduto = new javax.swing.JMenu();
        btnCadastrarProduto = new javax.swing.JMenuItem();
        btnBuscarProduto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnNovaVenda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnNovaCompra = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnCliente.setText("Cliente");

        btnCadastrarPessoa.setText("Cadastrar");
        btnCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPessoaActionPerformed(evt);
            }
        });
        mnCliente.add(btnCadastrarPessoa);

        btnBuscarPessoa.setText("Buscar");
        btnBuscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPessoaActionPerformed(evt);
            }
        });
        mnCliente.add(btnBuscarPessoa);

        jMenuBar1.add(mnCliente);

        mnProduto.setText("Produto");

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        mnProduto.add(btnCadastrarProduto);

        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });
        mnProduto.add(btnBuscarProduto);

        jMenuBar1.add(mnProduto);

        jMenu1.setText("Venda");

        btnNovaVenda.setText("Novo");
        btnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVendaActionPerformed(evt);
            }
        });
        jMenu1.add(btnNovaVenda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compra");

        btnNovaCompra.setText("Novo");
        btnNovaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCompraActionPerformed(evt);
            }
        });
        jMenu2.add(btnNovaCompra);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 253, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPessoaActionPerformed
        CadastroCliente cadCli = new CadastroCliente(null, true);
        cadCli.setVisible(true);
    }//GEN-LAST:event_btnCadastrarPessoaActionPerformed

    private void btnBuscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPessoaActionPerformed
        BuscarPessoa bPe = new BuscarPessoa(null, false);
        bPe.setVisible(true);
    }//GEN-LAST:event_btnBuscarPessoaActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        new CadastrarProduto(null, true).setVisible(true);
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        new BuscarProduto(null, true).setVisible(true);
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void btnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVendaActionPerformed
        new VendaView(null, true).setVisible(true);
    }//GEN-LAST:event_btnNovaVendaActionPerformed

    private void btnNovaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCompraActionPerformed
        new CompraView(null, true).setVisible(true);
    }//GEN-LAST:event_btnNovaCompraActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnBuscarPessoa;
    private javax.swing.JMenuItem btnBuscarProduto;
    private javax.swing.JMenuItem btnCadastrarPessoa;
    private javax.swing.JMenuItem btnCadastrarProduto;
    private javax.swing.JMenuItem btnNovaCompra;
    private javax.swing.JMenuItem btnNovaVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu mnCliente;
    private javax.swing.JMenu mnProduto;
    // End of variables declaration//GEN-END:variables
}
