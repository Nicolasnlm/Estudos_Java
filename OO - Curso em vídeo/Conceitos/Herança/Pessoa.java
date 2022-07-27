package OO.Herança;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;


    //Métodos Principais

   public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    public Pessoa() {
}

    public void  fazerAniv(){
       this.idade++;

    }

    

   //Métodos Especiais
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString(){
        return "\nNome: " + nome + "\nIdade: "
        + idade + "\nSexo: " + sexo;
    }
}
