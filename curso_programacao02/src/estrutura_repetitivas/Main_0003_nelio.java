package estrutura_repetitivas;

import java.util.Scanner;

public class Main_0003_nelio {

	public static void main(String[] args) {
		// Exercicio01 aula 48 - Estrutura repetitiva For _feito por nelio

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);

		sc.close();
	}

}
