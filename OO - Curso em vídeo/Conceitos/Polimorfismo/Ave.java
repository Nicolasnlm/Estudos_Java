package OO.Polimorfismo;

public class Ave extends Animal{


    private String corPena;
    protected float peso;
    protected int idade;
    protected int membros;
 



    @Override
    public void locomover() {
        System.out.println("*Voando*");
        
        
    }

    @Override
    public void alimentar() {
        System.out.println("*Comendo minhoca*");
        
        
    }

    @Override
    public void emitirSom() {
        System.out.println("*Som de Ave*");
        
        
    }

    public void construirNinho(){
        System.out.println("*Construindo Ninho*");
    }

    

    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
