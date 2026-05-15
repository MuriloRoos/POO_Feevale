package TrabalhoConsultasIncompleto;

public class ConsultaDomiciliar extends Consulta {
    private String endereco;

    public ConsultaDomiciliar(String endereco, String paciente, double valor) {
        super(paciente, valor);
        this.endereco = endereco;
        this.tipo = "Domiciliar";
    }

    @Override
    public void confirmar() {
        System.out.print("Endereço da consulta: " + this.endereco);
        System.out.println("\nO médico chegará em até 1 hora.");
    }

    @Override
    public void aplicarDescontoAutomatico() {
        // Sem desconto para presenciais
    }

    // IMPLEMENTAÇÃO PARA CONSULTAS DOMICILIARES
    @Override
    public double somarDomiciliar(double somaTotal) {
        return somaTotal + this.getValor();
    }

    @Override
    public int addQtdDomiciliar(int quantia) {
        return quantia + 1;
    }

    // Retorna 0 para outros tipos (polimorfismo)
    @Override
    public double somarPresencial(double somaTotal) {
        return somaTotal; // Não soma nada
    }

    @Override
    public double somarTele(double somaTotal) {
        return somaTotal; // Não soma nada
    }

    @Override
    public int addQtdPresencial(int quantia) {
        return quantia; // Não incrementa
    }

    @Override
    public int addQtdTele(int quantia) {
        return quantia; // Não incrementa
    }

    @Override
    public void exibirSe(Class<?> tipoAlvo) {
        if (tipoAlvo.isInstance(this)) {
            exibirAgendamento();
        }
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}