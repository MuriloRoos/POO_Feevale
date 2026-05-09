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
    public void gerarRelatorio(ArrayList<Consulta> listaConsultas) {
    int consultasPresencial = 0;
    int consultasDomiciliar = 0;
    double somaTotal = 0.0;
    double somaTotalPresencial = 0.0;


    for(Consulta c : listaConsultas) {
        somaTotal += c.getValor();
        somarPresencial(somaTotalPresencial);
    }

   
    // System.out.println("\n--- Relatório de consultas ---");
    // System.out.println("- Teleconsultas: " + consultasTele + " (Total: R$ " + String.format("%.2f", somaTotalTele) + ")");
    // System.out.println("- Consultas presenciais: " + consultasPresencial + " (Total: R$ " + String.format("%.2f", somaTotalPresencial) + ")");
    // System.out.println("- Consultas domiciliares: " + consultasDomiciliar + " (Total: R$ " + String.format("%.2f", somaTotalDomiciliar) + ")");
    // System.out.printf("\nValor total (com desconto): R$ %.2f%n", somaTotal);
    }

    public void exibirAgendamento() {
        System.out.println("---- Consulta " + this.tipo + " ----");
        System.out.println("Nome do paciente: " + this.paciente);
        
        System.out.printf("Valor a pagar: %.2f ", this.valor);
        
        confirmar();
        
        System.out.println();
        System.out.println("-----------------------------");
    }
    
    public abstract double somarPresencial(int somaTotal);
    public abstract double somarTele(int somaTotal);
    public abstract double somarDomiciliar(int somaTotal);

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

    public void aplicarDesconto(double percentual){
        if(percentual > 0 && percentual <= 100){
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