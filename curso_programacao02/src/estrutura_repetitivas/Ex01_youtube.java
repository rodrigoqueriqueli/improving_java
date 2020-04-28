package estrutura_repetitivas;

import java.util.Scanner;

public class Ex01_youtube {

	public static void main(String[] args) {
		// Exercicio feito no youtube pré lista while

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite valor de X e Y: ");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != y) {

			if (x > y)
				System.out.println("Ordem descrente");

			else
				System.out.println("Ordem crescente");

			System.out.println("Digite valor de X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}

}
