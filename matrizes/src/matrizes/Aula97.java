package matrizes;

import java.util.Scanner;

public class Aula97 {

	public static void main(String[] args) {
		// Aula 97 - Exercicio Proposto by me

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a ordem de grandeza(X e Y) da matriz: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] mat = new int[x][y]; // instanciando o objeto matriz no heap
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Escolha um número da matriz: ");
		int escolha = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == escolha) {
					System.out.println("Position " + i + "," + j);
					if (j > 0)
						System.out.println("Left: " + mat[i][j - 1]);
					if (i > 0)
						System.out.println("Acima: " + mat[i - 1][j]);
					if (j < mat[i].length-1)
						System.out.println("Direita: " + mat[i][j + 1]);
					if (i < mat.length-1)
						System.out.println("Abaixo: " + mat[i + 1][j]);
					System.out.println("---------------------");
				}
			}
		}

		sc.close();
	}

}
