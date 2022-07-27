package OO.Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
      

    Mamífero m = new Mamífero();

    Canguru c = new Canguru();

    lobo k = new lobo();

    cachorro ca = new cachorro();

    Cobra jorge = new Cobra();

    Tartaruga t = new Tartaruga();

    Goldfish g = new Goldfish();

    Arara azulao = new Arara();

    



     m.setPeso(5.70f);
     m.setIdade(8);
     m.setMembros(4);
     m.locomover();
     m.alimentar();
     m.emitirSom();

     System.out.println("=================");

     c.setPeso(55.30f);
     c.setIdade(3);
     c.setMembros(4);
     c.locomover();
     c.alimentar();
     c.emitirSom();
     c.usarBolsa();

     System.out.println("=================");

     k.setPeso(3.83f);
     k.setIdade(5);
     k.setMembros(4);
     k.locomover();
     k.alimentar();
     k.emitirSom();
     k.abanarRabo();
     k.enterrarOsso();

     System.out.println("=================");

     azulao.alimentar();
     azulao.construirNinho();
     azulao.locomover();

     System.out.println("=================");

     jorge.locomover();
     jorge.alimentar();

     System.out.println("=================");

     t.locomover();
     t.alimentar();

     System.out.println("=================");
     
     g.locomover();
     g.alimentar();
     g.soltarBolha();


     System.out.println("=================");

     ca.emitirSom();
     


    }
    
}
