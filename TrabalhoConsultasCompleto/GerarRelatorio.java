package TrabalhoConsultas;

import java.util.ArrayList;

public class GerarRelatorio {

    public GerarRelatorio(){
    }

    public void exibir(ArrayList<Consulta> listaConsultas) {

    int quantiaTele = 0;
    int quantiaPresencial = 0;
    int quantiaDomiciliar = 0;

    double somaTotal = 0.0;

    double somaTotalPresencial = 0.0;
    double somaTotalDomiciliar = 0.0;
    double somaTotalTele = 0.0;

    for(Consulta c : listaConsultas) {
        somaTotal += c.getValor();

        somaTotalPresencial = c.somarPresencial(somaTotalPresencial);
        somaTotalDomiciliar = c.somarDomiciliar(somaTotalDomiciliar);
        somaTotalTele = c.somarTele(somaTotalTele);

        quantiaTele = c.adicionarQuantiaTele(quantiaTele);
        quantiaDomiciliar = c.adicionarQuantiaDomiciliar(quantiaDomiciliar);
        quantiaPresencial = c.adicionarQuantiaPresencial(quantiaPresencial);
    }

   
    System.out.println("\n--- Relatório de consultas ---");
    System.out.printf("- Teleconsultas: %d (Total: R$ %.2f)\n",quantiaTele,somaTotalTele);
    System.out.printf("- Consultas presenciais: %d (Total: R$ %.2f)\n",quantiaPresencial,somaTotalPresencial);
    System.out.printf("- Consultas domiciliares: %d (Total: R$ %.2f)\n",quantiaDomiciliar,somaTotalDomiciliar);
    System.out.printf("\nValor total (com desconto): R$ %.2f%n", somaTotal);

    }
}
