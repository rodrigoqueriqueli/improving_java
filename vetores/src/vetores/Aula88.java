package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Product88;

public class Aula88 {

	public static void main(String[] args) {
		// Aula 88 vetor de referência
		
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				Product88[] vect = new Product88[n];
				
				for (int i=0; i < vect.length; i++) {
					sc.nextLine();
					String name = sc.nextLine();
					double price = sc.nextDouble();
					vect[i] = new Product88(name, price);
				}
				
				double sum = 0.0;
				for (int i=0; i < vect.length; i++) {
					sum += vect[i].getPrice();
				}
						
				double avg = sum / vect.length;
				
				System.out.printf("AVERAGE PRICE: %.2f%n", avg);
				
				sc.close();

	}

}
