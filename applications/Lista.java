package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add("Felipe");
		list.add(2, "Laura Vitória");
		list.add("Marcio");
		list.add("Marilia");
		list.add("Mano Brown");
		System.out.println("Ana Luisa");
		System.out.println("André");
		System.out.println("Antonio");

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		//list.remove(1);
		//list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Felipe: " + list.indexOf("Felipe"));

		System.out.println("-------------------------------");

		List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : resultado) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

		
	}

}
