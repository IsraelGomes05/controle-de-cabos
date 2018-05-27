/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 18/03/2018
 * @lastModified 18/03/2018
 * @version 1.0
 *
 * @Function...
 */
public class Saida {

    private int idSaida;
    private int codigoCabo;
    private int idVendedor;
    private int numBobina;
    private double quantidade;
    private String nomeVendedor;
    private String data;
    private String Descricao;
    private String caboPossuiBobina;

    public Saida() {
    }

    //Construtos utilizado para gravar no banco.
    public Saida(int codigoCabo, int idVendedor, double quantidade, String data) {
        this.codigoCabo = codigoCabo;
        this.idVendedor = idVendedor;
        this.quantidade = quantidade;
        this.data = data;
    }
    
    //Costrutor utilizado para obter as os registors das saídas de cabo sem bobina.
    public Saida(int idSaida, int codigoCabo, String nomeVendedor, double quantidade,
            String data, String Descricao,String caboPossuiBobina) {
        this.idSaida = idSaida;
        this.codigoCabo = codigoCabo;
        this.nomeVendedor = nomeVendedor;
        this.quantidade = quantidade;
        this.data = data;
        this.Descricao = Descricao;
        this.caboPossuiBobina = caboPossuiBobina;
    }

    //Costrutor utilizado para obter as os registors das saídas de cabo Com bobina. 
    public Saida(int idSaida, int codigoCabo, String nomeVendedor, double quantidade, 
            String data, String Descricao, int numBobina,String caboPossuiBobina) {
        this.idSaida = idSaida;
        this.codigoCabo = codigoCabo;
        this.nomeVendedor = nomeVendedor;
        this.quantidade = quantidade;
        this.data = data;
        this.Descricao = Descricao;
        this.numBobina = numBobina;
        this.caboPossuiBobina = caboPossuiBobina;
    }

    public String getCaboPossuiBobina() {
        return caboPossuiBobina;
    }

    public void setCaboPossuiBobina(String caboPossuiBobina) {
        this.caboPossuiBobina = caboPossuiBobina;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getNumBobina() {
        return numBobina;
    }

    public void setNumBobina(int numBobina) {
        this.numBobina = numBobina;
    }

    public int getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(int idSaida) {
        this.idSaida = idSaida;
    }

    public int getCodigoCabo() {
        return codigoCabo;
    }

    public void setCodigoCabo(int codigoCabo) {
        this.codigoCabo = codigoCabo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
