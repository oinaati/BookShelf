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
public class Livros {

    private String nome, autor, genero, usuarioLogado;
    private int id_Livros, paginas, paginasLidas, nota, media;

    public Livros(String nome, String autor, String genero, int paginas, int paginasLidas, int nota) {

        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
        this.paginasLidas = paginasLidas;
        this.nota = nota;
    }

    public Livros(int id_Livros, int paginasLidas) {
        this.id_Livros = id_Livros;
        this.paginasLidas = paginasLidas;
    }

    public Livros(String nome, String autor, String genero, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
    }

    public Livros() {

    }

    public Livros(String nome, String autor, String genero, int paginas, int id_Livros) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
        this.id_Livros = id_Livros;
    }

    public Livros(int id_Livros) {
        this.id_Livros = id_Livros;
    }

    public void setId_Livros(int id_Livros) {
        this.id_Livros = id_Livros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getId_Livros() {
        return id_Livros;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public int getNota() {
        return nota;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    public int mediaNotas(){
        media =+ nota;
        return media;
    }

    @Override
    public String toString() {
        return "Informações do livro: "
                + "\nID: " + getId_Livros()
                + "\nTítulo: " + getNome()
                + "\nAutor: " + getAutor()
                + "\nGênero: " + getGenero()
                + "\nPáginas: " + getPaginas()
                + "\nPáginas lidas: " + getPaginasLidas()
                + "\nAvaliação: " + getNota();
    }

}
