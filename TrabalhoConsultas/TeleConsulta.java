package TrabalhoConsultasIncompleto;

public class TeleConsulta extends Consulta {
    private String linkAcesso;

    public TeleConsulta(String linkAcesso, String paciente, double valor) {
        super(paciente, valor);
        this.linkAcesso = linkAcesso;
        this.tipo = "Teleconsulta";  // Corrigido: nome mais claro
    }

    @Override
    public void confirmar() {
        System.out.print("Link de acesso: " + this.linkAcesso);
        System.out.println("\nEntre com 5 minutos de antecedência.");
    }

    @Override
    public void aplicarDescontoAutomatico() {
        this.aplicarDesconto(10);  // 10% para teleconsultas
    }

    // IMPLEMENTAÇÃO PARA TELECONSULTAS
    @Override
    public double somarTele(double somaTotal) {
        return somaTotal + this.getValor();
    }

    @Override
    public int addQtdTele(int quantia) {
        return quantia + 1;
    }

    // Retorna 0 para outros tipos (polimorfismo)
    @Override
    public double somarPresencial(double somaTotal) {
        return somaTotal; // Não soma nada
    }

    @Override
    public double somarDomiciliar(double somaTotal) {
        return somaTotal; // Não soma nada
    }

    @Override
    public int addQtdPresencial(int quantia) {
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
    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }
}