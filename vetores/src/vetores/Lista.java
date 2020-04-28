package vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// Aula 93 - Listas
		
		List <String> list = new ArrayList<>(); //instanciando a lista do tipo interface através da Classe ArrayList
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x); //listando todos elementos da lista por meio do for each
		}
		System.out.println("-----------------------------");

		list.remove("Anna");
		list.remove(1);
		
		System.out.println("-----------------------------");
		
		list.add("Maria");
		list.add("Alex");
		list.add("Anna");
		
		
		list.removeIf(x -> x.charAt(0) == 'M'); //função lambda (predicato)., retorno do predicado é vdd ou falso
		//o remove acima deletou todos os elementos que começam com a letra M
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-----------------------------");
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("-----------------------------");
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);
		
		
	}

}
