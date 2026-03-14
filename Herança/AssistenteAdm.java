package Herança;

public class AssistenteAdm extends Assistente{
    //Assistentes Administrativos possuem um turno (dia ou noite) e um
    // adicional noturno
    private String turno;
    private double adicionalNoturno;

    public AssistenteAdm(String turno, double adicionalNoturno, double bonusSalarial, String nome, String endereco, String sexo, int anoContratacao, String especializacão){
        super(nome, endereco, sexo, anoContratacao, especializacão)
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public
}
