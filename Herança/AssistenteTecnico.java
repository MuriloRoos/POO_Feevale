package Herança;

public class AssistenteTecnico extends Assistente {
    //Sabendo que os Assistentes Técnicos possuem um percentual de bônus salarial 
    private double bonusSalarial;

    public AssistenteTecnico(double bonusSalarial, String nome, String endereco, String sexo, int anoContratacao, String especializacão){
        super(nome, endereco, sexo, anoContratacao, especializacão);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial(){
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }
}
