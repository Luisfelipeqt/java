package curso_programacao;

import java.util.Scanner;

public class Atividade_cinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		double cachorroQuente = 4.0;
		double x_salada = 4.50;
		double x_bacon = 5.0;
		double torrada = 2.0;
		double refrigerante = 1.50;
		
		double qntUm = sc.nextDouble();
		double qntDois = sc.nextDouble();
		double resultado = qntUm * qntDois;
		
		if (qntUm == 1) {
			double c = cachorroQuente * qntDois;
			System.out.println("Total: " + resultado);
		}
		else if (qntUm == 2) {
			double c = x_salada * qntDois;
			System.out.println("Total: " + c);
		}
		
		else if (qntUm == 3) {
			double c = x_bacon * qntDois;
			System.out.println("Total: " + c);
		}
		else if (qntUm == 4) {
			double c = torrada * qntDois;
			System.out.println("Total: " + c);
		}
		else if (qntUm == 5) {
			double c = refrigerante * qntDois;
			System.out.println("Total: " + c);
		}
		else {
			System.out.println("Não existe esse item no MENU;");
			
		}
		
		
		
				

	}

}
