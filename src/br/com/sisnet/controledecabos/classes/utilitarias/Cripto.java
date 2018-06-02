/** 
 * @created  15/04/2018
 * @lastModified 15/04/2018 
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 * Classe utilitária para criptogradar senhas.
 * @author Israel Gomes
 * @version 1.0
 * @since 1.0
 */
public class Cripto {

    /**
     * Converte a String passada como parâmetro par um código Hash.
     * 
     * @param original String - texto para conversão.
     * @return String - código Hash.
     */
    public static String criptografar(String original) {
        byte messageDigest[];
        String senha = null;
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            messageDigest = algorithm.digest(original.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senha = hexString.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao criptografar Senha",
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
        return senha;
    }
}
