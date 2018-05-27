/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import javax.swing.JOptionPane;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 11/03/2018
 * @lastModified 15/03/2018
 * @version 1.2.0
 *
 * @Function...
 */
public class Conversor {

    public static int paraInt(String txt, String campo) {
        try {
            Integer inteiro = Integer.parseInt(txt);
            return inteiro;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Campo: " + campo + " Inválido, Verifique!",
                    "Número Inválido", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }

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
                JOptionPane.showMessageDialog(null, "Campo: " + campo + " Inválido, Verifique!",
                        "Número Inválido", JOptionPane.WARNING_MESSAGE);
            }
        }
        return 0;
    }
}
