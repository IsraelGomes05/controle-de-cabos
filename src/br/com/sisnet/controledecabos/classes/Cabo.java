 /** 
 * @created  06/03/2018
 * @lastModified 11/03/2018 
 */ 
package br.com.sisnet.controledecabos.classes;

import br.com.sisnet.controledecabos.telas.TelaBuscarCabos;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Classe responsável por definir o BEAN Cabo.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class Cabo extends Bobina{
    
    private int codigoCabo;
    private String descricao;
    String possuiBobina;

    public Cabo() {
    }
    
    /**
     * Usado por PontaCabo na herança.
     * 
     * @param codigoCabo int - codigo do cabo, igual a do AutCom.
     * @param descricao String - Descrição do cabo, igual a do AutCom.
     * @param possuiBobina String - "s" Se possuir bobina, caso contrário "n".
     */
    public Cabo(int codigoCabo, String descricao, String possuiBobina) {
        this.codigoCabo = codigoCabo;
        this.descricao = descricao;
        this.possuiBobina = possuiBobina;
    }
    
    /**
     * Construtor utilizado somente quando um cabo possui bobina.
     * 
     * @param descricao String - Descrição do cabo, igual a do AutCom.
     * @param idBobina int - Número da bobina que possui este cabo.
     * @param qtdAtual double - Quantidade atual da bobina deste Cabo.
     * @param ativo String - "s" se a bobina deste cabo estiver ativa, caso contrário "n".
     */
    public Cabo(String descricao, int idBobina, double qtdAtual, String ativo) {
        super(idBobina, qtdAtual, ativo);
        this.descricao = descricao;
    }
    
    /**
     * Usado para salvar cabo, bobina. e busca os dados do BD.
     * 
     * @param codigo int - codigo do cabo, igual a do AutCom.
     * @param descricao String - Descrição do cabo, igual a do AutCom.
     * @param possuiBobina String -  "s" se a bobina deste cabo estiver ativa, caso contrário "n".
     * @param idBobina int - Número da bobina que possui este cabo.
     * @param qtdOriginal double - Quantidade que a bobina foi cadastrada.
     * @param qtdAtual double - Quantidade atual da bobina deste Cabo.
     * @param ativo String - "s" a bobina deste cabo estiver ativa, caso contrário "n".
     */
    public Cabo(int codigo, String descricao,String possuiBobina, int idBobina, double qtdOriginal, double qtdAtual, String ativo) {
        super(idBobina, qtdOriginal, qtdAtual, ativo);
        this.codigoCabo = codigo;
        this.descricao = descricao;
        this.possuiBobina = possuiBobina;
    }
    
    public String  getPossuiBobina() {
        return possuiBobina;
    }

    public void setPossuiBobina(String  possuiBobina) {
        this.possuiBobina = possuiBobina;
    }
    
    public int getCodigoCabo() {
        return codigoCabo;
    }

    public void setCodigoCabo(int codigo) {
        this.codigoCabo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Utilizado para realizar uma busca no banco de dados, seja por código do cabo 
     * ou pela descrição do mesmo. após a busca será inserido o código selecionado
     * no JTextField passado como parâmetro.
     * 
     * @param txt JTextField - Campo de texto que o usuário irá digitar o código ou a descrição do cabo.
     * @see TelaBuscarCabos
     */
    public static void buscarCabo(JTextField txt) {
        TelaBuscarCabos cabosBuscarModal = new TelaBuscarCabos(new JFrame(), true, txt.getText(), true);
        cabosBuscarModal.setVisible(true);
        txt.setText("" + cabosBuscarModal.getCodigoCaboSelec());
    }
}
