/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iss_trab_farmacia;

import org.mongodb.morphia.Datastore;

/**
 *
 * @author guest-1HRmBh
 */
public class CadastroPessoa extends javax.swing.JFrame {

    //private final Pessoas pessoas;
    
    PessoaFisica   pessoaFisica;
    PessoaJuridica pessoaJuridica;
    
    /**
     * Creates new form FarmaciaInterface
     * @param ds
     */
    public CadastroPessoa(Datastore ds) {
        initComponents();
        btGrupoTipoPessoa.add(btPessoaFisica);
        btGrupoTipoPessoa.add(btPessoaJuridica);
        
        pessoaFisica   = new PessoaFisica(ds);
        pessoaJuridica = new PessoaJuridica(ds);
        
        painel.add(pessoaFisica);
        pessoaFisica.setVisible(false);
        pessoaFisica.setSize(painel.getSize());
        
        painel.add(pessoaJuridica);
        pessoaJuridica.setVisible(false);
        pessoaJuridica.setSize(painel.getSize());
        
        //this.pessoas = new Pessoas(ds);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGrupoTipoPessoa = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btPessoaFisica = new javax.swing.JRadioButton();
        btPessoaJuridica = new javax.swing.JRadioButton();
        painel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 130, 40));
        setForeground(java.awt.Color.red);

        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Cadastro de Pessoa:");

        btPessoaFisica.setSelected(true);
        btPessoaFisica.setText("Física");
        btPessoaFisica.setToolTipText("Selecione para cadastrar uma pessoa física");
        btPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPessoaFisicaActionPerformed(evt);
            }
        });

        btPessoaJuridica.setText("Jurídica");
        btPessoaJuridica.setToolTipText("Selecione para cadastrar uma pessoa jurídica");
        btPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPessoaJuridicaActionPerformed(evt);
            }
        });

        painel.setBackground(new java.awt.Color(190, 190, 190));
        painel.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(btPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPessoaJuridica)
                                .addGap(0, 293, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitulo)
                    .addComponent(btPessoaJuridica)
                    .addComponent(btPessoaFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPessoaFisicaActionPerformed
        // TODO add your handling code here:
        pessoaFisica.setVisible(true);
        pessoaJuridica.setVisible(false);
    }//GEN-LAST:event_btPessoaFisicaActionPerformed

    private void btPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPessoaJuridicaActionPerformed
        // TODO add your handling code here:
        pessoaFisica.setVisible(false);
        pessoaJuridica.setVisible(true);
    }//GEN-LAST:event_btPessoaJuridicaActionPerformed

    /**
     * @param ds
     */
    public static void main(Datastore ds) {
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
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroPessoa(ds).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGrupoTipoPessoa;
    private javax.swing.JRadioButton btPessoaFisica;
    private javax.swing.JRadioButton btPessoaJuridica;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel painel;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}