package OO.MétodosEspeciais;

public class Caneta{

    public String modelo;
    public String cor;
    private float ponta;
    public int carga;
    public boolean tampada;


  public Caneta (String m, String c, float p){ //Método Construtor
   this.tampar();
   this.cor = "Vermelho";
   this.cor = c;
   this.modelo = m;
   this.tampar();
   this.setPonta(p);

    }




   public void status(){
        
         System.out.println("Sobre a Caneta: ");
         System.out.println("Modelo " + this.modelo); 
         System.out.println("Ponta " + this.getPonta());
    
    
    
    
        /*System.out.println("Uma caneta " + this.cor);
         System.out.println("Carga = " + carga + "%");
         System.out.println("Tampada? " + this.tampada);
         System.out.println("Ponta " + ponta);
         System.out.println("Modelo = " + modelo);*/
    }

    public void rabiscar(){

        if(tampada == false){

            System.out.println("*Rabiscando ======>*");
        } else{

            System.out.println("Caneta tampada, impossível rabiscar ======xx");
        }

        
        
    }

   public void tampar(){

        this.tampada = true;

    }

    public void destampar(){

        this.tampada = false;


    }

    public String getModelo(String m){
        return this.modelo = m;
    }
    
    public String setModelo(String m){
        return this.modelo = m;
    }

    public float getPonta(){
        return  this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }
   


}