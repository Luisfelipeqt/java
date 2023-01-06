import java.util.Locale;

public class Program {
    public static void main(String[] args)   {
        Locale.setDefault(Locale.US);

        double[] notas = {10.0, 9.0};
        
        Aluno aluno = new Aluno();
        aluno.setCurso("Engenharia de Software");
        aluno.setNotas(notas);

        
        System.out.println(aluno.toString());
       
        }
    }


        
        

