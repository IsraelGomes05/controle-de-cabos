/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import javax.swing.table.DefaultTableModel;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 17/03/2018
 * @lastModified 17/03/2018
 * @version 1.0
 *
 * @Function Limpar as linhas de uma tabela Qualquer...
 */
public class Tabela {

    public static void limpa(DefaultTableModel tabela) {
        for (; tabela.getRowCount() != 0;) {
            if (tabela.getRowCount() != 0) {
                tabela.removeRow(0);
            }
        }
    }
}
