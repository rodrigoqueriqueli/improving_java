package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_youtube {

	public static void main(String[] args) {
		// Exercicio feito no youtube pré lista PDF

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, valorm2, area, preco;

		System.out.println("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.println("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.println("Digite o valor do m2: ");
		valorm2 = sc.nextDouble();

		area = largura * comprimento;
		preco = area * valorm2;

		System.out.printf("A área do terreno é %.2f %n", area);
		System.out.printf("O preço do terreno é %.2f", preco);

		sc.close();

	}

}
