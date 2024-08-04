package br.edu.ifpb.padroes.biblioteca.gerenciador.models.livros;

import br.edu.ifpb.padroes.biblioteca.gerenciador.models.Autor;
import jakarta.persistence.*;

@Entity
@Table(name = "livro_autor")
public class LivroAutor {
    @EmbeddedId
    private LivroAutorId id;

    @ManyToOne
    @MapsId("livroId") // conectar um atributo da entidade a um campo específico dentro de uma chave composta
    @JoinColumn(name = "livro_id") // associação entre duas entidades ( chave estrangeira )
    private Livro livro;

    @ManyToOne
    @MapsId("autorId")
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public LivroAutor() {
    }

    public LivroAutor(Livro livro, Autor autor) {
        this.livro = livro;
        this.autor = autor;
        this.id = new LivroAutorId(livro.getId(), autor.getId());
    }

    public LivroAutorId getId() {
        return id;
    }

    public void setId(LivroAutorId id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
