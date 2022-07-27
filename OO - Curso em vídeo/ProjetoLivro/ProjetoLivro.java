package OO.ProjetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];


        p[0] = new Pessoa("José", 19, "Masculino");

        p[1] = new Pessoa("Antônio", 48, "Masculino");

        p[2] = new Pessoa("Josefa", 30, "Feminino");


        l[0] = new Livro("Marcenaria Aplicada", "Rodrigues Vieira","Antônio", 152);
        l[1] = new Livro("Rosas no Jardim Dourado","Anna Linkspt", "Josefa", 58);
        l[2] = new Livro("Finanças e Investimentos", "Gabriel Santos", "José", 35);

    
        l[0].abrir();
        l[0].folear(233);
       System.out.println(l[0].detalhes());
       

    }
    
}
