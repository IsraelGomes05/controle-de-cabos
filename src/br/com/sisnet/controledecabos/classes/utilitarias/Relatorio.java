 /**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import br.com.sisnet.controledecabos.conexaobd.ConnectionFactory;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Israel Gomes Da Silva
 * @created  15/04/2018
 * @lastModified 21/04/2018 
 * @version 3.0
 *
 * @Function Imprimi relatórios utilizando jasperViwer.
 */
public class Relatorio {
    
    public void imprimirRelatorio(String paramentro, String diretorio) {
        int confirma = JOptionPane.showConfirmDialog(null, "   Confirma a impressão"
                + " deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try (Connection conexao = ConnectionFactory.getConexao()) {

                HashMap filtro = new HashMap();
                filtro.put("status", paramentro);

                JasperPrint print = JasperFillManager.fillReport(diretorio, filtro, conexao);

                JasperViewer jv = new JasperViewer(print,false);
                jv.setVisible(true);
                jv.setTitle("Controle de Cabos Relatórios");
                jv.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
                        "/br/com/sisnet/controledecabos/telas/imagens/icone_cabo.png")));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao imprimir \n"
                        + e.getMessage(), "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void imprimirRelatorio(int paramentro, String diretorio) {
        int confirma = JOptionPane.showConfirmDialog(null, "   Confirma a impressão"
                + " deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try (Connection conexao = ConnectionFactory.getConexao()) {

                HashMap filtro = new HashMap();
                filtro.put("codigo", paramentro);

                JasperPrint print = JasperFillManager.fillReport(diretorio, filtro, conexao);

                JasperViewer jv = new JasperViewer(print, false);
                jv.setVisible(true);
                jv.setTitle("Controle de Cabos Relatórios");
                jv.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
                        "/br/com/sisnet/controledecabos/telas/imagens/icone_cabo.png")));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao imprimir \n"
                        + e.getMessage(), "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void imprimirRelatorio(HashMap paramentros, String diretorio) {
        int confirma = JOptionPane.showConfirmDialog(null, "   Confirma a impressão"
                + " deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try (Connection conexao = ConnectionFactory.getConexao()) {

                JasperPrint print = JasperFillManager.fillReport(diretorio, paramentros, conexao);

                JasperViewer jv = new JasperViewer(print, false);
                jv.setVisible(true);
                jv.setTitle("Controle de Cabos Relatórios");
                jv.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
                        "/br/com/sisnet/controledecabos/telas/imagens/icone_cabo.png")));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao imprimir \n"
                        + e.getMessage(), "Falha", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
