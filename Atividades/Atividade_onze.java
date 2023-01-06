package curso_programacao;

import java.util.Scanner;

public class Atividade_onze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("Desconto de: %.2f%n ", desconto);
		
		sc.close();
	}

}
