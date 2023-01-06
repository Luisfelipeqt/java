package curso_programacao;

import java.io.InputStream;
import java.util.Scanner;

public class Atividade_treze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
			
			
			
		}
		System.out.println(soma);
		sc.close();
	}

	
	

}
