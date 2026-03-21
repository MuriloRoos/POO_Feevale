
public class Curso{

    private String Nome;
    private String Nivel;
    private int TotalHoras;
    private Linguagem linguagem;

    public Curso(String Nome, String Nivel, int TotalHoras, Linguagem linguagem){
        this.Nome = Nome;
        this.Nivel = Nivel;
        this.TotalHoras = TotalHoras;
        this.linguagem = linguagem;
    }

    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }


    public String getNivel(){
        return Nivel;
    }

    public void setNivel(String Nivel){
        // iniciante, intermediario ou avançado
        this.Nivel = Nivel;
    }

    public int getTotalHoras(){
        return TotalHoras;
    } 

    public void setTotalHoras(int TotalHoras){
        if (this.TotalHoras <= 0)
            System.out.println("Erro: valor menor ou igual a zero, coloque um valor correto");

        this.TotalHoras = TotalHoras;
    }

    public Linguagem getlinguagem(){
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem){
        this.linguagem = linguagem;
    }

}