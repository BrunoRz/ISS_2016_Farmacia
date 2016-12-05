/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia;

import iss_trab_farmacia.control.Produtos;
import iss_trab_farmacia.util.table_models.ProdutosTableModel;
import java.util.Calendar;
import javax.swing.JFrame;

/**
 *
 * @author guest-bKdJPh
 */
public class Venda extends javax.swing.JPanel {
    //Compras compras;
    Produtos produtos;
    ProdutosTableModel tableModel;
    BuscarCliente buscarCliente;
    BuscarProduto buscarProduto;


    /**
     * Creates new form PainelCadastroPessoa
     */
    public Venda() {
        initComponents();
        
        buscarCliente = new BuscarCliente();
        //buscarProduto = new BuscarCliente();
        this.produtos = new Produtos();
        
        Calendar c = Calendar.getInstance();
	String ano = String.valueOf(c.get(Calendar.YEAR));
	String mes = String.valueOf(c.get(Calendar.MONTH));
	String dia = String.valueOf(c.get(Calendar.DAY_OF_MONTH));

          
        this.txtData.setText(dia + mes + ano);
         
        //compras = new Compras(ds);
        //tableModel = new PessoasTableModel(pessoas.buscarTodos());
        //System.out.println(tableModel.getRowCount());
        //tabela.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomeAtendente = new javax.swing.JLabel();
        btAddProduto = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        separador = new javax.swing.JSeparator();
        txtData = new javax.swing.JFormattedTextField();
        lbAtendente = new javax.swing.JLabel();
        btFinalizarVenda = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbCliente = new javax.swing.JLabel();
        lbNomeCliente = new javax.swing.JLabel();
        btAddCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbData = new javax.swing.JLabel();

        lbNomeAtendente.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbNomeAtendente.setText("<nome>");

        btAddProduto.setText("Adicionar Produto");
        btAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProdutoActionPerformed(evt);
            }
        });

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Venda");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Valor Unitário", "Qtd.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lbAtendente.setText("Atendente:");

        btFinalizarVenda.setText("Finalizar Venda");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbCliente.setText("Cliente:");

        lbNomeCliente.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lbNomeCliente.setText("<nome>");

        btAddCliente.setText("Adicionar Cliente");
        btAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddClienteActionPerformed(evt);
            }
        });

        lbData.setText("Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addComponent(separador)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCliente)
                                    .addComponent(lbAtendente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNomeAtendente)
                                    .addComponent(lbNomeCliente))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAddProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAtendente)
                        .addComponent(lbNomeAtendente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbData)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(lbNomeCliente))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizarVenda)
                    .addComponent(btCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProdutoActionPerformed
        JFrame busca = new JFrame();
        busca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        busca.setSize(600, 400);
        busca.setVisible(true);
        
        buscarProduto = new BuscarProduto();
        buscarProduto.setSize(busca.getSize());
        buscarProduto.alterarTitulo("Adicionar Produto");
        buscarProduto.habilitarAdicionarProduto(true);
        buscarProduto.setVisible(true);
        
        busca.add(buscarProduto);
        
    }//GEN-LAST:event_btAddProdutoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddClienteActionPerformed
        JFrame busca = new JFrame();
        busca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        busca.setSize(600, 400);
        busca.setVisible(true);
        
        buscarCliente = new BuscarCliente();
        buscarCliente.setSize(busca.getSize());
        buscarCliente.alterarTitulo("Adicionar Cliente");
        buscarCliente.habilitarAdicionarCliente(true);
        buscarCliente.setVisible(true);
        
        busca.add(buscarCliente);
    }//GEN-LAST:event_btAddClienteActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCliente;
    private javax.swing.JButton btAddProduto;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizarVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAtendente;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeAtendente;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtData;
    // End of variables declaration//GEN-END:variables
}