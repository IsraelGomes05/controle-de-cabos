/** 
 * @created      10/03/2018
 * @lastModified 06/04/2018 
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
 * Classe responsável por realizar o CRUD na tabela cabo.
 * @author  Israel Gomes
 * @version 2.8
 * @since   1.0
 */
public class CaboDAO {

    public static boolean salvar(Cabo cabo) {

        String sql = "INSERT INTO Cabo (idCabo, Descricao, PossuiBobina) "
                + "VALUES (?,?,?);";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setInt(1, cabo.getCodigoCabo());
            ps.setString(2, cabo.getDescricao());
            ps.setString(3, cabo.getPossuiBobina());

            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Salvar o Cabo " + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static List<Cabo> busca(int codigo, String ativo) {
        String sqlVerificacao = "SELECT idCabo,Descricao,PossuiBobina FROM Cabo "
                + "WHERE idCabo = ?"
                + "ORDER BY Descricao;";

        String sqlComBobina = "SELECT c.idCabo,c.Descricao,c.PossuiBobina, "
                + "b.idBobina,b.QtdAtual,b.Quantidade,b.Ativo "
                + "FROM Cabo c "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo AND c.idCabo = ? AND b.Ativo = ? "
                + "ORDER BY c.Descricao;";

        ResultSet resultSet = null;
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sqlVerificacao);
                PreparedStatement ps2 = com.prepareStatement(sqlComBobina);) {

            ps.setInt(1, codigo);
            List<Cabo> CaboList = new ArrayList();
            ResultSet resultSet1 = ps.executeQuery();
            while (resultSet1.next()) {
                CaboList.add(new Cabo(
                        resultSet1.getInt("idCabo"),
                        resultSet1.getString("Descricao"),
                        resultSet1.getString("PossuiBobina")));
            }

            if (CaboList.isEmpty()) {
                ConnectionFactory.close(resultSet1);
                return CaboList;
            }
            if (CaboList.get(0).getPossuiBobina().equals("n")) {
                ConnectionFactory.close(resultSet1);
                return CaboList;
            } else {

                ps2.setInt(1, codigo);
                ps2.setString(2, ativo);
                resultSet = ps2.executeQuery();
                List<Cabo> CaboList2 = new ArrayList();
                while (resultSet.next()) {
                    CaboList2.add(new Cabo(
                            resultSet.getInt("idCabo"),
                            resultSet.getString("Descricao"),
                            resultSet.getString("PossuiBobina"),
                            resultSet.getInt("idBobina"),
                            resultSet.getDouble("Quantidade"),
                            resultSet.getDouble("QtdAtual"),
                            resultSet.getString("Ativo")));
                }
                return CaboList2;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static List<Cabo> buscaPorDescricao(String descricao) {
        String sqlSemBobina = "SELECT idCabo,Descricao,PossuiBobina FROM Cabo"
                + " WHERE Descricao LIKE ? AND PossuiBobina = 'n';";

        String sqlComBobina = "SELECT c.idCabo,c.Descricao,c.PossuiBobina, "
                + "b.idBobina,b.QtdAtual,b.Quantidade,b.Ativo "
                + "FROM Cabo c "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo AND c.Descricao LIKE ? AND b.Ativo = 's' "
                + "AND PossuiBobina = 's' "
                + "ORDER BY c.Descricao;";

        ResultSet resultSet1 = null, resultSet = null;
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sqlSemBobina);
                PreparedStatement ps2 = com.prepareStatement(sqlComBobina);) {

            ps.setString(1, "%" + descricao + "%");
            List<Cabo> CaboList = new ArrayList();
            resultSet1 = ps.executeQuery();

            while (resultSet1.next()) {
                CaboList.add(new Cabo(
                        resultSet1.getInt("idCabo"),
                        resultSet1.getString("Descricao"),
                        resultSet1.getString("PossuiBobina")));
            }

            ps2.setString(1, "%" + descricao + "%");
            resultSet = ps2.executeQuery();
            while (resultSet.next()) {
                CaboList.add(new Cabo(
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina"),
                        resultSet.getInt("idBobina"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getDouble("QtdAtual"),
                        resultSet.getString("Ativo")));
            }
            return CaboList;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(resultSet1);
        }
        return null;
    }

    public static List<Cabo> buscaPorCodigo(int codigo) {
        ResultSet resultSet = null;
        List<Cabo> CaboList2 = new ArrayList();

        String sqlComBobina = "SELECT c.idCabo,c.Descricao,c.PossuiBobina, "
                + "b.idBobina,b.QtdAtual,b.Quantidade,b.Ativo "
                + "FROM Cabo c "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo AND c.idCabo = ? "
                + "ORDER BY c.Descricao;;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps2 = com.prepareStatement(sqlComBobina);) {

            ps2.setInt(1, codigo);
            resultSet = ps2.executeQuery();
            while (resultSet.next()) {
                CaboList2.add(new Cabo(
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina"),
                        resultSet.getInt("idBobina"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getDouble("QtdAtual"),
                        resultSet.getString("Ativo")));

            }
            return CaboList2;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return CaboList2;
    }

    public static List<Cabo> buscaTudo() {
        ResultSet resultSet = null;
        List<Cabo> CaboList2 = new ArrayList();

        String sqlComBobina = "SELECT c.idCabo,c.Descricao,c.PossuiBobina, "
                + "b.idBobina,b.QtdAtual,b.Quantidade,b.Ativo "
                + "FROM Cabo c "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo AND b.Ativo = 's' "
                + "ORDER BY c.Descricao;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps2 = com.prepareStatement(sqlComBobina);) {

            resultSet = ps2.executeQuery();
            while (resultSet.next()) {
                CaboList2.add(new Cabo(
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina"),
                        resultSet.getInt("idBobina"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getDouble("QtdAtual"),
                        resultSet.getString("Ativo")));

            }
            return CaboList2;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return CaboList2;
    }

    public static List<Cabo> buscaTudoSemBobina() {
        ResultSet resultSet = null;
        List<Cabo> CaboList2 = new ArrayList();

        String sqlSemBobina = "SELECT c.idCabo,c.Descricao,c.PossuiBobina "
                + "FROM Cabo c "
                + "INNER JOIN Ponta p "
                + "ON p.id_cabo = c.idCabo "
                + "AND c.PossuiBobina = 'n' "
                + "GROUP BY c.idCabo "
                + "ORDER BY c.Descricao;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps2 = com.prepareStatement(sqlSemBobina);) {

            resultSet = ps2.executeQuery();
            while (resultSet.next()) {
                CaboList2.add(new Cabo(
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina")
                ));

            }
            return CaboList2;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return CaboList2;
    }

    public static boolean excluir(Cabo cabo) {
        String sql = "DELETE FROM Cabo "
                + "WHERE  idCabo = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, cabo.getCodigoCabo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "   Não foi possível excluir o cabo\n"
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean atualizar(Cabo cabo) {
        String sql = "UPDATE Cabo "
                + "SET Descricao = ?,PossuiBobina = ? "
                + "WHERE idCabo = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setString(1, cabo.getDescricao());
            ps.setString(2, cabo.getPossuiBobina());
            ps.setInt(3, cabo.getCodigoCabo());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível Atualizar o Cabo" + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
