package matrizes;

import java.util.Scanner;

public class Aula96Nelio {

	public static void main(String[] args) {
		// Aula 96 - Exercicio Resolvido by Nelio
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //instancia a matriz na memoria
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt(); //mat na linha i coluna j vai receber a entrada do sc
			}
		}
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " "); //mandou imprimir elemento da matriz que linha e coluna sejam iguais
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) { //elemento da matriz linha i coluna j menor que zero girando o contador
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);

		
		sc.close();
	}

}
