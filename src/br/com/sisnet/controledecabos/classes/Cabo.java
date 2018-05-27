 /**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes;

import br.com.sisnet.controledecabos.telas.TelaBuscarCabos;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created  06/03/2018
 * @lastModified 11/03/2018 
 * @version 2.1.0
 *
 * @Function...
 */
public class Cabo extends Bobina{
    
    private int codigoCabo;
    private String descricao;
    String possuiBobina;

    public Cabo() {
    }
    
    /*Usado por PontaCabo na herança */
    public Cabo(int codigoCabo, String descricao, String possuiBobina) {
        this.codigoCabo = codigoCabo;
        this.descricao = descricao;
        this.possuiBobina = possuiBobina;
    }
    
    public Cabo(String descricao, int idBobina, double qtdAtual, String ativo) {
        super(idBobina, qtdAtual, ativo);
        this.descricao = descricao;
    }
    
    /*Usado para salvar o cabo e a bobina e busca os dados*/
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

    public static void buscarCabo(JTextField txt) {
        TelaBuscarCabos cabosBuscarModal = new TelaBuscarCabos(new JFrame(), true, txt.getText(), true);
        cabosBuscarModal.setVisible(true);
        txt.setText("" + cabosBuscarModal.getCaboSelecionado());
    }
}
