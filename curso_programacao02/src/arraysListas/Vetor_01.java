package arraysListas;

import java.util.Locale;
import java.util.Scanner;

public class Vetor_01 {

	public static void main(String[] args) {
		// Aula 87 arrays
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do n: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i < n; i++) {
			sum += vect[i];	
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}

}
