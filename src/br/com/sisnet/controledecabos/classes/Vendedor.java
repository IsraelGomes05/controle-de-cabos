 /** 
 * @created  06/03/2018
 * @lastModified 06/03/2018 
 */
package br.com.sisnet.controledecabos.classes;
/**
 * Classe responsável por definir o BEAN Vendedor.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class Vendedor {

    private int idVendedor;
    private String nome;
    
    public Vendedor() {
    }

    /**
     * Contrutor usado para gravar no Banco 
     * @param nome String - Nome do vendedor.
     */
    public Vendedor(String nome) {
        this.nome = nome;
    }
    
    /**
     * Contrutor usado para obter os dados do banco
     * @param idVendedor int - ID do vendedor.
     * @param nome String - Nome do vendedor.
     */
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
