package br.com.sisnet.controledecabos.classes.utilitarias;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 * Permite que as linhas de uma tabela, mudem de cor de acordo com
 * a condição estipulada.<br>
 *
 * created      07/07/2018<br>
 * lastModified 08/07/2018
 *
 * @author      Israel Gomes
 * @version     1.0
 * @since       3.0.0
 */
public class RenderizadorTabela implements TableCellRenderer {

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    boolean tabela;

    public RenderizadorTabela(boolean tabela) {
        this.tabela = tabela;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, 7);

        Color foreground = new Color(51, 51, 51), background = null;

        if (isSelected) {
            foreground = new Color(51, 51, 51);
            background = new Color(37, 211, 124);
        } else {
            Object ref = table.getValueAt(row, 7);
            if (ref != null && ref == "<") {
                background = new Color(65, 163, 237);
            }

        }
        renderer.setForeground(foreground);
        renderer.setBackground(background);
        return renderer;
    }
}
