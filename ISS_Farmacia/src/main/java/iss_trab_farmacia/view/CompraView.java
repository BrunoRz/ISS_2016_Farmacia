/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia.view;

import iss_trab_farmacia.entity.Compra;
import iss_trab_farmacia.entity.PessoaJuridica;
import iss_trab_farmacia.util.ItemCompra;
import iss_trab_farmacia.util.table_models.ItemCompraTableModel;
import java.awt.Dialog;

/**
 *
 * @author guest-a2ok8M
 */
public class CompraView extends javax.swing.JDialog {

    Compra compra;
    
    /**
     * Creates new form VendaView
     */
    public CompraView(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setCompra(new Compra());
    }

    public CompraView(Compra compra, Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        this.setCompra(compra);
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
        this.tabelaProduto.setModel(new ItemCompraTableModel(compra.getItensCompra()));
        ItemCompraTableModel iM = (ItemCompraTableModel) this.tabelaProduto.getModel();
        this.txtValorTotal.setText(Float.toString(iM.getTotal()));
    }

    public void setFornecedor(PessoaJuridica fornecedor){
        Compra.setFornecedor(fornecedor);
        this.fornecedorLabel.setText(fornecedor.getNome());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clienteLabel = new javax.swing.JLabel();
        clienteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        salvarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        btAddProduto = new javax.swing.JButton();
        lbValorTotal = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        clienteLabel.setText("<Null>");

        clienteBtn.setText("Fornecedor");
        clienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBtnActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        salvarBtn.setText("Finalizar");

        cancelarBtn.setText("Cancelar");

        btAddProduto.setText("Ad. Produto");
        btAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProdutoActionPerformed(evt);
            }
        });

        lbValorTotal.setText("Valor Total:");

        txtValorTotal.setText("<Null>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clienteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAddProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbValorTotal)
                            .addComponent(cancelarBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salvarBtn)
                            .addComponent(txtValorTotal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteLabel)
                    .addComponent(clienteBtn)
                    .addComponent(btAddProduto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorTotal)
                    .addComponent(txtValorTotal))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn)
                    .addComponent(cancelarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProdutoActionPerformed
        AdicionarItemCompra addProduto = new AdicionarItemCompra(this, true);
        addProduto.setVisible(true);
    }//GEN-LAST:event_btAddProdutoActionPerformed

    private void clienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBtnActionPerformed
        BuscarPessoa bP = new BuscarPessoa(this, rootPaneCheckingEnabled);
        bP.registraRetornoVenca();
        bP.setVisible(true);
    }//GEN-LAST:event_clienteBtnActionPerformed

    public void adcionarProduto(ItemCompra item, int qnt, float preco) {
        ItemCompraTableModel pM = (ItemCompraTableModel) this.tabelaProduto.getModel();
        pM.addRow(item.toVector());
        this.tabelaProduto.setModel(pM);
        this.compra.addItemCompra(item);
        this.txtValorTotal.setText(Float.toString(pM.getTotal()));
    }
    
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
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CompraView dialog = new CompraView(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private javax.swing.JLabel fornecedorLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddProduto;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton clienteBtn;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
