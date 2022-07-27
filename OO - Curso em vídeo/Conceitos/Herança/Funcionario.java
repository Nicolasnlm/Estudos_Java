package OO.Herança;

public class Funcionario extends Pessoa {

    
     private String setor;
     private boolean trabalhando;

   
   
     //Métodos principais

    public Funcionario(String n, int i, String s, String st) {
        super(n, i, s);
        this.trabalhando = true;
        
    }
 
    public Funcionario() {
    }

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    

    //Métodos Especiais

    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
