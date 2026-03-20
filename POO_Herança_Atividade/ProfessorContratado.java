package POO_Herança_Atividade;

import javax.xml.crypto.Data;

public class ProfessorContratado extends FuncionarioContratado {
    private String Formacao;

    public ProfessorContratado(String Formacao, int Matricula, String Nome, int CPF, int datanasc){
        super(Matricula, Nome, CPF, datanasc);
        this.Formacao = Formacao;
    }

    public String getFormacao(){
        return Formacao;
    }

    public void setFormacao(){
        this.Formacao = Formacao;
    }
}
