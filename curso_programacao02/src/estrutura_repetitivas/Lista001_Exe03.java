package estrutura_repetitivas;

import java.util.Scanner;

public class Lista001_Exe03 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 47 exer. resolvido 03

		Scanner sc = new Scanner(System.in);

		int opcao, alcool = 0, gasolina = 0, diesel = 0;

		System.out.println("Digite a opção desejada");
		System.out.println("1 - Ácool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");

		opcao = sc.nextInt();

		while (opcao != 4) {
			if (opcao == 1) {
				alcool++;
				opcao = sc.nextInt();
			} else if (opcao == 2) {
				gasolina++;
				opcao = sc.nextInt();
			} else if (opcao == 3) {
				diesel++;
				opcao = sc.nextInt();
			} else {
				System.out.println("Digite um valor válido");
				opcao = sc.nextInt();
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Álcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();
	}

}
