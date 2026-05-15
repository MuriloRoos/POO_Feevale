package TrabalhoConsultas;

public class Presencial extends Consulta {
    private String sala;

    public Presencial(String sala, String paciente, double valor) {
        super(paciente, valor);
        this.sala = sala;
        this.setTipo("Presencial");
       
    }
    @Override
    public double somarPresencial(double somaTotal) {
        return somaTotal += this.getValor();
    }

    @Override
    public int adicionarQuantiaPresencial(int quantia){
        return quantia+1;
    }

    @Override
    public void confirmar() {
        System.out.print("\nSala: " + sala);
        System.out.print("\nChegar com 15 minutos de antecedência.");
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}