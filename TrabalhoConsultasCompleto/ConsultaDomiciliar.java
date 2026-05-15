package TrabalhoConsultas;

public class ConsultaDomiciliar extends Consulta {

    private String endereco;
    

    public ConsultaDomiciliar(String endereco, String paciente, double valor) {
        super(paciente, valor);
        this.endereco = endereco;
        this.setTipo("Domiciliar");
    }

    @Override
    public void confirmar() {
        System.out.print("\nEndereço da consulta: " + endereco);
        System.out.print("\nO médico chegará em até 1 hora.");
    }

    @Override
    public int adicionarQuantiaDomiciliar(int quantia){
        return quantia+1;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public double somarDomiciliar(double somaTotal) {
        return somaTotal += this.getValor();
    }
}
