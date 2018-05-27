 /**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes;
/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created  11/03/2018
 * @lastModified 11/03/2018 
 * @version 1.0
 *
 * @Function...
 */
public class PontaCabo extends Cabo {
    
    private int idPontaCabo;
    private double quantidade;
    private String Local;

    public PontaCabo() {
    }

    public PontaCabo(int idPontaCabo,double quantidade, String Local, int codigoCabo, String descricao, String possuiBobina) {
        super(codigoCabo, descricao, possuiBobina);
        this.quantidade = quantidade;
        this.Local = Local;
        this.idPontaCabo = idPontaCabo;
    }

    public int getIdPontaCabo() {
        return idPontaCabo;
    }

    public void setIdPontaCabo(int idPontaCabo) {
        this.idPontaCabo = idPontaCabo;
    }


    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    
}
