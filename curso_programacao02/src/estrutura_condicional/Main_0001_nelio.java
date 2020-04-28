package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main_0001_nelio {

	public static void main(String[] args) {
		// Exercicio01 aula 36 - operadores de atribuição cumulativa feito pelo Nelio
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos-100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
	}

}
