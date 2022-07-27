package OO.Herança;

public class Professor extends Pessoa{


    private String especialidade;
    private float salario;


   //Métodos Principais


    public Professor(String n, int i, String s, float sal, String es) {
        super(n, i, s);
        this.especialidade = es;
        this.salario = sal;
        
    }
    


    public Professor() {
    }



    public void receberAum(float aum){
        this.salario+= aum;
        
    }


    //Métodos Especiais

    

    
    public String getEspecialidade() {
        return especialidade;
    }

   
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
