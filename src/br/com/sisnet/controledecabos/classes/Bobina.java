 /**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes;
/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created  06/03/2018
 * @lastModified 11/03/2018 
 * @version 2.0.0
 *
 * @Function...
 */
public class Bobina {
    
    private int idBobina;
    private double qtdOriginal;
    private double qtdAtual;
    private String ativo;
    

    public Bobina() {
    }

    public Bobina(int idBobina, double qtdAtual, String ativo) {
        this.idBobina = idBobina;
        this.qtdAtual = qtdAtual;
        this.ativo = ativo;
    }
    
    public Bobina(int idBobina, double qtdOriginal, double qtdAtual, String ativo) {
        this.idBobina = idBobina;
        this.ativo = ativo;
        this.qtdOriginal = qtdOriginal;
        this.qtdAtual = qtdAtual;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public int getIdBobina() {
        return idBobina;
    }

    public void setIdBobina(int idBobina) {
        this.idBobina = idBobina;
    }

    public double getQtdOriginal() {
        return qtdOriginal;
    }

    public void setQtdOriginal(double qtdOriginal) {
        this.qtdOriginal = qtdOriginal;
    }

    public double getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(double qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    
}
