 /** 
 * @created  06/03/2018
 * @lastModified 06/03/2018 
 */
package br.com.sisnet.controledecabos.classes;

/**
 * Classe responsável por definir o BEAN Login.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */

public class Login {

    private int idLogin;
    private String usuario;
    private String senha;
    private String alterarDados;

    public Login() {
    }

    /**
     * @param idLogin int - chave primária do usuário.
     * @param usuario String - Nome de usuário.
     * @param senha String - Senha do usuário.
     * @param alterarDados String - <b>"s"</b> Se o usuário possuir permissão para alterar dados, <b>"n"</b> Caso contrário
     */
    public Login(int idLogin, String usuario, String senha, String alterarDados) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.senha = senha;
        this.alterarDados = alterarDados;
    }

    /**
     * @param senha String - Senha do usuário.
     * @param alterarDados String - <b>"s"</b> Se o usuário possuir permissão para alterar dados, <b>"n"</b> Caso contrário
     */
    public Login(String senha, String alterarDados) {
        
        this.senha = senha;
        this.alterarDados = alterarDados;
    }

    /**
     * @param usuario String - Nome de usuário.
     * @param senha String - Senha do usuário.
     * @param alterarDados String - <b>"s"</b> Se o usuário possuir permissão para alterar dados, <b>"n"</b> Caso contrário
     */
    public Login(String usuario, String senha, String alterarDados) {
        this.usuario = usuario;
        this.senha = senha;
        this.alterarDados = alterarDados;
    }
    
    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getAlterarDados() {
        return alterarDados;
    }

    public void setAlterarDados(String alterarDados) {
        this.alterarDados = alterarDados;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
