package OO.Polimorfismo;


public class Réptil extends Animal{


   private String corEscama;
   protected float peso;
   protected int idade;
   protected int membros;

   



   public Réptil() {
    
   }
    
    @Override
    public void locomover() {
        System.out.println("*Rastejando*");
       
    }

    @Override
    public void alimentar() {
        System.out.println("*Comendo Vegetais*");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("*Som de Réptil*");
       
        
    }

    
    //Getter e Setters


    public String getCorEscama() {
        return corEscama;
    }

    
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}