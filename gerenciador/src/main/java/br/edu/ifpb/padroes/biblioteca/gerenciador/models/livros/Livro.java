package br.edu.ifpb.padroes.biblioteca.gerenciador.models.livros;

import br.edu.ifpb.padroes.biblioteca.gerenciador.models.Autor;
import br.edu.ifpb.padroes.biblioteca.gerenciador.models.Genero;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String isbn;
    private String sinopse;
    @Column(name = "ano_edicao")
    private Date dataPublicacao;
    private int quantidade;
    private Set<Autor> autores;
    private Set<Genero> generos;

    public Livro(Long id, String titulo, Set<Autor> autor, Set<Genero> genero, String isbn, Date dataPublicacao, int quantidade, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autor;
        this.generos = genero;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
        this.quantidade = quantidade;
        this.sinopse = sinopse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Autor> getAutor() {
        return autores;
    }

    public Set<Genero> getGenero() {
        return generos;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
