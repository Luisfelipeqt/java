package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		
		
		
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.print("Enter the number of products to be add in sotck: ");
		
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println();
		
		System.out.println();
		System.out.print("Update data: " + produto);		
		
		
		
		
		
		
		sc.close();
	}
}
