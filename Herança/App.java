package Herança;

public class App {
    
    public static void main(String args[])
	{
		//nome, endereco, sexo, ano de contratação
		Funcionario mu = new Funcionario("Murilo", "Rolante", "Masculino", 2024);
		Gerente al = new Gerente (1, "Alceu", "Rolante", "Masculino", 2025);
		Assistente jo = new Assistente("joana", "Rolante","Feminino", 2025, "técnica");
		System.out.println(mu.getNome());
		System.out.println(al.getNome());
		System.out.println(jo.getNome());

		//correntista, gerente, assitente,  conta c1, exibir dados()
	}
}
