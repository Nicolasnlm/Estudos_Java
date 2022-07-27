package OO.Polimorfismo;

public class Mamífero extends Animal {

   private String corPelo;
   protected float peso;
   protected int idade;
   protected int membros;





    @Override
    public void locomover() {
        System.out.println("*Correndo*");
       
        
    }

    @Override
    public void alimentar() {
        System.out.println("*Mamando*");
       
        
    }

    @Override
    public void emitirSom() {
        System.out.println("*Som de mamífero*");
       
        
    }
    
    //Getters e Setters

   
    public String getCorPelo() {
        return corPelo;
    }

  
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void setPeso(double d) {
    }

    public void setIdade(int i) {
    }

    public void setMembros(int i) {
    }

}
