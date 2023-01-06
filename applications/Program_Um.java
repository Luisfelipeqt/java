package applications;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program_Um {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();

		}
		Arrays.sort(vect);
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] <= 0) {
				System.out.print("Números negativos: ");
				System.out.println(vect[i]);

			} else {
				System.out.print("Números positivos: ");
				System.out.println(vect[i]);
			}
		}

	}
}
