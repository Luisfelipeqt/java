package applications;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas?: ");
		int n = sc.nextInt();
		System.out.println();
		double alturaMenor, porcentagemMenor;
		String[] name = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			System.out.println();
		}

		double alturaAux = 0;
		int menores = 0;

		for (int i = 0; i < n; i++) {
			alturaAux += altura[i];
			if (idade[i] < 16) {

				menores += idade[i];

			}

		}

		alturaMenor = alturaAux / n;
		porcentagemMenor = ((double) menores * n) / 100.0 * 100;
		System.out.printf("Altura média das pessoas: %.2f%n", alturaMenor);
		System.out.printf("Porcentagem de pessoas menores de 16 anos: %.1f%%\n", porcentagemMenor);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println("Pessoa menor de 16 anos: " + name[i]);
			}
		}

		sc.close();
	}
}