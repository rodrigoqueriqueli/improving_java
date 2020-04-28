package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Main_0004 {

	public static void main(String[] args) {
		// Exercicio01 aula 48 - Estrutura repetitiva Do_While
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		char newtemp;
		do {		
			System.out.println("Passe a temperatura em Celsius");
			double temp =sc.nextDouble();
			
			double fah = ((9*temp)/5)+32;
			System.out.printf("A temperatura em Fahrenheit é: %.1f%n", fah);
			
			System.out.println("Deseja inputar nova temperatura (s/n) ? ");
			newtemp = sc.next().charAt(0);
			
		} while (newtemp != 'n');
		
		sc.close();

	}

}
