package estrutura_repetitivas;

import java.util.Scanner;

public class Main_003 {

	public static void main(String[] args) {
		// Exercicio01 aula 48 - Estrutura repetitiva For
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0, y;
		
		System.out.println("Digite um n�mero: ");
		x = sc.nextInt();
		
		for (y = 0; y < x; y++) {
			System.out.println("Digite um n�mero");
			soma += sc.nextInt();
		}
		System.out.println("A soma �: " + soma);
		sc.close();
	}

}
