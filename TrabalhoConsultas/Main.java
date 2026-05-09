import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Consulta> listaConsultas = new ArrayList<>();

        listaConsultas.add(new Presencial("Sala 101", "Ana Paula", 150.00));
        listaConsultas.add(new TeleConsulta("www.medico.com/sala1", "Junior Silva", 100.00));
        listaConsultas.add(new ConsultaDomiciliar("Rua Stallone, 123", "Mariana Lima", 250.00));
        listaConsultas.add(new Presencial("Sala 202", "Carlos Eduardo", 180.00));
        listaConsultas.add(new TeleConsulta("www.medico.com/sala2", "Beatriz Souza", 120.00));

        
    

        System.out.println("--- LISTA DE AGENDAMENTOS ---");
        for (Consulta c : listaConsultas) {
            if(c.getTipo().equals("Tele")){
                c.aplicarDesconto(10);
            }
            // c.exibirAgendamento();
        
        }

        filtrarPorTipo(listaConsultas, Presencial.class);
        
        
        
        
        

        System.out.println("\n[Aviso] Cancelando a segunda consulta da lista...");
        listaConsultas.remove(1);

        System.out.println("Quantidade de consultas restantes: " + listaConsultas.size());



        gerarRelatorio(listaConsultas);
    }

    public static void filtrarPorTipo(ArrayList<Consulta> consultas, Class<?> tipoAlvo) {
    consultas.stream()
        .filter(tipoAlvo::isInstance)
        .forEach(Consulta::exibirAgendamento); 
    }
    
    
         
}