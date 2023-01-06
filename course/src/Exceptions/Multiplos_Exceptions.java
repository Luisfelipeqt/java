package Exceptions;

public class Multiplos_Exceptions {
	
	public static void main(String[] args) {
		
		int[] numero = {4, 8, 16, 32, 64, 128};
		int[] denom = {2,0 ,4 , 8, 0};
		
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println(numero[i] + "/" + denom[i] + " = " + (numero[i] / denom[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException exc) {
				System.out.println("Aconteceu um erro");
			}
			
			
		}
		
	}

}
