/** 
 * @created  11/03/2018
 * @lastModified 28/05/2018 
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import javax.swing.JOptionPane;

/**
 * Classe utilitária para converter String em números.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class Conversor {
    
    /**
     * Coverte o texto passado como parâmetro para int.
     * 
     * @param txt String - Texto para conversão para inteiro.
     * @param campo String - Nome do campo (JTextField) será exibido na mensagem de erro caso
     *       não seja possível realizar a conversão.
     * 
     * @return int ou 0 caso não seja possível realizar a conversão.
     */
    public static int paraInt(String txt, String campo) {
        try {
            Integer inteiro = Integer.parseInt(txt);
            return inteiro;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,  "  " + campo + " Inválido, Verifique!",
                    "Número Inválido", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

    /**
     * Coverte o texto passado como parâmetro para double.
     * 
     * @param txt String - Texto para conversão para double.
     * @param campo String - Nome do campo (JTextField) será exibido na mensagem de erro caso
     *       não seja possível realizar a conversão.
     * 
     * @return double ou 0 caso não seja possível realizar a conversão.
     */
    public static double paraDouble(String txt, String campo) {
        double numero;
        try {
            numero = Double.parseDouble(txt);
            return numero;
        } catch (NumberFormatException ex) {
            try {
                numero = Double.parseDouble(txt.replaceAll(",", "."));
                return numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "  " + campo + " Inválido, Verifique!",
                        "Número Inválido", JOptionPane.WARNING_MESSAGE);
            }
        }
        return 0;
    }
}
