import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Linguagem Java = new Linguagem("Java", null);
        Curso CC = new Curso("Ciencias da Computação", "Intermediario", 200, Java);
        Java.setCurso(CC);
        

        System.out.println("INFORME o Nome da linguagem de programação");
        String NomeLinguagem = leitor.nextLine();
        Linguagem NomeLinguagemCurso = new Linguagem(NomeLinguagem, null)
    
        System.out.println("Informe o nome do Curso");
        String NomeCurso = leitor.nextLine();
        
        System.out.println("informe o nivel (Iniciante/Intermediário/Avançado)");
        String NivelCurso = leitor.nextLine();

        System.out.println("Informe o numero total de horas");
        int TotalHorasCurso = leitor.nextInt();

        Curso novCurso = new Curso(NomeCurso, NivelCurso, TotalHorasCurso, NomeLinguagemCurso);

        leitor.close();
    }

}

