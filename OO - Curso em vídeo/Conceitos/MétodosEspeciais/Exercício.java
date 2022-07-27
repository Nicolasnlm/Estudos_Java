package OO.MétodosEspeciais;

public class Exercício{
    public static void main(String[] args) {
           
        //Criando as Contas

        ContaBanco p1 = new ContaBanco();

        p1.setnumConta(1928);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        //p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();

        p2.setnumConta(9012);
        p2.setDono("Creusa");
        
        p2.abrirConta("CP");

        //p2.estadoAtual();

        //Depósito
 
        p1.depositar(300.00f);
        p2.depositar(500.00f);
        
        p1.sacar(350.00f);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
        


        
    }
    
    
}
