

public abstract class Pessoa {


    protected String nome;
    protected int idade;
    protected String sexo;
    protected int exp;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.exp = 0;
    };

    protected void ganharExp(){
        this.exp++;

    };



    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", "
                + "sexo=" + sexo + ", exp=" + exp + '}';
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public int getIdade() {
        return idade;
    };

    public void setIdade(int idade) {
        this.idade = idade;
    };

    public String getSexo() {
        return sexo;
    };

    public void setSexo(String sexo) {
        this.sexo = sexo;
    };

    public int getExp() {
        return exp;
    };

    public void setExp(int exp) {
        this.exp = exp;
    };
    
     

    
    
    
    

    
}
