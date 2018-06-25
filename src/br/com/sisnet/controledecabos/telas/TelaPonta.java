/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.telas;

import br.com.sisnet.controledecabos.classes.PontaCabo;
import br.com.sisnet.controledecabos.classes.utilitarias.Conversor;
import br.com.sisnet.controledecabos.conexaobd.PontaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 24/03/2018
 * @lastModified 24/06/2018
 * @version 2.0
 *
 * @Function...
 */
public class TelaPonta extends javax.swing.JDialog {

    double qtdSolicitada;
    
    DefaultTableModel tabelaPonta;

    public  TelaPonta(java.awt.Frame parent, boolean modal, int codigo, double qtd, boolean btnAtivo) {
        super(parent, modal);
        this.setAcessibilidade();
        
        initComponents();
        
        btnFechar.requestFocus();
        btnSubtrair.setEnabled(btnAtivo);
        qtdSolicitada = qtd;
        txtQtd.setText("" + qtd);
        
        List<PontaCabo> pontaList = PontaDAO.buscaCodigoCabo(codigo, qtd);

        if (!pontaList.isEmpty()) {
            tabelaPonta = (DefaultTableModel) jtbPonta.getModel();
            for (int i = 0; i < pontaList.size(); i++) {
                Object[] ponta = {pontaList.get(i).getIdPontaCabo(),
                    pontaList.get(i).getCodigoCabo(), pontaList.get(i).getQuantidade(),
                    pontaList.get(i).getLocal()};
                tabelaPonta.addRow(ponta);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPonta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnSubtrair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PONTAS DISPONÍVEIS");
        setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(153, 255, 153));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jtbPonta.setBackground(new java.awt.Color(204, 255, 204));
        jtbPonta.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jtbPonta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM. PONTA", "CÓDIGO", "QTD", "LOCAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbPonta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbPonta.setShowHorizontalLines(false);
        jtbPonta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbPonta);
        if (jtbPonta.getColumnModel().getColumnCount() > 0) {
            jtbPonta.getColumnModel().getColumn(0).setResizable(false);
            jtbPonta.getColumnModel().getColumn(1).setResizable(false);
            jtbPonta.getColumnModel().getColumn(2).setResizable(false);
            jtbPonta.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Quantidade");

        txtQtd.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        btnSubtrair.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnSubtrair.setText("Subtrair");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("PONTAS DISPONÍVEIS");

        btnFechar.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32.png"))); // NOI18N
        btnFechar.setContentAreaFilled(false);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFechar.setRolloverEnabled(true);
        btnFechar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32 amarelo.png"))); // NOI18N
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        btnFechar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnFecharKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel2)
                .addGap(160, 160, 160)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    
    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        qtdSolicitada = Conversor.paraDouble(txtQtd.getText(), "Quantidade");
        
        if (jtbPonta.getSelectedRow() != -1 && qtdSolicitada != 0 ) {
            int numPonta = Conversor.paraInt(
                    tabelaPonta.getValueAt(jtbPonta.getSelectedRow(), 0).toString(), "");
            double qtdPonta = Conversor.paraDouble(
                    tabelaPonta.getValueAt(jtbPonta.getSelectedRow(), 2).toString(), "");
            
            if (qtdPonta == qtdSolicitada) {
                PontaDAO.excluir(numPonta);
                TelaPrincipal.subtrairBobina = false;
                this.dispose();
                return;
                
            } else if (qtdSolicitada > qtdPonta){
                JOptionPane.showMessageDialog(null, "Quantidade da Ponta Insulficiente",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            qtdPonta = qtdPonta - qtdSolicitada;

            PontaCabo pontaCabo = new PontaCabo();
            pontaCabo.setIdPontaCabo(numPonta);
            pontaCabo.setQuantidade(qtdPonta);
            pontaCabo.setLocal(tabelaPonta.getValueAt(jtbPonta.getSelectedRow(), 3).toString());

            PontaDAO.atualizar(pontaCabo);
            this.dispose();
            TelaPrincipal.subtrairBobina = false;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item para continuar",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnFecharKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFecharKeyTyped
         btnFechar.doClick();
    }//GEN-LAST:event_btnFecharKeyTyped

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaPonta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            TelaPonta dialog = new TelaPonta(new javax.swing.JFrame(), true, 0, 0, false);
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
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbPonta;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

}
