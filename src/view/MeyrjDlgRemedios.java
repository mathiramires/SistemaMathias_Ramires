package view;

import bean.MeyrRemedios;
import tools.Util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author Mathias Eduardo
 */

public class MeyrjDlgRemedios extends javax.swing.JDialog {
    boolean pesquisando = false;
    public MeyrjDlgRemedios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Remedios");
        setLocationRelativeTo(null);
        Util.habilitar(false, 
            meyrjTxtCodigo,
            meyrjTxtNome,
            meyrjTxtLaboratorio,
            meyrjTxtDosagem,
            meyrjTxtPrecoVenda,
            meyrjTxtPrecoCusto,
            meyrjFmtValidade,
            meyrjChbControlado,
            meyrjButtonConfirmar,
            meyrjButtonCancelar
        );
    }
    public MeyrRemedios viewBean() {
    MeyrRemedios meyrRemedios = new MeyrRemedios();

    int codigo = Util.strToInt(meyrjTxtCodigo.getText());
    meyrRemedios.setMeyrIdRemedio(codigo);
    meyrRemedios.setMeyrNome(meyrjTxtNome.getText());
    meyrRemedios.setMeyrLaboratorio(meyrjTxtLaboratorio.getText());
    meyrRemedios.setMeyrDosagem(meyrjTxtDosagem.getText());
    meyrRemedios.setMeyrPrecoVenda(Util.strToDuble(meyrjTxtPrecoVenda.getText()));
    meyrRemedios.setMeyrPrecoCusto(Util.strToDuble(meyrjTxtPrecoCusto.getText()));
    meyrRemedios.setMeyrDataValidade(Util.strToDate(meyrjFmtValidade.getText()));

    if (meyrjChbControlado.isSelected() == true) {
        meyrRemedios.setMeyrControlado("S");
    } else {
        meyrRemedios.setMeyrControlado("N");
    }

    return meyrRemedios;
}

public void beanView(MeyrRemedios meyrRemedios) {
    meyrjTxtCodigo.setText(Util.intToStr(meyrRemedios.getMeyrIdRemedio()));
    meyrjTxtNome.setText(meyrRemedios.getMeyrNome());
    meyrjTxtLaboratorio.setText(meyrRemedios.getMeyrLaboratorio());
    meyrjTxtDosagem.setText(meyrRemedios.getMeyrDosagem());
    meyrjTxtPrecoVenda.setText(Util.doubleToStr(meyrRemedios.getMeyrPrecoVenda()));
    meyrjTxtPrecoCusto.setText(Util.doubleToStr(meyrRemedios.getMeyrPrecoCusto()));
    meyrjFmtValidade.setText(Util.dateToStr(meyrRemedios.getMeyrDataValidade()));

    if (meyrRemedios.getMeyrControlado().equals("S") == true) {
        meyrjChbControlado.setSelected(true);
    } else {
        meyrjChbControlado.setSelected(false);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jProgressBar1 = new javax.swing.JProgressBar();
        meyrjTxtCodigo2 = new javax.swing.JTextField();
        meyrjLblCodigo1 = new javax.swing.JLabel();
        meyrjLblCadastroRemedios = new javax.swing.JLabel();
        meyrjLblLaboratorio = new javax.swing.JLabel();
        meyrjTxtLaboratorio = new javax.swing.JTextField();
        meyrjTxtDosagem = new javax.swing.JTextField();
        meyrjLblDosagem = new javax.swing.JLabel();
        meyrjLblPrecoVenda = new javax.swing.JLabel();
        meyrjTxtPrecoVenda = new javax.swing.JTextField();
        meyrjLblPrecoCusto = new javax.swing.JLabel();
        meyrjTxtPrecoCusto = new javax.swing.JTextField();
        meyrjButtonPesquisar = new javax.swing.JButton();
        meyrjButtonIncluir = new javax.swing.JButton();
        meyrjButtonConfirmar = new javax.swing.JButton();
        meyrjButtonAlterar = new javax.swing.JButton();
        meyrjButtonCancelar = new javax.swing.JButton();
        meyrjButtonExcluir = new javax.swing.JButton();
        meyrjLblDataValidade = new javax.swing.JLabel();
        meyrjLblNome = new javax.swing.JLabel();
        meyrjTxtNome = new javax.swing.JTextField();
        meyrjChbControlado = new javax.swing.JCheckBox();
        meyrjTxtCodigo = new javax.swing.JTextField();
        meyrjLblCodigo2 = new javax.swing.JLabel();
        meyrjFmtValidade = new javax.swing.JFormattedTextField();

        meyrjTxtCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtCodigo2ActionPerformed(evt);
            }
        });

        meyrjLblCodigo1.setText("Código");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        meyrjLblCadastroRemedios.setText("Cadastro de Remedios");

        meyrjLblLaboratorio.setText("Laboratorio:");

        meyrjTxtLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtLaboratorioActionPerformed(evt);
            }
        });

        meyrjLblDosagem.setText("Dosagem:");

        meyrjLblPrecoVenda.setText("Preço de Venda:");

        meyrjTxtPrecoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtPrecoVendaActionPerformed(evt);
            }
        });

        meyrjLblPrecoCusto.setText("Preço de Custo:");

        meyrjTxtPrecoCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtPrecoCustoActionPerformed(evt);
            }
        });

        meyrjButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        meyrjButtonPesquisar.setText("Pesquisar");
        meyrjButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonPesquisarActionPerformed(evt);
            }
        });

        meyrjButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        meyrjButtonIncluir.setText("Incluir");
        meyrjButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonIncluirActionPerformed(evt);
            }
        });

        meyrjButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        meyrjButtonConfirmar.setText("Confirmar");
        meyrjButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonConfirmarActionPerformed(evt);
            }
        });

        meyrjButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        meyrjButtonAlterar.setText("Alterar");
        meyrjButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonAlterarActionPerformed(evt);
            }
        });

        meyrjButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        meyrjButtonCancelar.setText("Cancelar");
        meyrjButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonCancelarActionPerformed(evt);
            }
        });

        meyrjButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        meyrjButtonExcluir.setText("Excluir");
        meyrjButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonExcluirActionPerformed(evt);
            }
        });

        meyrjLblDataValidade.setText("Validade:");

        meyrjLblNome.setText("Nome:");

        meyrjTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtNomeActionPerformed(evt);
            }
        });

        meyrjChbControlado.setText("Controlado");
        meyrjChbControlado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjChbControladoActionPerformed(evt);
            }
        });

        meyrjTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtCodigoActionPerformed(evt);
            }
        });

        meyrjLblCodigo2.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(meyrjLblCadastroRemedios)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meyrjLblCodigo2)
                    .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(meyrjTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(meyrjTxtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjLblDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjTxtDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjTxtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(meyrjTxtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLblNome)
                                    .addComponent(meyrjLblPrecoVenda))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLblPrecoCusto)
                                    .addComponent(meyrjLblLaboratorio))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjLblDataValidade)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjFmtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(meyrjChbControlado))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(meyrjLblCadastroRemedios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(meyrjLblCodigo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(meyrjLblNome)
                            .addComponent(meyrjLblLaboratorio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjTxtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(meyrjLblDosagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meyrjTxtDosagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjLblPrecoVenda)
                    .addComponent(meyrjLblPrecoCusto)
                    .addComponent(meyrjLblDataValidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjTxtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjTxtPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjChbControlado)
                    .addComponent(meyrjFmtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meyrjTxtPrecoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtPrecoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtPrecoVendaActionPerformed

    private void meyrjTxtPrecoCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtPrecoCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtPrecoCustoActionPerformed

    private void meyrjButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonPesquisarActionPerformed
        MeyrJDlgRemediosPesquisar meyrJDlgRemediosPesquisar = new MeyrJDlgRemediosPesquisar(null, true);
        meyrJDlgRemediosPesquisar.setTelaPai(this);
        meyrJDlgRemediosPesquisar.setVisible(true);
        pesquisando = true;
        
    }//GEN-LAST:event_meyrjButtonPesquisarActionPerformed

    private void meyrjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonIncluirActionPerformed
        Util.habilitar(true, meyrjTxtCodigo, meyrjTxtNome, meyrjTxtLaboratorio, meyrjTxtDosagem, meyrjTxtPrecoVenda, meyrjTxtPrecoCusto, meyrjFmtValidade, meyrjChbControlado, meyrjButtonConfirmar, meyrjButtonCancelar);  
        Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);  
         Util.limpar(meyrjTxtCodigo,
            meyrjTxtNome,
            meyrjTxtLaboratorio,
            meyrjTxtDosagem,
            meyrjTxtPrecoVenda,
            meyrjTxtPrecoCusto,
            meyrjFmtValidade,
            meyrjChbControlado);
    }//GEN-LAST:event_meyrjButtonIncluirActionPerformed

    private void meyrjButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonAlterarActionPerformed
        Util.habilitar(true, meyrjTxtNome, meyrjTxtLaboratorio, meyrjTxtDosagem, meyrjTxtPrecoVenda, meyrjTxtPrecoCusto, meyrjFmtValidade, meyrjChbControlado, meyrjButtonConfirmar, meyrjButtonCancelar);  
        Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonAlterarActionPerformed

    private void meyrjButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonExcluirActionPerformed
         if (pesquisando == false) {
            Util.mensagem("Você precisa pesquisar um usuário primeiro");
        } else {
                Util.perguntar("Você deseja excluir?");
                Util.limpar(meyrjTxtCodigo,
            meyrjTxtNome,
            meyrjTxtLaboratorio,
            meyrjTxtDosagem,
            meyrjTxtPrecoVenda,
            meyrjTxtPrecoCusto,
            meyrjFmtValidade,
            meyrjChbControlado
            );  
        } 
    }//GEN-LAST:event_meyrjButtonExcluirActionPerformed

    private void meyrjButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonConfirmarActionPerformed
        Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNome, meyrjTxtLaboratorio, meyrjTxtDosagem, meyrjTxtPrecoVenda, meyrjTxtPrecoCusto, meyrjFmtValidade, meyrjChbControlado, meyrjButtonConfirmar, meyrjButtonCancelar);  
        Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonConfirmarActionPerformed

    private void meyrjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonCancelarActionPerformed
    Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNome, meyrjTxtLaboratorio, meyrjTxtDosagem, meyrjTxtPrecoVenda, meyrjTxtPrecoCusto, meyrjFmtValidade, meyrjChbControlado, meyrjButtonConfirmar, meyrjButtonCancelar);  
    Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonCancelarActionPerformed

    private void meyrjTxtLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtLaboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtLaboratorioActionPerformed

    private void meyrjTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtNomeActionPerformed

    private void meyrjChbControladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjChbControladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjChbControladoActionPerformed

    private void meyrjTxtCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtCodigo2ActionPerformed

    private void meyrjTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtCodigoActionPerformed
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(MeyrjDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(MeyrjDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(MeyrjDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(MeyrjDlgClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MeyrjDlgRemedios dialog = new MeyrjDlgRemedios(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton meyrjButtonAlterar;
    private javax.swing.JButton meyrjButtonCancelar;
    private javax.swing.JButton meyrjButtonConfirmar;
    private javax.swing.JButton meyrjButtonExcluir;
    private javax.swing.JButton meyrjButtonIncluir;
    private javax.swing.JButton meyrjButtonPesquisar;
    private javax.swing.JCheckBox meyrjChbControlado;
    private javax.swing.JFormattedTextField meyrjFmtValidade;
    private javax.swing.JLabel meyrjLblCadastroRemedios;
    private javax.swing.JLabel meyrjLblCodigo1;
    private javax.swing.JLabel meyrjLblCodigo2;
    private javax.swing.JLabel meyrjLblDataValidade;
    private javax.swing.JLabel meyrjLblDosagem;
    private javax.swing.JLabel meyrjLblLaboratorio;
    private javax.swing.JLabel meyrjLblNome;
    private javax.swing.JLabel meyrjLblPrecoCusto;
    private javax.swing.JLabel meyrjLblPrecoVenda;
    private javax.swing.JTextField meyrjTxtCodigo;
    private javax.swing.JTextField meyrjTxtCodigo2;
    private javax.swing.JTextField meyrjTxtDosagem;
    private javax.swing.JTextField meyrjTxtLaboratorio;
    private javax.swing.JTextField meyrjTxtNome;
    private javax.swing.JTextField meyrjTxtPrecoCusto;
    private javax.swing.JTextField meyrjTxtPrecoVenda;
    // End of variables declaration//GEN-END:variables

}
