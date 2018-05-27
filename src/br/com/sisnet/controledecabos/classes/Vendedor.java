 /**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.classes;
/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created  06/03/2018
 * @lastModified 06/03/2018 
 * @version 1.0
 *
 * @Function...
 */
public class Vendedor {

    private int idVendedor;
    private String nome;
    
    public Vendedor() {
    }

    //Contrutor usado para gravar no Banco
    public Vendedor(String nome) {
        this.nome = nome;
    }
    
    //Contrutor usado para obter os dados do banco
    public Vendedor(int idVendedor, String nome) {
        this.idVendedor = idVendedor;
        this.nome = nome;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
