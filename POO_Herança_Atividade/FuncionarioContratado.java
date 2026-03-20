package POO_Herança_Atividade;

public class FuncionarioContratado extends PessoaProfessor {

    private int Matricula;

    public FuncionarioContratado(int Matricula, String Nome, int CPF, int datanasc){
        super(Nome, CPF, datanasc);
        this.Matricula = Matricula;
    }

    public int getMatricula(){
        return Matricula;
    }

    public void setMatricula(){
        this.Matricula = Matricula;
    }
}
