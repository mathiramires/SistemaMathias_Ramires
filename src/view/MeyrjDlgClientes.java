package view;

import bean.MeyrClientes;
import tools.Util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author Mathias Eduardo
 */
public class MeyrjDlgClientes extends javax.swing.JDialog {

    /**
     * Creates new form jDlgCli initComponents(); habilitar(false);
     * getContentPane().entes
     */
    boolean pesquisando = false;
    public MeyrjDlgClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Clientes");
        setLocationRelativeTo(null);
        Util.habilitar(false, 
        meyrjTxtCodigo,
        meyrjTxtNome,
        meyrjFmtCpf,
        meyrjFmtRg,
        meyrjFmtDataNascimento,
        meyrjTxtEndereco,
        meyrjTxtBairro,
        meyrjTxtCidade,
        meyrjFmtCep,
        meyrjCboUf,
        meyrjFmtTelefone,
        meyrjFmtCelular,
        meyrjTxtEmail,
        meyrFmtDataCadastro,
        meyrjChbAtivo,
        meyrjButtonConfirmar,
        meyrjButtonCancelar
        
);
        
     


    }
    
    public MeyrClientes viewBean() {
    MeyrClientes meyrClientes = new MeyrClientes();

    int codigo = Util.strToInt(meyrjTxtCodigo.getText());
    meyrClientes.setMeyrIdCliente(codigo);
    meyrClientes.setMeyrNome(meyrjTxtNome.getText());
    meyrClientes.setMeyrCpf(meyrjFmtCpf.getText());
    meyrClientes.setMeyrRg(meyrjFmtRg.getText());
    meyrClientes.setMeyrDataNascimento(Util.strToDate(meyrjFmtDataNascimento.getText()));
    meyrClientes.setMeyrEndereco(meyrjTxtEndereco.getText());
    meyrClientes.setMeyrBairro(meyrjTxtBairro.getText());
    meyrClientes.setMeyrCidade(meyrjTxtCidade.getText());
    meyrClientes.setMeyrCep(meyrjFmtCep.getText());
    meyrClientes.setMeyrEstado(meyrjCboUf.getSelectedItem().toString());
    meyrClientes.setMeyrTelefone(meyrjFmtTelefone.getText());
    meyrClientes.setMeyrCelular(meyrjFmtCelular.getText());
    meyrClientes.setMeyrEmail(meyrjTxtEmail.getText());
    meyrClientes.setMeyrDataCadastro(Util.strToDate(meyrFmtDataCadastro.getText()));

    if (meyrjChbAtivo.isSelected() == true) {
        meyrClientes.setMeyrAtivo("S");
    } else {
        meyrClientes.setMeyrAtivo("N");
    }

    return meyrClientes;
}

public void beanView(MeyrClientes meyrClientes) {
    meyrjTxtCodigo.setText(Util.intToStr(meyrClientes.getMeyrIdCliente()));
    meyrjTxtNome.setText(meyrClientes.getMeyrNome());
    meyrjFmtCpf.setText(meyrClientes.getMeyrCpf());
    meyrjFmtRg.setText(meyrClientes.getMeyrRg());
    meyrjFmtDataNascimento.setText(Util.dateToStr(meyrClientes.getMeyrDataNascimento()));
    meyrjTxtEndereco.setText(meyrClientes.getMeyrEndereco());
    meyrjTxtBairro.setText(meyrClientes.getMeyrBairro());
    meyrjTxtCidade.setText(meyrClientes.getMeyrCidade());
    meyrjFmtCep.setText(meyrClientes.getMeyrCep());
    meyrjCboUf.setSelectedItem(meyrClientes.getMeyrEstado());
    meyrjFmtTelefone.setText(meyrClientes.getMeyrTelefone());
    meyrjFmtCelular.setText(meyrClientes.getMeyrCelular());
    meyrjTxtEmail.setText(meyrClientes.getMeyrEmail());
    meyrFmtDataCadastro.setText(Util.dateToStr(meyrClientes.getMeyrDataCadastro()));

    if (meyrClientes.getMeyrAtivo().equals("S") == true) {
        meyrjChbAtivo.setSelected(true);
    } else {
        meyrjChbAtivo.setSelected(false);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meyrjLblNome = new javax.swing.JLabel();
        meyrjTxtNome = new javax.swing.JTextField();
        meyrjLblCpf = new javax.swing.JLabel();
        meyrjLblRg = new javax.swing.JLabel();
        meyrjblDateNascimento = new javax.swing.JLabel();
        meyrjTxtEndereco = new javax.swing.JTextField();
        meyrjLblEndereco = new javax.swing.JLabel();
        jLblCadastroClientes = new javax.swing.JLabel();
        meyrjLblBairro = new javax.swing.JLabel();
        meyrjTxtBairro = new javax.swing.JTextField();
        meyrjLblCep = new javax.swing.JLabel();
        meyrjLblCidade = new javax.swing.JLabel();
        meyrjTxtCidade = new javax.swing.JTextField();
        meyrjLblUf = new javax.swing.JLabel();
        meyrjLblTelefone = new javax.swing.JLabel();
        meyrjLblCelular = new javax.swing.JLabel();
        meyrjLblEmail = new javax.swing.JLabel();
        meyrjTxtEmail = new javax.swing.JTextField();
        meyrjButtonIncluir = new javax.swing.JButton();
        meyrjButtonConfirmar = new javax.swing.JButton();
        meyrjButtonAlterar = new javax.swing.JButton();
        meyrjButtonCancelar = new javax.swing.JButton();
        meyrjButtonExcluir = new javax.swing.JButton();
        meyrjButtonPesquisar = new javax.swing.JButton();
        meyrjLblDataCadastro = new javax.swing.JLabel();
        meyrjChbAtivo = new javax.swing.JCheckBox();
        meyrjLblCodigo1 = new javax.swing.JLabel();
        meyrjTxtCodigo = new javax.swing.JTextField();
        meyrjCboUf = new javax.swing.JComboBox<>();
        meyrjFmtCpf = new javax.swing.JFormattedTextField();
        meyrjFmtRg = new javax.swing.JFormattedTextField();
        meyrjFmtDataNascimento = new javax.swing.JFormattedTextField();
        meyrjFmtCep = new javax.swing.JFormattedTextField();
        meyrjFmtTelefone = new javax.swing.JFormattedTextField();
        meyrjFmtCelular = new javax.swing.JFormattedTextField();
        meyrFmtDataCadastro = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        meyrjLblNome.setText("Nome:");

        meyrjTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtNomeActionPerformed(evt);
            }
        });

        meyrjLblCpf.setText("Cpf:");

        meyrjLblRg.setText("Rg");

        meyrjblDateNascimento.setText("Data de Nascimento:");

        meyrjTxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtEnderecoActionPerformed(evt);
            }
        });

        meyrjLblEndereco.setText("Endereço:");

        jLblCadastroClientes.setText("Cadastro de Clientes");

        meyrjLblBairro.setText("Bairro:");

        meyrjTxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtBairroActionPerformed(evt);
            }
        });

        meyrjLblCep.setText("Cep:");

        meyrjLblCidade.setText("Cidade:");

        meyrjLblUf.setText("UF");

        meyrjLblTelefone.setText("Telefone:");

        meyrjLblCelular.setText("Celular:");

        meyrjLblEmail.setText("E-Mail");

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

        meyrjButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        meyrjButtonPesquisar.setText("Pesquisar");
        meyrjButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjButtonPesquisarActionPerformed(evt);
            }
        });

        meyrjLblDataCadastro.setText("Data de Cadastro:");

        meyrjChbAtivo.setText("Ativo");
        meyrjChbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjChbAtivoActionPerformed(evt);
            }
        });

        meyrjLblCodigo1.setText("Código");

        meyrjTxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjTxtCodigoActionPerformed(evt);
            }
        });

        meyrjCboUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        meyrjFmtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyrjFmtRgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLblCpf)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meyrjFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(meyrjFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(meyrjLblNome)
                                                    .addComponent(meyrjLblEndereco))
                                                .addGap(296, 296, 296))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(meyrjLblTelefone)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(meyrjLblCidade)
                                            .addComponent(meyrjLblRg))
                                        .addGap(65, 65, 65)))
                                .addGap(12, 12, 12)
                                .addComponent(meyrjblDateNascimento))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(meyrjLblCodigo1)
                            .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjChbAtivo))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meyrjLblCelular))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjLblEmail)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(meyrjTxtEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meyrjLblDataCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(meyrFmtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meyrjTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meyrjTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(meyrjLblBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjFmtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(meyrjLblCep)
                                        .addGap(88, 88, 88)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meyrjLblUf)
                                    .addComponent(meyrjCboUf, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meyrjLblCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meyrjTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjLblCpf)
                            .addComponent(meyrjLblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjblDateNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjFmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjLblEndereco)
                            .addComponent(meyrjLblBairro)
                            .addComponent(meyrjLblCidade)
                            .addComponent(meyrjLblCep)
                            .addComponent(meyrjLblUf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjCboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjLblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjLblCelular)
                            .addComponent(meyrjLblEmail)
                            .addComponent(meyrjLblDataCadastro))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meyrjTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrjFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meyrFmtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(meyrjLblNome))
                .addGap(18, 18, 18)
                .addComponent(meyrjChbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meyrjButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meyrjButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meyrjTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtNomeActionPerformed

    private void meyrjTxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtEnderecoActionPerformed

    private void meyrjTxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtBairroActionPerformed

    private void meyrjButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonIncluirActionPerformed
         // TODO add your handling code here:
        Util.habilitar(true, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtRg, meyrjFmtDataNascimento, meyrjTxtEndereco, meyrjTxtBairro, meyrjTxtCidade, meyrjFmtCep, meyrjCboUf, meyrjFmtTelefone, meyrjFmtCelular, meyrjTxtEmail, meyrFmtDataCadastro, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);
        Util.limpar(meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtRg, meyrjFmtDataNascimento, meyrjTxtEndereco, meyrjTxtBairro, meyrjTxtCidade, meyrjFmtCep, meyrjCboUf, meyrjFmtTelefone, meyrjFmtCelular, meyrjTxtEmail, meyrFmtDataCadastro, meyrjChbAtivo);

    }//GEN-LAST:event_meyrjButtonIncluirActionPerformed

    private void meyrjButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonAlterarActionPerformed
        Util.habilitar(true, meyrjTxtNome, meyrjFmtCpf, meyrjFmtRg, meyrjFmtDataNascimento, meyrjTxtEndereco, meyrjTxtBairro, meyrjTxtCidade, meyrjFmtCep, meyrjCboUf, meyrjFmtTelefone, meyrjFmtCelular, meyrjTxtEmail, meyrFmtDataCadastro, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(false, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);

    }//GEN-LAST:event_meyrjButtonAlterarActionPerformed

    private void meyrjButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonExcluirActionPerformed
        if (pesquisando == false) {
            Util.mensagem("Você precisa pesquisar um usuário primeiro");
        } else {
                Util.perguntar("Você deseja excluir?");
                Util.limpar(meyrjTxtCodigo,
        meyrjTxtNome,
        meyrjFmtCpf,
        meyrjFmtRg,
        meyrjFmtDataNascimento,
        meyrjTxtEndereco,
        meyrjTxtBairro,
        meyrjTxtCidade,
        meyrjFmtCep,
        meyrjCboUf,
        meyrjFmtTelefone,
        meyrjFmtCelular,
        meyrjTxtEmail,
        meyrFmtDataCadastro,
        meyrjChbAtivo);  
        } 
    }//GEN-LAST:event_meyrjButtonExcluirActionPerformed

    private void meyrjButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonPesquisarActionPerformed
        MeyrJDlgClientesPesquisar meyrJDlgClientesPesquisar = new MeyrJDlgClientesPesquisar(null, true);
        meyrJDlgClientesPesquisar.setTelaPai(this);
        meyrJDlgClientesPesquisar.setVisible(true);
        pesquisando = true;
    }//GEN-LAST:event_meyrjButtonPesquisarActionPerformed

    private void meyrjButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonCancelarActionPerformed
        Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtRg, meyrjFmtDataNascimento, meyrjTxtEndereco, meyrjTxtBairro, meyrjTxtCidade, meyrjFmtCep, meyrjCboUf, meyrjFmtTelefone, meyrjFmtCelular, meyrjTxtEmail, meyrFmtDataCadastro, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);
        Util.habilitar(true, meyrjButtonIncluir, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar);

    }//GEN-LAST:event_meyrjButtonCancelarActionPerformed

    private void meyrjButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjButtonConfirmarActionPerformed
        Util.habilitar(false, meyrjTxtCodigo, meyrjTxtNome, meyrjFmtCpf, meyrjFmtDataNascimento, meyrjChbAtivo, meyrjButtonConfirmar, meyrjButtonCancelar);  
        Util.habilitar(true, meyrjButtonAlterar, meyrjButtonExcluir, meyrjButtonPesquisar, meyrjButtonIncluir);


    }//GEN-LAST:event_meyrjButtonConfirmarActionPerformed

    private void meyrjChbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjChbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjChbAtivoActionPerformed

    private void meyrjTxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjTxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjTxtCodigoActionPerformed

    private void meyrjFmtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyrjFmtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meyrjFmtRgActionPerformed
    public static void main(String args[]) {
             java.awt.EventQueue.invokeLater(() -> {
                 MeyrjDlgClientes dialog = new MeyrjDlgClientes(new javax.swing.JFrame(), true);
                 dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                     @Override
                     public void windowClosing(java.awt.event.WindowEvent e) {
                         System.exit(0);
                     }
                 });
                 dialog.setVisible(true);
             });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblCadastroClientes;
    private javax.swing.JFormattedTextField meyrFmtDataCadastro;
    private javax.swing.JButton meyrjButtonAlterar;
    private javax.swing.JButton meyrjButtonCancelar;
    private javax.swing.JButton meyrjButtonConfirmar;
    private javax.swing.JButton meyrjButtonExcluir;
    private javax.swing.JButton meyrjButtonIncluir;
    private javax.swing.JButton meyrjButtonPesquisar;
    private javax.swing.JComboBox<String> meyrjCboUf;
    private javax.swing.JCheckBox meyrjChbAtivo;
    private javax.swing.JFormattedTextField meyrjFmtCelular;
    private javax.swing.JFormattedTextField meyrjFmtCep;
    private javax.swing.JFormattedTextField meyrjFmtCpf;
    private javax.swing.JFormattedTextField meyrjFmtDataNascimento;
    private javax.swing.JFormattedTextField meyrjFmtRg;
    private javax.swing.JFormattedTextField meyrjFmtTelefone;
    private javax.swing.JLabel meyrjLblBairro;
    private javax.swing.JLabel meyrjLblCelular;
    private javax.swing.JLabel meyrjLblCep;
    private javax.swing.JLabel meyrjLblCidade;
    private javax.swing.JLabel meyrjLblCodigo1;
    private javax.swing.JLabel meyrjLblCpf;
    private javax.swing.JLabel meyrjLblDataCadastro;
    private javax.swing.JLabel meyrjLblEmail;
    private javax.swing.JLabel meyrjLblEndereco;
    private javax.swing.JLabel meyrjLblNome;
    private javax.swing.JLabel meyrjLblRg;
    private javax.swing.JLabel meyrjLblTelefone;
    private javax.swing.JLabel meyrjLblUf;
    private javax.swing.JTextField meyrjTxtBairro;
    private javax.swing.JTextField meyrjTxtCidade;
    private javax.swing.JTextField meyrjTxtCodigo;
    private javax.swing.JTextField meyrjTxtEmail;
    private javax.swing.JTextField meyrjTxtEndereco;
    private javax.swing.JTextField meyrjTxtNome;
    private javax.swing.JLabel meyrjblDateNascimento;
    // End of variables declaration//GEN-END:variables
}
