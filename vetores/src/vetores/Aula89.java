package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Aula89 {

	public static void main(String[] args) {
		// Exercicio de fixacao da aula 89

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cliente vect[] = new Cliente[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d:%n", i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Cliente(name, email, room);
			System.out.println();
		}
		System.out.println();
		System.out.println("Busy rooms: ");

		for (int i = 0; i < vect.length; i++)
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s%n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
			}

		sc.close();
	}

}
