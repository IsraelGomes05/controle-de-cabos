/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.conexaobd;

import br.com.sisnet.controledecabos.classes.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Israel Gomes Da Silva
 * @created 18/02/2018
 * @lastModified 06/04/2018
 * @version 1.5
 *
 * @Function...
 */
public class LoginDAO {

    public static boolean salvar(Login senha) {

        String sql = "INSERT INTO Login (Senha, user,AlterarDados) "
                + "VALUES (?,?,?);";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setString(1, senha.getSenha());
            ps.setString(2, senha.getUsuario());
            ps.setString(3, senha.getAlterarDados());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "   Erro Usuário já cadastrado\n" + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
    }

    public static List<Login> busca(String usuario) {
        String sql = "SELECT Senha,AlterarDados FROM Login "
                +"WHERE user = ?;";
        
        ResultSet resultSet = null;
        List<Login> loginList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            
            ps.setString(1, usuario);
            resultSet = ps.executeQuery();
            
            while (resultSet.next()) {
                loginList.add(new Login(
                resultSet.getString("Senha"),
                resultSet.getString("AlterarDados")));
            }
            return loginList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static boolean excluir(String usuario) {
        String sql = "DELETE FROM Login " +
                        "WHERE  User = ?;";
        
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            
            ps.setString(1, usuario);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"    Não foi possível excluir o Usuário\n" 
                    + ex.getMessage(),
                    "Concluido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean atualizar(Login senha) {
        String sql = "UPDATE Login SET Senha = ? ,AlterarDados = ? " +
                        "WHERE   user = ?;";
        
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            
            ps.setString(1, senha.getSenha());
            ps.setString(2, senha.getAlterarDados());
            ps.setString(3, senha.getUsuario());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "      Não foi possível atualizar\n" 
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}