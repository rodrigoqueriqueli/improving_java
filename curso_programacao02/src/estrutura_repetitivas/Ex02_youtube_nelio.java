package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_youtube_nelio {

	public static void main(String[] args) {
		// Exercicio 02 feito no youtube pré lista while(feito professor Neli)

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;

		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}

		if (cont > 0) {
			double media = (double) soma / cont; // resultado da divisao da inteiro, por isso vem o double na frente pra
													// usar como casting
			System.out.printf("%.2f%n", media);
		} 
		else {
			System.out.println("Impossivel Calcular.");
		}

		sc.close();
	}

}
