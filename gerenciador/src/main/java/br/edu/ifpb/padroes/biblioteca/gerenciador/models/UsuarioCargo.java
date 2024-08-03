package br.edu.ifpb.padroes.biblioteca.gerenciador.models;

public enum UsuarioCargo {
    ADMIN(0L),
    NORMAL(1L);

    private Long id;

    private UsuarioCargo(Long id) {
        this.id = id;
    }
}
