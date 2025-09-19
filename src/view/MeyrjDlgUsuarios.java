package view;

import javax.swing.JFrame;
import tools.Util;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author Mathias Eduardo
 */
    public class MeyrjDlgUsuarios extends javax.swing.JDialog {

    public MeyrjDlgUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Usuários");
        setLocationRelativeTo(null);
        Util.habilitar(false, meyrjTxtApelido, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtDataNascimento, meyrjTxtSenha, meyrjCboNivel, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
    }                
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        meyrjLblCadastroUsuario = new javax.swing.JLabel();
        meyrjLblNome = new javax.swing.JLabel();
        meyrjTxtNome = new javax.swing.JTextField();
        meyrjLabel1 = new javax.swing.JLabel();
        meyrjTxtApelido = new javax.swing.JTextField();
        meyrjLblCpf = new javax.swing.JLabel();
        meyrjblDateNascimento = new javax.swing.JLabel();
        meyrjLblSenha = new javax.swing.JLabel();
        meyrjTxtSenha = new javax.swing.JTextField();
        meyrjCboNivel = new javax.swing.JComboBox<>();
        meyrjLblNivel = new javax.swing.JLabel();
        meyrjButtonPesquisar = new javax.swing.JButton();
        meyrjButtonIncluir = new javax.swing.JButton();
        meyrjButtonConfirmar = new javax.swing.JButton();
        meyrjButtonAlterar = new javax.swing.JButton();
        meyrjButtonCancelar = new javax.swing.JButton();
        meyrjButtonExcluir = new javax.swing.JButton();
        meyrjChbAtivo = new javax.swing.JCheckBox();
        meyrjLblCodigo = new javax.swing.JLabel();
        meyrjTxtCodigo = new javax.swing.JTextField();
        meyrjFmtCpf = new javax.swing.JFormattedTextField();
        meyrjFmtDataNascimento = new javax.swing.JFormattedTextField();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        meyrjLblCadastroUsuario.setText("Cadastro de Usuarios");

        meyrjLblNome.setText("Nome:");

        meyrjTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtNomeActionPerformed(evt);
            }
        });

        meyrjLabel1.setText("Apelido:");

        meyrjTxtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtApelidoActionPerformed(evt);
            }
        });

        meyrjLblCpf.setText("Cpf:");

        meyrjblDateNascimento.setText("Data de Nascimento:");

        meyrjLblSenha.setText("Senha:");

        meyrjTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtSenhaActionPerformed(evt);
            }
        });

        meyrjCboNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente", "Usuário", " " }));
        meyrjCboNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjCboNivelActionPerformed(evt);
            }
        });

        meyrjLblNivel.setText("Nivel:");

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

        meyrjChbAtivo.setText("Ativo");
        meyrjChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjChbAtivoActionPerformed(evt);
            }
        });

        meyrjLblCodigo.setText("Código");

        meyrjTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(meyrjLblCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meyrjLblCadastroUsuario)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjTxtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjblDateNascimento)
                            .addComponent(meyrjLblNome)
                            .addComponent(meyrjFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjTxtApelido, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(meyrjTxtSenha)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLabel1)
                                    .addComponent(meyrjLblSenha))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjLblNivel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(meyrjChbAtivo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjLblCpf)
                            .addComponent(meyrjFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(meyrjLblCadastroUsuario)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(meyrjLblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjLabel1)
                    .addComponent(meyrjLblNome)
                    .addComponent(meyrjLblCpf))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjblDateNascimento)
                    .addComponent(meyrjLblSenha)
                    .addComponent(meyrjLblNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjCboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjChbAtivo)
                    .addComponent(meyrjFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meyrjTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtNomeActionPerformed

    private void meyrjTxtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtApelidoActionPerformed

    private void meyrjTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtSenhaActionPerformed

    private void meyrjCboNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjCboNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjCboNivelActionPerformed

    private void meyrjButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonPesquisarActionPerformed
        // TODO add your handling code here:
        /*String id = JOptionPane.showInputDialog(null, "Entre com o código ?");
        int codigo = Integer.valueOf(id);
        MeyrUsuariosDao usuariosDao = new MeyrUsuariosDao();
        MeyrUsuarios usuarios = (MeyrUsuarios) usuariosDao.list(codigo);
        if (usuarios == null) {
            JOptionPane.showMessageDialog(null, "Codigo não existente");
        }
        meyrjTxtCodigo.setText(id);
        meyrjTxtNome.setText(usuarios.getMeyr_nome());
        meyrjTxtApelido.setText(usuarios.getMeyr_apelido());
        meyrjFmtCpf.setText(usuarios.getMeyr_cpf());
// jFmtDatadeNascimento.setText(usuarios.getMeyr_dataNascimento()); // Se quiser descomentar depois
        meyrjTxtSenha.setText(usuarios.getMeyr_senha()); // Aqui só se existir esse método, porque você não citou no banco
        meyrjCboNivel.setSelectedIndex(usuarios.getMeyr_nivel());
        if (usuarios.getMeyr_ativo().equals("S")) {
            meyrjChbAtivo.setSelected(true);
        } else {
            meyrjChbAtivo.setSelected(false);
        }*/
        Util.mensagem("Nao Implementado.");
    }//GEN-LAST:event_meyrjButtonPesquisarActionPerformed

    private void meyrjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonIncluirActionPerformed
        Util.habilitar(true, meyrjTxtApelido, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtDataNascimento, meyrjTxtSenha, meyrjCboNivel, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);
        Util.limpar(meyrjTxtCodigo, meyrjTxtNome, meyrjTxtApelido);

    }//GEN-LAST:event_meyrjButtonIncluirActionPerformed

    private void meyrjButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonAlterarActionPerformed
        Util.habilitar(true, meyrjTxtApelido, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtDataNascimento, meyrjTxtSenha, meyrjCboNivel, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonAlterarActionPerformed

    private void meyrjButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonExcluirActionPerformed
        Util.perguntar("Deseja excluir o registro?");
    }//GEN-LAST:event_meyrjButtonExcluirActionPerformed

    private void meyrjButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonConfirmarActionPerformed
        Util.habilitar(false, meyrjTxtApelido, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtDataNascimento, meyrjTxtSenha, meyrjCboNivel, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonConfirmarActionPerformed

    private void meyrjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonCancelarActionPerformed
        Util.habilitar(false, meyrjTxtApelido, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtDataNascimento, meyrjTxtSenha, meyrjCboNivel, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonCancelarActionPerformed

    private void meyrjChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjChbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjChbAtivoActionPerformed

    private void meyrjTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtCodigoActionPerformed
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MeyrjDlgUsuarios dialog = new MeyrjDlgUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton meyrjButtonAlterar;
    private javax.swing.JButton meyrjButtonCancelar;
    private javax.swing.JButton meyrjButtonConfirmar;
    private javax.swing.JButton meyrjButtonExcluir;
    private javax.swing.JButton meyrjButtonIncluir;
    private javax.swing.JButton meyrjButtonPesquisar;
    private javax.swing.JComboBox<String> meyrjCboNivel;
    private javax.swing.JCheckBox meyrjChbAtivo;
    private javax.swing.JFormattedTextField meyrjFmtCpf;
    private javax.swing.JFormattedTextField meyrjFmtDataNascimento;
    private javax.swing.JLabel meyrjLabel1;
    private javax.swing.JLabel meyrjLblCadastroUsuario;
    private javax.swing.JLabel meyrjLblCodigo;
    private javax.swing.JLabel meyrjLblCpf;
    private javax.swing.JLabel meyrjLblNivel;
    private javax.swing.JLabel meyrjLblNome;
    private javax.swing.JLabel meyrjLblSenha;
    private javax.swing.JTextField meyrjTxtApelido;
    private javax.swing.JTextField meyrjTxtCodigo;
    private javax.swing.JTextField meyrjTxtNome;
    private javax.swing.JTextField meyrjTxtSenha;
    private javax.swing.JLabel meyrjblDateNascimento;
    // End of variables declaration//GEN-END:variables
}
