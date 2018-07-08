/**
 * @created  05/03/2018
 * @lastModified 28/03/2018
 */
package br.com.sisnet.controledecabos.telas;

import br.com.sisnet.controledecabos.classes.Cabo;
import br.com.sisnet.controledecabos.classes.PontaCabo;
import br.com.sisnet.controledecabos.classes.utilitarias.Calculo;
import br.com.sisnet.controledecabos.classes.utilitarias.Conversor;
import br.com.sisnet.controledecabos.classes.utilitarias.Tabela;
import br.com.sisnet.controledecabos.conexaobd.BobinaDAO;
import br.com.sisnet.controledecabos.conexaobd.CaboDAO;
import br.com.sisnet.controledecabos.conexaobd.PontaDAO;
import br.com.sisnet.controledecabos.conexaobd.SaidaDAO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 * Classe que define a tela de gerenciar cabo.
 *
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class TelaGerenciarCabos extends javax.swing.JDialog {

    DefaultTableModel tabelaBusca;
    ViewUtil viewUtil;

    /**
     *
     * @param parent java.awt.Frame - Tela a qual esta será associada.<br>
     * @param modal boolean - <b>true</b> a tela parent(que chama esta tela) não
     * pode ser acessada, enquanto esta tela estiver aberta,<br> <b>false</b>
     * poderá ser acessada.<br>
     * @param externo boolean - <b>true</b> caso os dados para cadastro da ponta
     * venham pelo contrutor, e assim só será possível preencher o local da
     * ponta, <b>false</b> tela será exibida normalmente.<br>
     * @param quantidade double - Quantidade em metros para cadastrar a ponta
     * <b>necessário apenas quando externo for true</b>.<br>
     * @param codigoCabo int - código do cabo
     */
    public TelaGerenciarCabos(
            java.awt.Frame parent,
            boolean modal,
            boolean externo,
            double quantidade,
            int codigoCabo
    ) {
        super(parent, modal);
        setAcessibilidade();
        initComponents();
        viewUtil = new ViewUtil();

        /*Cabo*/
        btnAlterarCabo.setEnabled(false);
        btnCadastrarCabo.setEnabled(false);
        btnDeletarCabo.setEnabled(false);
        txtDescricaoCabos.setEditable(false);
        
        /*Pontas*/
        btnPontas.setBackground(Color.YELLOW);
        btnDeletarPonta.setEnabled(false);
        btnAtualizarPonta.setEnabled(false);
        btnCadastrarPonta.setEnabled(false);
        txtCodigoPonta.setEditable(false);
        txtQuantidadePonta.setEditable(false);
        txtLocalPonta.setEditable(false);
        jcbSubtrairBobinaPonta.setEnabled(false);
        viewUtil.alterarIcone(btnPontas, "icons8-ponta-64-selecionado.png");

        if (externo) {
            btnGerarPontas.doClick();
            btnPontas.doClick();
            txtCodigoPonta.setText("" + codigoCabo);
            txtQuantidadePonta.setText("" + quantidade);
            txtCodigoPontaKeyPressed(new KeyEvent(parent, WIDTH, WIDTH, SOMEBITS, KeyEvent.VK_ENTER));
            txtCodigoPonta.setActionCommand("");
            txtLocalPonta.setEditable(true);
            jcbSubtrairBobinaPonta.setEnabled(false);
            btnCadastrarPonta.setEnabled(true);
            txtLocalPonta.requestFocus();
            btnCabos.setEnabled(false);
            btnBobinas.setEnabled(false);
        }
        /*Bobinas*/
        txtQuantidadeBobinas.setEditable(false);
        jcbAtivo.setEnabled(false);
        tabelaBusca = (DefaultTableModel) jtbTabelaBobina.getModel();
        lblBobinaCadastrada.setVisible(false);
        btnCadastrarBobina.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpnPontas = new javax.swing.JPanel();
        jpnUsuarios1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroPontas = new javax.swing.JTextField();
        btnCadastrarPonta = new javax.swing.JButton();
        btnAtualizarPonta = new javax.swing.JButton();
        btnDeletarPonta = new javax.swing.JButton();
        txtDescricaooPontas = new javax.swing.JTextField();
        txtCodigoPonta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLocalPonta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcbSubtrairBobinaPonta = new javax.swing.JCheckBox();
        txtQuantidadePonta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnGerarPontas = new javax.swing.JButton();
        jpnCabos = new javax.swing.JPanel();
        btnCadastrarCabo = new javax.swing.JButton();
        btnAlterarCabo = new javax.swing.JButton();
        btnDeletarCabo = new javax.swing.JButton();
        txtCodigoCabos = new javax.swing.JTextField();
        txtDescricaoCabos = new javax.swing.JTextField();
        txtBobinaAtualCabos = new javax.swing.JTextField();
        txtQuantidadeCabos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpnBobinas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoCaboBobinas = new javax.swing.JTextField();
        txtDescricaoBobinas = new javax.swing.JTextField();
        txtQuantidadeBobinas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAtualizarBobinas = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnDeletarBobinas = new javax.swing.JButton();
        txtNumBobinaBobinas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcbAtivo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaBobina = new javax.swing.JTable();
        btnCadastrarBobina = new javax.swing.JButton();
        btnSelecionarBobinas = new javax.swing.JButton();
        lblBobinaCadastrada = new javax.swing.JLabel();
        btnGerarBobinas = new javax.swing.JButton();
        btnBobinas = new javax.swing.JButton();
        btnCabos = new javax.swing.JButton();
        btnPontas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Cabos");
        setResizable(false);

        jPanel2.setLayout(new java.awt.CardLayout());

        jpnUsuarios1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("Número");

        txtNumeroPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtNumeroPontas.setPreferredSize(new java.awt.Dimension(14, 30));
        txtNumeroPontas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroPontasKeyPressed(evt);
            }
        });

        btnCadastrarPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCadastrarPonta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32-azul.png"))); // NOI18N
        btnCadastrarPonta.setText("Cadastrar");
        btnCadastrarPonta.setContentAreaFilled(false);
        btnCadastrarPonta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarPonta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarPonta.setRolloverEnabled(true);
        btnCadastrarPonta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32 azul-claro.png"))); // NOI18N
        btnCadastrarPonta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarPonta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPontaActionPerformed(evt);
            }
        });
        btnCadastrarPonta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnCadastrarPontaKeyTyped(evt);
            }
        });

        btnAtualizarPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnAtualizarPonta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-azul.png"))); // NOI18N
        btnAtualizarPonta.setText("Alterar");
        btnAtualizarPonta.setContentAreaFilled(false);
        btnAtualizarPonta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarPonta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizarPonta.setRolloverEnabled(true);
        btnAtualizarPonta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-amarelo.png"))); // NOI18N
        btnAtualizarPonta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizarPonta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPontaActionPerformed(evt);
            }
        });

        btnDeletarPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarPonta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lixo-32-azul.png"))); // NOI18N
        btnDeletarPonta.setText("Excluir");
        btnDeletarPonta.setContentAreaFilled(false);
        btnDeletarPonta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarPonta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletarPonta.setRolloverEnabled(true);
        btnDeletarPonta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32-red.png"))); // NOI18N
        btnDeletarPonta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletarPonta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarPontaActionPerformed(evt);
            }
        });

        txtDescricaooPontas.setEditable(false);
        txtDescricaooPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtDescricaooPontas.setPreferredSize(new java.awt.Dimension(14, 30));

        txtCodigoPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtCodigoPonta.setPreferredSize(new java.awt.Dimension(14, 30));
        txtCodigoPonta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPontaActionPerformed(evt);
            }
        });
        txtCodigoPonta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoPontaKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setText("Código");

        txtLocalPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtLocalPonta.setPreferredSize(new java.awt.Dimension(14, 30));
        txtLocalPonta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocalPontaKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel9.setText("Local");

        jcbSubtrairBobinaPonta.setBackground(new java.awt.Color(204, 204, 204));
        jcbSubtrairBobinaPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbSubtrairBobinaPonta.setText("Subtrair da bobina");

        txtQuantidadePonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtQuantidadePonta.setPreferredSize(new java.awt.Dimension(14, 30));
        txtQuantidadePonta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadePontaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel12.setText("Quantidade");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel13.setText("Descrição");

        jLabel17.setText("Metros");

        btnGerarPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnGerarPontas.setText("Gerar");
        btnGerarPontas.setToolTipText("Gera um número disponível para cadastro");
        btnGerarPontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPontasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnUsuarios1Layout = new javax.swing.GroupLayout(jpnUsuarios1);
        jpnUsuarios1.setLayout(jpnUsuarios1Layout);
        jpnUsuarios1Layout.setHorizontalGroup(
            jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSubtrairBobinaPonta)
                    .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                        .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigoPonta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(38, 38, 38)
                        .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                                    .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(txtLocalPonta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                                            .addComponent(txtQuantidadePonta, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel17))))
                                .addComponent(txtDescricaooPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                                    .addComponent(btnDeletarPonta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAtualizarPonta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCadastrarPonta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                        .addComponent(txtNumeroPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerarPontas)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jpnUsuarios1Layout.setVerticalGroup(
            jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUsuarios1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroPontas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaooPontas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarPontas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPonta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalPonta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadePonta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jcbSubtrairBobinaPonta)
                .addGap(35, 35, 35)
                .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnUsuarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDeletarPonta)
                        .addComponent(btnAtualizarPonta))
                    .addComponent(btnCadastrarPonta))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnPontasLayout = new javax.swing.GroupLayout(jpnPontas);
        jpnPontas.setLayout(jpnPontasLayout);
        jpnPontasLayout.setHorizontalGroup(
            jpnPontasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnUsuarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnPontasLayout.setVerticalGroup(
            jpnPontasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnUsuarios1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jpnPontas, "Pontas");

        jpnCabos.setBackground(new java.awt.Color(204, 204, 204));

        btnCadastrarCabo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCadastrarCabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32-azul.png"))); // NOI18N
        btnCadastrarCabo.setText("Cadastrar");
        btnCadastrarCabo.setContentAreaFilled(false);
        btnCadastrarCabo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarCabo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarCabo.setRolloverEnabled(true);
        btnCadastrarCabo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32 azul-claro.png"))); // NOI18N
        btnCadastrarCabo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCadastrarCabo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarCabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCaboActionPerformed(evt);
            }
        });
        btnCadastrarCabo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnCadastrarCaboKeyTyped(evt);
            }
        });

        btnAlterarCabo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnAlterarCabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-azul.png"))); // NOI18N
        btnAlterarCabo.setText("Alterar");
        btnAlterarCabo.setContentAreaFilled(false);
        btnAlterarCabo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCabo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterarCabo.setRolloverEnabled(true);
        btnAlterarCabo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-amarelo.png"))); // NOI18N
        btnAlterarCabo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterarCabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCaboActionPerformed(evt);
            }
        });

        btnDeletarCabo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarCabo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lixo-32-azul.png"))); // NOI18N
        btnDeletarCabo.setText("Excluir");
        btnDeletarCabo.setContentAreaFilled(false);
        btnDeletarCabo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarCabo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletarCabo.setRolloverEnabled(true);
        btnDeletarCabo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32-red.png"))); // NOI18N
        btnDeletarCabo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletarCabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarCaboActionPerformed(evt);
            }
        });

        txtCodigoCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtCodigoCabos.setPreferredSize(new java.awt.Dimension(14, 30));
        txtCodigoCabos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoCabosKeyPressed(evt);
            }
        });

        txtDescricaoCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtDescricaoCabos.setPreferredSize(new java.awt.Dimension(14, 30));
        txtDescricaoCabos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoCabosKeyPressed(evt);
            }
        });

        txtBobinaAtualCabos.setEditable(false);
        txtBobinaAtualCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtBobinaAtualCabos.setPreferredSize(new java.awt.Dimension(14, 30));

        txtQuantidadeCabos.setEditable(false);
        txtQuantidadeCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtQuantidadeCabos.setPreferredSize(new java.awt.Dimension(14, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Bobina atual");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel5.setText("Quantidade ");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Metros");

        javax.swing.GroupLayout jpnCabosLayout = new javax.swing.GroupLayout(jpnCabos);
        jpnCabos.setLayout(jpnCabosLayout);
        jpnCabosLayout.setHorizontalGroup(
            jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCabosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnCabosLayout.createSequentialGroup()
                        .addComponent(btnDeletarCabo)
                        .addGap(0, 0, 0)
                        .addComponent(btnAlterarCabo)
                        .addGap(0, 0, 0)
                        .addComponent(btnCadastrarCabo))
                    .addGroup(jpnCabosLayout.createSequentialGroup()
                        .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBobinaAtualCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55)
                        .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(txtDescricaoCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnCabosLayout.createSequentialGroup()
                                .addComponent(txtQuantidadeCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jpnCabosLayout.setVerticalGroup(
            jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCabosLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCabos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoCabos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBobinaAtualCabos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeCabos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(53, 53, 53)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCabo)
                    .addComponent(btnAlterarCabo)
                    .addComponent(btnDeletarCabo))
                .addContainerGap())
        );

        jPanel2.add(jpnCabos, "Cabos");

        jpnBobinas.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel10.setText("Código");

        txtCodigoCaboBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtCodigoCaboBobinas.setMinimumSize(new java.awt.Dimension(14, 30));
        txtCodigoCaboBobinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoCaboBobinasKeyPressed(evt);
            }
        });

        txtDescricaoBobinas.setEditable(false);
        txtDescricaoBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtDescricaoBobinas.setMinimumSize(new java.awt.Dimension(14, 30));

        txtQuantidadeBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtQuantidadeBobinas.setMinimumSize(new java.awt.Dimension(14, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel11.setText("Quantidade");

        btnAtualizarBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnAtualizarBobinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-azul.png"))); // NOI18N
        btnAtualizarBobinas.setText("Alterar");
        btnAtualizarBobinas.setContentAreaFilled(false);
        btnAtualizarBobinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarBobinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizarBobinas.setRolloverEnabled(true);
        btnAtualizarBobinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-amarelo.png"))); // NOI18N
        btnAtualizarBobinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizarBobinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarBobinasActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel14.setText("Descrição");

        btnDeletarBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarBobinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lixo-32-azul.png"))); // NOI18N
        btnDeletarBobinas.setText("Excluir");
        btnDeletarBobinas.setContentAreaFilled(false);
        btnDeletarBobinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarBobinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletarBobinas.setRolloverEnabled(true);
        btnDeletarBobinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32-red.png"))); // NOI18N
        btnDeletarBobinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletarBobinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarBobinasActionPerformed(evt);
            }
        });

        txtNumBobinaBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtNumBobinaBobinas.setMinimumSize(new java.awt.Dimension(14, 30));
        txtNumBobinaBobinas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumBobinaBobinasKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel15.setText("Nº Bobina");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel16.setText("Status");

        jcbAtivo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Ativo", "Inativo" }));

        jtbTabelaBobina.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbTabelaBobina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nº Bobina", "Qtd Original", "Qtd Atual", "Status", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTabelaBobina.setGridColor(new java.awt.Color(255, 255, 255));
        jtbTabelaBobina.setSelectionBackground(new java.awt.Color(37, 211, 124));
        jtbTabelaBobina.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtbTabelaBobina.setShowHorizontalLines(false);
        jtbTabelaBobina.getTableHeader().setReorderingAllowed(false);
        jtbTabelaBobina.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jtbTabelaBobina);
        if (jtbTabelaBobina.getColumnModel().getColumnCount() > 0) {
            jtbTabelaBobina.getColumnModel().getColumn(0).setMinWidth(50);
            jtbTabelaBobina.getColumnModel().getColumn(0).setMaxWidth(60);
            jtbTabelaBobina.getColumnModel().getColumn(1).setMinWidth(50);
            jtbTabelaBobina.getColumnModel().getColumn(1).setMaxWidth(70);
            jtbTabelaBobina.getColumnModel().getColumn(2).setMinWidth(60);
            jtbTabelaBobina.getColumnModel().getColumn(2).setMaxWidth(70);
            jtbTabelaBobina.getColumnModel().getColumn(3).setMinWidth(50);
            jtbTabelaBobina.getColumnModel().getColumn(3).setMaxWidth(60);
            jtbTabelaBobina.getColumnModel().getColumn(4).setMinWidth(60);
            jtbTabelaBobina.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        btnCadastrarBobina.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCadastrarBobina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32-azul.png"))); // NOI18N
        btnCadastrarBobina.setText("Cadastrar");
        btnCadastrarBobina.setContentAreaFilled(false);
        btnCadastrarBobina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarBobina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarBobina.setRolloverEnabled(true);
        btnCadastrarBobina.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32 azul-claro.png"))); // NOI18N
        btnCadastrarBobina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarBobina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarBobinaActionPerformed(evt);
            }
        });

        btnSelecionarBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnSelecionarBobinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-selecionado-32-azul.png"))); // NOI18N
        btnSelecionarBobinas.setText("Selecionar");
        btnSelecionarBobinas.setContentAreaFilled(false);
        btnSelecionarBobinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionarBobinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelecionarBobinas.setMinimumSize(new java.awt.Dimension(88, 70));
        btnSelecionarBobinas.setRolloverEnabled(true);
        btnSelecionarBobinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-selecionado-verde-32.png"))); // NOI18N
        btnSelecionarBobinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSelecionarBobinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarBobinasActionPerformed(evt);
            }
        });

        lblBobinaCadastrada.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        lblBobinaCadastrada.setForeground(new java.awt.Color(153, 0, 0));
        lblBobinaCadastrada.setText("Bobina já cadastrada");

        btnGerarBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnGerarBobinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-confirmação-e-atualizacao-32-azul.png"))); // NOI18N
        btnGerarBobinas.setText("Gerar Num");
        btnGerarBobinas.setToolTipText("Gera um número disponível para cadastro");
        btnGerarBobinas.setContentAreaFilled(false);
        btnGerarBobinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarBobinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGerarBobinas.setRolloverEnabled(true);
        btnGerarBobinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-confirmacao-e-atualizacao-32-verde.png"))); // NOI18N
        btnGerarBobinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGerarBobinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarBobinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBobinasLayout = new javax.swing.GroupLayout(jpnBobinas);
        jpnBobinas.setLayout(jpnBobinasLayout);
        jpnBobinasLayout.setHorizontalGroup(
            jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBobinasLayout.createSequentialGroup()
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpnBobinasLayout.createSequentialGroup()
                        .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCaboBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumBobinaBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(20, 20, 20)
                        .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidadeBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnBobinasLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(72, 72, 72)
                                .addComponent(lblBobinaCadastrada))
                            .addComponent(txtDescricaoBobinas, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))
                    .addGroup(jpnBobinasLayout.createSequentialGroup()
                        .addComponent(btnSelecionarBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnGerarBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletarBobinas)
                        .addGap(0, 0, 0)
                        .addComponent(btnAtualizarBobinas)
                        .addGap(0, 0, 0)
                        .addComponent(btnCadastrarBobina)))
                .addGap(0, 0, 0))
        );
        jpnBobinasLayout.setVerticalGroup(
            jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBobinasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(lblBobinaCadastrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoCaboBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumBobinaBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtualizarBobinas)
                    .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeletarBobinas)
                        .addComponent(btnCadastrarBobina))
                    .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGerarBobinas)
                        .addComponent(btnSelecionarBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.add(jpnBobinas, "Bobinas");

        btnBobinas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBobinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-bobina-64-azul.png"))); // NOI18N
        btnBobinas.setText("Bobinas");
        btnBobinas.setContentAreaFilled(false);
        btnBobinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBobinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBobinas.setRolloverEnabled(true);
        btnBobinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-bobina-6-cinza.png"))); // NOI18N
        btnBobinas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBobinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBobinasActionPerformed(evt);
            }
        });

        btnCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-eletrico-64-azul.png"))); // NOI18N
        btnCabos.setText("Cabos");
        btnCabos.setContentAreaFilled(false);
        btnCabos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCabos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCabos.setPreferredSize(new java.awt.Dimension(662, 417));
        btnCabos.setRolloverEnabled(true);
        btnCabos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-eletrico-64-cinza.png"))); // NOI18N
        btnCabos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabosActionPerformed(evt);
            }
        });

        btnPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnPontas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-ponta-6-azul.png"))); // NOI18N
        btnPontas.setText("Pontas");
        btnPontas.setContentAreaFilled(false);
        btnPontas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPontas.setFocusCycleRoot(true);
        btnPontas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPontas.setName(""); // NOI18N
        btnPontas.setRolloverEnabled(true);
        btnPontas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-ponta-64-cinza.png"))); // NOI18N
        btnPontas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontasActionPerformed(evt);
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
                        .addComponent(btnPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCabos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabosActionPerformed
        if (!TelaPrincipal.usuario.getAlterarDados().equals("s")) {
            TelaLoginInterno verificacao = new TelaLoginInterno(null, true);
            verificacao.setVisible(true);
            if (!verificacao.isDadosCorretos()) {
                return;
            }
        }
        viewUtil.alterarIcone(btnCabos, "icons8-eletrico-64-selecionado.png");
        viewUtil.alterarIcone(btnBobinas, "icons8-bobina-64-azul.png");
        viewUtil.alterarIcone(btnPontas, "icons8-ponta-6-azul.png");

        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Cabos");

    }//GEN-LAST:event_btnCabosActionPerformed

    private void btnPontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontasActionPerformed
        viewUtil.alterarIcone(btnCabos, "icons8-eletrico-64-azul.png");
        viewUtil.alterarIcone(btnBobinas, "icons8-bobina-64-azul.png");
        viewUtil.alterarIcone(btnPontas, "icons8-ponta-64-selecionado.png");

        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Pontas");
    }//GEN-LAST:event_btnPontasActionPerformed

    private void btnBobinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBobinasActionPerformed
        if (!TelaPrincipal.usuario.getAlterarDados().equals("s")) {
            TelaLoginInterno verificacao = new TelaLoginInterno(null, true);
            verificacao.setVisible(true);
            if (!verificacao.isDadosCorretos()) {
                return;
            }
        }
        viewUtil.alterarIcone(btnCabos, "icons8-eletrico-64-azul.png");
        viewUtil.alterarIcone(btnBobinas, "icons8-bobina-64-selecionado.png");
        viewUtil.alterarIcone(btnPontas, "icons8-ponta-6-azul.png");

        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Bobinas");
    }//GEN-LAST:event_btnBobinasActionPerformed

    private void txtCodigoCabosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCabosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            List<Cabo> caboList;
            txtDescricaoCabos.setText("");
            txtQuantidadeCabos.setText("");
            txtBobinaAtualCabos.setText("");
            btnCadastrarCabo.setEnabled(false);

            if (txtCodigoCabos.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "      Digite um Código!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                btnCadastrarCabo.setEnabled(false);
                btnAlterarCabo.setEnabled(false);
                btnDeletarCabo.setEnabled(false);
                txtQuantidadeCabos.setText("");
                txtBobinaAtualCabos.setText("");
                return;
            }

            int codigo = Conversor.paraInt(txtCodigoCabos.getText(), "Código");
            if (codigo == -1) {
                return;
            }

            caboList = CaboDAO.busca(codigo, "s");
            if (caboList.isEmpty()) {
                txtDescricaoCabos.setText("");
                txtQuantidadeCabos.setText("");
                txtBobinaAtualCabos.setText("");
                txtDescricaoCabos.setEditable(true);
                btnCadastrarCabo.setEnabled(true);
                btnAlterarCabo.setEnabled(false);
                btnDeletarCabo.setEnabled(false);
            } else {
                txtDescricaoCabos.setEditable(true);
                txtDescricaoCabos.setText(caboList.get(0).getDescricao());
                if (caboList.get(0).getPossuiBobina().equals("s")) {
                    txtBobinaAtualCabos.setText("" + caboList.get(0).getIdBobina());
                    txtQuantidadeCabos.setText("" + caboList.get(0).getQtdAtual());
                }
                btnCadastrarCabo.setEnabled(false);
                btnAlterarCabo.setEnabled(true);
                btnDeletarCabo.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtCodigoCabosKeyPressed

    private void btnCadastrarCaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCaboActionPerformed
        List<Cabo> caboList;
        int codigo = Conversor.paraInt(txtCodigoCabos.getText(), "Código");

        if (codigo == -1) {
            return;
        }

        caboList = CaboDAO.busca(codigo, "s");

        if (caboList.isEmpty()) {

            if (txtDescricaoCabos.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "  Digite uma Descrição para o cabo",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Cabo cabo = new Cabo(codigo, txtDescricaoCabos.getText().toUpperCase(), "n");
            if (CaboDAO.salvar(cabo)) {
                JOptionPane.showMessageDialog(null, "   Cabo cadastrado com sucesso!",
                        "Concluído", JOptionPane.INFORMATION_MESSAGE);
                this.limparTelaCabo();
                txtCodigoCabos.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(null, "  Este Código já está Cadastrado",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            btnCadastrarCabo.setEnabled(false);

        }
    }//GEN-LAST:event_btnCadastrarCaboActionPerformed

    private void txtNumeroPontasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPontasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

            btnCadastrarPonta.setEnabled(false);
            jcbSubtrairBobinaPonta.setEnabled(false);
            List<PontaCabo> pontaCaboList;
            btnCadastrarPonta.setEnabled(false);

            if (txtNumeroPontas.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "  Digite um Número!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                this.limparTelaPontas();
                return;
            }

            int numero = Conversor.paraInt(txtNumeroPontas.getText(), "Número da Ponta");
            if (numero == -1) {
                return;
            }

            pontaCaboList = PontaDAO.busca(numero);
            if (pontaCaboList.isEmpty()) {
                txtCodigoPonta.requestFocus();
                btnCadastrarPonta.setEnabled(true);
                btnAtualizarPonta.setEnabled(false);
                btnDeletarPonta.setEnabled(false);
                txtCodigoPonta.setEditable(true);
                txtQuantidadePonta.setEditable(true);
                txtLocalPonta.setEditable(true);
                txtCodigoPonta.setText("");
                txtQuantidadePonta.setText("");
                txtLocalPonta.setText("");
                txtDescricaooPontas.setText("");
            } else {
                txtDescricaooPontas.setText(pontaCaboList.get(0).getDescricao());
                txtLocalPonta.setText(pontaCaboList.get(0).getLocal());
                txtQuantidadePonta.setText("" + pontaCaboList.get(0).getQuantidade());
                txtCodigoPonta.setText("" + pontaCaboList.get(0).getCodigoCabo());

                btnCadastrarPonta.setEnabled(false);
                btnAtualizarPonta.setEnabled(true);
                btnDeletarPonta.setEnabled(true);
                txtCodigoPonta.setEditable(false);
                txtQuantidadePonta.setEditable(true);
                txtLocalPonta.setEditable(true);

            }
        }
    }//GEN-LAST:event_txtNumeroPontasKeyPressed

    private void btnAtualizarPontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPontaActionPerformed
        List<PontaCabo> pontaCaboList;
        int numero = Conversor.paraInt(txtNumeroPontas.getText(), "Número da Ponta");
        double quantidade = Conversor.paraDouble(txtQuantidadePonta.getText(), "Quantidade");
        if (numero == -1 || quantidade == -1) {
            return;
        }

        pontaCaboList = PontaDAO.busca(numero);
        if (pontaCaboList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "  Registro de Ponta não encontrado!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            this.limparTelaPontas();
        } else {
            PontaCabo pontaCabo = pontaCaboList.get(0);
            pontaCabo.setLocal(txtLocalPonta.getText());
            pontaCabo.setQuantidade(quantidade);

            if (PontaDAO.atualizar(pontaCabo)) {
                JOptionPane.showMessageDialog(null, "ponta atualizada com sucesso",
                        "Concluído", JOptionPane.WARNING_MESSAGE);
                this.limparTelaPontas();
            }
        }
    }//GEN-LAST:event_btnAtualizarPontaActionPerformed

    private void btnAlterarCaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCaboActionPerformed
        int codigo = Conversor.paraInt(txtCodigoCabos.getText(), "Código");

        if (codigo == -1) {
            return;
        }

        List<Cabo> caboList = CaboDAO.busca(codigo, "s");

        if (caboList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cabo não encontrado Verifique o Código",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Cabo cabo = new Cabo(codigo, txtDescricaoCabos.getText(), "n");

        if (CaboDAO.atualizar(cabo)) {
            JOptionPane.showMessageDialog(null, "Cabo atualizado com sucesso",
                    "Concluído", JOptionPane.WARNING_MESSAGE);
        }
        this.limparTelaCabo();
    }//GEN-LAST:event_btnAlterarCaboActionPerformed

    private void btnDeletarCaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarCaboActionPerformed
        int codigo = Conversor.paraInt(txtCodigoCabos.getText(), "Código");
        String msg = "";
        if (codigo == -1) {
            return;
        }

        List<Cabo> caboList = CaboDAO.busca(codigo, "s");
        if (caboList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cabo não encontrado Verifique o Código",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Cabo cabo = caboList.get(0);
        if (JOptionPane.showConfirmDialog(null, "<html> <H2 ALIGN=\"center\"><FONT FACE=\"Tahoma\" COLOR=\"red\">ATENÇÃO</FONT></H2>"
                + "<p><font  FACE=\"Arial\" SIZE=\"5\">Este Procedimento <b>excluirá o cabo </b>"
                + "e sua respectiva <b>bobina</b>, caso possua,<br>"
                + "Também serão excluidos todos os registros de <b>Saidas</b> e <b>Pontas,</b><br>"
                + "<br>Deseja Continuar?<font></p> </html>", "Excluir cabo", JOptionPane.YES_NO_OPTION, -1) == 0) {

            if (cabo.getPossuiBobina().equals("s")) {
                if (BobinaDAO.excluir(cabo)) {
                    msg += "<font COLOR=\"green\"><br>Bobina excluída com sucesso!</font><br>";
                } else {
                    msg += "<font COLOR=\"red\"><br>Falha ao excluir Bobina, contacte o desenvolvedor!</font><br>";
                }
            }

            if (PontaDAO.excluirTudoPorCodigo(cabo.getCodigoCabo())) {
                msg += "<font COLOR=\"green\"><br>Registros de ponta Excluídos com sucesso!</font><br>";
            } else {
                msg += "<font COLOR=\"red\"><br>Falha ao excluir as pontas, contacte o desenvolvedor!</font><br>";
            }

            if (SaidaDAO.excluirTudoPorCodigo(cabo.getCodigoCabo())) {
                msg += "<font COLOR=\"green\"><br>Registros de Saída Excluídos com sucesso!</font><br>";
            } else {
                msg += "<font COLOR=\"red\"><br>Falha ao excluir as saídas, contacte o desenvolvedor!</font><br>";
            }

            if (CaboDAO.excluir(cabo)) {
                msg += "<font COLOR=\"green\"><br>Cabo Excluído com sucesso!</font><br>";
            } else {
                msg += "<font COLOR=\"red\"><br>Falha ao excluir o cabo, contacte o desenvolvedor!</font><br>";
            }

            JOptionPane.showMessageDialog(this, "<html>" + msg + "</html>");
            this.limparTelaCabo();
        }
    }//GEN-LAST:event_btnDeletarCaboActionPerformed

    public void limparTelaCabo() {
        txtDescricaoCabos.setEditable(false);
        txtCodigoCabos.setText("");
        txtDescricaoCabos.setText("");
        txtBobinaAtualCabos.setText("");
        txtQuantidadeCabos.setText("");
        btnAlterarCabo.setEnabled(false);
        btnCadastrarCabo.setEnabled(false);
        btnDeletarCabo.setEnabled(false);
    }

    private void btnDeletarPontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarPontaActionPerformed
        int numeroPonta = Conversor.paraInt(txtNumeroPontas.getText(), "Número da Ponta");

        if (numeroPonta != -1) {
            List<PontaCabo> pontaCaboList = PontaDAO.busca(numeroPonta);

            if (pontaCaboList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ponta não encontrada Verifique o Número!",
                        "Falha", JOptionPane.WARNING_MESSAGE);

            } else {
                if (JOptionPane.showConfirmDialog(null, "Este Procedimento excluirá esta Ponta "
                        + "Deseja Continuar? ", "Deletar", WIDTH, JOptionPane.QUESTION_MESSAGE) == 0) {
                    if (PontaDAO.excluir(numeroPonta)) {
                        JOptionPane.showMessageDialog(null, "Ponta excluida com sucesso!",
                                "Concluído", JOptionPane.WARNING_MESSAGE);
                    }
                    this.limparTelaPontas();
                }
            }
        }
    }//GEN-LAST:event_btnDeletarPontaActionPerformed

    private void txtCodigoPontaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPontaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.buscarCaboPontas();
        }
    }//GEN-LAST:event_txtCodigoPontaKeyPressed

    public void buscarCaboPontas() {
        try {

            List<Cabo> caboList;
            if (txtCodigoPonta.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "  Digite um Código!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                txtDescricaooPontas.setText("");
                return;
            }

            int codigo = Integer.parseInt(txtCodigoPonta.getText());
            if (codigo == 0) {
                return;
            }

            caboList = CaboDAO.busca(codigo, "s");
            if (caboList.isEmpty()) {
                Cabo.buscarCabo(txtCodigoPonta);
            } else {
                txtLocalPonta.requestFocus();
                jcbSubtrairBobinaPonta.setEnabled(true);
                txtCodigoPonta.setEditable(false);
                txtDescricaooPontas.setText(caboList.get(0).getDescricao());
            }

        } catch (NumberFormatException e) {
            Cabo.buscarCabo(txtCodigoPonta);
            this.buscarCaboPontas();
        }
    }

    private void btnCadastrarPontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPontaActionPerformed
        int numeroPonta = Conversor.paraInt(txtNumeroPontas.getText(), "Número da Ponta");
        double quantidade = Conversor.paraDouble(txtQuantidadePonta.getText(), "Quantidade");
        int codigo = Conversor.paraInt(txtCodigoPonta.getText(), "Código Ponta");

        if (txtDescricaooPontas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira um Código de Cabo Válido",
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (numeroPonta != -1 && quantidade != -1 && codigo != -1) {
            List<PontaCabo> pontaCaboList = PontaDAO.busca(numeroPonta);

            if (!pontaCaboList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "número de Ponta já cadastrado!",
                        "Falha", JOptionPane.WARNING_MESSAGE);

            } else {
                PontaCabo ponta = new PontaCabo(numeroPonta, quantidade,
                        txtLocalPonta.getText().toUpperCase(), codigo, txtDescricaooPontas.getText(), "");

                if (jcbSubtrairBobinaPonta.isSelected()) {
                    List<Cabo> caboList = CaboDAO.busca(codigo, "s");
                    if (!caboList.isEmpty()) {
                        Cabo cabo = caboList.get(0);

                        if (quantidade > cabo.getQtdAtual()) {
                            JOptionPane.showMessageDialog(null, "Quantidade da "
                                    + "Bobina Insulficiente para retirar esta Qtd \n"
                                    + "Bobina Nº:  " + cabo.getIdBobina() + "  QtdAtual:   "
                                    + cabo.getQtdAtual() + " m",
                                    "Falha", JOptionPane.WARNING_MESSAGE);

                        } else if (PontaDAO.salvar(ponta)) {
                            this.limparTelaPontas();

                            cabo.setQtdAtual(cabo.getQtdAtual() - quantidade);
                            BobinaDAO.atualizar(cabo);

                            JOptionPane.showMessageDialog(null, "Ponta Salva com sucesso",
                                    "concluido", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else if (PontaDAO.salvar(ponta)) {
                    this.limparTelaPontas();
                    JOptionPane.showMessageDialog(null, "Ponta Salva com sucesso",
                            "concluido", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarPontaActionPerformed

    public void limparTelaPontas() {
        btnCadastrarPonta.setEnabled(false);
        btnDeletarPonta.setEnabled(false);
        btnAtualizarPonta.setEnabled(false);
        txtCodigoPonta.setEditable(false);
        txtQuantidadePonta.setEditable(false);
        txtLocalPonta.setEditable(false);
        jcbSubtrairBobinaPonta.setSelected(false);
        jcbSubtrairBobinaPonta.setEnabled(false);
        txtNumeroPontas.setText("");
        txtCodigoPonta.setText("");
        txtQuantidadePonta.setText("");
        txtLocalPonta.setText("");
        txtDescricaooPontas.setText("");
    }

    private void txtCodigoCaboBobinasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCaboBobinasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.buscarCaboBobinas();
        }

    }//GEN-LAST:event_txtCodigoCaboBobinasKeyPressed

    public void buscarCaboBobinas() {
        try {

            lblBobinaCadastrada.setVisible(false);
            if (txtCodigoCaboBobinas.getText().equals("")) {
                Tabela.limpar(tabelaBusca);
                JOptionPane.showMessageDialog(null, "Digite um Código "
                        + "para pesquisar", "Falha", JOptionPane.WARNING_MESSAGE);
                this.limparTelaBobinas();
                return;
            }

            int codigoCabo = Integer.parseInt(txtCodigoCaboBobinas.getText());

            if (codigoCabo != 0) {
                List<Cabo> caboBobina = CaboDAO.buscaPorCodigo(codigoCabo);

                if (caboBobina.isEmpty()) {
                    Tabela.limpar(tabelaBusca);
                    caboBobina = CaboDAO.busca(codigoCabo, "s");
                    if (caboBobina.isEmpty()) {
                        Tabela.limpar(tabelaBusca);
                        this.limparTelaBobinas();
                        Cabo.buscarCabo(txtCodigoCaboBobinas);

                    } else {
                        Tabela.limpar(tabelaBusca);
                        txtDescricaoBobinas.setText(caboBobina.get(0).getDescricao());
                        jcbAtivo.setSelectedIndex(0);
                        txtNumBobinaBobinas.setText("");
                        txtQuantidadeBobinas.setText("");
                    }
                } else {
                    txtNumBobinaBobinas.setText("");
                    jcbAtivo.setSelectedIndex(0);
                    txtQuantidadeBobinas.setText("");
                    Tabela.limpar(tabelaBusca);
                    txtDescricaoBobinas.setText(caboBobina.get(0).getDescricao());

                    for (int i = 0; i < caboBobina.size(); i++) {
                        Object[] cabo = {caboBobina.get(i).getCodigoCabo(),
                            caboBobina.get(i).getIdBobina(),
                            caboBobina.get(i).getQtdOriginal(),
                            caboBobina.get(i).getQtdAtual(),
                            caboBobina.get(i).getAtivo().equals("s") ? "Ativo" : "Inativo",
                            caboBobina.get(i).getDescricao()
                        };
                        tabelaBusca.addRow(cabo);
                    }
                }
            }

        } catch (NumberFormatException e) {
            Cabo.buscarCabo(txtCodigoCaboBobinas);
            this.buscarCaboBobinas();
        }
    }


    private void txtNumBobinaBobinasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumBobinaBobinasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (txtNumBobinaBobinas.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite o número "
                        + "da bobina para pesquisar", "Falha", JOptionPane.WARNING_MESSAGE);
                this.limparTelaBobinas();
                return;
            }

            int numBobina = Conversor.paraInt(txtNumBobinaBobinas.getText(), "Número Bobina");

            if (numBobina != -1) {
                List<Cabo> caboBobina = BobinaDAO.buscaPorNumBobina(numBobina);

                if (caboBobina.isEmpty()) {
                    btnCadastrarBobina.setEnabled(true);
                    lblBobinaCadastrada.setVisible(false);
                    jcbAtivo.setSelectedIndex(0);
                    txtQuantidadeBobinas.setText("");
                    jcbAtivo.setEnabled(true);
                    txtQuantidadeBobinas.setEditable(true);

                } else {
                    btnCadastrarBobina.setEnabled(false);
                    lblBobinaCadastrada.setVisible(true);
                    jcbAtivo.setSelectedIndex(0);
                    txtQuantidadeBobinas.setText("");
                    jcbAtivo.setEnabled(false);
                    txtQuantidadeBobinas.setEditable(false);
                }
            }
        }
    }//GEN-LAST:event_txtNumBobinaBobinasKeyPressed

    private void btnAtualizarBobinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarBobinasActionPerformed

        double quantidade = Conversor.paraDouble(txtQuantidadeBobinas.getText(), "Quantidade");
        int idBobina = Conversor.paraInt(txtNumBobinaBobinas.getText(), "Número Bobina");
        int codigoCabo = Conversor.paraInt(txtCodigoCaboBobinas.getText(), "Código do Cabo");
        String status = jcbAtivo.getSelectedItem().toString();
        String Descricao = txtDescricaoBobinas.getText();

        if (status.equals("-----")) {
            JOptionPane.showMessageDialog(null, "Status Inválido,Verifique!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (idBobina != -1 && codigoCabo != -1 && quantidade != -1) {
            Cabo cabo = new Cabo();
            cabo.setQtdAtual(quantidade);
            cabo.setIdBobina(idBobina);
            cabo.setDescricao(Descricao);
            cabo.setCodigoCabo(codigoCabo);
            List<Cabo> caboBobina = BobinaDAO.buscaPorNumBobina(idBobina);
            List<Cabo> caboList = CaboDAO.busca(codigoCabo, "s");

            if (caboBobina.isEmpty()) {
                Tabela.limpar(tabelaBusca);
                JOptionPane.showMessageDialog(null, "Bobina não Encontrada",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                txtDescricaoBobinas.setText("");
                txtCodigoCaboBobinas.setText("");
                jcbAtivo.setEnabled(false);
                jcbAtivo.setSelectedIndex(0);
                txtQuantidadeBobinas.setText("");
                txtQuantidadeBobinas.setEditable(false);
            } else {

                if (status.equals("Inativo")) {
                    if (caboBobina.get(0).getAtivo().equals("s")) {
                        cabo.setPossuiBobina("n");
                        //Atualiza o cabo
                        CaboDAO.atualizar(cabo);
                        //Atualiza a bobina
                        cabo.setAtivo("n");
                        this.atualizarBobina(cabo);
                        this.limparTelaBobinas();

                    } else {
                        cabo.setAtivo("n");
                        //atualiza a quantidade
                        this.atualizarBobina(cabo);
                        this.limparTelaBobinas();
                    }
                } else {
                    if (caboList.get(0).getPossuiBobina().equals("s")) {
                        if (caboBobina.get(0).getAtivo().equals("s")) {
                            cabo.setAtivo("s");
                            //atualiza a quantidade
                            this.atualizarBobina(cabo);
                            this.limparTelaBobinas();
                        } else {
                            this.limparTelaBobinas();
                            JOptionPane.showMessageDialog(null, "Não é possivel atualizar esta bobina para (ativo)\n"
                                    + "Pois este cabo já possui uma bobina ativa",
                                    "Falha", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        cabo.setPossuiBobina("s");
                        cabo.setAtivo("s");
                        //Cabo Passa a possuir Bobina
                        CaboDAO.atualizar(cabo);
                        //Bobina passa a ser ativa 
                        this.atualizarBobina(cabo);
                        this.limparTelaBobinas();

                    }
                }
            }
        }
    }//GEN-LAST:event_btnAtualizarBobinasActionPerformed

    public void atualizarBobina(Cabo cabo) {
        if (BobinaDAO.atualizar(cabo)) {
            JOptionPane.showMessageDialog(null, "Bobina Atualizada Com Sucesso",
                    "Concluido", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void limparTelaBobinas() {
        txtDescricaoBobinas.setText("");
        txtCodigoCaboBobinas.setText("");
        txtNumBobinaBobinas.setText("");
        jcbAtivo.setEnabled(false);
        jcbAtivo.setSelectedIndex(0);
        txtQuantidadeBobinas.setText("");
        txtQuantidadeBobinas.setEditable(false);
        Tabela.limpar(tabelaBusca);
    }

    private void btnDeletarBobinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarBobinasActionPerformed
        int idBobina = Conversor.paraInt(txtNumBobinaBobinas.getText(), "Número Bobina");
        int codigoCabo = Conversor.paraInt(txtCodigoCaboBobinas.getText(), "Código Cabo");

        if (idBobina != -1 && codigoCabo != -1) {
            Cabo caboBobina = new Cabo();
            caboBobina.setCodigoCabo(codigoCabo);
            caboBobina.setIdBobina(idBobina);
            caboBobina.setDescricao(txtDescricaoBobinas.getText());

            List<Cabo> caboBobinaList = BobinaDAO.buscaPorNumBobina(idBobina);

            if (caboBobinaList.isEmpty()) {
                Tabela.limpar(tabelaBusca);
                JOptionPane.showMessageDialog(null, "Bobina não Encontrada",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                this.limparTelaBobinas();
            } else {

                if (JOptionPane.showConfirmDialog(null, "Este Procedimento excluirá a Bobina\n"
                        + "E causará uma alteração no cabo: " + codigoCabo
                        + "\nDeseja Continuar? ", "Deletar", WIDTH, JOptionPane.QUESTION_MESSAGE) == 0) {
                    Tabela.limpar(tabelaBusca);
                    if (BobinaDAO.excluir(caboBobina)) {
                        JOptionPane.showMessageDialog(null, "     Bobina excluida com sucesso!",
                                "Concluído", JOptionPane.INFORMATION_MESSAGE);
                    }

                    if (caboBobinaList.get(0).getAtivo().equals("s")) {
                        caboBobina.setPossuiBobina("n");
                        if (caboBobinaList.get(0).getPossuiBobina().equals("s")) {
                            CaboDAO.atualizar(caboBobina);
                        }
                    }
                }
                this.limparTelaBobinas();
            }
        }
    }//GEN-LAST:event_btnDeletarBobinasActionPerformed

    private void btnSelecionarBobinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarBobinasActionPerformed

        btnCadastrarBobina.setEnabled(false);

        if (jtbTabelaBobina.getSelectedRow() != -1) {
            txtCodigoCaboBobinas.setText(jtbTabelaBobina.getValueAt(jtbTabelaBobina.getSelectedRow(), 0).toString());
            txtNumBobinaBobinas.setText(jtbTabelaBobina.getValueAt(jtbTabelaBobina.getSelectedRow(), 1).toString());

            if (jtbTabelaBobina.getValueAt(jtbTabelaBobina.getSelectedRow(), 4).toString().equals("Ativo")) {
                jcbAtivo.setSelectedIndex(1);
            } else {
                jcbAtivo.setSelectedIndex(2);
            }
            txtQuantidadeBobinas.setText(jtbTabelaBobina.getValueAt(jtbTabelaBobina.getSelectedRow(), 3).toString());
            txtDescricaoBobinas.setText(jtbTabelaBobina.getValueAt(jtbTabelaBobina.getSelectedRow(), 5).toString());
            txtQuantidadeBobinas.setEditable(true);
            jcbAtivo.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Item Selecionado",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSelecionarBobinasActionPerformed

    private void btnCadastrarBobinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarBobinaActionPerformed

        double quantidade = Conversor.paraDouble(txtQuantidadeBobinas.getText(), "Quantidade");
        int idBobina = Conversor.paraInt(txtNumBobinaBobinas.getText(), "Número Bobina");
        int codigoCabo = Conversor.paraInt(txtCodigoCaboBobinas.getText(), "Código do Cabo");
        String status = jcbAtivo.getSelectedItem().toString();
        String Descricao = txtDescricaoBobinas.getText();

        if (status.equals("-----")) {
            JOptionPane.showMessageDialog(null, "Status Inválido,Verifique!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (idBobina != -1 && codigoCabo != -1 && quantidade != -1) {
            List<Cabo> caboList = CaboDAO.busca(codigoCabo, "s");
            if (caboList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Cabo não encontrado verifique o código",
                        "Falha", JOptionPane.WARNING_MESSAGE);
            } else {
                Cabo cabo = new Cabo();
                if (status.equals("Ativo")) {
                    if (caboList.get(0).getPossuiBobina().equals("n")) {
                        cabo.setPossuiBobina("s");
                        cabo.setDescricao(Descricao);
                        cabo.setCodigoCabo(codigoCabo);
                        CaboDAO.atualizar(cabo);
                        TelaGerenciarCabos.salvarBobina("s", codigoCabo, idBobina, quantidade);
                    } else {
                        JOptionPane.showMessageDialog(null, "  Este cabo já possui uma Bobina ativa!",
                                "Falha", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    List<Cabo> caboBobinaList = BobinaDAO.buscaPorNumBobina(idBobina);
                    if (caboBobinaList.isEmpty()) {
                        TelaGerenciarCabos.salvarBobina("n", codigoCabo, idBobina, quantidade);

                        this.limparTelaBobinas();
                    } else {
                        JOptionPane.showMessageDialog(null, "Número de Bobina já cadastrado!",
                                "Falha", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarBobinaActionPerformed

    public static void salvarBobina(String status, int codigoCabo, int numBobina, double qtd) {
        Cabo cabo = new Cabo();
        cabo.setAtivo(status);
        cabo.setCodigoCabo(codigoCabo);
        cabo.setIdBobina(numBobina);
        cabo.setQtdAtual(qtd);
        cabo.setQtdOriginal(qtd);

        if (BobinaDAO.salvar(cabo)) {
            JOptionPane.showMessageDialog(null, "   Bobina Salva com sucesso!",
                    "Concluido", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btnGerarPontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPontasActionPerformed
        List<Integer> intList = PontaDAO.buscaNumPonta();
        txtNumeroPontas.setText("" + Calculo.NumValido(intList));
        txtNumeroPontas.requestFocus();
    }//GEN-LAST:event_btnGerarPontasActionPerformed

    private void btnGerarBobinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarBobinasActionPerformed
        List<Integer> intList = BobinaDAO.buscaSomenteNumBobina();
        txtNumBobinaBobinas.setText("" + Calculo.NumValido(intList));

    }//GEN-LAST:event_btnGerarBobinasActionPerformed

    private void txtLocalPontaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocalPontaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQuantidadePonta.requestFocus();
        }
    }//GEN-LAST:event_txtLocalPontaKeyPressed

    private void txtQuantidadePontaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadePontaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCadastrarPonta.requestFocus();
        }
    }//GEN-LAST:event_txtQuantidadePontaKeyPressed

    private void txtDescricaoCabosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoCabosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCadastrarCabo.requestFocus();
        }
    }//GEN-LAST:event_txtDescricaoCabosKeyPressed

    private void txtCodigoPontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPontaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPontaActionPerformed

    private void btnCadastrarCaboKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarCaboKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCadastrarCabo.doClick();
        }
    }//GEN-LAST:event_btnCadastrarCaboKeyTyped

    private void btnCadastrarPontaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarPontaKeyTyped
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCadastrarPonta.doClick();
        }
    }//GEN-LAST:event_btnCadastrarPontaKeyTyped

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
            java.util.logging.Logger.getLogger(TelaGerenciarCabos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!!", JOptionPane.ERROR_MESSAGE);
        }
        //</editor-fold>
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
            TelaGerenciarCabos dialog = new TelaGerenciarCabos(new javax.swing.JFrame(), true, false, 0, 0);
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
    private javax.swing.JButton btnAlterarCabo;
    private javax.swing.JButton btnAtualizarBobinas;
    private javax.swing.JButton btnAtualizarPonta;
    private javax.swing.JButton btnBobinas;
    private javax.swing.JButton btnCabos;
    private javax.swing.JButton btnCadastrarBobina;
    private javax.swing.JButton btnCadastrarCabo;
    private javax.swing.JButton btnCadastrarPonta;
    private javax.swing.JButton btnDeletarBobinas;
    private javax.swing.JButton btnDeletarCabo;
    private javax.swing.JButton btnDeletarPonta;
    private javax.swing.JButton btnGerarBobinas;
    private javax.swing.JButton btnGerarPontas;
    private javax.swing.JButton btnPontas;
    private javax.swing.JButton btnSelecionarBobinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbAtivo;
    private javax.swing.JCheckBox jcbSubtrairBobinaPonta;
    private javax.swing.JPanel jpnBobinas;
    private javax.swing.JPanel jpnCabos;
    private javax.swing.JPanel jpnPontas;
    private javax.swing.JPanel jpnUsuarios1;
    private javax.swing.JTable jtbTabelaBobina;
    private javax.swing.JLabel lblBobinaCadastrada;
    private javax.swing.JTextField txtBobinaAtualCabos;
    private javax.swing.JTextField txtCodigoCaboBobinas;
    private javax.swing.JTextField txtCodigoCabos;
    private javax.swing.JTextField txtCodigoPonta;
    private javax.swing.JTextField txtDescricaoBobinas;
    private javax.swing.JTextField txtDescricaoCabos;
    private javax.swing.JTextField txtDescricaooPontas;
    private javax.swing.JTextField txtLocalPonta;
    private javax.swing.JTextField txtNumBobinaBobinas;
    private javax.swing.JTextField txtNumeroPontas;
    private javax.swing.JTextField txtQuantidadeBobinas;
    private javax.swing.JTextField txtQuantidadeCabos;
    private javax.swing.JTextField txtQuantidadePonta;
    // End of variables declaration//GEN-END:variables

}
