public class CursoPresencial extends Curso{
    private String local;
    private int vagas; 

    public CursoPresencial(String local, int vagas, String Nome, String Nivel, int TotalHoras, Linguagem linguagem){
        super(Nome, Nivel, TotalHoras, linguagem);
        this.local = local;
        this.vagas = vagas;
    }

    public String getLocal(){
        return local;
    }

    public void setLoca(String local){
        this.local = local;
    }

    public int getVagas(){
        return vagas;
    }

    public void setVagas(int vagas){
        if(this.vagas > 1)
            System.out.println("Erro: O Numero de alunos deve ser no mínimo 1");
        this.vagas = vagas;
    }
    
}
