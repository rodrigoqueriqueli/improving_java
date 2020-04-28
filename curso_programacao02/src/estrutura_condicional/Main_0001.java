package estrutura_condicional;

import java.util.Scanner;

public class Main_0001 {

	public static void main(String[] args) {
		// Exercicio01 aula 36 - operadores de atribuição cumulativa

		Scanner sc = new Scanner(System.in);

		double minutos, add, valor_conta = 50.0;

		System.out.println("Digite a quantidade de minutos utilizada");
		minutos = sc.nextDouble();

		if (minutos > 100) {
			add = minutos - 100.0;
			valor_conta = 50.0 + (add * 2.0);
			System.out.printf("O valor da conta será de R$ %.2f%n", valor_conta);
		} else {
			System.out.printf("O valor da conta será de R$ %.2f%n", valor_conta);
		}
		sc.close();
	}

}
