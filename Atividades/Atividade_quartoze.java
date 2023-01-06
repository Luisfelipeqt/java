package curso_programacao;

import java.util.Scanner;

public class Atividade_quartoze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha;
		senha = sc.nextInt();
		int password = 2002;
		if (senha != password) {
			System.out.println("Senha inválida");

		} else {
			System.out.println("Acesso Permitido");
		}

		while (senha != password) {
			senha = sc.nextInt();
			if (senha != password) {
				System.out.println("Senha inválida");
			}
			else {
				System.out.println("Acesso Permitido");
			}

		}
		sc.close();
	}

}
