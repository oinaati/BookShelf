/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bancoDados.ConnectionFactory;
import classes.Livros;
import classes.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natim
 */
public class DAOEstante {

    public static List<Livros> listarEstante() throws Exception {

        List<Livros> livrosEstante = new ArrayList<>();

        String sql = "SELECT * FROM tabela_estante";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Livros livro = new Livros();

                livro.setId_Livros(rs.getInt("id"));
                livro.setNome(rs.getString("nome"));
                livro.setPaginas(rs.getInt("paginas"));
                livro.setUsuarioLogado(rs.getString("usuarioLogado"));
                
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setPaginasLidas(rs.getInt("paginas_lidas"));
                livro.setNota(rs.getInt("nota"));
                 
                livrosEstante.add(livro);

            }

        }

        return livrosEstante;
    }

    public static void adicionarEstante(Livros livro, Usuarios usuario) throws Exception {
        String sql = "INSERT INTO tabela_estante (nome, autor, genero, paginas, usuarioLogado) VALUES (?, ?, ?, ?, ?)";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, livro.getNome());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getGenero());
            ps.setInt(4, livro.getPaginas());
            ps.setString(5, usuario.getNome());
            ps.execute();
        }
    }

    public static void removerEstante(Livros livros) throws Exception {
        String sql = "DELETE FROM tabela_estante where id = ?";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, livros.getId_Livros());

            ps.execute();
        }
    }
    
  
    public static void avaliarLivro(Livros livros, int id) throws Exception {
        String sql = "UPDATE tabela_estante SET nota = ? WHERE id = ?";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, livros.getNota());
            ps.setInt(2, livros.getId_Livros());

            ps.execute();
        }
    }

    public static void progressoLivro(Livros livros, int id) throws Exception {
        String sql = "UPDATE tabela_estante SET paginas_lidas = ? WHERE id = ?";

        
        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, livros.getPaginasLidas());
            ps.setInt(2, livros.getId_Livros());

            ps.execute();
        }
    }


}
