package curso_programacao;

import java.util.Scanner;

public class Atividade_um {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.printf("O número: %d não é negativo", x);
				
		}
		else {
			System.out.printf("O número: %d é negativo ", x);
		}
		
		sc.close();
}}
	