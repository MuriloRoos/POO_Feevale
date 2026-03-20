package POO_Herança_Atividade;

public class AuxiliarContratado extends FuncionarioContratado {
    private int abcdef;

    public AuxiliarContratado(int abcdf, int Matricula, String Nome, int CPF, int datanasc){
        super (Matricula, Nome, CPF, datanasc);
        this.abcdef = abcdef;
    }

    public int getAbcdef(){
        return abcdef;
    }

    public void setAbcdef(int abcdef){
        this.abcdef = abcdef;
    }
}
