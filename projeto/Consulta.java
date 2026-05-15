package TrabalhoConsultasIncompleto;

import java.util.ArrayList;

public abstract class Consulta {
    protected String tipo;
    protected String paciente;
    protected double valor;

    public Consulta(String paciente, double valor) {
        this.paciente = paciente;
        this.valor = valor;
    }

    public abstract void confirmar();

    public static void gerarRelatorio(ArrayList<Consulta> lista) {
        int qP = 0, qT = 0, qD = 0;
        double sP = 0, sT = 0, sD = 0, totalGeral = 0;

        for (Consulta c : lista) {
            totalGeral += c.getValor();
            // Polimorfismo: apenas a classe correta vai somar
            sP = c.somarPresencial(sP);
            sT = c.somarTele(sT);
            sD = c.somarDomiciliar(sD);
            qP = c.addQtdPresencial(qP);
            qT = c.addQtdTele(qT);
            qD = c.addQtdDomiciliar(qD);
        }

        System.out.println("\n--- Relatório de consultas ---");
        System.out.printf("- Teleconsultas: %d (Total: R$ %.2f)\n", qT, sT);
        System.out.printf("- Consultas presenciais: %d (Total: R$ %.2f)\n", qP, sP);
        System.out.printf("- Consultas domiciliares: %d (Total: R$ %.2f)\n", qD, sD);
        System.out.printf("\nValor total (com desconto): R$ %.2f\n", totalGeral);
    }

    public void exibirAgendamento() {
        System.out.println("---- Consulta " + this.tipo + " ----");
        System.out.println("Nome do paciente: " + this.paciente);
        System.out.printf("Valor a pagar: R$ %.2f\n", this.valor);
        confirmar();
        System.out.println("-----------------------------");
    }

    // Métodos abstratos corrigidos - todos retornam double para soma e int para quantidade
    public abstract double somarPresencial(double somaTotal);
    public abstract double somarTele(double somaTotal);  // Corrigido: double ao invés de int
    public abstract double somarDomiciliar(double somaTotal);  // Corrigido: double ao invés de int

    public abstract int addQtdPresencial(int quantia);
    public abstract int addQtdTele(int quantia);
    public abstract int addQtdDomiciliar(int quantia);

    public abstract void aplicarDescontoAutomatico();

    public abstract void exibirSe(Class<?> tipoAlvo);

    public double getValor() {
        return valor;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = (percentual / 100) * this.valor;
            this.valor -= desconto;
        } else {
            System.out.println("Percentual de desconto inválido. Deve ser entre 0 e 100.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}