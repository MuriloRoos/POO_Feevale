package Herança;

public class Funcionario {
    //nome, endereco, sexo, ano de contratação, lembre-se de implementar os métodos
    private String nome;
    private String endereco;
    private String sexo;
    private int anoContratacao;

    public Funcionario(String nome, String endereco, String sexo, int anoContratacao){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.anoContratacao = anoContratacao;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereço(){
        return nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getAnoContracacao(){
        return anoContratacao;
    }
    public void setAnoContratacao(int anoContratacao){
        this.anoContratacao = anoContratacao;
    }
}
