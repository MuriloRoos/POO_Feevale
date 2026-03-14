package Herança;

public class Conta {
	private int numero; 
	private double saldo;
	private Correntista correntista;
	//adicione um atributo gerente
	private Gerente gerente;
	
	//construtor
	public Conta() {
		// atribui valores padrão aos atributos
	}
	
	public Conta(int n) {
		numero = n; // this.numero = numero;
		saldo = 0;
	}
	
	public Conta(int numero, double saldo) {
		super(); //herança
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta (int numero, double saldo, Correntista correntista) {
		this.numero = numero;
		this.saldo = saldo;
		this.correntista = correntista;
		
	}
	//comportamentais
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void retirar(double valor) {
		saldo = saldo - valor;
	}
	
	//gets e sets
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public static exibirDados()
	// printar gerente -- conta -- correntista
	//printar +gerente.getnome(), numero, saldo,  correntista.getnome, correntista.getendereço
}
