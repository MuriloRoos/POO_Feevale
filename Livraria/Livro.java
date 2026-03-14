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

    public boolean associarAutor(Autor a){
        //verifica se o array livro está cheio, limite é 5
        if(this.totalAutores >= MAX_AUTORES){
            System.out.println("Erro: Este livro jáatingiu o limite de 5 autores");
            return false;
        }
        //verifica se o autor está associado a esse livro
        if(this.buscarAutores(a.getId()) != null) {
            System.out.println("Erro: Este autor já está associado a este livro.");
            return false;
        }
        //verifica se o array do autor está cheio, limite é 20
        if(a.getTotalLivros() >= 20){
            System.out.println("Erro: o autor " + a.getNome() + "já atingiu o limite");
            return false;
        }
        //adiciona o autor no array
        this.autores[this.totalAutores] = a;
        this.totalAutores++;

        //adicionar o livro no array do autor
        a.adicionarLivro(this);

        return true;

    }
    public boolean desassociarAutor(String idAutor){
        //procurar o autor
        for (int i = 0; i < totalAutores; i++) {
           if (autores[i].getId().equals(idAutor)){
               autores[i].removerLivro(this.isbn);

                for (int j = 0; j < totalAutores - 1; j++) {
                    autores[j] = autores[j+1]; //o proximo vem para a vaga atual
                }
                autores[totalAutores-1] = null;
                totalAutores--;

                return true;
            }
        }
        return false;
    }
    public void listarAutores() {

    }
    public Autor buscarAutores(String id){

        for (int i = 0; i < totalAutores; i++) {
            // compara o ID recebido com o ID do autor na posição i
            if (autores[i].getId().equals(id)){
                return autores[i];
            }
        }
        return null;
    }
    public String getIsbn() {
        return this.isbn;
    }

    public String getTítulo() {
        return this.título;
    }
}
