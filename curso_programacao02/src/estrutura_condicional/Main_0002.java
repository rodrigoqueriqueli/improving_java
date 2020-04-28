package estrutura_condicional;

import java.util.Scanner;

public class Main_0002 {

	public static void main(String[] args) {
		// Exercicio01 aula 37 - switch case

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda-feira";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor invalido";
			break;

		}

		System.out.printf("O dia da semana é: %s%n", dia);
		sc.close();
	}

}
