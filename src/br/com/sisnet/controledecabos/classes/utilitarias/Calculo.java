/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import java.util.List;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 27/03/2018
 * @lastModified 20/04/2018
 * @version 1.0
 *
 * @Function Classe utilizada para calcular números válidos para registros de
 * pontas e bobinas.
 */
public class Calculo {

    public static int NumValido(List<Integer> list) {
        int numValido = 0;

        for (int i = 1; i < 1000; i++) {
            if (!list.contains(i)) {
                numValido = i;
                break;
            }
        }

        return numValido;
    }
}
