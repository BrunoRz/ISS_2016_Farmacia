/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia;

import iss_trab_farmacia.control.Produtos;
import iss_trab_farmacia.entity.Produto;

/**
 *
 * @author guest-Y3PHBK
 */
public class CadastroProduto extends javax.swing.JPanel {
    
    Produtos produtos = new Produtos();

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbDescricao = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbCodigoDeBarras = new javax.swing.JLabel();
        lbCrustoPadrao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCodigoDeBarras = new javax.swing.JTextField();
        lbCustoPadrao = new javax.swing.JLabel();
        txtCustoPadrao = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro de Produto");

        lbDescricao.setText("Descrição:");

        lbCategoria.setText("Categoria:");

        lbMarca.setText("Marca:");

        lbCodigoDeBarras.setText("Código de Barras:");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        lbCustoPadrao.setText("Custo Padrão:");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMarca)
                            .addComponent(lbCategoria)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbCrustoPadrao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCustoPadrao))
                                .addComponent(lbCodigoDeBarras))
                            .addComponent(lbDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricao)
                            .addComponent(txtCategoria)
                            .addComponent(txtMarca)
                            .addComponent(txtCodigoDeBarras)
                            .addComponent(txtCustoPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoDeBarras)
                    .addComponent(txtCodigoDeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustoPadrao)
                    .addComponent(txtCustoPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCrustoPadrao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Produto produto = new Produto(); 
        produto.setDescricao(txtDescricao.getText());
        produto.setCategoria(txtCategoria.getText());
        produto.setMarca(txtMarca.getText());
        produto.setCodigoBarras(Integer.parseInt(txtCodigoDeBarras.getText()));
        produto.setValorPadrao(Integer.parseInt(txtCustoPadrao.getText()));
        produtos.save(produto);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        //JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        //frame.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtDescricao.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        txtCodigoDeBarras.setText("");
        txtCustoPadrao.setText("");
    }//GEN-LAST:event_btLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigoDeBarras;
    private javax.swing.JLabel lbCrustoPadrao;
    private javax.swing.JLabel lbCustoPadrao;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigoDeBarras;
    private javax.swing.JTextField txtCustoPadrao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
