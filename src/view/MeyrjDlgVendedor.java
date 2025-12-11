package view;

import bean.MeyrVendedor;
import dao.MeyrUsuariosDAO;
import dao.MeyrVendedorDAO;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author Mathias Eduardo
 */
public class MeyrjDlgVendedor extends javax.swing.JDialog {
    
    private boolean incluir;
    boolean pesquisando = false;
    private MaskFormatter mascaraCpf, mascaraDataNasc;
    
    public MeyrjDlgVendedor(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    setTitle("Cadastro de Vendedores");
    setLocationRelativeTo(null);
    Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
     try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraDataNasc = new MaskFormatter("##/##/####");
            meyrjFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
            meyrjFmtDataAdmissao.setFormatterFactory(new DefaultFormatterFactory(mascaraDataNasc));
        } catch (ParseException ex) {
            Logger.getLogger(MeyrjDlgClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public MeyrVendedor viewBean() {
    MeyrVendedor meyrVendedor = new MeyrVendedor();
    
    int codigo = Util.strToInt(meyrjTxtCodigo.getText());
    meyrVendedor.setMeyrIdVendedor(codigo);
    meyrVendedor.setMeyrNome(meyrjTxtNomeVendedor.getText());
    meyrVendedor.setMeyrCpf(meyrjFmtCpf.getText());
    meyrVendedor.setMeyrTelefone(meyrjFmtTelefone.getText());
    meyrVendedor.setMeyrEmail(meyrjTxtEmail.getText());
    meyrVendedor.setMeyrDataAdmissao(Util.strToDate(meyrjFmtDataAdmissao.getText()));

    if (meyrjChbAtivo.isSelected()) {
        meyrVendedor.setMeyrAtivo("S");
    } else {
        meyrVendedor.setMeyrAtivo("N");
    }

    return meyrVendedor;
}
    public void beanView(MeyrVendedor meyrVendedor) {
    meyrjTxtCodigo.setText(Util.intToStr(meyrVendedor.getMeyrIdVendedor()));
    meyrjTxtNomeVendedor.setText(meyrVendedor.getMeyrNome());
    meyrjFmtCpf.setText(meyrVendedor.getMeyrCpf());
    meyrjFmtTelefone.setText(meyrVendedor.getMeyrTelefone());
    meyrjFmtDataAdmissao.setText(Util.dateToStr(meyrVendedor.getMeyrDataAdmissao()));
    meyrjTxtEmail.setText(meyrVendedor.getMeyrEmail());
    meyrjChbAtivo.setText(meyrVendedor.getMeyrAtivo());

    if (meyrVendedor.getMeyrAtivo().equals("S") == true) {
        meyrjChbAtivo.setSelected(true);
    } else {
        meyrjChbAtivo.setSelected(false);
    }


}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meyrjLbllUltimaModificacao1 = new javax.swing.JLabel();
        meyrjLblCadastroVendedor = new javax.swing.JLabel();
        meyrjLblNomeVendedor = new javax.swing.JLabel();
        meyrjTxtNomeVendedor = new javax.swing.JTextField();
        meyrjLblCpf = new javax.swing.JLabel();
        meyrjLblTelefone = new javax.swing.JLabel();
        meyrjLblEmail = new javax.swing.JLabel();
        meyrjTxtEmail = new javax.swing.JTextField();
        meyrjblDateAdmissao = new javax.swing.JLabel();
        meyrjButtonPesquisar = new javax.swing.JButton();
        meyrjButtonIncluir = new javax.swing.JButton();
        meyrjButtonConfirmar = new javax.swing.JButton();
        meyrjButtonAlterar = new javax.swing.JButton();
        meyrjButtonCancelar = new javax.swing.JButton();
        meyrjButtonExcluir = new javax.swing.JButton();
        meyrjChbAtivo = new javax.swing.JCheckBox();
        meyrjTxtCodigo = new javax.swing.JTextField();
        meyrjLblCodigo1 = new javax.swing.JLabel();
        meyrjFmtCpf = new javax.swing.JFormattedTextField();
        meyrjFmtTelefone = new javax.swing.JFormattedTextField();
        meyrjFmtDataAdmissao = new javax.swing.JFormattedTextField();
        meyrjLbllUltimaModificacao = new javax.swing.JLabel();

        meyrjLbllUltimaModificacao1.setText("Ultima Modificação as:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        meyrjLblCadastroVendedor.setText("Cadastro de Vendedor");

        meyrjLblNomeVendedor.setText("Nome do Vendedor:");

        meyrjLblCpf.setText("Cpf:");

        meyrjLblTelefone.setText("Telefone:");

        meyrjLblEmail.setText("E-Mail");

        meyrjblDateAdmissao.setText("Data de Admissao:");

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

        meyrjTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtCodigoActionPerformed(evt);
            }
        });

        meyrjLblCodigo1.setText("Código");

        meyrjLbllUltimaModificacao.setText("Ultima Modificação as:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjLblCodigo1)
                            .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjTxtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLblCpf)
                                    .addComponent(meyrjFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLblTelefone)
                                    .addComponent(meyrjFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meyrjLblEmail)
                            .addComponent(meyrjLblNomeVendedor)
                            .addComponent(meyrjLbllUltimaModificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjFmtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(meyrjChbAtivo))
                                    .addComponent(meyrjblDateAdmissao))))
                        .addContainerGap(249, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(meyrjLblCadastroVendedor)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meyrjLblCadastroVendedor)
                .addGap(23, 23, 23)
                .addComponent(meyrjLblCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjLblNomeVendedor)
                    .addComponent(meyrjLblCpf)
                    .addComponent(meyrjLblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjTxtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjLblEmail)
                    .addComponent(meyrjblDateAdmissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjChbAtivo)
                    .addComponent(meyrjFmtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonConfirmar)
                    .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(meyrjLbllUltimaModificacao)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meyrjButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonPesquisarActionPerformed
        MeyrJDlgVendedorPesquisar meyrJDlgVendedorPesquisar = new MeyrJDlgVendedorPesquisar(null, true);
        meyrJDlgVendedorPesquisar.setTelaPai(this);
        meyrJDlgVendedorPesquisar.setVisible(true);
        pesquisando = true;
        
        
         LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            meyrjLbllUltimaModificacao.setText("Última modificação: " + agora.format(formato));
    }//GEN-LAST:event_meyrjButtonPesquisarActionPerformed

    private void meyrjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonIncluirActionPerformed
        // TODO add your handling code here:
    Util.habilitar(true, meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
    Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);
    Util.limpar(meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo);
    incluir = true;
    
    
     LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            meyrjLbllUltimaModificacao.setText("Última modificação: " + agora.format(formato));
    }//GEN-LAST:event_meyrjButtonIncluirActionPerformed

    private void meyrjButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonAlterarActionPerformed
     // TODO add your handling code here:
   Util.habilitar(true,
            meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf,
            meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao,
            meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);

    Util.habilitar(false,
            meyrjButtonAlterar, meyrjButtonExcluir,
            meyrjButtonPesquisar, meyrjButtonIncluir,
            meyrjTxtCodigo);

    meyrjTxtNomeVendedor.grabFocus();
    incluir = false;

    LocalDateTime agora = LocalDateTime.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    meyrjLbllUltimaModificacao.setText("Última modificação: " + agora.format(formato));
    }//GEN-LAST:event_meyrjButtonAlterarActionPerformed

    private void meyrjButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonExcluirActionPerformed
         LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            meyrjLbllUltimaModificacao.setText("Última modificação: " + agora.format(formato));

        if  (Util.perguntar("Deseja Excluir?") == true) {
                MeyrVendedorDAO meyrVendedorDAO= new MeyrVendedorDAO();
                meyrVendedorDAO.delete(viewBean());
        }
                Util.limpar(meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo);
    }//GEN-LAST:event_meyrjButtonExcluirActionPerformed

    private void meyrjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonCancelarActionPerformed
    Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
    Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);
    
     LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            meyrjLbllUltimaModificacao.setText("Última modificação: " + agora.format(formato));
    }//GEN-LAST:event_meyrjButtonCancelarActionPerformed

    private void meyrjButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonConfirmarActionPerformed
        // TODO add your handling code here:
         LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            meyrjLbllUltimaModificacao.setText("Última modificação: " + agora.format(formato));
        
       
        MeyrVendedorDAO meyrVendedorDAO = new MeyrVendedorDAO() {};
       if (incluir == true) {
            meyrVendedorDAO.insert(viewBean());
        } else {
            meyrVendedorDAO.update(viewBean());
        }
       
       
    Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
    Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);
      Util.limpar(meyrjTxtCodigo, meyrjTxtNomeVendedor, meyrjFmtCpf, meyrjFmtTelefone, meyrjTxtEmail, meyrjFmtDataAdmissao, meyrjChbAtivo);
    }//GEN-LAST:event_meyrjButtonConfirmarActionPerformed

    private void meyrjTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtCodigoActionPerformed
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MeyrjDlgVendedor dialog = new MeyrjDlgVendedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton meyrjButtonAlterar;
    private javax.swing.JButton meyrjButtonCancelar;
    private javax.swing.JButton meyrjButtonConfirmar;
    private javax.swing.JButton meyrjButtonExcluir;
    private javax.swing.JButton meyrjButtonIncluir;
    private javax.swing.JButton meyrjButtonPesquisar;
    private javax.swing.JCheckBox meyrjChbAtivo;
    private javax.swing.JFormattedTextField meyrjFmtCpf;
    private javax.swing.JFormattedTextField meyrjFmtDataAdmissao;
    private javax.swing.JFormattedTextField meyrjFmtTelefone;
    private javax.swing.JLabel meyrjLblCadastroVendedor;
    private javax.swing.JLabel meyrjLblCodigo1;
    private javax.swing.JLabel meyrjLblCpf;
    private javax.swing.JLabel meyrjLblEmail;
    private javax.swing.JLabel meyrjLblNomeVendedor;
    private javax.swing.JLabel meyrjLblTelefone;
    private javax.swing.JLabel meyrjLbllUltimaModificacao;
    private javax.swing.JLabel meyrjLbllUltimaModificacao1;
    private javax.swing.JTextField meyrjTxtCodigo;
    private javax.swing.JTextField meyrjTxtEmail;
    private javax.swing.JTextField meyrjTxtNomeVendedor;
    private javax.swing.JLabel meyrjblDateAdmissao;
    // End of variables declaration//GEN-END:variables
}
