/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vitorjclima.controledeintervencoes.view;

import br.com.vitorjclima.controledeintervencoes.core.controller.PessoaJpaController;
import br.com.vitorjclima.controledeintervencoes.core.controller.exceptions.NonexistentEntityException;
import br.com.vitorjclima.controledeintervencoes.db.Pessoa;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class PessoaView extends javax.swing.JFrame{

    private PessoaJpaController pessoaController;
    private Pessoa pessoa;
    private Principal principal;
    private boolean editar;

    /**
     * Creates new form PessoaView
     */
    public PessoaView() {
        initComponents();
        this.pessoaController = new PessoaJpaController();
        enableCampos(false);
        panelBotoes.setEnabled(true);
    }

    public PessoaView(Principal principal) {
        initComponents();
        this.pessoaController = new PessoaJpaController();
        this.principal = principal;
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        enableCampos(false);
    }

    private void enableCampos(boolean x) {
            nome.setEnabled(x);
            cpf.setEnabled(x);
            email.setEnabled(x);
    }

    public boolean getEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    private void apagaConteudo() {
        nome.setText(null);
        cpf.setText(null);
        email.setText(null);
        pesquisar.setText(null);
    }

    private void cursorWait() {
        Cursor ponteiroMouse = new Cursor(Cursor.WAIT_CURSOR);
        setCursor(ponteiroMouse);
    }

    private void cursorDefault() {
        Cursor ponteiroMouse = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(ponteiroMouse);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        cpf = new javax.swing.JFormattedTextField();
        botaoPesquisar = new javax.swing.JButton();
        pesquisar = new javax.swing.JFormattedTextField();
        panelBotoes = new java.awt.Panel();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelNome.setText("Nome");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        labelCPF.setText("CPF");

        labelEmail.setText("E-mail");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setToolTipText("");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        try {
            pesquisar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pesquisar.setToolTipText("");

        panelBotoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail)
                            .addComponent(labelNome)
                            .addComponent(labelCPF))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPesquisar))
                            .addComponent(cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cpf, email, nome});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCPF, labelEmail, labelNome});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPesquisar)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed


        if (editar == false) {

            this.pessoa = new Pessoa();
            this.pessoa.setPessoaNome(nome.getText());
            this.pessoa.setPessoaCpf(cpf.getText());
            this.pessoa.setPessoaEmail(email.getText());

            if (nome.getText().equals("") || cpf.getText().equals("   .   .   -  ") || email.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos");
            } else {

                try {
                    cursorWait();
                    pessoaController.findPessoa(cpf.getText());
                    JOptionPane.showMessageDialog(this, "Já existe uma pessoa cadastrada com este CPF");
                    cursorDefault();
                } catch (Exception e) {
                    cursorWait();
                    this.pessoaController.create(pessoa);
                    JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso");
                    this.dispose();
                    this.principal.setEnabled(true);
                    cursorDefault();
                }
            }
        } else {

            this.pessoa.setPessoaNome(nome.getText());
            this.pessoa.setPessoaCpf(cpf.getText());
            this.pessoa.setPessoaEmail(email.getText());

            if (nome.getText().equals("") || cpf.getText().equals("   .   .   -  ") || email.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos");
            } else {
                try {
                    cursorWait();
                    this.pessoaController.edit(pessoa);
                    JOptionPane.showMessageDialog(this, "Cadastro alterado com sucesso");
                    this.dispose();
                    this.principal.setEnabled(true);
                    cursorDefault();
                } catch (Exception ex) {
                    Logger.getLogger(PessoaView.class.getName()).log(Level.SEVERE, null, ex);             
                }
            }

        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        this.principal.setEnabled(true);

    }//GEN-LAST:event_formWindowClosed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        cursorWait();
        enableCampos(false);
        this.pessoa = new Pessoa();

        try {
            pessoa = pessoaController.findPessoa(pesquisar.getText());
            nome.setText(pessoa.getPessoaNome());
            cpf.setText(pessoa.getPessoaCpf());
            email.setText(pessoa.getPessoaEmail());
            botaoEditar.setEnabled(true);
            botaoExcluir.setEnabled(true);
            botaoPesquisar.setEnabled(true);
            botaoNovo.setEnabled(true);
            botaoSalvar.setEnabled(true);
            cursorDefault();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não existe nenhuma pessoa cadastrada com este CPF");
            cursorDefault();
            apagaConteudo();
            pesquisar.requestFocusInWindow();
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        enableCampos(true);
        setEditar(true);
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        apagaConteudo();
        enableCampos(true);
        nome.requestFocusInWindow();
        pesquisar.setEnabled(false);
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoPesquisar.setEnabled(false);
        botaoNovo.setEnabled(false);
        botaoSalvar.setEnabled(true);

    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        cursorWait();
        try {
            pessoaController.destroy(pessoa.getPessoaId());
            apagaConteudo();
            JOptionPane.showMessageDialog(this, "Registro removido com sucesso");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        cursorDefault();
    }//GEN-LAST:event_botaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JTextField nome;
    private java.awt.Panel panelBotoes;
    private javax.swing.JFormattedTextField pesquisar;
    // End of variables declaration//GEN-END:variables
}