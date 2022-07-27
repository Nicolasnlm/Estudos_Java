package OO.Polimorfismo;

public class Peixe extends Animal {


   private String corEscama;
   protected float peso;
   protected int idade;
   protected int membros;


    @Override
    public void locomover() {
        System.out.println("*Nadando*");
        
        
    }

    @Override
    public void alimentar() {
        System.out.println("*Comendo substâncias*");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("*silêncio*");
        
        
    }

    public void soltarBolha(){
        System.out.println("*blob*");
    }
    

    public String getCorEscama() {
        return corEscama;
    }

    
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
