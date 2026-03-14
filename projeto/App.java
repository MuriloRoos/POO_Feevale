
public class App {
	public static void main(String args[]) {
		Conta c1;
		c1 = new Conta(123);
		Conta c2 = new Conta();
		c1.depositar(500);
		c1.depositar(15); //c1.saldo = c1.saldo +15;
		System.out.println(c1.getSaldo());
		c1.retirar(25);
		System.out.println(c1.getSaldo());
		//Associação
		Correntista adri = new Correntista("Adriana", "Canoas");
		Conta cAdri = new Conta(666, 1500.50, adri);
		adri.setConta(cAdri);
		System.out.println(adri.getNome() + " tem " + adri.getConta().getSaldo() + " reais.");
		
	}
}
