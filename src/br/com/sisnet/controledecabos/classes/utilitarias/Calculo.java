/** 
 * @created  27/03/2018
 * @lastModified 20/04/2018 
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import java.util.List;

/**
 * Classe utilitária para calculo.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class Calculo {

    /**
     * Apartir da lista passada como parâmetro, é realizada uma iteração na mesma,
     * buscando um número qualquer, que não esteja presente na respectiva lista, quando 
     * encontrado este número é retornado.
     * 
     * @param list Integer - Lista preenchida com números inteiros.
     * @return numValido int - Número que não está presente na lista 
     */
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
