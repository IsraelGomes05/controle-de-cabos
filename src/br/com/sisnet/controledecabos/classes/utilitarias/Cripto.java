/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes.utilitarias;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 15/04/2018
 * @lastModified 15/04/2018
 * @version 1.0
 *
 * @Function Criptografar senhas para salvar no banco de dados.
 */
public class Cripto {

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
