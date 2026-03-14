package Herança;

public class Gerente extends Funcionario {
    //Implemente uma classe Gerente com atributo nivel. foi
    // A classe Gerente é uma especialização de funcionário. foi
    // Lembre-se de implementar os métodos! 

    private int nivel;
    
    public Gerente(int nivel, String nome, String endereco, String sexo, int anoContratacao){
        super(nome, endereco, sexo, anoContratacao);
        this.nivel = nivel;
    }

    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}
