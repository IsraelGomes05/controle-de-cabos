/** 
 * @created  10/03/2018
 * @lastModified 28/03/2018 
 */
package br.com.sisnet.controledecabos.conexaobd;

import br.com.sisnet.controledecabos.classes.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe responsável por fazer o CRUD na tabela saída.
 * @author Israel Gomes
 * @version 1.0
 * @since 1.0
 */
public class VendedorDAO {

    public static boolean salvar(Vendedor vendedor) {

        String sql = "INSERT INTO Vendedor (Nome)"
                + " VALUES (?);";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setString(1, vendedor.getNome());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "    Não foi Possível salvar\n "
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static List<Vendedor> busca(String vendedor) {
        String sql = "SELECT Nome,idVendedor "
                + "FROM Vendedor WHERE Nome = ? ORDER BY Nome;";

        ResultSet resultSet = null;
        List<Vendedor> vendedorList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setString(1, vendedor);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                vendedorList.add(new Vendedor(resultSet.getInt("idVendedor"),
                        resultSet.getString("nome")));
            }
            return vendedorList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "      Erro ao buscar os dados"
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static List<Vendedor> buscaTudo() {
        String sql = "SELECT Nome "
                + "FROM Vendedor ORDER BY Nome;";

        ResultSet resultSet = null;
        List<Vendedor> vendedorList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                vendedorList.add(new Vendedor(resultSet.getString("nome")));
            }
            return vendedorList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "     Erro ao buscar os dados\n"
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static boolean excluir(String vendedor) {
        String sql = "DELETE FROM Vendedor "
                + "WHERE Nome = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setString(1, vendedor);
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "      Falha ao tentar excluir\n"
                    + ex.getMessage(),
                    "Falha", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
}
