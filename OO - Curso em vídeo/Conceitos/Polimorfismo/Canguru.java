package OO.Polimorfismo;

public class Canguru extends Mamífero {

    public void usarBolsa(){
        System.out.println("Usando Bolsa");

    }
    
    @Override
    public void locomover(){
        System.out.println("*Saltando*");
    }
}
