package OO.Herança;

public class Herança02 {
    public static void main(String[] args) {
        

        Visitante v1 = new Visitante();
        v1.setIdade(20);
        v1.setSexo("Masculino");
        v1.setNome("Antônio");

        Aluno a1 = new Aluno();
        a1.setNome("Leandro");
        a1.setCurso("Engenharia");
        a1.setIdade(23);
        a1.setSexo("Masculino");

        Bolsista b1 = new Bolsista();
        b1.setBolsa(0293f);
        b1.setNome("Jubileu");
        b1.setSexo("Masculino");
        
        b1.cancelMatr();
    }
    
}
