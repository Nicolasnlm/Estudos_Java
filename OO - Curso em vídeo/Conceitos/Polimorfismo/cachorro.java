package OO.Polimorfismo;



public class cachorro extends lobo {
    public void emitirSom(){
        System.out.println("au! au! au!");

    };

    public void reagir(String frase){
      if(frase=="toma comida" || frase=="Olá"){
        System.out.println("Abanar e latir");

      }else{
        System.out.println("*Rosnando*");
      }


    }
    public void reagir(int h, int min){
        if(h<12){
            System.out.println("Abanar");
        }else if(h>=18){
            System.out.println("Ignorar");
        } else{
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(Boolean d){
        if(d == true){
            System.out.println("Abanar e latir");
        } else{
            System.out.println("Rosnar");
        }
    }

    public void reagir (int i, float p){
        if(i<5){
            if(p <10){
                System.out.println("Abanar e Latir");
            }

            else if(p <10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
