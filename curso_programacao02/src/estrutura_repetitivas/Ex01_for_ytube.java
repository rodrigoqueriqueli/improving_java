package estrutura_repetitivas;

import java.util.Scanner;

public class Ex01_for_ytube {

	public static void main(String[] args) {
		// Exercicio 01 feito no youtube pré lista for
		
		Scanner sc = new Scanner(System.in);
		
		int number, i;
		
		System.out.println("Digite o número que deseja saber a taboada: ");
		number = sc.nextInt();
		
		for (i=1 ; i<=10; i++) {
			int resultado = number * i;
			System.out.println(i + " x " + number + " = " + resultado );
		}

		
		sc.close();
	}

}
