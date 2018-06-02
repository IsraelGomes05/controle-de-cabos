/** 
 * @created  06/03/2018
 * @lastModified 11/03/2018 
 */  

package br.com.sisnet.controledecabos.classes;

/**
 * Classe responsável por definir o BEAN Bobina.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */

public class Bobina {
    
    private int idBobina;
    private double qtdOriginal;
    private double qtdAtual;
    private String ativo;
    

    public Bobina() {
    }

    /**
     * @param idBobina int - número da bobina.
     * @param qtdAtual double - Quantidade inicial em metros. 
     * @param ativo String - "s" se a bobina estiver ativa, Caso contrario "n".
     */
    public Bobina(int idBobina, double qtdAtual, String ativo) {
        this.idBobina = idBobina;
        this.qtdAtual = qtdAtual;
        this.ativo = ativo;
    }
    
    /**
     * @param idBobina int - número da bobina.
     * @param qtdOriginal double - Quantidade inicial da bobina.
     * @param qtdAtual double - Quantidade inicial em metros. 
     * @param ativo String - "s" se a bobina estiver ativa, Caso contrario "n".
     */
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
