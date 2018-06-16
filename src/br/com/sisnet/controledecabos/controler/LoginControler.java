/**
 * @created  15/06/2018
 * @lastModified 00/00/2018
 */
package br.com.sisnet.controledecabos.controler;

import br.com.sisnet.controledecabos.classes.utilitarias.Cripto;
import br.com.sisnet.controledecabos.conexaobd.LoginDAO;
import br.com.sisnet.controledecabos.telas.TelaPrincipal;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * funcion...
 *
 * @author Israel Gomes
 * @version 1.0
 * @since 2.5.7
 */
public class LoginControler {

    static int tentativa = 4;

    public static boolean logar(JDialog tela, String senha, String usuario, JLabel lblTentativas) {

        if (checkLogin(Cripto.criptografar(senha), usuario)) {
            tela.dispose();
            return true;
        } else {
            tentativa--;
            lblTentativas.setText(tentativa + " Tentativa" + (tentativa > 1 ? "s" : "") + " restante" + (tentativa > 1 ? "s!" : "!"));
            lblTentativas.setVisible(true);
            if (tentativa == 0) {
                JOptionPane.showMessageDialog(null, "        Dados Incorretos!\n      "
                        + "Tentativas excedidas", "Falha no Login", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            return false;
        }
    }

    public static boolean checkLogin(String senha, String usuario) {
        if (senha.equals("") || usuario.equals("")) {
            return false;
        } else {
            String senhaBd;
            List<br.com.sisnet.controledecabos.classes.Login> loginList;
            loginList = LoginDAO.busca(usuario);
            if (loginList != null && loginList.isEmpty()) {
                return false;
            } else {
                TelaPrincipal.usuario = loginList.get(0);
                senhaBd = loginList.get(0).getSenha();
                return senhaBd.equals(senha);
            }
        }
    }

}
