package OO.Polimorfismo;

public class lobo extends Mamífero {

    public void enterrarOsso(){
        System.out.println("*Enterrando Osso*");
    }

    public void abanarRabo(){
        System.out.println("*Abanando Rabo*");
    }

    @Override
    public void emitirSom(){
        System.out.println("*auuuuuuuu*");
    }
}
