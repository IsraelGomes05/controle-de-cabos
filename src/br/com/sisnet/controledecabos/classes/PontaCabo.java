/** 
 * @created  11/03/2018
 * @lastModified 11/03/2018 
 */
package br.com.sisnet.controledecabos.classes;

/**
 * Classe responsável por definir o BEAN PontaCabo.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class PontaCabo extends Cabo {
    
    private int idPontaCabo;
    private double quantidade;
    private String Local;

    public PontaCabo() {
    }

    /**
     * @param idPontaCabo int - numero da ponta.
     * @param quantidade double - Quantidade da ponta.
     * @param Local String - Local onde esta ponta está armazenada.
     * @param codigoCabo int - codigo do cabo, igual a do AutCom.
     * @param descricao String - Descrição do cabo, igual a do AutCom.
     * @param possuiBobina String - "s" Se possuir bobina, caso contrário "n".
     */
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
