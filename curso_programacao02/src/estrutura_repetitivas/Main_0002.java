package estrutura_repetitivas;

import java.util.Scanner;

public class Main_0002 {

	public static void main(String[] args) {
		// Exercicio01 aula 43 - Estrutura repetitiva While

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x; //soma = soma + x;
			x = sc.nextInt();
			
		}
		
		System.out.println("A soma dos números é: " + soma);
		
		sc.close();
		
	}

}
