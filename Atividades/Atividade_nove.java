package curso_programacao;

import java.util.Scanner;

public class Atividade_nove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double basico = sc.nextDouble();
		double valor;
		double valor_dois;
		double valor_tres;
		
		if (basico <= 100) {
			
			System.out.println("Valor a pagar: R$50.00");
		}
		else if (basico >= 101) {
			 valor = basico - 100;
			 valor_dois = valor * 2;
			 valor_tres = valor_dois + 50;
			 System.out.printf("Valor a pagar: R$ %.2f%n", valor_tres);
			
			
		}
		
		sc.close();
	}

}
