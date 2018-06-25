/**
 * @created  17/03/2018
 * @lastModified 17/03/2018
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import javax.swing.table.DefaultTableModel;

/**
 * Classe utilitária para manipular tabelas.
 *
 * @author Israel Gomes
 * @version 1.0
 * @since 1.0
 */
public class Tabela {

    /**
     * Limpa todas as linhas de uma tabela.
     *
     * @param tabela DefaultTableModel
     */
    public static void limpa(DefaultTableModel tabela) {
        for (; tabela.getRowCount() != 0;) {
            if (tabela.getRowCount() != 0) {
                tabela.removeRow(0);
            }
        }
    } 
}
