/**
 * @created  17/03/2018
 * @lastModified 07/07/2018
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * Classe utilitária para manipular tabelas.
 *
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class Tabela {

    private static final DefaultTableCellRenderer align;

    static {
        align = new DefaultTableCellRenderer();
    }

    /**
     * Limpa todas as linhas de uma tabela.
     *
     * @param tabela DefaultTableModel
     */
    public static void limpar(DefaultTableModel tabela) {
        for (; tabela.getRowCount() != 0;) {
            if (tabela.getRowCount() != 0) {
                tabela.removeRow(0);
            }
        }
    }

    /**
     * Alinha os dados de uma coluna a direita.
     *
     * @param tabela
     * @param colunas
     */
    public static void alinharColunaDireita(JTable tabela, int[] colunas) {
        for (int coluna : colunas) {
            align.setHorizontalAlignment(SwingConstants.RIGHT);
            tabela.getColumnModel().getColumn(coluna).setCellRenderer(align);
            tabela.setShowVerticalLines(true);
        }
    }

}
