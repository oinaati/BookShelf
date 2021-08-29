/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bancoDados.ConnectionFactory;
import classes.Livros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author natim
 */
public class DAORecomendacoes {


    public static List<Livros> listarRecomendacoes() throws Exception {

        List<Livros> livrosRecomenda = new ArrayList<>();

        String sql = "SELECT  * FROM tabela_estante order by nota desc";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Livros livro = new Livros();

                livro.setId_Livros(rs.getInt("id"));
                livro.setNome(rs.getString("nome"));
                livro.setNota(rs.getInt("nota"));
                livrosRecomenda.add(livro);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar livros, tente novamente mais tarde!");
        }

        return livrosRecomenda;
    }

}
