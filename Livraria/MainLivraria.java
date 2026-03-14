package Livraria;

public class MainLivraria {
    public static void main(String[] args) {
        System.out.println("=== Cadastrando Autores ===");
        Autor a1 = new Autor("A1", "Machado de Assis", "Brasileira");
        Autor a2 = new Autor("A2", "Clarice Lispector", "Brasileira");
        Autor a3 = new Autor("A3", "J.K. Rowling", "Britânica");
        Autor a4 = new Autor("A4", "Stephen King", "Americano");

        System.out.println("=== Cadastrando Livros ===");
        Livro l1 = new Livro("101", "Dom Casmurro", 1899, 45.90);
        Livro l2 = new Livro("102", "A Hora da Estrela", 1977, 35.00);
        Livro l3 = new Livro("103", "Harry Potter", 1997, 59.90);
        Livro l4 = new Livro("104", "O Iluminado", 1977, 50.00);
        Livro l5 = new Livro("105", "Antologia Brasileira", 2026, 80.00);

        System.out.println("\n--- Associando Autores aos Livros ---");
        
        // Coautoria: l5 terá Machado e Clarice
        l5.associarAutor(a1);
        l5.associarAutor(a2);

        // Autor com vários livros: Machado escreveu l1 e l5
        l1.associarAutor(a1);

        // --- 4. TESTANDO REGRAS DE NEGÓCIO (REQUISITOS) ---
        
        // Tentativa de duplicidade (Deve dar erro)
        System.out.print("[Teste Duplicidade]: ");
        l1.associarAutor(a1); 

        // --- 5. EXIBIÇÃO DE RESULTADOS ---
        System.out.println("\n--- Listagem de Verificação ---");
        l5.listarAutores(); // Deve mostrar Machado e Clarice
        a1.listarLivros();  // Deve mostrar Dom Casmurro e Antologia Brasileira

        // --- 6. TESTANDO DESASSOCIAÇÃO E COMPACTAÇÃO ---
        System.out.println("\n--- Testando Desassociação (Removendo Clarice do Livro 105) ---");
        boolean removeu = l5.desassociarAutor("A2");
        
        if (removeu) {
            System.out.println("Clarice removida com sucesso!");
        }

        System.out.println("\n--- Estado Final após Desassociação ---");
        l5.listarAutores(); // Deve mostrar apenas Machado agora
        a2.listarLivros();  // Deve estar vazio ou sem o livro 105
    }
}