
public class ProjetoVideo {

   
    public static void main(String args[]) {
       
        Video[] v = new Video[3];
        v[0] = new Video ("Como instanciar Objetos");
        v[1] = new Video ("Java para iniciantes");
        v[2] = new Video ("Arrays");
        
       /* 
        v[0].play();
        v[0].pause();
        System.out.println("\n\n" + v[0].toString());
       */

        Gafanhoto[] g = new Gafanhoto[3];
         g[0] = new Gafanhoto("José", 21, "M", "xXSenhor_das_TrevasXx");
         g[1] = new Gafanhoto("Alana", 25, "F", "Amandaa");
         
        //System.out.println(g[0].toString());
        

        Visualizacao vis = new Visualizacao(g[0], v[1]);
        vis.avaliar(55.5f);
        System.out.println(vis.toString());
     
    }
}
