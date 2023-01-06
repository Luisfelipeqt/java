package curso_programacao;

import java.util.Scanner;

public class Atividade_dez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia;
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido!";
			break;
		
	
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

}
