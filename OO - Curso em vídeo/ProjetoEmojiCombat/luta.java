package OO.ProjetoEmojiCombat;

import java.util.Random;

public class luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
   
    


//Métodos 
    
public void marcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
          
        System.out.println("==x====x==x===x==x===x==x===x==");
        System.out.println("Luta aprovada");
 
    } else{
        this.aprovada = false;
        this.desafiado = null;
        this.desafiante = null;

    }

    
}

public void Lutar(){

if(this.aprovada == true){


    System.out.println("===== DESAFIADO =====");
    this.desafiado.apresentar();
    System.out.println("==== DESAFIANTE =====");
    this.desafiante.apresentar();
    
    Random aleatorio = new Random();
    int vencedor = aleatorio.nextInt(3); //0 até 2
    


    switch(vencedor){
        
        case 0: //Empate

        System.out.println("==x====x==x===x==x===x==x===x==");
        System.out.println("Empatou!");
        this.desafiante.empatar();
        this.desafiado.empatar();
        break;

        case 1: //Desafiado ganha
        System.out.println("==x====x==x===x==x===x==x===x==");
        System.out.println(this.desafiado.getNome() + " Ganhou a luta!");
        this.desafiado.ganharLuta();
        this.desafiante.perderLuta();
        break;

        case 2: //Desafiante ganha
        System.out.println("==x====x==x===x==x===x==x===x==");
        System.out.println(this.desafiante.getNome() + " Ganhou a Luta!");
        this.desafiante.ganharLuta();
        this.desafiado.perderLuta();
        break;

    }


    




}else{
    System.out.println("A luta não pode acontecer");
}


}

//Métodos Especiais



    public Lutador getDesafiado() {
        return desafiado;
    }

    
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

  
    public Lutador getDesafiante() {
        return desafiante;
    }

   
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

  
    public int getRounds() {
        return rounds;
    }

   
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

   
    public boolean isAprovada() {
        return aprovada;
    }

    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
