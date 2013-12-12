/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vitorjclima.controledeintervencoes.view;

import br.com.vitorjclima.controledeintervencoes.core.controller.IntervencaoTipoJpaController;
import br.com.vitorjclima.controledeintervencoes.db.IntervencaoTipo;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class CadastroIntervencaoTipoView extends javax.swing.JFrame {
    
    
    private IntervencaoTipoJpaController tipoIntervencaoController;
    private IntervencaoTipo tipoIntervencao;
    private Principal principal;

    /**
     * Creates new form CadastroIntervencaoTipoView
     */
    public CadastroIntervencaoTipoView() {
        initComponents();
        tipoIntervencaoController = new IntervencaoTipoJpaController();
    }
    
    
    public CadastroIntervencaoTipoView(Principal principal) {
        initComponents();
        this.principal = principal;
        tipoIntervencaoController = new IntervencaoTipoJpaController();
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

        labelTipoIntervencao = new javax.swing.JLabel();
        tipoIntervencaoEntrada = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipo de Intervenção");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelTipoIntervencao.setText("Tipo de Intervenção");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipoIntervencao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoIntervencaoEntrada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(botaoSalvar)
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoIntervencaoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTipoIntervencao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSalvar)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        tipoIntervencao = new IntervencaoTipo();
                
        tipoIntervencao.setIntervencaoTipoId(tipoIntervencaoEntrada.getText());
        cursorWait();
        try {
            if (tipoIntervencaoController.findIntervencaoTipo(tipoIntervencaoEntrada.getText()).getIntervencaoTipoId().equals(tipoIntervencaoEntrada.getText())) {
                JOptionPane.showMessageDialog(this, "Tipo de Intervenção já cadastrado");
                cursorDefault();
            }
        } catch (Exception e) {
            if (tipoIntervencaoEntrada.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Você deve digitar o nome do tipo de intervençaõ");
            } else if (tipoIntervencaoEntrada.getText().length() > 40) {
                JOptionPane.showMessageDialog(this, "Tamanho máximo: 40 caracteres");
            } else {

                try {
                    this.tipoIntervencaoController.create(tipoIntervencao);
                    JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso");
                    this.dispose();
                    this.principal.setEnabled(true);
                } catch (Exception ex) {
                    Logger.getLogger(IntervencaoTipo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            cursorDefault();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroIntervencaoTipoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroIntervencaoTipoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroIntervencaoTipoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroIntervencaoTipoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroIntervencaoTipoView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel labelTipoIntervencao;
    private javax.swing.JTextField tipoIntervencaoEntrada;
    // End of variables declaration//GEN-END:variables
}
