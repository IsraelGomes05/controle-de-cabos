/**
 * @created  25/12/2017
 * @lastModified 06/04/2018
 */
package br.com.sisnet.controledecabos.conexaobd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;

/**
 * Classe responsável por abrir e fechar conexões com o banco de dados.
 *
 * @author Israel Gomes
 * @version 2.8
 * @since 1.0
 */
public class ConnectionFactory {

    private static DataSource con = null;
    private static final String URL = "jdbc:sqlite:/C:/Controle de Cabos/ControleDeCabos_BD.db";

    public static Connection getConexao() {
        try {
            Class.forName("org.sqlite.JDBC");

            if (con == null) {
                SQLiteConnectionPoolDataSource pool = new SQLiteConnectionPoolDataSource();
                pool.setUrl(URL);
                con = pool;
            }
            return con.getConnection();

        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "<html><h3>    Não foi possível conectar ao Banco de dados</h3></html> \n" + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return null;
        }
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

    public static void close(Statement stm) {
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
        close(stm);
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
