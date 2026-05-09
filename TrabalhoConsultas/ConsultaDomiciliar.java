public class ConsultaDomiciliar extends Consulta {

    private String endereco;
    

    public ConsultaDomiciliar(String endereco, String paciente, double valor) {
        super(paciente, valor);
        this.endereco = endereco;
        tipo = "Domiciliar";
    }



    @Override
    public void confirmar() {
        System.out.print("Endereço da consulta: " + this.endereco);
        System.out.println("\nO médico chegará em até 1 hora.");
    }



    public String getEndereco() {
        return endereco;
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public double somarPresencial(int somaTotal) {
        return somaTotal;
    }

    @Override
    public double somarTele(int somaTotal) {
        return somaTotal;
    }

    @Override
    public double somarDomiciliar(int somaTotal) {
        return somaTotal += this.getValor();
    }
}
