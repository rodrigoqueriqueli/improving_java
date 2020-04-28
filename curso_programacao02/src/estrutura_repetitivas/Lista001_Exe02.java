package estrutura_repetitivas;

import java.util.Scanner;

public class Lista001_Exe02 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 47 exer. resolvido 02

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("Digite os pontos X e Y: ");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante. ");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante. ");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante. ");
			} else {
				System.out.println("Quarto quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();
	}

}
