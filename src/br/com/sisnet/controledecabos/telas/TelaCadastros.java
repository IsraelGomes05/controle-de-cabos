/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.telas;

import br.com.sisnet.controledecabos.classes.Login;
import br.com.sisnet.controledecabos.classes.Vendedor;
import br.com.sisnet.controledecabos.classes.utilitarias.Cripto;
import br.com.sisnet.controledecabos.conexaobd.LoginDAO;
import br.com.sisnet.controledecabos.conexaobd.VendedorDAO;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 * @author Israel Gomes Da Silva
 * @created 05/03/2018
 * @lastModified 19/05/2018
 * @version 4.1.0
 *
 * @Function...
 */
public class TelaCadastros extends javax.swing.JDialog {

    public TelaCadastros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnAlterarUsuarios.setEnabled(false);
        btnCadastrarUsuarios.setEnabled(false);
        btnDeletarUsuarios.setEnabled(false);
        jcbAlterarDados.setEnabled(false);
        btnCadastrarVendedor.setEnabled(false);
        btnDeletarVendedor.setEnabled(false);
        
        setAcessibilidade();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpnUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        btnCadastrarUsuarios = new javax.swing.JButton();
        btnAlterarUsuarios = new javax.swing.JButton();
        btnDeletarUsuarios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbAlterarDados = new javax.swing.JCheckBox();
        jpnVendedores = new javax.swing.JPanel();
        jpnUsuarios1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JTextField();
        btnCadastrarVendedor = new javax.swing.JButton();
        btnDeletarVendedor = new javax.swing.JButton();
        jbnUsuariosCadastros = new javax.swing.JButton();
        jbnVendedoresCadastros = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Usuarios/Vendedores");
        setResizable(false);

        jPanel2.setLayout(new java.awt.CardLayout());

        jpnUsuarios.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Usuário");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Senha");

        txtSenha.setToolTipText("Esta senha será criptografada");
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Confirmar Senha");

        btnCadastrarUsuarios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCadastrarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/disk.png"))); // NOI18N
        btnCadastrarUsuarios.setText("Cadastrar");
        btnCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuariosActionPerformed(evt);
            }
        });

        btnAlterarUsuarios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnAlterarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/refresh-29.png"))); // NOI18N
        btnAlterarUsuarios.setText("Alterar");
        btnAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuariosActionPerformed(evt);
            }
        });

        btnDeletarUsuarios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/delete.png"))); // NOI18N
        btnDeletarUsuarios.setText("Deletar");
        btnDeletarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarUsuariosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jcbAlterarDados.setBackground(new java.awt.Color(204, 204, 204));
        jcbAlterarDados.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbAlterarDados.setText("Alterar Dados");
        jcbAlterarDados.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jcbAlterarDados)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jcbAlterarDados)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jpnUsuariosLayout = new javax.swing.GroupLayout(jpnUsuarios);
        jpnUsuarios.setLayout(jpnUsuariosLayout);
        jpnUsuariosLayout.setHorizontalGroup(
            jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnUsuariosLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(btnDeletarUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarUsuarios)
                .addGap(21, 21, 21))
            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnUsuariosLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnUsuariosLayout.createSequentialGroup()
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnUsuariosLayout.setVerticalGroup(
            jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnUsuariosLayout.createSequentialGroup()
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarUsuarios)
                    .addComponent(btnAlterarUsuarios)
                    .addComponent(btnDeletarUsuarios))
                .addGap(17, 17, 17))
        );

        jPanel2.add(jpnUsuarios, "Usuarios");

        jpnUsuarios1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("Nome");

        txtNomeVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtNomeVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeVendedorKeyPressed(evt);
            }
        });

        btnCadastrarVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCadastrarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/disk.png"))); // NOI18N
        btnCadastrarVendedor.setText("Cadastrar");
        btnCadastrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendedorActionPerformed(evt);
            }
        });

        btnDeletarVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/delete.png"))); // NOI18N
        btnDeletarVendedor.setText("Deletar");
        btnDeletarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnUsuarios1Layout = new javax.swing.GroupLayout(jpnUsuarios1);
        jpnUsuarios1.setLayout(jpnUsuarios1Layout);
        jpnUsuarios1Layout.setHorizontalGroup(
            jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnUsuarios1Layout.createSequentialGroup()
                        .addComponent(btnDeletarVendedor)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarVendedor)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnUsuarios1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jpnUsuarios1Layout.setVerticalGroup(
            jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(109, 109, 109)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarVendedor)
                    .addComponent(btnDeletarVendedor))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jpnVendedoresLayout = new javax.swing.GroupLayout(jpnVendedores);
        jpnVendedores.setLayout(jpnVendedoresLayout);
        jpnVendedoresLayout.setHorizontalGroup(
            jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnVendedoresLayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jpnUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        jpnVendedoresLayout.setVerticalGroup(
            jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
            .addGroup(jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnVendedoresLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpnUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jpnVendedores, "Vendedores");

        jbnUsuariosCadastros.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jbnUsuariosCadastros.setText("Usuários");
        jbnUsuariosCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnUsuariosCadastrosActionPerformed(evt);
            }
        });

        jbnVendedoresCadastros.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jbnVendedoresCadastros.setText("Vendedores");
        jbnVendedoresCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnVendedoresCadastrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbnUsuariosCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbnVendedoresCadastros))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnUsuariosCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jbnVendedoresCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void setAcessibilidade() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }
    
    
    private void jbnUsuariosCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnUsuariosCadastrosActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Usuarios");
    }//GEN-LAST:event_jbnUsuariosCadastrosActionPerformed

    private void jbnVendedoresCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnVendedoresCadastrosActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Vendedores");
    }//GEN-LAST:event_jbnVendedoresCadastrosActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            List<Login> loginList;
            loginList = LoginDAO.busca(txtUsuario.getText());
            if (txtUsuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um nome de Usuário!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                jcbAlterarDados.setSelected(false);
                btnCadastrarUsuarios.setEnabled(false);
                return;
            }
            if (loginList.isEmpty()) {
                txtSenha.requestFocus();
                jcbAlterarDados.setSelected(false);
                jcbAlterarDados.setEnabled(true);
                btnAlterarUsuarios.setEnabled(false);
                btnDeletarUsuarios.setEnabled(false);
                btnCadastrarUsuarios.setEnabled(true);
            } else {
                jcbAlterarDados.setEnabled(true);
                btnAlterarUsuarios.setEnabled(true);
                btnDeletarUsuarios.setEnabled(true);
                if (loginList.get(0).getAlterarDados().equals("s")) {
                    jcbAlterarDados.setSelected(true);
                } else {
                    jcbAlterarDados.setSelected(false);
                }
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void btnCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuariosActionPerformed
        String selecionado = "n";
        String senha = new String(txtSenha.getPassword());
        String senhaConfirma = new String(txtConfirmarSenha.getPassword());
        if (senha.equals("") || senhaConfirma.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite uma Senha válida",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            if (senha.equals(senhaConfirma)) {
                if (jcbAlterarDados.isSelected()) {
                    selecionado = "s";
                } 
                Login login = new Login(txtUsuario.getText(), Cripto.criptografar(senha), selecionado);
                if (LoginDAO.salvar(login)) {
                    JOptionPane.showMessageDialog(null, "Usuário Salvo com Sucesso!",
                        "concluido", JOptionPane.WARNING_MESSAGE);
                }
                
                jcbAlterarDados.setSelected(false);
                btnCadastrarUsuarios.setEnabled(false);
                txtUsuario.setText("");
                txtSenha.setText("");
                txtConfirmarSenha.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "As Senhas São Diferentes!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarUsuariosActionPerformed

    private void btnDeletarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarUsuariosActionPerformed
        if (LoginDAO.excluir(txtUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Usuário excluido com Sucesso!",
                        "concluido", JOptionPane.WARNING_MESSAGE);
        }
        txtUsuario.setText("");
    }//GEN-LAST:event_btnDeletarUsuariosActionPerformed

    private void btnAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuariosActionPerformed
        String selecionado = "n";
        String senha = Cripto.criptografar(new String(txtSenha.getPassword()));
        String senhaConfirma = Cripto.criptografar(new String(txtConfirmarSenha.getPassword()));
        
        if (senha.equals("") || senhaConfirma.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite uma Senha válida",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            if (senha.equals(senhaConfirma)) {
                if (jcbAlterarDados.isSelected()) {
                    selecionado = "s";
                } 
                Login login = new Login(txtUsuario.getText(), senha, selecionado);
                if (LoginDAO.atualizar(login)) {
                     JOptionPane.showMessageDialog(null, "Usuário atualizado com Sucesso!",
                        "concluido", JOptionPane.WARNING_MESSAGE);
                }
                jcbAlterarDados.setSelected(false);
                btnCadastrarUsuarios.setEnabled(false);
                txtUsuario.setText("");
                txtSenha.setText("");
                txtConfirmarSenha.setText("");
                btnAlterarUsuarios.setEnabled(false);
                btnDeletarUsuarios.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "As Senhas São Diferentes!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAlterarUsuariosActionPerformed

    private void txtNomeVendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeVendedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            List<Vendedor> vendedorList;
            vendedorList = VendedorDAO.busca(txtNomeVendedor.getText().toUpperCase());

            if (txtNomeVendedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um nome para Cadastrar",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                btnDeletarVendedor.setEnabled(false);
                btnCadastrarVendedor.setEnabled(false);
                return;
            }

            if (vendedorList.isEmpty()) {
                btnCadastrarVendedor.requestFocus();
                btnCadastrarVendedor.setEnabled(true);
                btnDeletarVendedor.setEnabled(false);
            } else {
                txtNomeVendedor.setText(vendedorList.get(0).getNome());
                btnDeletarVendedor.setEnabled(true);
                btnCadastrarVendedor.setEnabled(false);

            }
        }
    }//GEN-LAST:event_txtNomeVendedorKeyPressed

    private void btnCadastrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendedorActionPerformed
        if (txtNomeVendedor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um nome para Cadastrar",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            btnDeletarVendedor.setEnabled(false);
            btnCadastrarVendedor.setEnabled(false);
            return;
        }
        
        if (VendedorDAO.salvar(new Vendedor(txtNomeVendedor.getText().toUpperCase()))) {
            JOptionPane.showMessageDialog(null, "Vendedor Salvo com sucesso!",
                        "Concluído", JOptionPane.INFORMATION_MESSAGE);
        }
        
        btnCadastrarVendedor.setEnabled(false);
        txtNomeVendedor.setText("");
    }//GEN-LAST:event_btnCadastrarVendedorActionPerformed

    private void btnDeletarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarVendedorActionPerformed
        if (txtNomeVendedor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um nome para deletar",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            btnDeletarVendedor.setEnabled(false);
            btnCadastrarVendedor.setEnabled(false);
            return;
        }
        if (VendedorDAO.excluir(txtNomeVendedor.getText())) {
            JOptionPane.showMessageDialog(null, "Vendedor Excluido com sucesso!",
                        "Concluído", JOptionPane.INFORMATION_MESSAGE);
        }
        
        txtNomeVendedor.setText("");
        btnDeletarVendedor.setEnabled(false);
    }//GEN-LAST:event_btnDeletarVendedorActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtConfirmarSenha.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!!", JOptionPane.ERROR_MESSAGE);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            TelaCadastros dialog = new TelaCadastros(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterarUsuarios;
    private javax.swing.JButton btnCadastrarUsuarios;
    private javax.swing.JButton btnCadastrarVendedor;
    private javax.swing.JButton btnDeletarUsuarios;
    private javax.swing.JButton btnDeletarVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbnUsuariosCadastros;
    private javax.swing.JButton jbnVendedoresCadastros;
    private javax.swing.JCheckBox jcbAlterarDados;
    private javax.swing.JPanel jpnUsuarios;
    private javax.swing.JPanel jpnUsuarios1;
    private javax.swing.JPanel jpnVendedores;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
