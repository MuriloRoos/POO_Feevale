package Herança;

public class Assistente extends Funcionario {
    //Crie a classe Assistente, que também é um funcionário, e que possui um atributo 
    // especializacao. Lembre-se de implementar os métodos!

    private String especializacao;

    public Assistente(String nome, String endereco, String sexo, int anoContratacao, String especializacão){
        super(nome, endereco, sexo, anoContratacao);
        this.especializacao = especializacão;
    }

    public String getEspecializacao(){
        return especializacao;
    }
    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }

}
