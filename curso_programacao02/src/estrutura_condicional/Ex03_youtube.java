package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_youtube {

	public static void main(String[] args) {
		// Exercicio03 feito no youtube pr� lista PDF

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int menor;

		System.out.println("Digite 3 n�meros: ");

		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}
		System.out.println("O menor n�mero �: " + menor);
		sc.close();
	}

}
