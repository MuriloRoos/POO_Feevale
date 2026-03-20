package POO_Herança_Atividade;
import java.util.Random;

public class Contratos {
    public static void main(String[] args) {
        Random cpf = new Random();

        ProfessorConcursado Lu = new ProfessorConcursado("Professor", "Lucas", cpf.nextInt(1000000000), 1989);

    }
}
