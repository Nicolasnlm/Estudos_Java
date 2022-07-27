package OO.Herança;

public class Aluno extends Pessoa {


    private boolean matr;
    private String curso;


    public Aluno(String n, int i, String s, String c) {
        super(n, i, s);
        matr = true;
    
        
    }

    public Aluno() {
    }

    public void cancelMatr(){
        this.setMatr(false);
        System.out.println("Matrícula Cancelada");
    }
     

    






     //Métodos Especiais  
   
    public boolean isMatr() {
        return matr;
    }

    
    public void setMatr(boolean matr) {
        this.matr = matr;
    }

   
    public String getCurso() {
        return curso;
    }

   
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
