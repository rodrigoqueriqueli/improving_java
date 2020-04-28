package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Lista002_Exe04 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 04

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0)
				System.out.println("Divisão impossível. ");
			else {
				double div = (double) a / b;
				Locale.setDefault(Locale.US);
				System.out.printf("%.1f %n", div);
			}

		}

		sc.close();
	}

}
