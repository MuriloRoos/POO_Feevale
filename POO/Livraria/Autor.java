package Livraria;

public class Autor {

    private static final int MAX_LIVROS = 20;

    private String id;
    private String nome;
    private String nacionalidade;
    private Livro[] livros;
    private int totalLivros;

    public Autor(String id, String nome, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = new Livro[MAX_LIVROS];
        this.totalLivros = 0;
    }

    public boolean adicionarLivro(Livro livro) {
        return false;
    }
    public boolean removerLivro(Livro livro) {
        return false;
    }

    void listarLivros() {
    }

}
