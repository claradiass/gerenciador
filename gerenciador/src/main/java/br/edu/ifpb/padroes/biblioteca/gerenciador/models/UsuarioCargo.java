package br.edu.ifpb.padroes.biblioteca.gerenciador.models;

public enum UsuarioCargo {
    ADMIN(1L),
    COMUM(2L);

    private Long id;

    private UsuarioCargo(Long id) {
        this.id = id;
    }
}
