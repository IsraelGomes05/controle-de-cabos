/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.telas;

import br.com.sisnet.controledecabos.classes.Cabo;
import br.com.sisnet.controledecabos.classes.PontaCabo;
import br.com.sisnet.controledecabos.classes.Saida;
import br.com.sisnet.controledecabos.classes.Vendedor;
import br.com.sisnet.controledecabos.classes.utilitarias.Conversor;
import br.com.sisnet.controledecabos.classes.utilitarias.Relatorio;
import br.com.sisnet.controledecabos.classes.utilitarias.Tabela;
import br.com.sisnet.controledecabos.conexaobd.BobinaDAO;
import br.com.sisnet.controledecabos.conexaobd.CaboDAO;
import br.com.sisnet.controledecabos.conexaobd.PontaDAO;
import br.com.sisnet.controledecabos.conexaobd.SaidaDAO;
import br.com.sisnet.controledecabos.conexaobd.VendedorDAO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Israel Gomes Da Silva
 * @created 01/03/2018
 * @lastModified 28/05/2018
 * @version 5.2
 *
 * @Function...
 */
public class TelaPrincipal extends javax.swing.JFrame {

    static boolean subtrairBobina, usuarioAlterarDados;
    DefaultTableModel tabelaCabos;
    DefaultTableModel tabelaRelatorioPontas;
    DefaultTableModel tabelaRelatorioSaidas;
    DefaultTableModel tabelaRelatorioBobinas;
    DefaultTableModel tabelaRelatorioCabos;

    double qtdBobinaAtual = 0;
    int bobinaAtual = 0;
    String dataHoje, codAtualPossuiBobina;

    public TelaPrincipal() {

    }

    private TelaPrincipal(JFrame jFrame, boolean b) {

        try {

            TelaLogin lm = new TelaLogin(this, true);
            lm.setVisible(true);
            initComponents();

            ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
            ButtonGroup buttonGroup2 = new javax.swing.ButtonGroup();

            buttonGroup1.add(jcbAtivoRelatorios);
            buttonGroup1.add(jcbInativoRelatorios);
            jcbAtivoRelatorios.setSelected(true);
            btnSaidasRelatorios.doClick();

            buttonGroup2.add(jRadioButton2);
            buttonGroup2.add(jRadioButton1);
            jRadioButton2.setSelected(true);

            tabelaCabos = (DefaultTableModel) jtbTabelaCabos.getModel();
            tabelaRelatorioPontas = (DefaultTableModel) jtbPontas.getModel();
            tabelaRelatorioSaidas = (DefaultTableModel) jtbTabelaRelatorioSaidas.getModel();
            tabelaRelatorioBobinas = (DefaultTableModel) jtbBobinasRelatorios.getModel();
            tabelaRelatorioCabos = (DefaultTableModel) jtbCabosRelatorios.getModel();

            //Obtendo os dados dos Vendedores
            this.preencherJComboBoxVendedores(jcbVendedoresCabos, "SELECIONE");

            //Obtendo a data atual do Sistema
            DateFormat formato = DateFormat.getDateInstance(DateFormat.MEDIUM);
            Calendar data = Calendar.getInstance();
            dataHoje = formato.format(data.getTime());
            txtDataAtual.setText(dataHoje);

            this.alterarIcone();
        } catch (Exception th) {
            JOptionPane.showMessageDialog(null, "     Falha não tratada Detectada",
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRelatoriosAreaDeTrab = new javax.swing.JButton();
        btnCabosAreaDeTrab = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDataAtual = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        jpnCabos = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnRelatoriosCabos = new javax.swing.JButton();
        btnCabosCabos = new javax.swing.JButton();
        txtDescricaoCabos = new javax.swing.JTextField();
        txtCodigoCabos = new javax.swing.JTextField();
        jcbVendedoresCabos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdicionarCabos = new javax.swing.JButton();
        txtBubinaCabos = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQtdCabos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaCabos = new javax.swing.JTable();
        btnSalvarSaidaCabos = new javax.swing.JButton();
        btnExcluirCabos = new javax.swing.JButton();
        btnLimparCabos = new javax.swing.JButton();
        btnVerificarPontasCabos = new javax.swing.JButton();
        jpnRelatorios = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jbnRelatorios = new javax.swing.JButton();
        jbnCabosRelatorios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSaidasRelatorios = new javax.swing.JButton();
        btnBobinasRelatorios = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jpnPontasRelatorios = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtbPontas = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarRelatoriosPontas = new javax.swing.JButton();
        txtCodigoRelatoriosPontas = new javax.swing.JTextField();
        txtTotalPontasRelatoriosPontas = new javax.swing.JTextField();
        btnImprimirRelatoriosPontas = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnImprimirGeralpontas = new javax.swing.JButton();
        jpnSaidasData = new javax.swing.JPanel();
        btnBuscarRelarorioSaidas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbTabelaRelatorioSaidas = new javax.swing.JTable();
        btnDeletarRelatorioSaidas = new javax.swing.JButton();
        jcbVendedorRelatorio = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        btnImprimirRelatoriosSaidas = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtDataInicialRelatorioSaidas = new javax.swing.JFormattedTextField();
        txtDataFinallRelatorioSaidas = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jpnBobinas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumBobinaRelBobina = new javax.swing.JTextField();
        btnBuscarRelatoriosBobina = new javax.swing.JButton();
        btnExibirTudoRelatoriosBobina = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbBobinasRelatorios = new javax.swing.JTable();
        jpnOpcoesRelatorioBobinas = new javax.swing.JPanel();
        jcbInativoRelatorios = new javax.swing.JCheckBox();
        jcbAtivoRelatorios = new javax.swing.JCheckBox();
        jcbIncluirPontas = new javax.swing.JCheckBox();
        btnImprimir = new javax.swing.JButton();
        jpnCabosRelatorios = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtbCabosRelatorios = new javax.swing.JTable();
        txtCodigoRelatorioCabo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnBuscarCaboRelatorio = new javax.swing.JButton();
        btnBuscarTudoCabos = new javax.swing.JButton();
        btnImprimirRelatoriosCabos = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnPontasRelatorios = new javax.swing.JButton();
        btnCabosRelatorios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAjustes = new javax.swing.JMenu();
        jmUsuariosBarraMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmGerenciarCabos = new javax.swing.JMenuItem();
        jmInformacoes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Controle de Cabos v2.5.7");
        setMinimumSize(new java.awt.Dimension(1231, 615));

        jPanel2.setLayout(new java.awt.CardLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Software de Controle de Cabos v2.5.7");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel2)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
        );

        btnRelatoriosAreaDeTrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Botao_relatorios.png"))); // NOI18N
        btnRelatoriosAreaDeTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosAreaDeTrabActionPerformed(evt);
            }
        });

        btnCabosAreaDeTrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Botao_cabos.png"))); // NOI18N
        btnCabosAreaDeTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabosAreaDeTrabActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("Data Atual");

        txtDataAtual.setForeground(new java.awt.Color(153, 51, 0));
        try {
            txtDataAtual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataAtual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnAlterar.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRelatoriosAreaDeTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCabosAreaDeTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 772, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelatoriosAreaDeTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCabosAreaDeTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jDesktopPane1, "card2");

        jpnCabos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        btnRelatoriosCabos.setBackground(new java.awt.Color(204, 204, 204));
        btnRelatoriosCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Botao_relatorios.png"))); // NOI18N
        btnRelatoriosCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosCabosActionPerformed(evt);
            }
        });

        btnCabosCabos.setBackground(new java.awt.Color(204, 204, 204));
        btnCabosCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Botao_cabos.png"))); // NOI18N

        txtDescricaoCabos.setEditable(false);
        txtDescricaoCabos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDescricaoCabos.setForeground(new java.awt.Color(51, 51, 51));

        txtCodigoCabos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodigoCabos.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigoCabos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoCabosKeyPressed(evt);
            }
        });

        jcbVendedoresCabos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbVendedoresCabos.setForeground(new java.awt.Color(51, 51, 51));
        jcbVendedoresCabos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbVendedoresCabos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbVendedoresCabosKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Código");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel6.setText("Bobina");

        btnAdicionarCabos.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnAdicionarCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/add.png"))); // NOI18N
        btnAdicionarCabos.setText("Adicionar");
        btnAdicionarCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCabosActionPerformed(evt);
            }
        });

        txtBubinaCabos.setEditable(false);
        txtBubinaCabos.setForeground(new java.awt.Color(51, 51, 51));
        txtBubinaCabos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBubinaCabos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBubinaCabosKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel7.setText("Qtd");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setText("Vendedor(a)");

        txtQtdCabos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtQtdCabos.setForeground(new java.awt.Color(51, 51, 51));
        txtQtdCabos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtdCabosKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel9.setText("Descrição");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRelatoriosCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCabosCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 241, Short.MAX_VALUE))
                    .addComponent(txtDescricaoCabos, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQtdCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBubinaCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jcbVendedoresCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionarCabos))
                    .addComponent(jLabel8))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnRelatoriosCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(btnCabosCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCabos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoCabos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdCabos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBubinaCabos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbVendedoresCabos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionarCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );

        jtbTabelaCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbTabelaCabos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "QUANTIDADE", "VENDEDOR(A)", "BOBINA ATUAL", "QTD BOBINA ", "QTD ESTOQUE", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTabelaCabos.setGridColor(new java.awt.Color(255, 255, 255));
        jtbTabelaCabos.setName(""); // NOI18N
        jtbTabelaCabos.setSelectionBackground(new java.awt.Color(170, 215, 135));
        jtbTabelaCabos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtbTabelaCabos.setShowHorizontalLines(false);
        jtbTabelaCabos.getTableHeader().setReorderingAllowed(false);
        jtbTabelaCabos.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jtbTabelaCabos);
        jtbTabelaCabos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtbTabelaCabos.getColumnModel().getColumnCount() > 0) {
            jtbTabelaCabos.getColumnModel().getColumn(0).setMinWidth(100);
            jtbTabelaCabos.getColumnModel().getColumn(0).setMaxWidth(110);
            jtbTabelaCabos.getColumnModel().getColumn(1).setMinWidth(400);
            jtbTabelaCabos.getColumnModel().getColumn(1).setMaxWidth(600);
            jtbTabelaCabos.getColumnModel().getColumn(2).setMinWidth(80);
            jtbTabelaCabos.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtbTabelaCabos.getColumnModel().getColumn(2).setMaxWidth(110);
            jtbTabelaCabos.getColumnModel().getColumn(3).setMinWidth(125);
            jtbTabelaCabos.getColumnModel().getColumn(3).setMaxWidth(150);
            jtbTabelaCabos.getColumnModel().getColumn(4).setMinWidth(120);
            jtbTabelaCabos.getColumnModel().getColumn(4).setMaxWidth(130);
            jtbTabelaCabos.getColumnModel().getColumn(5).setMinWidth(110);
            jtbTabelaCabos.getColumnModel().getColumn(5).setMaxWidth(150);
            jtbTabelaCabos.getColumnModel().getColumn(6).setMinWidth(90);
            jtbTabelaCabos.getColumnModel().getColumn(6).setPreferredWidth(90);
            jtbTabelaCabos.getColumnModel().getColumn(6).setMaxWidth(120);
            jtbTabelaCabos.getColumnModel().getColumn(7).setMinWidth(10);
            jtbTabelaCabos.getColumnModel().getColumn(7).setPreferredWidth(10);
            jtbTabelaCabos.getColumnModel().getColumn(7).setMaxWidth(15);
        }

        btnSalvarSaidaCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnSalvarSaidaCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/disk.png"))); // NOI18N
        btnSalvarSaidaCabos.setText("Salvar");
        btnSalvarSaidaCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSaidaCabosActionPerformed(evt);
            }
        });

        btnExcluirCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnExcluirCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/delete.png"))); // NOI18N
        btnExcluirCabos.setText("Excluir  Item");
        btnExcluirCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCabosActionPerformed(evt);
            }
        });

        btnLimparCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnLimparCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Edit-clear.png"))); // NOI18N
        btnLimparCabos.setText("Limpar");
        btnLimparCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCabosActionPerformed(evt);
            }
        });

        btnVerificarPontasCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnVerificarPontasCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/help.png"))); // NOI18N
        btnVerificarPontasCabos.setText("Verificar Ponta");
        btnVerificarPontasCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarPontasCabosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnCabosLayout = new javax.swing.GroupLayout(jpnCabos);
        jpnCabos.setLayout(jpnCabosLayout);
        jpnCabosLayout.setHorizontalGroup(
            jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCabosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCabosLayout.createSequentialGroup()
                        .addComponent(btnLimparCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificarPontasCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirCabos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarSaidaCabos)))
                .addContainerGap())
        );
        jpnCabosLayout.setVerticalGroup(
            jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCabosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnCabosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarSaidaCabos)
                    .addComponent(btnExcluirCabos)
                    .addComponent(btnLimparCabos)
                    .addComponent(btnVerificarPontasCabos))
                .addContainerGap())
        );

        jPanel2.add(jpnCabos, "jpnCabos");

        jpnRelatorios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jbnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Botao_relatorios.png"))); // NOI18N

        jbnCabosRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/Botao_cabos.png"))); // NOI18N
        jbnCabosRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCabosRelatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbnCabosRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnCabosRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnSaidasRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnSaidasRelatorios.setText("Saidas");
        btnSaidasRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidasRelatoriosActionPerformed(evt);
            }
        });

        btnBobinasRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBobinasRelatorios.setText("Bobinas");
        btnBobinasRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBobinasRelatoriosActionPerformed(evt);
            }
        });

        jPanel7.setLayout(new java.awt.CardLayout());

        jpnPontasRelatorios.setBackground(new java.awt.Color(204, 204, 204));
        jpnPontasRelatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jpnPontasRelatorios.setName("jpnPontasRelatorios"); // NOI18N

        jtbPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbPontas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM.PONTA", "CÓDIGO", "DESCRIÇÃO", "QUANTIDADE", "LOCAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPontas.setSelectionBackground(new java.awt.Color(170, 215, 135));
        jtbPontas.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtbPontas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbPontas.setShowHorizontalLines(false);
        jtbPontas.getTableHeader().setReorderingAllowed(false);
        jtbPontas.setUpdateSelectionOnSort(false);
        jScrollPane4.setViewportView(jtbPontas);
        if (jtbPontas.getColumnModel().getColumnCount() > 0) {
            jtbPontas.getColumnModel().getColumn(0).setResizable(false);
            jtbPontas.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbPontas.getColumnModel().getColumn(1).setResizable(false);
            jtbPontas.getColumnModel().getColumn(1).setPreferredWidth(30);
            jtbPontas.getColumnModel().getColumn(2).setResizable(false);
            jtbPontas.getColumnModel().getColumn(2).setPreferredWidth(500);
            jtbPontas.getColumnModel().getColumn(3).setResizable(false);
            jtbPontas.getColumnModel().getColumn(3).setPreferredWidth(15);
            jtbPontas.getColumnModel().getColumn(4).setResizable(false);
            jtbPontas.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel11.setText("Código ");

        btnBuscarRelatoriosPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBuscarRelatoriosPontas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/magnifier.png"))); // NOI18N
        btnBuscarRelatoriosPontas.setText("Buscar");
        btnBuscarRelatoriosPontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRelatoriosPontasActionPerformed(evt);
            }
        });

        txtCodigoRelatoriosPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtCodigoRelatoriosPontas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoRelatoriosPontasKeyPressed(evt);
            }
        });

        txtTotalPontasRelatoriosPontas.setEditable(false);
        txtTotalPontasRelatoriosPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        btnImprimirRelatoriosPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnImprimirRelatoriosPontas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/printer.png"))); // NOI18N
        btnImprimirRelatoriosPontas.setText("Imprimir");
        btnImprimirRelatoriosPontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatoriosPontasActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel13.setText("Total em Pontas");

        btnImprimirGeralpontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnImprimirGeralpontas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/printer.png"))); // NOI18N
        btnImprimirGeralpontas.setText("Imprimir Relatório Geral");
        btnImprimirGeralpontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirGeralpontasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnPontasRelatoriosLayout = new javax.swing.GroupLayout(jpnPontasRelatorios);
        jpnPontasRelatorios.setLayout(jpnPontasRelatoriosLayout);
        jpnPontasRelatoriosLayout.setHorizontalGroup(
            jpnPontasRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jpnPontasRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnPontasRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPontasRelatoriosLayout.createSequentialGroup()
                        .addComponent(txtCodigoRelatoriosPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarRelatoriosPontas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimirRelatoriosPontas))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addGroup(jpnPontasRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPontasRelatoriosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(1, 1, 1))
                    .addComponent(txtTotalPontasRelatoriosPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnImprimirGeralpontas)
                .addContainerGap())
        );
        jpnPontasRelatoriosLayout.setVerticalGroup(
            jpnPontasRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPontasRelatoriosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpnPontasRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnPontasRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarRelatoriosPontas)
                    .addComponent(txtCodigoRelatoriosPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPontasRelatoriosPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirRelatoriosPontas)
                    .addComponent(btnImprimirGeralpontas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jpnPontasRelatorios, "Pontas");

        jpnSaidasData.setBackground(new java.awt.Color(204, 204, 204));
        jpnSaidasData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        btnBuscarRelarorioSaidas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBuscarRelarorioSaidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/magnifier.png"))); // NOI18N
        btnBuscarRelarorioSaidas.setText("Buscar");
        btnBuscarRelarorioSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRelarorioSaidasActionPerformed(evt);
            }
        });

        jtbTabelaRelatorioSaidas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbTabelaRelatorioSaidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓD.SAíDA", "DATA", "CÓDIGO", "DESCRIÇÃO", "QUANTIDADE", "VENDEDOR", "BOBINA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTabelaRelatorioSaidas.setSelectionBackground(new java.awt.Color(170, 215, 135));
        jtbTabelaRelatorioSaidas.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtbTabelaRelatorioSaidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbTabelaRelatorioSaidas.setShowHorizontalLines(false);
        jtbTabelaRelatorioSaidas.getTableHeader().setReorderingAllowed(false);
        jtbTabelaRelatorioSaidas.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(jtbTabelaRelatorioSaidas);
        jtbTabelaRelatorioSaidas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtbTabelaRelatorioSaidas.getColumnModel().getColumnCount() > 0) {
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(0).setMinWidth(40);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(0).setMaxWidth(70);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(1).setMinWidth(70);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(1).setMaxWidth(100);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(2).setMinWidth(100);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(2).setMaxWidth(150);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(3).setMinWidth(350);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(3).setMaxWidth(550);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(4).setMinWidth(90);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(4).setMaxWidth(150);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(5).setMinWidth(90);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(5).setMaxWidth(180);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(6).setMinWidth(70);
            jtbTabelaRelatorioSaidas.getColumnModel().getColumn(6).setMaxWidth(170);
        }

        btnDeletarRelatorioSaidas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarRelatorioSaidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/delete.png"))); // NOI18N
        btnDeletarRelatorioSaidas.setText("Deletar");
        btnDeletarRelatorioSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarRelatorioSaidasActionPerformed(evt);
            }
        });

        jcbVendedorRelatorio.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbVendedorRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel17.setText("Vendedor(a)");

        btnImprimirRelatoriosSaidas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnImprimirRelatoriosSaidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/printer.png"))); // NOI18N
        btnImprimirRelatoriosSaidas.setText("Imprimir");
        btnImprimirRelatoriosSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatoriosSaidasActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Período", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14)), "Período", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 13), new java.awt.Color(51, 51, 51))); // NOI18N

        try {
            txtDataInicialRelatorioSaidas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataInicialRelatorioSaidas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtDataInicialRelatorioSaidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataInicialRelatorioSaidasKeyPressed(evt);
            }
        });

        try {
            txtDataFinallRelatorioSaidas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataFinallRelatorioSaidas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtDataFinallRelatorioSaidas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataFinallRelatorioSaidasKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel16.setText("Até");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel15.setText("De");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataInicialRelatorioSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataFinallRelatorioSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataInicialRelatorioSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFinallRelatorioSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnSaidasDataLayout = new javax.swing.GroupLayout(jpnSaidasData);
        jpnSaidasData.setLayout(jpnSaidasDataLayout);
        jpnSaidasDataLayout.setHorizontalGroup(
            jpnSaidasDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSaidasDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnSaidasDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jpnSaidasDataLayout.createSequentialGroup()
                        .addComponent(jcbVendedorRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarRelarorioSaidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(btnImprimirRelatoriosSaidas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletarRelatorioSaidas)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        jpnSaidasDataLayout.setVerticalGroup(
            jpnSaidasDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSaidasDataLayout.createSequentialGroup()
                .addGroup(jpnSaidasDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSaidasDataLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnSaidasDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbVendedorRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarRelarorioSaidas)
                            .addComponent(btnImprimirRelatoriosSaidas)
                            .addComponent(btnDeletarRelatorioSaidas)))
                    .addGroup(jpnSaidasDataLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel7.add(jpnSaidasData, "SaidasData");

        jpnBobinas.setBackground(new java.awt.Color(204, 204, 204));
        jpnBobinas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel5.setText("Bobina");

        txtNumBobinaRelBobina.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        btnBuscarRelatoriosBobina.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBuscarRelatoriosBobina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/magnifier.png"))); // NOI18N
        btnBuscarRelatoriosBobina.setText("Buscar");
        btnBuscarRelatoriosBobina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRelatoriosBobinaActionPerformed(evt);
            }
        });

        btnExibirTudoRelatoriosBobina.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnExibirTudoRelatoriosBobina.setText("Exibir Tudo");
        btnExibirTudoRelatoriosBobina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirTudoRelatoriosBobinaActionPerformed(evt);
            }
        });

        jtbBobinasRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbBobinasRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÚM.BOBINA", "CÓDIGO", "DESCRIÇÃO", "QTD ORIGINAL", "QTD RETIRADA", "QTD ATUAL", "QTD ESTOQUE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbBobinasRelatorios.setSelectionBackground(new java.awt.Color(170, 215, 135));
        jtbBobinasRelatorios.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtbBobinasRelatorios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbBobinasRelatorios.setShowHorizontalLines(false);
        jtbBobinasRelatorios.getTableHeader().setReorderingAllowed(false);
        jtbBobinasRelatorios.setUpdateSelectionOnSort(false);
        jScrollPane3.setViewportView(jtbBobinasRelatorios);
        jtbBobinasRelatorios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtbBobinasRelatorios.getColumnModel().getColumnCount() > 0) {
            jtbBobinasRelatorios.getColumnModel().getColumn(0).setMinWidth(100);
            jtbBobinasRelatorios.getColumnModel().getColumn(0).setMaxWidth(110);
            jtbBobinasRelatorios.getColumnModel().getColumn(1).setMinWidth(100);
            jtbBobinasRelatorios.getColumnModel().getColumn(1).setMaxWidth(110);
            jtbBobinasRelatorios.getColumnModel().getColumn(2).setMinWidth(300);
            jtbBobinasRelatorios.getColumnModel().getColumn(7).setMaxWidth(70);
        }

        jpnOpcoesRelatorioBobinas.setBackground(new java.awt.Color(204, 204, 204));
        jpnOpcoesRelatorioBobinas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jcbInativoRelatorios.setBackground(new java.awt.Color(204, 204, 204));
        jcbInativoRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbInativoRelatorios.setText("Inativo");

        jcbAtivoRelatorios.setBackground(new java.awt.Color(204, 204, 204));
        jcbAtivoRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbAtivoRelatorios.setText("Ativo");

        jcbIncluirPontas.setBackground(new java.awt.Color(204, 204, 204));
        jcbIncluirPontas.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbIncluirPontas.setText("Incluir Pontas");

        javax.swing.GroupLayout jpnOpcoesRelatorioBobinasLayout = new javax.swing.GroupLayout(jpnOpcoesRelatorioBobinas);
        jpnOpcoesRelatorioBobinas.setLayout(jpnOpcoesRelatorioBobinasLayout);
        jpnOpcoesRelatorioBobinasLayout.setHorizontalGroup(
            jpnOpcoesRelatorioBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnOpcoesRelatorioBobinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbInativoRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAtivoRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbIncluirPontas)
                .addContainerGap())
        );
        jpnOpcoesRelatorioBobinasLayout.setVerticalGroup(
            jpnOpcoesRelatorioBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnOpcoesRelatorioBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbInativoRelatorios)
                .addComponent(jcbAtivoRelatorios)
                .addComponent(jcbIncluirPontas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnImprimir.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/printer.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBobinasLayout = new javax.swing.GroupLayout(jpnBobinas);
        jpnBobinas.setLayout(jpnBobinasLayout);
        jpnBobinasLayout.setHorizontalGroup(
            jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBobinasLayout.createSequentialGroup()
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBobinasLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBobinasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(jpnBobinasLayout.createSequentialGroup()
                                .addComponent(txtNumBobinaRelBobina, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnBuscarRelatoriosBobina)
                                .addGap(18, 18, 18)
                                .addComponent(btnExibirTudoRelatoriosBobina))
                            .addComponent(jpnOpcoesRelatorioBobinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir)))
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        jpnBobinasLayout.setVerticalGroup(
            jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBobinasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumBobinaRelBobina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRelatoriosBobina)
                    .addComponent(btnExibirTudoRelatoriosBobina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnBobinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnOpcoesRelatorioBobinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir))
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel7.add(jpnBobinas, "Bobinas");

        jpnCabosRelatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtbCabosRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbCabosRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "BOBINA ATUAL", "QTD EM BOBINAS", "QTD EM PONTAS", "QTD TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbCabosRelatorios.setSelectionBackground(new java.awt.Color(170, 215, 135));
        jtbCabosRelatorios.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtbCabosRelatorios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbCabosRelatorios.setShowHorizontalLines(false);
        jtbCabosRelatorios.getTableHeader().setReorderingAllowed(false);
        jtbCabosRelatorios.setUpdateSelectionOnSort(false);
        jScrollPane5.setViewportView(jtbCabosRelatorios);
        if (jtbCabosRelatorios.getColumnModel().getColumnCount() > 0) {
            jtbCabosRelatorios.getColumnModel().getColumn(0).setResizable(false);
            jtbCabosRelatorios.getColumnModel().getColumn(1).setResizable(false);
            jtbCabosRelatorios.getColumnModel().getColumn(1).setPreferredWidth(350);
            jtbCabosRelatorios.getColumnModel().getColumn(2).setResizable(false);
            jtbCabosRelatorios.getColumnModel().getColumn(3).setResizable(false);
            jtbCabosRelatorios.getColumnModel().getColumn(4).setResizable(false);
            jtbCabosRelatorios.getColumnModel().getColumn(5).setResizable(false);
        }

        txtCodigoRelatorioCabo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtCodigoRelatorioCabo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoRelatorioCaboKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel14.setText("Código");

        btnBuscarCaboRelatorio.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBuscarCaboRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/magnifier.png"))); // NOI18N
        btnBuscarCaboRelatorio.setText("Buscar");
        btnBuscarCaboRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCaboRelatorioActionPerformed(evt);
            }
        });

        btnBuscarTudoCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBuscarTudoCabos.setText("Exibir Tudo");
        btnBuscarTudoCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTudoCabosActionPerformed(evt);
            }
        });

        btnImprimirRelatoriosCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnImprimirRelatoriosCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/printer.png"))); // NOI18N
        btnImprimirRelatoriosCabos.setText("Imprimir");
        btnImprimirRelatoriosCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRelatoriosCabosActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Possuem Bobinas");

        jRadioButton2.setText("Não possuem Bobinas");

        javax.swing.GroupLayout jpnCabosRelatoriosLayout = new javax.swing.GroupLayout(jpnCabosRelatorios);
        jpnCabosRelatorios.setLayout(jpnCabosRelatoriosLayout);
        jpnCabosRelatoriosLayout.setHorizontalGroup(
            jpnCabosRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
            .addGroup(jpnCabosRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCabosRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jpnCabosRelatoriosLayout.createSequentialGroup()
                        .addComponent(txtCodigoRelatorioCabo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCaboRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarTudoCabos))
                    .addGroup(jpnCabosRelatoriosLayout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimirRelatoriosCabos))
        );
        jpnCabosRelatoriosLayout.setVerticalGroup(
            jpnCabosRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCabosRelatoriosLayout.createSequentialGroup()
                .addGroup(jpnCabosRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnCabosRelatoriosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImprimirRelatoriosCabos))
                    .addGroup(jpnCabosRelatoriosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnCabosRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoRelatorioCabo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCaboRelatorio)
                            .addComponent(btnBuscarTudoCabos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnCabosRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jpnCabosRelatorios, "Cabos");

        btnPontasRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnPontasRelatorios.setText("Pontas");
        btnPontasRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontasRelatoriosActionPerformed(evt);
            }
        });

        btnCabosRelatorios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCabosRelatorios.setText("Cabos");
        btnCabosRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabosRelatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaidasRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBobinasRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPontasRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCabosRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaidasRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnBobinasRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPontasRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCabosRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout jpnRelatoriosLayout = new javax.swing.GroupLayout(jpnRelatorios);
        jpnRelatorios.setLayout(jpnRelatoriosLayout);
        jpnRelatoriosLayout.setHorizontalGroup(
            jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnRelatoriosLayout.setVerticalGroup(
            jpnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jpnRelatorios, "jpnRelatorios");

        jmAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/cog.png"))); // NOI18N
        jmAjustes.setText("Ajustes");

        jmUsuariosBarraMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jmUsuariosBarraMenu.setText("Usuários/Vendedores");
        jmUsuariosBarraMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosBarraMenuActionPerformed(evt);
            }
        });
        jmAjustes.add(jmUsuariosBarraMenu);

        jMenuBar1.add(jmAjustes);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icone_cabo.png"))); // NOI18N
        jMenu3.setText("Cabos");

        jmGerenciarCabos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmGerenciarCabos.setText("Gerenciar");
        jmGerenciarCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGerenciarCabosActionPerformed(evt);
            }
        });
        jMenu3.add(jmGerenciarCabos);

        jMenuBar1.add(jMenu3);

        jmInformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/information.png"))); // NOI18N
        jmInformacoes.setText("Informações");
        jmInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmInformacoesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmInformacoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(jPanel2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {

    }
    private void btnRelatoriosAreaDeTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosAreaDeTrabActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "jpnRelatorios");
        txtDataInicialRelatorioSaidas.setText(dataHoje);
        txtDataFinallRelatorioSaidas.setText(dataHoje);

    }//GEN-LAST:event_btnRelatoriosAreaDeTrabActionPerformed

    private void btnCabosAreaDeTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabosAreaDeTrabActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "jpnCabos");

    }//GEN-LAST:event_btnCabosAreaDeTrabActionPerformed

    private void btnRelatoriosCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosCabosActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "jpnRelatorios");
        txtDataInicialRelatorioSaidas.setText(dataHoje);
    }//GEN-LAST:event_btnRelatoriosCabosActionPerformed

    private void jbnCabosRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCabosRelatoriosActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "jpnCabos");

    }//GEN-LAST:event_jbnCabosRelatoriosActionPerformed

    private void jmInformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmInformacoesMouseClicked
        JOptionPane.showMessageDialog(null, "<html>"
                + "<head>"
                + "        <meta charset=\"utf-8\">"
                + "        <style> "
                + "                p{"
                + "                width:400px;"
                + "                text-align: justify;"
                + "                text-indent: 15px;"
                + "                }"
                + "        </style>"
                + "</head>"
                + "<body>"
                + "        <h3>Licença MIT</h3>"
                + "        <br/>"
                + "        <h4>Copyright &copy; 2018 Israel Gomes</h4>"
                + "        <br/>"
                + "        <p>É concedida permissão, gratuitamente, a qualquer pessoa que obtenha uma cópia"
                + "        deste software e dos arquivos de documentação associados a  <i>\"Controle de Cabos\"</i> "
                + "        para conceder sem limitação, os direitos de: usar, copiar, modificar, mesclar,"
                + "        publicar, distribuir, sublicenciar e/ou vender cópias do Software e para permitir"
                + "        que pessoas a quem o Software esteja fornecido, para tal sujeito às seguintes condições:</p>"
                + "        <br/>"
                + "        <p>O aviso de copyright acima e este aviso de permissão devem ser incluídos em todas"
                + "        as cópias ou partes substanciais do Software.</p>"
                + "        <br/>"
                + "        <p>O SOFTWARE É FORNECIDO NO ESTADO EM QUE SE ENCONTRA,SEM NENHUM TIPO DE GARANTIA,"
                + "        EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO ÀS GARANTIAS DE"
                + "        COMERCIALIZAÇÃO, ADEQUAÇÃO A UM FIM ESPECÍFICO E NÃO VIOLAÇÃO. EM NENHUMA "
                + "        CIRCUNSTÂNCIA, OS AUTORES OU PROPRIETÁRIOS DE DIREITOS DE AUTOR PODERÃO SER "
                + "        RESPONSABILIZADOS POR QUAISQUER REIVINDICAÇÕES, DANOS OU OUTRAS RESPONSABILIDADES,"
                + "        QUER EM ACÇÃO DE CONTRATO, DELITO OU DE OUTRA FORMA, DECORRENTES DE,"
                + "        OU EM CONEXÃO COM O SOFTWARE OU O USO OU OUTRAS NEGOCIAÇÕES NO PROGRAMA.</p>"
                + "        <br/>"
                + "        Contatos para Obter Ajuda:<br/>"
                + "        <b>E-mail :</b> israelgomes05@gmail.com<br/>"
                + "        <b>Tel :</b> (65) 98122-5343"
                + "</body> "
                + "</html>", "Informações", -1);
    }//GEN-LAST:event_jmInformacoesMouseClicked

    private void jmUsuariosBarraMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosBarraMenuActionPerformed
        if (!TelaPrincipal.usuarioAlterarDados) {
            TelaLoginInterno verificacao = new TelaLoginInterno(this, true);
            verificacao.setVisible(true);
            if (!verificacao.isDadosCorretos()) {
                return;
            }
        }

        TelaCadastros cadastros = new TelaCadastros(this, true);
        cadastros.setVisible(true);
        this.preencherJComboBoxVendedores(jcbVendedoresCabos, "SELECIONE");
    }//GEN-LAST:event_jmUsuariosBarraMenuActionPerformed

    private void jmGerenciarCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGerenciarCabosActionPerformed
        TelaGerenciarCabos caboGerenciar = new TelaGerenciarCabos(this, true, false, 0, 0);
        caboGerenciar.setVisible(true);

    }//GEN-LAST:event_jmGerenciarCabosActionPerformed

    private void btnSaidasRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidasRelatoriosActionPerformed
        btnSaidasRelatorios.setBackground(Color.YELLOW);
        btnBobinasRelatorios.setBackground(Color.GRAY);
        btnCabosRelatorios.setBackground(Color.GRAY);
        btnPontasRelatorios.setBackground(Color.GRAY);
        CardLayout card2 = (CardLayout) jPanel7.getLayout();
        card2.show(jPanel7, "SaidasData");

        this.preencherJComboBoxVendedores(jcbVendedorRelatorio, "TODOS");
    }//GEN-LAST:event_btnSaidasRelatoriosActionPerformed

    private void btnBobinasRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBobinasRelatoriosActionPerformed
        btnSaidasRelatorios.setBackground(Color.GRAY);
        btnPontasRelatorios.setBackground(Color.GRAY);
        btnCabosRelatorios.setBackground(Color.GRAY);
        btnBobinasRelatorios.setBackground(Color.YELLOW);
        CardLayout card2 = (CardLayout) jPanel7.getLayout();
        card2.show(jPanel7, "Bobinas");

    }//GEN-LAST:event_btnBobinasRelatoriosActionPerformed

    private void btnVerificarPontasCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarPontasCabosActionPerformed
        if (jtbTabelaCabos.getSelectedRow() != -1) {
            this.VerificaPonta(false);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Item Selecionado",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarPontasCabosActionPerformed

    private void txtCodigoCabosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCabosKeyPressed
        qtdBobinaAtual = 0;
        bobinaAtual = 0;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            List<Cabo> caboList = null;
            try {
                int codigo = Integer.parseInt(txtCodigoCabos.getText());
                caboList = CaboDAO.busca(codigo, "s");

                if (caboList.isEmpty()) {
                    this.buscarCaboJanela(caboList);
                } else {
                    txtDescricaoCabos.setText(caboList.get(0).getDescricao());

                    if (caboList.get(0).getPossuiBobina().equals("s")) {
                        txtBubinaCabos.setText("" + caboList.get(0).getIdBobina());
                        codAtualPossuiBobina = "s";
                        bobinaAtual = caboList.get(0).getIdBobina();
                        qtdBobinaAtual = caboList.get(0).getQtdAtual();
                        txtQtdCabos.requestFocus();
                    } else {
                        txtQtdCabos.requestFocus();
                        codAtualPossuiBobina = "n";
                    }
                }

            } catch (NumberFormatException e) {
                this.buscarCaboJanela(caboList);
            }
        }
    }//GEN-LAST:event_txtCodigoCabosKeyPressed

    public void buscarCaboJanela(List<Cabo> caboList) {
        TelaBuscarCabos cabosBuscar = new TelaBuscarCabos(this, true, txtCodigoCabos.getText(), true);
        cabosBuscar.setVisible(true);
        int codigoSelec = cabosBuscar.getCodigoCaboSelec();

        if (codigoSelec != 0) {
            caboList = CaboDAO.busca(codigoSelec, "s");
            txtCodigoCabos.setText("" + caboList.get(0).getCodigoCabo());
            txtDescricaoCabos.setText(caboList.get(0).getDescricao());

            if (caboList.get(0).getPossuiBobina().equals("s")) {
                txtBubinaCabos.setText("" + caboList.get(0).getIdBobina());
                codAtualPossuiBobina = "s";
                bobinaAtual = caboList.get(0).getIdBobina();
                qtdBobinaAtual = caboList.get(0).getQtdAtual();
                txtQtdCabos.requestFocus();
            } else {
                txtQtdCabos.requestFocus();
                codAtualPossuiBobina = "n";
            }
        }
    }

    private void txtBubinaCabosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBubinaCabosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jcbVendedoresCabos.requestFocus();
        }
    }//GEN-LAST:event_txtBubinaCabosKeyPressed

    private void jcbVendedoresCabosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbVendedoresCabosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAdicionarCabos.requestFocus();
        }
    }//GEN-LAST:event_jcbVendedoresCabosKeyPressed

    private void btnAdicionarCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCabosActionPerformed

        double qtdpedida = Conversor.paraDouble(txtQtdCabos.getText(), "Quantidade");
        int codigoCabo = Conversor.paraInt(txtCodigoCabos.getText(), "Código Cabo");
        int numBobinaAtual;
        double estoqueTotal = 0;
        if (qtdpedida == 0) {
            return;
        }

        if (txtCodigoCabos.getText().equals("") || txtDescricaoCabos.getText().equals("")
                || txtQtdCabos.getText().equals("") || jcbVendedoresCabos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos",
                    "Campos Vazios", JOptionPane.WARNING_MESSAGE);
            return;

        } else if (bobinaAtual != 0) {
            numBobinaAtual = Conversor.paraInt(txtBubinaCabos.getText(), "Número da Bobina");
            if (numBobinaAtual == 0) {
                return;
            }

            estoqueTotal = getQtdEstoqueBobina(codigoCabo);

            if (qtdpedida > estoqueTotal) {
                if (JOptionPane.showConfirmDialog(null, "Quantidade Solicitada "
                        + "Maior que o Estoque: " + estoqueTotal + " m disp\n"
                        + "Adicionar mesmo Assim?",
                        "Atenção", JOptionPane.YES_NO_OPTION) != 0) {
                    return;
                }
            }
        }
        Object[] cabo = {txtCodigoCabos.getText(), txtDescricaoCabos.getText(),
            qtdpedida,
            jcbVendedoresCabos.getSelectedItem().toString(),
            bobinaAtual != 0 ? "" + bobinaAtual : "- - - -",
            qtdBobinaAtual != 0 ? "" + qtdBobinaAtual : "- - - -",
            estoqueTotal != 0 ? "" + estoqueTotal : "- - - -"};

        tabelaCabos.addRow(cabo);
        List<PontaCabo> pontaList = PontaDAO.buscaCodigoCabo(codigoCabo, qtdpedida);
        if (!pontaList.isEmpty()) {
            TelaPonta telaPonta = new TelaPonta(this, true, codigoCabo, qtdpedida, false);
            telaPonta.setVisible(true);
            Object object = "<";
            jtbTabelaCabos.setValueAt(object, tabelaCabos.getRowCount() - 1, 7);
        }

        txtCodigoCabos.setText("");
        txtBubinaCabos.setText("");
        txtDescricaoCabos.setText("");
        txtQtdCabos.setText("");

        txtCodigoCabos.requestFocus();

    }//GEN-LAST:event_btnAdicionarCabosActionPerformed

    private void btnLimparCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCabosActionPerformed
        if (JOptionPane.showConfirmDialog(null, "           Limpar a tela?", "Confirmar", JOptionPane.YES_NO_OPTION) == 0) {
            Tabela.limpa(tabelaCabos);
            txtCodigoCabos.setText("");
            txtBubinaCabos.setText("");
            txtDescricaoCabos.setText("");
            txtQtdCabos.setText("");
            jcbVendedoresCabos.setSelectedIndex(0);

            txtCodigoCabos.requestFocus();
        }
    }//GEN-LAST:event_btnLimparCabosActionPerformed

    private void txtQtdCabosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdCabosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            jcbVendedoresCabos.requestFocus();

        }
    }//GEN-LAST:event_txtQtdCabosKeyPressed

    private void btnSalvarSaidaCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSaidaCabosActionPerformed
        // Grava a saída do cabo 
        try {
            subtrairBobina = true;
            if (jtbTabelaCabos.getSelectedRow() != -1) {
                int codigoCabo, NumBobina;
                double qtdSolicitada, qtdAtual;

                List<Vendedor> vendedor = VendedorDAO.busca(jtbTabelaCabos.getValueAt(
                        jtbTabelaCabos.getSelectedRow(), 3).toString());
                String numBobinaAtual = jtbTabelaCabos.getValueAt(jtbTabelaCabos.getSelectedRow(), 4).toString();
                codigoCabo = Conversor.paraInt(
                        jtbTabelaCabos.getValueAt(jtbTabelaCabos.getSelectedRow(), 0).toString(), "Código");
                qtdSolicitada = Conversor.paraDouble(
                        jtbTabelaCabos.getValueAt(jtbTabelaCabos.getSelectedRow(), 2).toString(), "Quantidade");

                if (qtdSolicitada == 0) {
                    return;
                }

                if (!numBobinaAtual.equals("- - - -")) {
                    NumBobina = Integer.parseInt(numBobinaAtual);
                    double qtdBobina = getQtdBobina(NumBobina);

                    if (qtdSolicitada > qtdBobina) {
                        JOptionPane.showMessageDialog(null, "Quantidade Solicitada "
                                + "Maior que a Qtd da Bobina: " + qtdBobina + " m disp\n"
                                + "Será salvo com Saída, mas não afetará a bobina!",
                                "Atenção", JOptionPane.WARNING_MESSAGE);
                    } else {
                        this.VerificaPonta(true);
                        if (subtrairBobina) {
                            //Procedimento para atualizar a bobina diminuindo a quantidade vendida.
                            qtdAtual = Conversor.paraDouble(
                                    jtbTabelaCabos.getValueAt(jtbTabelaCabos.getSelectedRow(), 5).toString(), "Quantidade");
                            qtdAtual = qtdAtual - qtdSolicitada;

                            Cabo cabo = new Cabo();
                            cabo.setIdBobina(NumBobina);
                            cabo.setAtivo("s");
                            cabo.setQtdAtual(qtdAtual);
                            BobinaDAO.atualizar(cabo);
                        }
                    }
                }
                //Procedimento para realizar a gravação no banco de dados
                this.VerificaPonta(true);
                Saida saida = new Saida(codigoCabo, vendedor.get(0).getIdVendedor(), qtdSolicitada, dataHoje);
                if (SaidaDAO.salvar(saida)) {
                    JOptionPane.showMessageDialog(null, "   Saída salva com sucesso",
                            "concluído", JOptionPane.INFORMATION_MESSAGE);
                }
                tabelaCabos.removeRow(jtbTabelaCabos.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "   Nenhum Item Selecionado",
                        "Falha", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "   Nenhum Item Selecionado \n",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnSalvarSaidaCabosActionPerformed

    private void btnBuscarRelarorioSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelarorioSaidasActionPerformed
        //ação para preencher a tabela de saidas por data.
        Tabela.limpa(tabelaRelatorioSaidas);
        List<Saida> saidaList;
        if (jcbVendedorRelatorio.getSelectedItem().toString().equals("TODOS")) {
            saidaList = SaidaDAO.busca(txtDataInicialRelatorioSaidas.getText(),
                    txtDataFinallRelatorioSaidas.getText());
        } else {
            saidaList = SaidaDAO.busca(txtDataInicialRelatorioSaidas.getText(),
                    txtDataFinallRelatorioSaidas.getText(),
                    jcbVendedorRelatorio.getSelectedItem().toString());
        }

        if (saidaList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado para esta Data!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i = 0; i < saidaList.size(); i++) {
                Object[] cabo = {
                    saidaList.get(i).getIdSaida(),
                    saidaList.get(i).getData(),
                    saidaList.get(i).getCodigoCabo(),
                    saidaList.get(i).getDescricao(),
                    saidaList.get(i).getQuantidade(),
                    saidaList.get(i).getNomeVendedor(),
                    saidaList.get(i).getCaboPossuiBobina().equals("s") ? saidaList.get(i).getNumBobina() : " - - - -",};
                tabelaRelatorioSaidas.addRow(cabo);
            }
        }
    }//GEN-LAST:event_btnBuscarRelarorioSaidasActionPerformed

    private void btnExcluirCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCabosActionPerformed
        if (jtbTabelaCabos.getSelectedRow() != -1) {
            tabelaCabos.removeRow(jtbTabelaCabos.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Item para excluir",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirCabosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnAlterar.setVisible(false);
        txtDataAtual.setEditable(false);
        dataHoje = txtDataAtual.getText();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtDataInicialRelatorioSaidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataInicialRelatorioSaidasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarRelarorioSaidas.doClick();
        }
    }//GEN-LAST:event_txtDataInicialRelatorioSaidasKeyPressed

    private void btnBuscarRelatoriosBobinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelatoriosBobinaActionPerformed
        int numBobina = Conversor.paraInt(txtNumBobinaRelBobina.getText(), "Número da bobina");
        this.buscarBobinaRelatorio(numBobina, false);
    }//GEN-LAST:event_btnBuscarRelatoriosBobinaActionPerformed

    private void btnExibirTudoRelatoriosBobinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirTudoRelatoriosBobinaActionPerformed
        this.buscarBobinaRelatorio(1, true);
    }//GEN-LAST:event_btnExibirTudoRelatoriosBobinaActionPerformed

    private void btnDeletarRelatorioSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarRelatorioSaidasActionPerformed

        if (jtbTabelaRelatorioSaidas.getSelectedRow() != -1) {
            int escolha = JOptionPane.showConfirmDialog(null, "    Este procedimento excluirá o registro de saída\n"
                    + "Deseja salvar os dados como uma ponta de Cabo?",
                    "Deletar Saída", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            int numSaida = Integer.parseInt(tabelaRelatorioSaidas.getValueAt(
                    jtbTabelaRelatorioSaidas.getSelectedRow(), 0).toString()
            );

            if (escolha == 0) {
                TelaGerenciarCabos caboGerenciar = new TelaGerenciarCabos(
                        this,
                        true,
                        true,
                        Double.parseDouble(tabelaRelatorioSaidas.getValueAt(
                                jtbTabelaRelatorioSaidas.getSelectedRow(), 4).toString()
                        ),
                        Integer.parseInt(tabelaRelatorioSaidas.getValueAt(
                                jtbTabelaRelatorioSaidas.getSelectedRow(), 2).toString()
                        )
                );
                caboGerenciar.setVisible(true);
                if (SaidaDAO.excluir(numSaida)) {
                    JOptionPane.showMessageDialog(null, "Registro de Saída excluído com secesso",
                            "Falha", JOptionPane.INFORMATION_MESSAGE);
                }
                tabelaRelatorioSaidas.removeRow(jtbTabelaRelatorioSaidas.getSelectedRow());
            } else if (escolha == 1) {
                if (SaidaDAO.excluir(numSaida)) {
                    JOptionPane.showMessageDialog(null, "Registro de Saída excluído com secesso",
                            "Falha", JOptionPane.INFORMATION_MESSAGE);
                }
                tabelaRelatorioSaidas.removeRow(jtbTabelaRelatorioSaidas.getSelectedRow());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Item Selecionado",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarRelatorioSaidasActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String diretorio = "C:/Controle de Cabos/Relatorios/bobinas cadastradas.jasper";
        Relatorio relatorio = new Relatorio();
        relatorio.imprimirRelatorio(jcbAtivoRelatorios.isSelected() ? "s" : "n", diretorio);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnPontasRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontasRelatoriosActionPerformed
        btnSaidasRelatorios.setBackground(Color.GRAY);
        btnBobinasRelatorios.setBackground(Color.GRAY);
        btnCabosRelatorios.setBackground(Color.GRAY);
        btnPontasRelatorios.setBackground(Color.YELLOW);
        CardLayout card2 = (CardLayout) jPanel7.getLayout();
        card2.show(jPanel7, "Pontas");
    }//GEN-LAST:event_btnPontasRelatoriosActionPerformed

    private void btnBuscarRelatoriosPontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRelatoriosPontasActionPerformed
        try {
            int codigoCabo = Integer.parseInt(txtCodigoRelatoriosPontas.getText());
            txtTotalPontasRelatoriosPontas.setText("");
            Tabela.limpa(tabelaRelatorioPontas);

            if (codigoCabo != 0 && !txtCodigoRelatoriosPontas.getText().equals("")) {
                List<PontaCabo> pontaList = PontaDAO.buscaCodigoCabo(codigoCabo, 0);

                if (pontaList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "     Nenhum Registro encontrado!\n",
                            "Falha", JOptionPane.WARNING_MESSAGE);
                } else {
                    txtTotalPontasRelatoriosPontas.setText("" + this.getQtdPonta(codigoCabo));
                    this.preencherTabelaPonta(pontaList);
                }
            }
        } catch (Exception e) {
            Cabo.buscarCabo(txtCodigoRelatoriosPontas);
        }
    }//GEN-LAST:event_btnBuscarRelatoriosPontasActionPerformed

    private void txtCodigoRelatoriosPontasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoRelatoriosPontasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarRelatoriosPontas.doClick();
        }
    }//GEN-LAST:event_txtCodigoRelatoriosPontasKeyPressed

    private void btnImprimirRelatoriosPontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatoriosPontasActionPerformed
        String diretorio = "C:/Controle de Cabos/Relatorios/Pontas.jasper";
        int codigo = Conversor.paraInt(txtCodigoRelatoriosPontas.getText(), "Código");
        if (codigo != 0) {
            Relatorio relatorio = new Relatorio();
            relatorio.imprimirRelatorio(codigo, diretorio);
        }
    }//GEN-LAST:event_btnImprimirRelatoriosPontasActionPerformed

    private void btnCabosRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabosRelatoriosActionPerformed
        btnSaidasRelatorios.setBackground(Color.GRAY);
        btnBobinasRelatorios.setBackground(Color.GRAY);
        btnCabosRelatorios.setBackground(Color.YELLOW);
        btnPontasRelatorios.setBackground(Color.GRAY);
        CardLayout card2 = (CardLayout) jPanel7.getLayout();
        card2.show(jPanel7, "Cabos");
    }//GEN-LAST:event_btnCabosRelatoriosActionPerformed

    private void btnBuscarCaboRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCaboRelatorioActionPerformed
        try {
            int codigoCabo = Integer.parseInt(txtCodigoRelatorioCabo.getText());
            if (codigoCabo != 0) {
                this.preecherTabelaCaboRelatorio(CaboDAO.busca(codigoCabo, "s"));
            }
        } catch (NumberFormatException e) {
            Cabo.buscarCabo(txtCodigoRelatorioCabo);
        }
    }//GEN-LAST:event_btnBuscarCaboRelatorioActionPerformed

    private void txtCodigoRelatorioCaboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoRelatorioCaboKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarCaboRelatorio.doClick();
        }
    }//GEN-LAST:event_txtCodigoRelatorioCaboKeyPressed

    private void btnBuscarTudoCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTudoCabosActionPerformed
        if (jRadioButton1.isSelected()) {
            this.preecherTabelaCaboRelatorio(CaboDAO.buscaTudo());
        } else {
            this.preecherTabelaCaboRelatorio(CaboDAO.buscaTudoSemBobina());
        }
    }//GEN-LAST:event_btnBuscarTudoCabosActionPerformed

    private void btnImprimirRelatoriosCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatoriosCabosActionPerformed
        if (!txtCodigoRelatorioCabo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Não é possível imprimir este relatório!\n",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            String diretorio;
            if (jRadioButton1.isSelected()) {
                diretorio = "C:/Controle de Cabos/Relatorios/GeralQuePossuemBobinas.jasper";
            } else {
                diretorio = "C:/Controle de Cabos/Relatorios/GeralQueNaoPossuemBobinas.jasper";
            }
            Relatorio relatorio = new Relatorio();
            relatorio.imprimirRelatorio("", diretorio);
        }
    }//GEN-LAST:event_btnImprimirRelatoriosCabosActionPerformed

    private void txtDataFinallRelatorioSaidasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataFinallRelatorioSaidasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarRelarorioSaidas.doClick();
        }
    }//GEN-LAST:event_txtDataFinallRelatorioSaidasKeyPressed

    private void btnImprimirRelatoriosSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRelatoriosSaidasActionPerformed
        btnBuscarRelarorioSaidas.doClick();
        String nomeVendedor = jcbVendedorRelatorio.getSelectedItem().toString();
        String diretorio;
        HashMap<String, String> parametros = new HashMap<>();
        parametros.put("dataInicio", txtDataInicialRelatorioSaidas.getText());
        parametros.put("dataFim", txtDataFinallRelatorioSaidas.getText());

        if (nomeVendedor.equals("TODOS")) {
            diretorio = "C:/Controle de Cabos/Relatorios/Saidas.jasper";
        } else {
            diretorio = "C:/Controle de Cabos/Relatorios/SaidasPorVendedor.jasper";
            parametros.put("nomeVendedor", nomeVendedor);
        }

        Relatorio relatorio = new Relatorio();
        relatorio.imprimirRelatorio(parametros, diretorio);
    }//GEN-LAST:event_btnImprimirRelatoriosSaidasActionPerformed

    private void btnImprimirGeralpontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirGeralpontasActionPerformed
        String diretorio = "C:/Controle de Cabos/Relatorios/PontasGeral.jasper";
        Relatorio relatorio = new Relatorio();
        relatorio.imprimirRelatorio(0,diretorio);
    }//GEN-LAST:event_btnImprimirGeralpontasActionPerformed

    public void preecherTabelaCaboRelatorio(List<Cabo> listCabo) {
        if (listCabo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cabo não encontrado!", "Falha",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            Tabela.limpa(tabelaRelatorioCabos);
            for (int i = 0; i < listCabo.size(); i++) {
                double qtdTotalBobina = this.getQtdEstoqueBobina(listCabo.get(i).getCodigoCabo());
                double qtdTotalPonta = this.getQtdPonta(listCabo.get(i).getCodigoCabo());
                Object[] caboTabela = {
                    listCabo.get(i).getCodigoCabo(),
                    listCabo.get(i).getDescricao(),
                    listCabo.get(i).getIdBobina(),
                    qtdTotalBobina,
                    qtdTotalPonta,
                    qtdTotalBobina + qtdTotalPonta
                };
                tabelaRelatorioCabos.addRow(caboTabela);
            }
        }
    }

    public void preencherTabelaPonta(List<PontaCabo> pontaList) {
        Tabela.limpa(tabelaRelatorioPontas);
        for (int i = 0; i < pontaList.size(); i++) {
            Object[] LinhaPonta = {
                pontaList.get(i).getIdPontaCabo(),
                pontaList.get(i).getCodigoCabo(),
                pontaList.get(i).getDescricao(),
                pontaList.get(i).getQuantidade(),
                pontaList.get(i).getLocal()
            };
            tabelaRelatorioPontas.addRow(LinhaPonta);
        }
    }

    public void VerificaPonta(boolean subtrair) {
        try {
            Object txt = tabelaCabos.getValueAt(jtbTabelaCabos.getSelectedRow(), 7);

            if (txt != null && txt.toString().equals("<")) {
                int codigoCabo = Conversor.paraInt(tabelaCabos.getValueAt(
                        jtbTabelaCabos.getSelectedRow(), 0).toString(), "");
                double qtd = Conversor.paraDouble(tabelaCabos.getValueAt(
                        jtbTabelaCabos.getSelectedRow(), 2).toString(), "");

                TelaPonta telaPonta = new TelaPonta(this, true, codigoCabo, qtd, subtrair);
                telaPonta.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "     Nenhum Item Selecionado \n",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public double getQtdPonta(int codigo) {
        double totalPonta = 0;
        List<PontaCabo> listPonta = PontaDAO.buscaCodigoCabo(codigo, 0);

        if (listPonta.isEmpty()) {
            return totalPonta;
        } else {

            for (PontaCabo list : listPonta) {
                totalPonta += list.getQuantidade();
            }
            return totalPonta;
        }

    }

    public double getQtdEstoqueBobina(int codigo) {
        double qtdEstoque = 0;
        List<Cabo> bobinaList = BobinaDAO.buscaPorCodigoCabo(codigo);

        if (bobinaList.isEmpty()) {
            return qtdEstoque;
        } else {

            for (Cabo list : bobinaList) {
                qtdEstoque += list.getQtdAtual();
            }
            return qtdEstoque;
        }
    }

    public double getQtdBobina(int numBobina) {
        double qtdEstoque = 0;
        List<Cabo> bobinaList = BobinaDAO.buscaPorNumBobina(numBobina);

        if (bobinaList.isEmpty()) {
            return qtdEstoque;
        } else {

            for (Cabo list : bobinaList) {
                qtdEstoque += list.getQtdAtual();
            }
            return qtdEstoque;
        }
    }

    public void buscarBobinaRelatorio(int numBobina, boolean BuscaTudo) {
        double qtdEstoque;
        int codigo;
        List<Cabo> listBobina;

        if (numBobina != 0) {
            if (BuscaTudo) {
                listBobina = BobinaDAO.buscaTudoBobina();
            } else {
                listBobina = BobinaDAO.buscaPorNumBobina(numBobina);
            }

            if (listBobina.isEmpty()) {
                JOptionPane.showMessageDialog(null, "   Bobina não encontrada!",
                        "Falha", JOptionPane.INFORMATION_MESSAGE);
            } else {

                Tabela.limpa(tabelaRelatorioBobinas);

                for (int i = 0; i < listBobina.size(); i++) {
                    if (jcbAtivoRelatorios.isSelected()) {
                        if (listBobina.get(i).getAtivo().equals("n")) {
                            continue;
                        }
                    } else {
                        if (listBobina.get(i).getAtivo().equals("s")) {
                            continue;
                        }
                    }
                    codigo = listBobina.get(i).getCodigoCabo();
                    qtdEstoque = this.getQtdEstoqueBobina(codigo);

                    if (jcbIncluirPontas.isSelected()) {
                        qtdEstoque += this.getQtdPonta(codigo);
                    }

                    Object bobinaTabela[] = {
                        listBobina.get(i).getIdBobina(), codigo,
                        listBobina.get(i).getDescricao(),
                        listBobina.get(i).getQtdOriginal(),
                        listBobina.get(i).getQtdOriginal() - listBobina.get(i).getQtdAtual(),
                        listBobina.get(i).getQtdAtual(), qtdEstoque,
                        listBobina.get(i).getAtivo().equals("s") ? "Ativo" : "inativo"
                    };
                    tabelaRelatorioBobinas.addRow(bobinaTabela);
                }
            }
        }
    }

    private void preencherJComboBoxVendedores(JComboBox jcb, String primeiroItem) {
        List<Vendedor> vendedorList = VendedorDAO.buscaTudo();
        jcb.removeAllItems();
        jcb.addItem(primeiroItem);

        for (int i = 0; i < vendedorList.size(); i++) {
            jcb.addItem(vendedorList.get(i).getNome());
        }
    }

    public final void alterarIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
                "/br/com/sisnet/controledecabos/telas/imagens/icone_cabo.png")));
    }

    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;

                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(TelaPrincipal.class
                        .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                TelaPrincipal dialog = new TelaPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        if (JOptionPane.showConfirmDialog(null, "    Deseja sair da Aplicação?",
                                "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
                            System.exit(0);
                        }
                    }
                });
                dialog.setVisible(true);
            });
        } catch (Throwable th) {
            JOptionPane.showMessageDialog(null, "     Falha não tratada Detectada: \n"
                    + th.getMessage(), "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCabos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBobinasRelatorios;
    private javax.swing.JButton btnBuscarCaboRelatorio;
    private javax.swing.JButton btnBuscarRelarorioSaidas;
    private javax.swing.JButton btnBuscarRelatoriosBobina;
    private javax.swing.JButton btnBuscarRelatoriosPontas;
    private javax.swing.JButton btnBuscarTudoCabos;
    private javax.swing.JButton btnCabosAreaDeTrab;
    private javax.swing.JButton btnCabosCabos;
    private javax.swing.JButton btnCabosRelatorios;
    private javax.swing.JButton btnDeletarRelatorioSaidas;
    private javax.swing.JButton btnExcluirCabos;
    private javax.swing.JButton btnExibirTudoRelatoriosBobina;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirGeralpontas;
    private javax.swing.JButton btnImprimirRelatoriosCabos;
    private javax.swing.JButton btnImprimirRelatoriosPontas;
    private javax.swing.JButton btnImprimirRelatoriosSaidas;
    private javax.swing.JButton btnLimparCabos;
    private javax.swing.JButton btnPontasRelatorios;
    private javax.swing.JButton btnRelatoriosAreaDeTrab;
    private javax.swing.JButton btnRelatoriosCabos;
    private javax.swing.JButton btnSaidasRelatorios;
    private javax.swing.JButton btnSalvarSaidaCabos;
    private javax.swing.JButton btnVerificarPontasCabos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbnCabosRelatorios;
    private javax.swing.JButton jbnRelatorios;
    private javax.swing.JCheckBox jcbAtivoRelatorios;
    private javax.swing.JCheckBox jcbInativoRelatorios;
    private javax.swing.JCheckBox jcbIncluirPontas;
    private javax.swing.JComboBox<String> jcbVendedorRelatorio;
    private javax.swing.JComboBox<String> jcbVendedoresCabos;
    private javax.swing.JMenu jmAjustes;
    private javax.swing.JMenuItem jmGerenciarCabos;
    private javax.swing.JMenu jmInformacoes;
    private javax.swing.JMenuItem jmUsuariosBarraMenu;
    private javax.swing.JPanel jpnBobinas;
    private javax.swing.JPanel jpnCabos;
    private javax.swing.JPanel jpnCabosRelatorios;
    private javax.swing.JPanel jpnOpcoesRelatorioBobinas;
    private javax.swing.JPanel jpnPontasRelatorios;
    private javax.swing.JPanel jpnRelatorios;
    private javax.swing.JPanel jpnSaidasData;
    private javax.swing.JTable jtbBobinasRelatorios;
    private javax.swing.JTable jtbCabosRelatorios;
    private javax.swing.JTable jtbPontas;
    private javax.swing.JTable jtbTabelaCabos;
    private javax.swing.JTable jtbTabelaRelatorioSaidas;
    private javax.swing.JFormattedTextField txtBubinaCabos;
    private javax.swing.JTextField txtCodigoCabos;
    private javax.swing.JTextField txtCodigoRelatorioCabo;
    private javax.swing.JTextField txtCodigoRelatoriosPontas;
    private javax.swing.JFormattedTextField txtDataAtual;
    private javax.swing.JFormattedTextField txtDataFinallRelatorioSaidas;
    private javax.swing.JFormattedTextField txtDataInicialRelatorioSaidas;
    private javax.swing.JTextField txtDescricaoCabos;
    private javax.swing.JTextField txtNumBobinaRelBobina;
    private javax.swing.JTextField txtQtdCabos;
    private javax.swing.JTextField txtTotalPontasRelatoriosPontas;
    // End of variables declaration//GEN-END:variables
}