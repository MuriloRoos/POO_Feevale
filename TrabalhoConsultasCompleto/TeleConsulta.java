package TrabalhoConsultas;
public class TeleConsulta extends Consulta {

    private String linkAcesso;

    public TeleConsulta(String linkAcesso, String paciente, double valor) {
        super(paciente, valor);
        this.linkAcesso = linkAcesso;
        this.setTipo("Tele");
    }

    @Override
    public int adicionarQuantiaTele(int quantia){
        return quantia+1;
    }

    @Override
    public void aplicarDescontoTele(){
        aplicarDesconto(10);
    }

    @Override
    public double somarTele(double somaTotal) {
        return somaTotal += this.getValor();
    }
    
    @Override
    public void confirmar() {
        System.out.print("\nLink de acesso: " + linkAcesso);
        System.out.print("\nEntre com 5 minutos de antecedência.");
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }
}