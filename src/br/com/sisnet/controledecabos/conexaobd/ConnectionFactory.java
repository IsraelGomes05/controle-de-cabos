/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.conexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 25/12/2017
 * @lastModified 06/04/2018
 * @version 3.0
 */
public class ConnectionFactory {

    public static Connection getConexao() {
        try {
            Class.forName("org.sqlite.JDBC");
            String urlSqliteInstalado = "jdbc:sqlite:/C:/Controle de Cabos/ControleDeCabos_BD.db";
            
            return DriverManager.getConnection(urlSqliteInstalado);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível conectar ao Banco de dados "+ ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    public static void close(Connection connection) {

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void close(Connection conection, Statement stm) {
        close(conection);
        try {
            if (stm != null) {
                stm.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void close(Connection conection, Statement stm, ResultSet rst) {
        close(conection, stm);
        try {
            if (rst != null) {
                rst.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void close(ResultSet rst) {

        try {
            if (rst != null) {
                rst.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        }
    }
}