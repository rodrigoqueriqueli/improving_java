package estrutura_repetitivas;

import java.util.Scanner;

public class Lista002_Exe01 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 01

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor entre 1 e 1000");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
