package estrutura_repetitivas;

import java.util.Scanner;

public class Ex02_for_ytube {

	public static void main(String[] args) {
		// Exercicio 02 feito no youtube pré lista for

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valores de X e Y: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//ordenar primeiro
		int min, max;
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for (int i = min+1; i < max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma dos ímpares é: " + soma);
	}

}
