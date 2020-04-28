package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_youtube {

	public static void main(String[] args) {
		// Exercicio01 feito no youtube pré lista PDF

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.println("Digite a primeira nota do aluno: ");
		nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota do aluno");
		nota2 = sc.nextDouble();

		media = (nota1 + nota2);

		if (media < 60.00)
			System.out.printf("Aluno Reprovado, com nota final: %.1f %n", media);
		else {
			System.out.printf("Aluno Aprovado, com nota final: %.1f", media);
		}

		sc.close();
	}

}
