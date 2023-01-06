package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Empregados;

public class Main_Empregados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		double salary;

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Empregados> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();

			System.out.print("Id: ");
			id = sc.nextInt();
			System.out.print("Salary: ");
			salary = sc.nextDouble();

			list.add(new Empregados(name, id, salary));
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id_dois = sc.nextInt();
		Empregados temp = list.stream().filter(x -> x.getId() == id_dois).findFirst().orElse(null);

		if (temp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			temp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Empregados obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<Empregados> list, int id) {
		Empregados temp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return temp != null;
	}
}




