/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia;

import javax.swing.DefaultListModel;

/**
 *
 * @author guest-bKdJPh
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    DefaultListModel listaCliente;
    DefaultListModel listaProduto;
    DefaultListModel listaFuncionario;
    DefaultListModel listaFornecedor;
    
    BuscarCliente     buscarCliente;
    CadastroPessoaFisica      pessoaFisica;
    CadastroPessoaJuridica    pessoaJuridica;
    CadastroProduto   cadastroProduto;
    FarmaciaInterface farmaciaInterface;

    
    /**
     * Creates new form telaInicial
     */
    public JanelaPrincipal() {
        initComponents();
        
        buscarCliente     = new BuscarCliente();
        pessoaFisica      = new CadastroPessoaFisica();
        pessoaJuridica    = new CadastroPessoaJuridica();
        cadastroProduto   = new CadastroProduto();
        farmaciaInterface = new FarmaciaInterface();
                        
        painel.add(farmaciaInterface);
        farmaciaInterface.setSize(painel.getSize());
        farmaciaInterface.setVisible(true);
        
        listaCliente = new DefaultListModel();
        listaCliente.add(0, "Cadastrar Cliente");
        listaCliente.add(1, "Alterar Cliente");
        listaCliente.add(2, "Buscar Cliente");
        
        listaProduto = new DefaultListModel();
        listaProduto.add(0, "Cadastrar Produto");
        listaProduto.add(1, "Alterar Produto");
        listaProduto.add(2, "Buscar Produto");
        
        listaFuncionario = new DefaultListModel();
        listaFuncionario.add(0, "Cadastrar Funcionário");
        listaFuncionario.add(1, "Alterar Funcionário");
        listaFuncionario.add(2, "Buscar Produto");
        listaFuncionario.add(3, "Excluir Funcionário");
        
        listaFornecedor = new DefaultListModel();
        listaFornecedor.add(0, "Cadastrar Fornecedor");
        listaFornecedor.add(1, "Alterar Fornecedor");
        listaFornecedor.add(2, "Buscar Fornecedor");
        listaFornecedor.add(3, "Excluir Fornecedor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVenda = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btFornecedor = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        painel = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(195, 195, 195));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btVenda.setText("Venda");
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendaActionPerformed(evt);
            }
        });

        btCliente.setText("Cliente");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btFornecedor.setText("Fornecedor");
        btFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedorActionPerformed(evt);
            }
        });

        btProduto.setText("Produto");
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutoActionPerformed(evt);
            }
        });

        btFuncionario.setText("Funcionário");
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });

        lista.setBackground(new java.awt.Color(209, 209, 209));
        lista.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lista.setForeground(new java.awt.Color(48, 48, 48));
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        painel.setBackground(new java.awt.Color(202, 133, 64));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu.setBackground(new java.awt.Color(205, 205, 205));
        menu.setForeground(new java.awt.Color(45, 45, 45));

        sair.setBackground(new java.awt.Color(160, 160, 160));
        sair.setForeground(new java.awt.Color(77, 77, 77));
        sair.setText("Sair");
        menu.add(sair);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(btVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        // TODO add your handling code here:
        lista.setVisible(false);
    }//GEN-LAST:event_btVendaActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        // TODO add your handling code here:
        lista.setModel(listaCliente);
        lista.setName("cliente");
    }//GEN-LAST:event_btClienteActionPerformed

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
        // TODO add your handling code here:
        lista.setModel(listaFornecedor);
        lista.setName("fornecedor");
    }//GEN-LAST:event_btFornecedorActionPerformed

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        // TODO add your handling code here:
        lista.setModel(listaProduto);
        lista.setName("produto");
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        // TODO add your handling code here:
        lista.setModel(listaFuncionario);
        lista.setName("funcionario");
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        // TODO add your handling code here:
        System.out.println(lista.getName() + "[" + lista.getSelectedIndex() + "]");
        painel.removeAll();
        
        if (lista.getName().equals("cliente")){
            if (lista.getSelectedIndex() == 0){     //Cadastrar Cliente
                painel.add(pessoaFisica);
                pessoaFisica.setSize(painel.getSize());
                pessoaFisica.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){     //Alterar Cliente
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }    
            if (lista.getSelectedIndex() == 2){     //Buscar Cliente
                painel.add(buscarCliente);
                buscarCliente.setSize(painel.getSize());
                buscarCliente.setVisible(true);
            }
        }
        else if (lista.getName().equals("produto")){
            if (lista.getSelectedIndex() == 0){     //Cadastrar Poduto
                painel.add(cadastroProduto);
                cadastroProduto.setSize(painel.getSize());
                cadastroProduto.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){     //Alterar Produto
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 2){     //Buscar Produto
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
        }
        else if (lista.getName().equals("funcionario")){
            if (lista.getSelectedIndex() == 0){     //Cadastrar Funcionário
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){     //Alterar Funcionário
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 2){     //Buscar Funcionário
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
        }
        else if (lista.getName().equals("fornecedor")){
            if (lista.getSelectedIndex() == 0){      //Cadastrar Fornecedor
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){      //Alterar Fornecedor
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 2){      //Buscar Fornecedor
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 3){      //Excluir Fornecedor
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
        }
        painel.revalidate();
        painel.repaint();
    }//GEN-LAST:event_listaValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel painel;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
