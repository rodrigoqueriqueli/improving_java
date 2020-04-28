package matrizes;

import java.util.Scanner;

public class Aula96 {

	public static void main(String[] args) {
		// Aula 96 - Exercicio Resolvido by me

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //instancia a matriz na memoria

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main Diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j]<0)
					count++;
			}
		}
		System.out.println();
		System.out.print("Quantidade de valores negativos na matriz: " + count);

		sc.close();
	}

}
