package TrabalhoConsultasIncompleto;

public class Presencial extends Consulta {
    private String sala;

    public Presencial(String sala, String paciente, double valor) {
        super(paciente, valor);
        this.sala = sala;
        this.tipo = "Presencial";
    }

    @Override
    public void confirmar() {
        System.out.print("Sala: " + this.sala);
        System.out.println("\nChegar com 15 minutos de antecedência.");
    }

    @Override
    public void aplicarDescontoAutomatico() {
        // Sem desconto para presenciais
    }

    // IMPLEMENTAÇÃO PARA CONSULTAS PRESENCIAIS
    @Override
    public double somarPresencial(double somaTotal) {
        return somaTotal + this.getValor();
    }

    @Override
    public int addQtdPresencial(int quantia) {
        return quantia + 1;
    }

    // Retorna 0 para outros tipos (polimorfismo)
    @Override
    public double somarTele(double somaTotal) {
        return somaTotal; // Não soma nada
    }

    @Override
    public double somarDomiciliar(double somaTotal) {
        return somaTotal; // Não soma nada
    }

    @Override
    public int addQtdTele(int quantia) {
        return quantia; // Não incrementa
    }

    @Override
    public int addQtdDomiciliar(int quantia) {
        return quantia; // Não incrementa
    }

    @Override
    public void exibirSe(Class<?> tipoAlvo) {
        if (tipoAlvo.isInstance(this)) {
            exibirAgendamento();
        }
    }

    // Getters e Setters
    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}