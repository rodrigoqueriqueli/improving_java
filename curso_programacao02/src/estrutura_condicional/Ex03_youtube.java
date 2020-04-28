package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_youtube {

	public static void main(String[] args) {
		// Exercicio03 feito no youtube pré lista PDF

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int menor;

		System.out.println("Digite 3 números: ");

		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}
		System.out.println("O menor número é: " + menor);
		sc.close();
	}

}
