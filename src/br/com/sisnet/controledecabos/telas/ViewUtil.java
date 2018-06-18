/**
 * @created  17/06/2018
 * @lastModified 17/06/2018
 */
package br.com.sisnet.controledecabos.telas;

import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * funcion...
 *
 * @author Israel Gomes
 * @version 1.0
 * @since 1.0
 */
public class ViewUtil {

    public void alterarIcone(JLabel label, String imagem) {
        String diretorio = "/br/com/sisnet/controledecabos/telas/imagens/" + imagem;

        try {

            URL resource = getClass().getResource(diretorio);
            File file = new File(resource.toURI());
            //setando o icone
            ImageIcon img = new ImageIcon(file.getPath());

            label.setIcon(img);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "    Não foi Possível carregar a imagem\n "
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void alterarIcone(JButton botao, String imagem) {
        String diretorio = "/br/com/sisnet/controledecabos/telas/imagens/" + imagem;

        try {

            URL resource = getClass().getResource(diretorio);
            File file = new File(resource.toURI());
            //setando o icone
            ImageIcon img = new ImageIcon(file.getPath());

            botao.setIcon(img);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "    Não foi Possível carregar a imagem\n "
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }
}