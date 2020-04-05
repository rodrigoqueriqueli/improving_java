package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Lista001_Exe02 {

	public static void main(String[] args) {
		// Capitulo Estrutura sequencial Aula 28 exer. resolvido 02
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi=3.14159;
		
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.printf("A área do círculo é: %.4f %n", area);
		
		sc.close();
	
	}

}
