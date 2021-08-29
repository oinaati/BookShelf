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
public class DAOLivros {
    
        public static boolean existeLivro(Livros livro) throws Exception {
        String sql = "SELECT * FROM tabela_biblioteca WHERE nome = ? and autor =?";

        try (Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, livro.getNome());
            ps.setString(2, livro.getAutor());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public static void adicionarBiblioteca(Livros livro) throws Exception{
        String sql = "INSERT INTO tabela_biblioteca (nome, autor, genero, paginas) VALUES (?, ?, ?, ?)";
        
        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {
            
            ps.setString(1, livro.getNome());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getGenero());
            ps.setInt(4, livro.getPaginas());
            
            ps.execute();
        }
    }
    
    public static void removerBiblioteca(Livros livros) throws Exception {
        String sql = "DELETE FROM tabela_biblioteca where idBiblioteca = ?";
        
        try(Connection c = new ConnectionFactory().obterConexao();
                    PreparedStatement ps = c.prepareStatement(sql)) {
            
            ps.setInt(1, livros.getId_Livros());
            
            ps.execute();
        }
    }

    public static void editarBiblioteca(Livros livros) throws Exception {
        String sql = "UPDATE tabela_biblioteca SET nome = ?, autor = ?, genero = ?, paginas = ? WHERE idBiblioteca = ?";
        
        try(Connection c = new ConnectionFactory().obterConexao();
                    PreparedStatement ps = c.prepareStatement(sql)) {
            
            ps.setString(1, livros.getNome());
            ps.setString(2, livros.getAutor());
            ps.setString(3, livros.getGenero());
            ps.setInt(4, livros.getPaginas());
            ps.setInt(5, livros.getId_Livros());
            
            ps.execute();
        }
    }
    
    public static List<Livros> listarLivros() throws Exception{
        
        List<Livros> livros = new ArrayList<>();
        
        String sql = "SELECT * FROM tabela_biblioteca";
        
        try(Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            
            while(rs.next()) {
                Livros livro = new Livros();
                
                livro.setId_Livros(rs.getInt("idBiblioteca"));
                livro.setNome(rs.getString("nome"));
                livro.setAutor(rs.getString("autor"));
                livro.setGenero(rs.getString("genero"));
                livro.setPaginas(rs.getInt("paginas"));
                livros.add(livro);
            }
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar livros, tente novamente mais tarde!");
        }
        return livros;
    }
}
