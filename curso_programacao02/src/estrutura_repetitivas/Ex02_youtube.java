package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_youtube {

	public static void main(String[] args) {
		// Exercicio 02 feito no youtube pré lista while

		Scanner sc = new Scanner(System.in);

		int idade, soma = 0, cont = 0;
		Locale.setDefault(Locale.US);
		double media = 0.00;

		System.out.println("Digite a idade da pessoa: ");
		idade = sc.nextInt();

		if (idade > 0) {
			while (idade >= 0) {
				soma += idade;
				cont++;
				idade = sc.nextInt();
			}

			media = (double) soma / cont;
			System.out.printf("A média das idadeis é: %.2f%n", media);
			sc.close();

		} else {
			System.out.println("Impossível de Calcular");
		}

	}

}
