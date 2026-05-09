public class TeleConsulta extends Consulta {

    private String linkAcesso;

    public TeleConsulta(String linkAcesso, String paciente, double valor) {
        super(paciente, valor);
        this.linkAcesso = linkAcesso;
        tipo = "Tele";
    }

    @Override
    public double somarPresencial(int somaTotal) {
        return somaTotal;
    }

    @Override
    public double somarTele(int somaTotal) {
        return somaTotal += this.getValor();
    }

    @Override
    public double somarDomiciliar(int somaTotal) {
        return somaTotal;
    }

    @Override
    public void confirmar() {
        System.out.print("Link de acesso: " + this.linkAcesso);
        System.out.println("\nEntre com 5 minutos de antecedência.");
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }
}