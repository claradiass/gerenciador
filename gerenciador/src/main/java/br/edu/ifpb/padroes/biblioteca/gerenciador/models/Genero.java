package br.edu.ifpb.padroes.biblioteca.gerenciador.models;

public class Genero {
    private Long id;
    private String nome;

    public Genero(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

