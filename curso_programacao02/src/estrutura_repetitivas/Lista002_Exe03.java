package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Lista002_Exe03 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 03

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.println("Digite 3 números reais: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double resul = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("A média ponderada é: %.1f %n", resul);
		}

		sc.close();
	}

}
