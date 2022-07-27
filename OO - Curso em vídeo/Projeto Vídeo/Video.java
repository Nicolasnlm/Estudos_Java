
public class Video implements AcoesVideo {


    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;



  public Video(String titulo) {
    this.titulo = titulo;
    this.avaliacao = 1;
    this.curtidas = 0;
    this.reproduzindo = false;
  }





    public void play() {
        if(this.reproduzindo == false){
            this.reproduzindo = true;
            System.out.println("> Reproduzindo...");
        }
        
    }

    
    public void pause() {
        if(this.reproduzindo == true){
            this.reproduzindo = false;
            System.out.println("|| Vídeo pausado");
        }
        
        
    }

    
    public void like() {
        this.curtidas++;
        System.out.println("Vídeo curtido");
        
        
    }
    
    //Getter n' Setters

    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
    public int getAvaliacao() {
        return avaliacao;
    }

   
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
        int nova = this.avaliacao + avaliacao/this.views;
        this.avaliacao = nova;
    }

 
    public int getViews() {
        return views;
    }

  
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    
    public boolean isReproduzindo() {
        return reproduzindo;
    }

  
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + 
                ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" 
                + reproduzindo + '}';
    }
    
    

}
