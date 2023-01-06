package curso_programacao;

import java.util.Scanner;

public class Atividade_dois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0 ){
			System.out.printf("O número %d é par", x);
			
		}
		else {
			System.out.printf("O número %d é ímpar", x);
		}
		
		
		sc.close();
	}
		
}
