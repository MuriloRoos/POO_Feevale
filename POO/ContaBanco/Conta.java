package ContaBanco;
public class Conta {
    private int numero;
    private double saldo;
    private double investimento;
    public Conta(){

    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo(){
        return saldo;
    }

    public double getInvestimento(){
        return investimento;
    }
}
