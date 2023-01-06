package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Ordem_Client;
import Entities.enums.Client;
import applications.OrdemStatus;
import applications.OrderItem;
import applications.Product;

public class Program_Ordem {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		
	
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		
		Ordem_Client order = new Ordem_Client(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			
			System.out.print("Product name: ");
			sc.nextLine();
			
			String nomeProduto = sc.nextLine();
			
			System.out.print("Product price: ");
			
			double priceProduto = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantidadeProduto = sc.nextInt();
			
			Product product = new Product(nomeProduto, priceProduto);
			
			OrderItem it = new OrderItem(quantidadeProduto, priceProduto, product);
			
			order.addItem(it);
			
			
			
		}
		
		
		System.out.println();
		System.out.println(order);
		
		
		
		sc.close();
	}

}
