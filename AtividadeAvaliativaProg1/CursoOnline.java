public class CursoOnline extends Curso{
    private String Link;
    private String Idioma;

    public CursoOnline(String Link, String Idioma, String Nome, String Nivel, int TotalHoras, Linguagem linguagem){
        super(Nome, Nivel, TotalHoras, linguagem);
        this.Idioma = Idioma;
        this.Link = Link;
    }

    public String getLink(){
        return Link;
    }

    public void setLink(String Link){
        this.Link = Link;
    }

    public String getIdioma(){
        return Idioma;
    }

    public void setIdioma(String Idioma){
        this.Idioma = Idioma;
    }
    
}
