/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.telas;

import br.com.sisnet.controledecabos.classes.Cabo;
import br.com.sisnet.controledecabos.classes.PontaCabo;
import br.com.sisnet.controledecabos.classes.utilitarias.Conversor;
import br.com.sisnet.controledecabos.classes.utilitarias.Tabela;
import br.com.sisnet.controledecabos.conexaobd.CaboDAO;
import br.com.sisnet.controledecabos.conexaobd.PontaDAO;
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
 * @created 06/03/2018
 * @lastModified 07/03/2018
 * @version 1.3
 *
 * @Function...
 */
public class TelaBuscarCabos extends javax.swing.JDialog {

    private int codigoSelecionado = 0;
    DefaultTableModel tabelaBusca;

    public TelaBuscarCabos(java.awt.Frame parent, boolean modal, String parametros, boolean inserir) {
        super(parent, modal);
        initComponents();
        setAcessibilidade();
        btnInserir.setEnabled(inserir);
        tabelaBusca = (DefaultTableModel) jtbBusca.getModel();
        txtParametrosBusca.setText(parametros);
        btnBuscarBuscarCabos.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtParametrosBusca = new javax.swing.JTextField();
        btnBuscarBuscarCabos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbBusca = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnbuscarPontas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        txtParametrosBusca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtParametrosBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtParametrosBuscaKeyPressed(evt);
            }
        });

        btnBuscarBuscarCabos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnBuscarBuscarCabos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-pesquisar-26 preto.png"))); // NOI18N
        btnBuscarBuscarCabos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarBuscarCabos.setRolloverEnabled(true);
        btnBuscarBuscarCabos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-pesquisar-26 verde.png"))); // NOI18N
        btnBuscarBuscarCabos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBuscarCabosActionPerformed(evt);
            }
        });

        jtbBusca.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtbBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO", "QUANTIDADE", "BOBINA", "LOCAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbBusca.setSelectionBackground(new java.awt.Color(170, 215, 135));
        jtbBusca.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtbBusca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtbBusca.setShowHorizontalLines(false);
        jtbBusca.getTableHeader().setReorderingAllowed(false);
        jtbBusca.setUpdateSelectionOnSort(false);
        jtbBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbBuscaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbBusca);
        if (jtbBusca.getColumnModel().getColumnCount() > 0) {
            jtbBusca.getColumnModel().getColumn(0).setMinWidth(80);
            jtbBusca.getColumnModel().getColumn(0).setMaxWidth(90);
            jtbBusca.getColumnModel().getColumn(1).setMinWidth(240);
            jtbBusca.getColumnModel().getColumn(2).setMinWidth(100);
            jtbBusca.getColumnModel().getColumn(2).setMaxWidth(110);
            jtbBusca.getColumnModel().getColumn(3).setMinWidth(60);
            jtbBusca.getColumnModel().getColumn(3).setMaxWidth(70);
            jtbBusca.getColumnModel().getColumn(4).setMinWidth(80);
            jtbBusca.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        btnInserir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-login-arredondado-à-direita-32.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        btnInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInserirKeyPressed(evt);
            }
        });

        btnbuscarPontas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnbuscarPontas.setText("Buscar Pontas");
        btnbuscarPontas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarPontasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtParametrosBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBuscarBuscarCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscarPontas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInserir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnbuscarPontas)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscarBuscarCabos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtParametrosBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void setAcessibilidade() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                setVisible(false);
            }
        });
    }

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    private void txtParametrosBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParametrosBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscarBuscarCabos.doClick();
        }
    }//GEN-LAST:event_txtParametrosBuscaKeyPressed

    private void jtbBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            btnInserir.requestFocus();
        }
    }//GEN-LAST:event_jtbBuscaKeyPressed

    private void btnBuscarBuscarCabosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBuscarCabosActionPerformed
        List<Cabo> caboList;

        try {
            int codigo = Integer.parseInt(txtParametrosBusca.getText());
            caboList = CaboDAO.busca(codigo, "s");
            if (caboList.isEmpty()) {
                Tabela.limpa(tabelaBusca);
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado",
                        "Falha", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Tabela.limpa(tabelaBusca);
                Object[] cabo = {caboList.get(0).getCodigoCabo(), caboList.get(0).getDescricao(),
                    caboList.get(0).getPossuiBobina().equals("s") ? caboList.get(0).getQtdAtual() : " - - - -",
                    caboList.get(0).getPossuiBobina().equals("s") ? caboList.get(0).getIdBobina() : " - - - -", " - - - -"};
                tabelaBusca.addRow(cabo);
                jtbBusca.requestFocus();
            }

            /*Caso não seja um Código haverá a busca pela descrição*/
        } catch (NumberFormatException ex) {
            caboList = CaboDAO.buscaPorDescricao(txtParametrosBusca.getText().toUpperCase());

            if (caboList.isEmpty()) {
                Tabela.limpa(tabelaBusca);
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado",
                        "Falha", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Tabela.limpa(tabelaBusca);
                for (int i = 0; i < caboList.size(); i++) {
                    Object[] cabo = {caboList.get(i).getCodigoCabo(), caboList.get(i).getDescricao(),
                        caboList.get(i).getPossuiBobina().equals("s") ? caboList.get(i).getQtdAtual() : " - - - -",
                        caboList.get(i).getPossuiBobina().equals("s") ? caboList.get(i).getIdBobina() : " - - - -", " - - - -"};
                    tabelaBusca.addRow(cabo);
                }
                jtbBusca.requestFocus();
            }
        }
    }//GEN-LAST:event_btnBuscarBuscarCabosActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        if (jtbBusca.getSelectedRow() != -1) {
            codigoSelecionado = Conversor.paraInt(
                    jtbBusca.getValueAt(jtbBusca.getSelectedRow(), 0).toString(), "Código");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Item Selecionado",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnbuscarPontasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarPontasActionPerformed
        int codigo = Conversor.paraInt(txtParametrosBusca.getText(), "Código");

        if (codigo == 0) {
            return;
        }

        List<PontaCabo> pontaList = PontaDAO.buscaCodigoCabo(codigo, 0);

        if (pontaList.isEmpty()) {
            Tabela.limpa(tabelaBusca);
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado",
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Tabela.limpa(tabelaBusca);

            for (int i = 0; i < pontaList.size(); i++) {
                Object[] cabo = {pontaList.get(i).getCodigoCabo(), pontaList.get(i).getDescricao(),
                    pontaList.get(i).getQuantidade(), "-----", pontaList.get(i).getLocal()
                };
                tabelaBusca.addRow(cabo);
            }
        }
    }//GEN-LAST:event_btnbuscarPontasActionPerformed

    private void btnInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInserirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jtbBusca.requestFocus();
        }
    }//GEN-LAST:event_btnInserirKeyPressed

    public int getCodigoCaboSelec() {
        return codigoSelecionado;
    }

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
            java.util.logging.Logger.getLogger(TelaBuscarCabos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            TelaBuscarCabos dialog = new TelaBuscarCabos(new javax.swing.JFrame(), true, "", true);
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
    private javax.swing.JButton btnBuscarBuscarCabos;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnbuscarPontas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbBusca;
    private javax.swing.JTextField txtParametrosBusca;
    // End of variables declaration//GEN-END:variables

}
