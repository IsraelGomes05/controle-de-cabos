 /** 
 * @created  15/04/2018
 * @lastModified 21/04/2018 
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
 * Classe utilitária para exibir relatórios.
 * @author Israel Gomes
 * @version 1.0
 * @since 1.0
 */
public class Relatorio {
    
    /**
     * exibe um relatório externo.
     * 
     * @param parametro String - parametro para filtrar a consulta.
     * @param diretorio String - local onde o relatorio está.
     */
    public void exibirRelatorio(String parametro, String diretorio) {
        int confirma = JOptionPane.showConfirmDialog(null, "   Confirma a impressão"
                + " deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try (Connection conexao = ConnectionFactory.getConexao()) {

                HashMap filtro = new HashMap();
                filtro.put("status", parametro);

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

    /**
     * exibe um relatório externo.
     * 
     * @param parametro int - parametro para filtrar a consulta.
     * @param diretorio String - local onde o relatorio está.
     */
    public void exibirRelatorio(int parametro, String diretorio) {
        int confirma = JOptionPane.showConfirmDialog(null, "   Confirma a impressão"
                + " deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try (Connection conexao = ConnectionFactory.getConexao()) {

                HashMap filtro = new HashMap();
                filtro.put("codigo", parametro);

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
    
    /**
     * exibe um relatório externo.
     * 
     * @param parametros HashMap - parametros para filtrar a consulta.
     * @param diretorio String - local onde o relatorio está.
     */
    public void exibirRelatorio(HashMap parametros, String diretorio) {
        int confirma = JOptionPane.showConfirmDialog(null, "   Confirma a impressão"
                + " deste relatório?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try (Connection conexao = ConnectionFactory.getConexao()) {

                JasperPrint print = JasperFillManager.fillReport(diretorio, parametros, conexao);

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
