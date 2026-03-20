package POO_Herança_Atividade;

public class ProfessorConcursado extends PessoaProfessor {
    private String Cargo;

    public ProfessorConcursado(String Cargo, String Nome, int CPF, int datanasc){
        super(Nome, CPF, datanasc);
        this.Cargo = Cargo;
    }

    public String getCargo(){
        return Cargo;
    }

    public void setCargo(String Cargo){
        this.Cargo = Cargo;
    }
}
