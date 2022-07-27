package OO.MétodosEspeciais;

public class ContaBanco {

   public int numConta;
   protected String tipo; //Corrente (CC) ou poupança (CP)
   private String dono;
   private Float saldo;
   private boolean status; //Conta trancada ou não

  

   
   //Métodos personalizados

   public void estadoAtual(){
       System.out.println("==========================");
       System.out.println("Conta: " + this.getnumConta());
       System.out.println("Tipo: " + this.getTipo());
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: R$" + this.getSaldo());
       System.out.println("Status: " + this.getStatus());
   }

   public void abrirConta(String t){
          setTipo(t);
          setStatus(true);
    
    
      if(tipo == "cc" || tipo =="CC"){
           this.saldo = 50.00f;
       }
       else if(tipo == "cp" || tipo =="CP"){
           this.saldo = 150.00f;
       } else {
           System.out.println("<<ERRO>\n Selecione CC ou CP");
       }
    
      
   }
   
   public void fecharConta(){
      if(this.getSaldo() > 0){
        
        System.out.println("Saldo existente na conta");

      } else if (this.getSaldo() < 0){
          System.out.println("<<ERRO> \n Conta em débito");
      }
     
       else{
           setStatus(false);
           System.out.println("Conta fechada com sucesso");
       }

   }

   public void depositar(float v){
      if(status == true){
          saldo += v;

      } else{
          System.out.println("Impossível depositar");
      }





   }
   public void sacar(float v){
    if(this.getStatus()){
        if(this.getSaldo() >= v){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Saque realizado com sucesso");

        } else{
            System.out.println("Saldo insuficiente");
        }
    } else{
        System.out.println("Conta fechada, impossível sacar");
    }

}
   public void pagarMensal(){
       float v = 0;

       if(tipo == "CC" || tipo == "cc"){
           v = 12f;
       } 

       else if(tipo == "CP" || tipo == "cp"){
           v = 20f;
       }
        
       if(status == true && saldo >= v){
           saldo-= v;
           
           
       } else{
           System.out.println("Saldo insuficiente");
       }

   }

    /*Métodos especiais*/
   
    public void contaBanco(){
        this.saldo = 0f;
        this.status = false;
    }
    


    public int getnumConta(){
        return this.numConta;
    }

    public int setnumConta(int nc){
        return numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String setTipo(String t){
        return tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public String setDono(String d){
        return dono = d;
    }

   public float getSaldo(){
       return this.saldo;
   }

   public float setSaldo(float s){
       return saldo = s;
   }

   public boolean getStatus(){
       return this.status;
   }

   public boolean setStatus(boolean st){
          return status = st;
   }








    


    
}
