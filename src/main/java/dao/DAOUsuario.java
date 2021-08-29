/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bancoDados.ConnectionFactory;
import classes.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author natim
 */
public class DAOUsuario {

    public static void cadastrarUsuario(Usuarios usuario) throws Exception {
        String sql = "INSERT INTO tabela_usuarios (nome, email, senha, idade, genero ) VALUES (?, ?, ?, ?, ?)";

        try (Connection c = new ConnectionFactory().obterConexao();
                PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setInt(4, usuario.getIdade());
            ps.setString(5, usuario.getGenero());

            ps.execute();
        }
    }

    public static boolean existe(Usuarios usuario) throws Exception {
        String sql = "SELECT * FROM tabela_usuarios WHERE nome = ? and email =?";

        try (Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public static boolean existeLogar(Usuarios usuario) throws Exception {
        String sql = "SELECT * FROM tabela_usuarios WHERE nome = ? and senha =?";

        try (Connection conexao = ConnectionFactory.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

}
