/**
 * Copyright(c)  Israel Silva, All Rights Reserved.
 * This software is the proprietary of physical person, Israel Silva.
 */
package br.com.sisnet.controledecabos.conexaobd;

import br.com.sisnet.controledecabos.classes.Saida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Israel Gomes Da Silva
 * @created 18/03/2018
 * @lastModified 06/04/2018
 * @version 2.0
 *
 * @Function...
 */
public class SaidaDAO {

    public static boolean salvar(Saida saida) {

        String sql = "INSERT INTO Saida (id_Cabo,id_Vendedor,Quantidade,Data ) "
                + "VALUES (?,?,?,?);";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setInt(1, saida.getCodigoCabo());
            ps.setInt(2, saida.getIdVendedor());
            ps.setDouble(3, saida.getQuantidade());
            ps.setString(4, saida.getData());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"       Falha ao tentar Salvar\n" 
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static List<Saida> busca(String dataInicial, String dataFinal) {
        ResultSet resultSet = null;
        //Query para buscar as saídas que não possuem bobina.
        String sqlSemBobina = "SELECT s.idSaida,s.Data,c.idCabo,c.PossuiBobina,"
                + "c.Descricao,s.Quantidade,v.Nome "
                + "FROM Saida s "
                + "INNER JOIN Cabo c "
                + "ON s.id_Cabo = c.idCabo "
                + "INNER JOIN Vendedor v  "
                + "ON s.id_Vendedor = v.idVendedor AND s.Data BETWEEN ? AND ? "
                + "AND c.PossuiBobina = 'n' "
                + "ORDER BY s.Data,v.Nome;";

        //Query para buscar as Saídas que possuem bobinas.
        String sqlComBobina = "SELECT s.idSaida,s.Data,c.idCabo,c.PossuiBobina,"
                + "c.Descricao,s.Quantidade,v.Nome,b.idBobina "
                + "FROM Saida s "
                + "INNER JOIN Cabo c "
                + "ON s.id_Cabo = c.idCabo "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo "
                + "INNER JOIN Vendedor v "
                + "ON s.id_Vendedor = v.idVendedor AND s.Data BETWEEN ? AND  ? "
                + "AND c.PossuiBobina = 's' AND b.Ativo = 's' "
                + "ORDER BY s.Data,v.Nome;";

        List<Saida> caboList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement psComBobina = com.prepareStatement(sqlComBobina);
                PreparedStatement psSemBobina = com.prepareStatement(sqlSemBobina);) {

            psComBobina.setString(1, dataInicial);
            psComBobina.setString(2, dataFinal);
            resultSet = psComBobina.executeQuery();

            //Adiciona a lista os "objetos" que possuem bobina.
            while (resultSet.next()) {
                caboList.add(new Saida(resultSet.getInt("idSaida"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Nome"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Data"),
                        resultSet.getString("Descricao"),
                        resultSet.getInt("idBobina"),
                        resultSet.getString("PossuiBobina")));
            }

            psSemBobina.setString(1, dataInicial);
            psSemBobina.setString(2, dataFinal);
            resultSet = psSemBobina.executeQuery();

            //Adiciona a Lista os objetos que não possuem bobina
            while (resultSet.next()) {
                caboList.add(new Saida(resultSet.getInt("idSaida"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Nome"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Data"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "    Falha ao tentar buscar os dados\n"
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }

    public static List<Saida> busca(String dataInicial, String dataFinal, String vendedor) {
        ResultSet resultSet = null;
        //SQL para buscar as saídas que não possuem bobina.
        String sqlSemBobina = "SELECT s.idSaida,s.Data,c.idCabo,c.PossuiBobina,"
                + "c.Descricao,s.Quantidade,v.Nome "
                + "FROM Saida s "
                + "INNER JOIN Cabo c "
                + "ON s.id_Cabo = c.idCabo "
                + "INNER JOIN Vendedor v  "
                + "ON s.id_Vendedor = v.idVendedor AND s.Data BETWEEN ? AND ? "
                + "AND v.nome = ? "
                + "AND c.PossuiBobina = 'n' "
                + "ORDER BY s.Data,v.Nome;";

        //SQL para bucar as Saídas que possuem bobinas.
        String sqlComBobina = "SELECT s.idSaida,s.Data,c.idCabo,c.PossuiBobina,"
                + "c.Descricao,s.Quantidade,v.Nome,b.idBobina "
                + "FROM Saida s "
                + "INNER JOIN Cabo c "
                + "ON s.id_Cabo = c.idCabo "
                + "INNER JOIN Bobina b "
                + "ON c.idCabo = b.id_Cabo "
                + "INNER JOIN Vendedor v "
                + "ON s.id_Vendedor = v.idVendedor AND s.Data BETWEEN ? AND  ? "
                + "AND v.nome = ? "
                + "AND c.PossuiBobina = 's' AND b.Ativo = 's' "
                + "ORDER BY s.Data,v.Nome;";

        List<Saida> caboList = new ArrayList();
        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement psComBobina = com.prepareStatement(sqlComBobina);
                PreparedStatement psSemBobina = com.prepareStatement(sqlSemBobina);) {

            psComBobina.setString(1, dataInicial);
            psComBobina.setString(2, dataFinal);
            psComBobina.setString(3, vendedor);
            resultSet = psComBobina.executeQuery();

            //Adiciona a lista os objetos que possuem bobina.
            while (resultSet.next()) {
                caboList.add(new Saida(resultSet.getInt("idSaida"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Nome"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Data"),
                        resultSet.getString("Descricao"),
                        resultSet.getInt("idBobina"),
                        resultSet.getString("PossuiBobina")));
            }

            psSemBobina.setString(1, dataInicial);
            psSemBobina.setString(2, dataFinal);
            psSemBobina.setString(3, vendedor);
            resultSet = psSemBobina.executeQuery();

            //Adiciona a Lista os objetos que não possuem bobina.
            while (resultSet.next()) {
                caboList.add(new Saida(resultSet.getInt("idSaida"),
                        resultSet.getInt("idCabo"),
                        resultSet.getString("Nome"),
                        resultSet.getDouble("Quantidade"),
                        resultSet.getString("Data"),
                        resultSet.getString("Descricao"),
                        resultSet.getString("PossuiBobina")));
            }
            return caboList;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "    Falha ao tentar buscar os dados\n"
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.close(resultSet);
        }
        return null;
    }
    
    public static boolean excluir(int idSaida) {
        String sql = "DELETE FROM Saida "
                + "WHERE idSaida = ?;";

        try (Connection com = ConnectionFactory.getConexao();
                PreparedStatement ps = com.prepareStatement(sql);) {

            ps.setInt(1, idSaida);
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "      Falha ao tentar excluir\n" 
                    + ex.getMessage(),
                    "Falha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
