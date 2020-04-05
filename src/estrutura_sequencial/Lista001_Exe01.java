package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Lista001_Exe01 {

	public static void main(String[] args) {
		// Capitulo Estrutura sequencial Aula 28 exer. resolvido 01

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num1, num2, soma;
		
		System.out.println("Digite o 1º número inteiro: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o 2º número inteiro: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma dos 2 números é: " + soma);

		sc.close();
	}

}
