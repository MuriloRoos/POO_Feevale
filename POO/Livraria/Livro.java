package Livraria;

public class Livro {

    private static final int MAX_AUTORES = 5;

    private String isbn;
    private String título;
    private int anoPublicação;
    private double preço;
    private Autor[] autores;
    private int totalAutores;

    public Livro(String isbn, String título, int anoPublicação, double preço) {
        this.isbn = isbn;
        this.título = título;
        this.anoPublicação = anoPublicação;
        this.preço = preço;
        this.autores = new Autor[MAX_AUTORES];
        this.totalAutores = 0;
    }
}
