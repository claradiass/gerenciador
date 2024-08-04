package br.edu.ifpb.padroes.biblioteca.gerenciador.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String cpf;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    private String senha;
    private UsuarioCargo cargo;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String cpf, String senha, Date dataNascimento, String endereco, UsuarioCargo cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.cargo = cargo;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public UsuarioCargo getCargo() {
        return cargo;
    }

    public void setCargo(UsuarioCargo cargo) {
        this.cargo = cargo;
    }
}

