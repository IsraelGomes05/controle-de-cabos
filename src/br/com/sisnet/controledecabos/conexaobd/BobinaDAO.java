/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.conexaobd;

import br.com.sisnet.controledecabos.classes.Cabo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Israel Gomes Da Silva
 * @contact israelgomes05@gmail.com
 * @created 10/03/2018
 * @lastModified 28/03/2018
 * @version 2.0
 *
 * @Function...
 */
public class BobinaDAO {

    public static boolean salvar(Cabo caboBobina) {

        String sql = "INSERT INTO Bobina (idBobina,id_Cabo,Quantidade,QtdAtual,Ativo)"
                + " VALUES (?, ?, ?, ?, ?);";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setInt(1, caboBobina.getIdBobina());
            ps.setInt(2, caboBobina.getCodigoCabo());
            ps.setDouble(3, caboBobina.getQtdOriginal());
            ps.setDouble(4, caboBobina.getQtdOriginal());
            ps.setString(5, caboBobina.getAtivo());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "                        "
                    + "A bobina não pode ser salva, Verifique!\n"
                    + "" + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static List<Cabo> buscaPorCodigoCabo(int numero) {
        String sql = "SELECT c.Descricao,b.QtdAtual,b.Ativo,b.idBobina "
                + "FROM Bobina b "
                + "INNER JOIN Cabo c "
                + "ON c.idCabo = b.id_Cabo AND b.id_cabo = ?;";

        List<Cabo> caboList = new ArrayList();
        ResultSet resultSet = null;
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, numero);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                caboList.add(new Cabo(resultSet.getString("Descricao"),
                        resultSet.getInt("idBobina"),
                        resultSet.getDouble("QtdAtual"),
                        resultSet.getString("Ativo")));
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

    public static List<Integer> buscaSomenteNumBobina() {
        String sql = "SELECT idBobina FROM Bobina ORDER BY idBobina;";

        ResultSet resultSet = null;
        List<Integer> intList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                intList.add(resultSet.getInt("idBobina"));
            }
            return intList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static List<Cabo> buscaPorNumBobina(int numeroBobina) {
        String sql = "SELECT c.idCabo,c.Descricao,c.PossuiBobina, "
                + "b.idBobina,b.QtdAtual,b.Quantidade,b.Ativo "
                + "FROM Cabo c "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo AND b.idBobina = ? ;";
        ResultSet resultSet = null;
        List<Cabo> caboList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, numeroBobina);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                caboList.add(new Cabo(
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina"),
                        resultSet.getInt("idBobina"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getDouble("QtdAtual"),
                        resultSet.getString("Ativo")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static List<Cabo> buscaTudoBobina() {
        String sql = "SELECT c.idCabo,c.Descricao,c.PossuiBobina, "
                + "b.idBobina,b.QtdAtual,b.Quantidade,b.Ativo "
                + "FROM Cabo c "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo "
                + "ORDER BY c.Descricao;";

        ResultSet resultSet = null;
        List<Cabo> caboList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                caboList.add(new Cabo(
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina"),
                        resultSet.getInt("idBobina"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getDouble("QtdAtual"),
                        resultSet.getString("Ativo")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static boolean excluir(Cabo bobinaCabo) {
        String sql = "DELETE FROM Bobina "
                + "WHERE  idBobina = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, bobinaCabo.getIdBobina());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"    Não foi possível excluir\n" 
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean atualizar(Cabo caboBobina) {
        String sql = "UPDATE Bobina "
                + "SET QtdAtual = ?, Ativo = ? "
                + "WHERE idBobina = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setDouble(1, caboBobina.getQtdAtual());
            ps.setString(2, caboBobina.getAtivo());
            ps.setInt(3, caboBobina.getIdBobina());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "   Não foi possivel atualizar a bobina" + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return true;
        }
    }

}