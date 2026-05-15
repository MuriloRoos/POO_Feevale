package TrabalhoConsultas;

public abstract class Consulta {
    private String tipo;
    private String paciente;
    private double valor;

    public Consulta(String paciente, double valor) {
        this.paciente = paciente;
        this.valor = valor;
        
    }

    public abstract void confirmar();

    public void exibirAgendamento() {
        System.out.println("---- Consulta " + this.tipo + " ----");
        System.out.println("Nome do paciente: " + this.paciente);
        
        System.out.printf("Valor a pagar: %.2f ", this.valor);
        confirmar();
        System.out.println();
        System.out.println("-----------------------------");
    }
    
    public double somarPresencial(double somaTotal){
        return somaTotal;
    };
    public double somarTele(double somaTotal){
        return somaTotal;
    };
    public double somarDomiciliar(double somaTotal){
        return somaTotal;
    };

    public int adicionarQuantiaTele(int quantia){
        return quantia;
    }

    public int adicionarQuantiaDomiciliar(int quantia){
        return quantia;
    }

    public int adicionarQuantiaPresencial(int quantia){
        return quantia;
    }

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
        if(percentual >= 0 && percentual <= 100){
            double desconto = (percentual / 100) * this.valor;
            this.valor -= desconto;
        } else {
            System.out.println("Percentual inválido.");
        }
    }

    public void aplicarDescontoTele(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}