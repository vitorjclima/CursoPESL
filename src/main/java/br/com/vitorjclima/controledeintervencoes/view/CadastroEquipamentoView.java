package br.com.vitorjclima.controledeintervencoes.view;

import br.com.vitorjclima.controledeintervencoes.core.controller.EmpresaJpaController;
import br.com.vitorjclima.controledeintervencoes.core.controller.EquipamentoJpaController;
import br.com.vitorjclima.controledeintervencoes.core.controller.exceptions.NonexistentEntityException;
import br.com.vitorjclima.controledeintervencoes.core.controller.exceptions.PreexistingEntityException;
import br.com.vitorjclima.controledeintervencoes.db.Empresa;
import br.com.vitorjclima.controledeintervencoes.db.Equipamento;
import java.awt.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroEquipamentoView extends javax.swing.JFrame {

    private EquipamentoJpaController equipamentoController;
    private Equipamento equipamento;
    private EmpresaJpaController empresaController;
    private Principal principal;
    private boolean editar;

    /**
     * Creates new form CadastroEquipamentoView
     */
    public CadastroEquipamentoView() {
        initComponents();
        this.equipamentoController = new EquipamentoJpaController();
        this.empresaController = new EmpresaJpaController();
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        enableCampos(false);
    }

    CadastroEquipamentoView(Principal principal) {
        initComponents();
        this.equipamentoController = new EquipamentoJpaController();
        this.empresaController = new EmpresaJpaController();
        this.principal = principal;
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoSalvar.setEnabled(false);
        enableCampos(false);   
    }

    private void enableCampos(boolean x) {
        equipamentoId.setEnabled(x);
        descricao.setEnabled(x);
        modelo.setEnabled(x);
        numeroSerie.setEnabled(x);
        faixaMedicao.setEnabled(x);
        menorDivisao.setEnabled(x);
        empresaComboBox.setEnabled(x);
    }

    private void carregaEmpresas() {
        cursorWait();
        empresaComboBox.removeAllItems();
        
        List<Empresa> lista = empresaController.findEmpresaEntities();

        for (Iterator itr = lista.iterator(); itr.hasNext();) {
            Empresa contato = (Empresa) itr.next();

            empresaComboBox.addItem(contato.getEmpresaNomeFantasia());
        }
        cursorDefault();

    }

    public boolean getEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    private void apagaConteudo() {
        equipamentoId.setText(null);
        descricao.setText(null);
        modelo.setText(null);
        numeroSerie.setText(null);
        faixaMedicao.setText(null);
        menorDivisao.setText(null);
        empresaComboBox.setToolTipText(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        labelDescricao = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        labelNumeroSerie = new javax.swing.JLabel();
        labelFaixaMedicao = new javax.swing.JLabel();
        labelMenorDivisao = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        numeroSerie = new javax.swing.JTextField();
        faixaMedicao = new javax.swing.JTextField();
        menorDivisao = new javax.swing.JTextField();
        empresaComboBox = new javax.swing.JComboBox();
        labelEmpresa = new javax.swing.JLabel();
        labelEquipamento = new javax.swing.JLabel();
        panelBotoes = new java.awt.Panel();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoPesquisar = new javax.swing.JButton();
        pesquisar = new javax.swing.JTextField();
        equipamentoId = new javax.swing.JFormattedTextField();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Equipamento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelDescricao.setText("Descrição");

        labelModelo.setText("Modelo");

        labelNumeroSerie.setText("Número de Série");

        labelFaixaMedicao.setText("Faixa de Medição");

        labelMenorDivisao.setText("Menor Divisão");

        empresaComboBox.setFocusCycleRoot(true);
        empresaComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empresaComboBoxMouseClicked(evt);
            }
        });

        labelEmpresa.setText("Empresa");

        labelEquipamento.setText("Equipamento");

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

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotoesLayout.createSequentialGroup()
                        .addComponent(botaoNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoExcluir))
                    .addGroup(panelBotoesLayout.createSequentialGroup()
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar)))
                .addContainerGap())
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPesquisar)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoSalvar))
                .addGap(5, 5, 5))
        );

        equipamentoId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        equipamentoId.setToolTipText("");
        equipamentoId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEquipamento)
                    .addComponent(labelDescricao)
                    .addComponent(labelModelo)
                    .addComponent(labelNumeroSerie)
                    .addComponent(labelFaixaMedicao)
                    .addComponent(labelMenorDivisao)
                    .addComponent(labelEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equipamentoId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(numeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(faixaMedicao, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(menorDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(empresaComboBox, 0, 308, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {descricao, empresaComboBox, faixaMedicao, menorDivisao, modelo, numeroSerie});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEquipamento)
                    .addComponent(equipamentoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroSerie)
                    .addComponent(numeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFaixaMedicao)
                    .addComponent(faixaMedicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenorDivisao)
                    .addComponent(menorDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEmpresa)
                    .addComponent(empresaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        apagaConteudo();
        enableCampos(true);
        carregaEmpresas();
        equipamentoId.requestFocusInWindow();
        pesquisar.setEnabled(false);
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
        botaoPesquisar.setEnabled(false);
        botaoNovo.setEnabled(false);
        botaoSalvar.setEnabled(true);
        setEditar(false);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        enableCampos(true);
        setEditar(true);
        carregaEmpresas();
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        carregaEmpresas();
        if (editar == false) {

            this.equipamento = new Equipamento();
            this.equipamento.setEquipamentoId(Integer.parseInt(equipamentoId.getText()));
            this.equipamento.setEquipamentoDescricao(descricao.getText());
            this.equipamento.setEquipamentoModelo(modelo.getText());
            this.equipamento.setEquipamentoNumeroSerie(numeroSerie.getText());
            this.equipamento.setEquipamentoFaixaMedicao(faixaMedicao.getText());
            this.equipamento.setEquipamentoMenorDivisao(menorDivisao.getText());
            

            this.equipamento.setEmpresaId(empresaController.findEmpresaNomeFantasia(empresaComboBox.getModel().getSelectedItem().toString()).getEmpresaId());

            if (descricao.getText().equals("")
                    || modelo.getText().equals("")
                    || numeroSerie.getText().equals("")
                    || faixaMedicao.getText().equals("")
                    || menorDivisao.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos");
            } else {

                try {
                    cursorWait();
                    equipamentoController.findEquipamento(Integer.parseInt(pesquisar.getText()));
                    JOptionPane.showMessageDialog(this, "Já existe uma empresa cadastrada com este CNPJ");
                    cursorDefault();
                } catch (Exception e) {
                    cursorWait();
                    try {
                        this.equipamentoController.create(equipamento);


                    } catch (PreexistingEntityException ex) {
                        Logger.getLogger(CadastroEquipamentoView.class
                                .getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(CadastroEquipamentoView.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso");
                    this.dispose();
                    this.principal.setEnabled(true);
                    cursorDefault();
                }
            }
        } else {

            this.equipamento.setEquipamentoDescricao(descricao.getText());
            this.equipamento.setEquipamentoModelo(modelo.getText());
            this.equipamento.setEquipamentoNumeroSerie(numeroSerie.getText());
            this.equipamento.setEquipamentoFaixaMedicao(faixaMedicao.getText());
            this.equipamento.setEquipamentoMenorDivisao(menorDivisao.getText());
            System.out.println("Passei aqui: "+empresaComboBox.getName());
            //this.equipamento.setEmpresaId(empresaComboBox.getSelectedIndex());

            if (descricao.getText().equals("")
                    || modelo.getText().equals("")
                    || numeroSerie.getText().equals("")
                    || faixaMedicao.getText().equals("")
                    || menorDivisao.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos");
            } else {
                try {
                    cursorWait();
                    this.equipamentoController.edit(equipamento);
                    JOptionPane.showMessageDialog(this, "Cadastro alterado com sucesso");
                    this.dispose();
                    this.principal.setEnabled(true);
                    cursorDefault();


                } catch (Exception ex) {
                    Logger.getLogger(PessoaView.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        cursorWait();
        try {
            equipamentoController.destroy(equipamento.getEquipamentoId());
            apagaConteudo();
            JOptionPane.showMessageDialog(this, "Registro removido com sucesso");


        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PessoaView.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        cursorDefault();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        cursorWait();
        enableCampos(false);
        carregaEmpresas();
        this.equipamento = new Equipamento();

        try {
            equipamento = equipamentoController.findEquipamento(Integer.parseInt(pesquisar.getText()));

            equipamentoId.setText(equipamento.getEquipamentoId().toString());
            descricao.setText(equipamento.getEquipamentoDescricao());
            modelo.setText(equipamento.getEquipamentoModelo());
            numeroSerie.setText(equipamento.getEquipamentoNumeroSerie());
            faixaMedicao.setText(equipamento.getEquipamentoFaixaMedicao());
            menorDivisao.setText(equipamento.getEquipamentoMenorDivisao());
            empresaComboBox.getItemAt(0);

            botaoEditar.setEnabled(true);
            botaoExcluir.setEnabled(true);
            botaoPesquisar.setEnabled(true);
            botaoNovo.setEnabled(true);
            botaoSalvar.setEnabled(true);
            cursorDefault();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não existe nenhuma empresa cadastrada com este CNPJ");
            cursorDefault();
            apagaConteudo();
            pesquisar.requestFocusInWindow();
        }
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void empresaComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresaComboBoxMouseClicked

    }//GEN-LAST:event_empresaComboBoxMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        this.principal.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(CadastroEquipamentoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEquipamentoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEquipamentoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEquipamentoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEquipamentoView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField descricao;
    private javax.swing.JComboBox empresaComboBox;
    private javax.swing.JFormattedTextField equipamentoId;
    private javax.swing.JTextField faixaMedicao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelEquipamento;
    private javax.swing.JLabel labelFaixaMedicao;
    private javax.swing.JLabel labelMenorDivisao;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelNumeroSerie;
    private javax.swing.JTextField menorDivisao;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField numeroSerie;
    private java.awt.Panel panelBotoes;
    private javax.swing.JTextField pesquisar;
    // End of variables declaration//GEN-END:variables
}
