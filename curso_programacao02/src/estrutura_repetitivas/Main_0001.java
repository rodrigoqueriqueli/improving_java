package estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Main_0001 {

	public static void main(String[] args) {
		// Exercicio01 aula 42 - Debug

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}

}
