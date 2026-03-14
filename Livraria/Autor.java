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
        if(totalLivros < MAX_LIVROS){
            this.livros[totalLivros] = livro;
            totalLivros++;
            return true;
        }
        return false;
    }
    public boolean removerLivro(Livro livro) {
        for (int i = 0; i < totalLivros; i++) {
            // Agora comparamos a String recebida com o ISBN do livro no array
            if (livros[i].getIsbn().equals(isbn)) {
                
                for (int j = i; j < totalLivros - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                
                livros[totalLivros - 1] = null; 
                totalLivros--; 
                return true;
            }
        }
        return false; // Se não encontrar o livro
    }

    void listarLivros() {
        for (int i = 0; i < livros.length; i++) {
            System.out.println(i);
        }
    }

    public String getNome() {
        return this.nome;
    }
    public String getId(){
        return this.id;
    }
    public int getTotalLivros(){
        return this.totalLivros;
    }
}
