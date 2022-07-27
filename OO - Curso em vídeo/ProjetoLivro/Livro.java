package OO.ProjetoLivro;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;
    

  //Métodos Especiais


  public Livro(String t, String au, String le, int tp) {
    this.titulo = t;
    this.totPaginas = tp;
    this.autor = au;
    this.leitor = le;
    this.pagAtual = 0;
    this.aberto = false;
  }

    public String detalhes(){
    return "Título: " + titulo + "\nAutor: " + autor + "\nNúmero de páginas: " + 
    totPaginas + "\nAberto: " + aberto + "\nLeitor: " + leitor + "\nPáginas Atual: " +
   this.getPagAtual();}
 

  

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

 
    public String getAutor() {
        return autor;
    }

   
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

  
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

   
    public boolean isAberto() {
        return aberto;
    }

   
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

   
    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

   //Métodos implementados

    @Override
    public void abrir() {
        if(this.isAberto() == true){
            System.out.println("O livro já está aberto");

        } else{
          this.setAberto(true);
           
        }
        
    }

    @Override
    public void fechar() {
        if(this.isAberto() == false){
            System.out.println("O livro já está aberto");

        } else{
            this.setAberto(false);
           
        }
        
    }

    @Override
    public void folear(int p) {
        if(p> this.totPaginas){
        this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
        
    }

    @Override
    public void nextPag() {
        this.pagAtual++;
        
        
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        
        
    }

   

}
