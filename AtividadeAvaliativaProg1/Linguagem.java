
public class Linguagem {
    private String Nome;
    private Curso curso;

    public Linguagem(){

    }
    
    public Linguagem(String Nome, Curso curso){
        this.Nome = Nome;
        this.curso = curso;
    }
    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
