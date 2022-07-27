package OO.ProjetoEmojiCombat;
public class Lutador {
   


    //Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    //Métodos especiais 

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }
        

       public float getAltura() {
           return altura;
       }

      public void setAltura(float altura) { 
    this.altura = altura;
      }

      
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public String getNacionalidade() {
       return nacionalidade;
   }
    
   public void setNacionalidade(String nacionalidade) {
       this.nacionalidade = nacionalidade;
   }


   public String getCategoria() {
       return categoria;
   }

   public void setCategoria(String categoria) {
       this.categoria = categoria;
       if(this.getPeso() < 52.2f){
           this.categoria = "Inválido Zé";
        
       } else if(this.getPeso() <= 78.3){
           this.categoria = "Peso Leve";
       
        } else if(this.getPeso() <=83.9){
           this.categoria = "Médio";
       }
        else if (this.getPeso() <= 128.2){
          this.categoria = "Pesado";
        }
 
        else{
            this.categoria = "Inválido";
        }
        
       

   }
  
    public String getNome() {
        return nome;
    }
     
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }
   
    public int getVitorias() {
        return vitorias;
    }

    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    
    public int getDerrotas() {
        return derrotas;
    }

    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
   
    
 
    //Métodos da Interface

    public void apresentar(){
        System.out.println("=========x===========");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println("Com " + this.getAltura() + "cm de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Vitórias " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    };

    public void status(){
        System.out.println(this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    };

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    };

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    };

    public void empatar(){
        setEmpates(getEmpates() + 1);
    };



}
    

