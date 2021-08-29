/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author natim
 */
public class Usuarios {
    private String nome, genero, senha, email;
    private int idade;
    
    public Usuarios (String nome, String email, String senha, int idade, String genero ){
        this.nome = nome;
        this.genero = genero;
        this.senha = senha;
        this.email = email;
        this.idade = idade;
    }

    public Usuarios(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuarios(String nome) {
        this.nome = nome;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
    
    

    @Override
    public String toString() {
        return nome;
    }

}
