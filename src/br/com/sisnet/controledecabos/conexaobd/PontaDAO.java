/** 
 * @created  05/03/2018
 * @lastModified 28/03/2018 
 */
package br.com.sisnet.controledecabos.conexaobd;

import br.com.sisnet.controledecabos.classes.PontaCabo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe responsável por fazer o CRUD na tabela de ponta.
 * @author Israel Gomes
 * @version 2.0
 * @since 1.0
 */
public class PontaDAO {

    public static boolean salvar(PontaCabo pontaCabo) {

        String sql = "INSERT INTO Ponta (idPonta, id_Cabo,Quantidade,Localizacao) "
                + "VALUES (?,?,?,?);";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setInt(1, pontaCabo.getIdPontaCabo());
            ps.setInt(2, pontaCabo.getCodigoCabo());
            ps.setDouble(3, pontaCabo.getQuantidade());
            ps.setString(4, pontaCabo.getLocal());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public static List<PontaCabo> busca(int numeroPonta) {
        String sql = "SELECT c.idCabo,c.Descricao,c.PossuiBobina,"
                + " p.idPonta,p.Quantidade,p.Localizacao"
                + " FROM Ponta p"
                + " INNER JOIN Cabo c"
                + " ON p.id_Cabo = c.idCabo AND p.idPonta = ? ;";

        ResultSet resultSet = null;
        List<PontaCabo> caboList = new ArrayList();

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, numeroPonta);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                caboList.add(new PontaCabo(resultSet.getInt("idPonta"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Localizacao"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static List<PontaCabo> buscaCodigoCabo(int codigoCabo, double qtd) {
        String sql = "SELECT c.idCabo,c.Descricao,c.PossuiBobina,"
                + " p.idPonta,p.Quantidade,p.Localizacao"
                + " FROM Ponta p"
                + " INNER JOIN Cabo c"
                + " ON p.id_Cabo = c.idCabo AND c.idCabo = ? AND p.Quantidade >= ? "
                + " ORDER BY p.Quantidade;";

        ResultSet resultSet = null;
        List<PontaCabo> caboList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, codigoCabo);
            ps.setDouble(2, qtd);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                caboList.add(new PontaCabo(resultSet.getInt("idPonta"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Localizacao"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

     public static List<PontaCabo> buscaTudo() {
        String sql = "SELECT c.idCabo,c.Descricao,c.PossuiBobina,"
                + " p.idPonta,p.Quantidade,p.Localizacao"
                + " FROM Ponta p"
                + " INNER JOIN Cabo c"
                + " ON p.id_Cabo = c.idCabo "
                + "ORDER BY c.descricao, p.Quantidade;";

        ResultSet resultSet = null;
        List<PontaCabo> caboList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                caboList.add(new PontaCabo(resultSet.getInt("idPonta"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Localizacao"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }
    
    public static List<Integer> buscaNumPonta() {
        String sql = "SELECT idPonta FROM ponta;";
        ResultSet resultSet = null;
        List<Integer> intList = new ArrayList();

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                intList.add((resultSet.getInt("idPonta")));
            }
            return intList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static boolean excluir(int numeroPonta) {
        String sql = "DELETE FROM Ponta "
                + "WHERE idPonta = ? ;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, numeroPonta);
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public static boolean excluirTudoPorCodigo(int codigoCabo) {
        String sql = "DELETE FROM Ponta "
                + "WHERE id_Cabo = ? ;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, codigoCabo);
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public static boolean atualizar(PontaCabo pontaCabo) {
        String sql = "UPDATE Ponta "
                + " SET   Quantidade = ?,"
                + "       Localizacao = ? "
                + " WHERE idPonta = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setDouble(1, pontaCabo.getQuantidade());
            ps.setString(2, pontaCabo.getLocal());
            ps.setInt(3, pontaCabo.getIdPontaCabo());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

}
