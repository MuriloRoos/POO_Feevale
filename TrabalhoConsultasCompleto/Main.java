package TrabalhoConsultas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long inicio = System.nanoTime();  // Nanosegundos!
        ArrayList<Consulta> listaConsultas = new ArrayList<>();

        GerarRelatorio relatorio = new GerarRelatorio();

        listaConsultas.add(new Presencial("Sala 101", "Ana Paula", 150.00));
        listaConsultas.add(new TeleConsulta("www.medico.com/sala1", "Junior Silva", 100.00));
        listaConsultas.add(new ConsultaDomiciliar("Rua Stallone, 123", "Mariana Lima", 250.00));
        listaConsultas.add(new Presencial("Sala 202", "Carlos Eduardo", 180.00));
        listaConsultas.add(new TeleConsulta("www.medico.com/sala2", "Beatriz Souza", 120.00));

        for (Consulta c : listaConsultas) {
            c.aplicarDescontoTele();
        }

        System.out.println("--- LISTA DE AGENDAMENTOS ---");
        filtrarPorTipo(listaConsultas, Presencial.class);



        System.out.println("\n[Aviso] Cancelando a segunda consulta da lista...");
        listaConsultas.remove(1);

        System.out.println("Quantidade de consultas restantes: " + listaConsultas.size());

        relatorio.exibir(listaConsultas);

        long fim = System.nanoTime();

        double tempoMs = (fim - inicio) / 1_000_000.0;
        System.out.printf("Tempo: %.3f ms%n", tempoMs);

    }

    public static void filtrarPorTipo(ArrayList<Consulta> consultas, Class<?> tipoAlvo) {
        for (Consulta c : consultas) {
            try {
                tipoAlvo.cast(c);
                c.exibirAgendamento();
            } catch (ClassCastException e) {
                
            }
        }
    }
    
    
         
}