package estrutura_sequencial;

import java.util.Scanner;

public class Lista001_Exe03 {

	public static void main(String[] args) {
		// Capitulo Estrutura sequencial Aula 28 exer. resolvido 03
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, R, resul;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		R = sc.nextInt();
		
		resul = (A*B - C*R);
		
		System.out.println("O resultado final é: " + resul);
		
		sc.close();

	}

}
