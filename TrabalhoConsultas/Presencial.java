public class Presencial extends Consulta {
    private String sala;

    public Presencial(String sala, String paciente, double valor) {
        super(paciente, valor);
        this.sala = sala;
        tipo = "Presencial";
    }
    @Override
    public double somarPresencial(int somaTotal) {
        return somaTotal += this.getValor();
    }

    @Override
    public double somarTele(int somaTotal) {
        return somaTotal;
    }

    @Override
    public double somarDomiciliar(int somaTotal) {
        return somaTotal;
    }

    @Override
    public void confirmar() {
        System.out.print("Sala: " + this.sala);
        System.out.println("\nChegar com 15 minutos de antecedência.");
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}