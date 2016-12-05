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
    DefaultListModel listaCaixa;
    
    BuscarCliente     buscarCliente;
    CadastroPessoaFisica      pessoaFisica;
    CadastroPessoaJuridica    pessoaJuridica;
    CadastroProduto   produto;
    BuscarProduto   buscarProduto;
    CadastroUsuario   usuario;
    AbrirCaixa caixa;
    Venda farmaciaInterface;

    
    /**
     * Creates new form telaInicial
     */
    public JanelaPrincipal() {
        initComponents();
        
        buscarCliente     = new BuscarCliente();
        pessoaFisica      = new CadastroPessoaFisica();
        pessoaJuridica    = new CadastroPessoaJuridica();
        produto           = new CadastroProduto();
        buscarProduto     = new BuscarProduto();
        caixa             = new AbrirCaixa();
        farmaciaInterface = new Venda();
                        
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
        listaFuncionario.add(2, "Cadastrar Usuário");
        listaFuncionario.add(3, "Excluir Funcionário");
        
        listaFornecedor = new DefaultListModel();
        listaFornecedor.add(0, "Cadastrar Fornecedor");
        listaFornecedor.add(1, "Alterar Fornecedor");
        listaFornecedor.add(2, "Buscar Fornecedor");
        listaFornecedor.add(3, "Excluir Fornecedor");
        
        listaCaixa = new DefaultListModel();
        listaCaixa.add(0, "Abertura de Caixa");
        listaCaixa.add(1, "Fechamento de Caixa");
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
        btSair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btCaixa = new javax.swing.JButton();

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

        painel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setForeground(new java.awt.Color(51, 51, 51));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCaixa.setText("Caixa");
        btCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btSair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btSair)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendaActionPerformed
        painel.removeAll();
        painel.add(farmaciaInterface);
        farmaciaInterface.setVisible(true);
        painel.revalidate();
        painel.repaint();
    }//GEN-LAST:event_btVendaActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        lista.setModel(listaCliente);
        lista.setName("cliente");
    }//GEN-LAST:event_btClienteActionPerformed

    private void btFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedorActionPerformed
        lista.setModel(listaFornecedor);
        lista.setName("fornecedor");
    }//GEN-LAST:event_btFornecedorActionPerformed

    private void btProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutoActionPerformed
        lista.setModel(listaProduto);
        lista.setName("produto");
    }//GEN-LAST:event_btProdutoActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        lista.setModel(listaFuncionario);
        lista.setName("funcionario");
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void btCaixaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        lista.setModel(listaCaixa);
        lista.setName("caixa");
    }
    
    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        System.out.println(lista.getName() + "[" + lista.getSelectedIndex() + "]");
        painel.removeAll();
        
        if (lista.getName().equals("cliente")){
            if (lista.getSelectedIndex() == 0){     //Cadastrar Cliente
                painel.add(pessoaFisica);
                pessoaFisica.alterarTitulo("Cadastrar Pessoa Física");
                pessoaFisica.setSize(painel.getSize());
                pessoaFisica.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){     //Alterar Cliente
                //painel.add();
                //pessoaFisica.alterarTitulo("Alterar Cadastro de Pessoa Física");
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
                painel.add(produto);
                produto.setSize(painel.getSize());
                produto.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){     //Alterar Produto
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
            if (lista.getSelectedIndex() == 2){     //Buscar Produto
                painel.add(buscarProduto);
                buscarProduto.setSize(painel.getSize());
                buscarProduto.setVisible(true);
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
            if (lista.getSelectedIndex() == 2){     //Cadastrar Usuário
                painel.add(usuario);
                usuario.setSize(painel.getSize());
                usuario.setVisible(true);
            }
            if (lista.getSelectedIndex() == 3){     //Excluir Funcionário
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
        }
        else if (lista.getName().equals("fornecedor")){
            if (lista.getSelectedIndex() == 0){      //Cadastrar Fornecedor
                painel.add(pessoaJuridica);
                pessoaJuridica.setSize(painel.getSize());
                pessoaJuridica.setVisible(true);
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
        else if (lista.getName().equals("caixa")){
            if (lista.getSelectedIndex() == 0){      //Abrir Caixa
                painel.add(caixa);
                caixa.setSize(painel.getSize());
                caixa.setVisible(true);
            }
            if (lista.getSelectedIndex() == 1){      //Fechar Caixa
                //painel.add();
                //.setSize(painel.getSize());
                //.setVisible(true);
            }
        }
        painel.revalidate();
        painel.repaint();
    }//GEN-LAST:event_listaValueChanged

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed
/*
    private void btCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCaixaActionPerformed
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCaixa;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lista;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
