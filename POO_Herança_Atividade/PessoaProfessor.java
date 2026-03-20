package POO_Herança_Atividade;

public class PessoaProfessor {
    //nome, cpf, datanasc
    private String Nome;
    private int CPF;
    private int datanasc;

    public PessoaProfessor(String Nome, int CPF, int datanasc){
        this.Nome = Nome;
        this.CPF = CPF;
        this.datanasc = datanasc;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }
}
