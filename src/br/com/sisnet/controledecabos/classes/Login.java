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
public class Login {

    private int idLogin;
    private String usuario;
    private String Senha;
    private String alterarDados;

    public Login() {
    }

    public Login(int idLogin, String usuario, String Senha, String alterarDados) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.Senha = Senha;
        this.alterarDados = alterarDados;
    }

    public Login(String Senha, String alterarDados) {
        
        this.Senha = Senha;
        this.alterarDados = alterarDados;
    }

    public Login(String usuario, String Senha, String alterarDados) {
        this.usuario = usuario;
        this.Senha = Senha;
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
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
}
