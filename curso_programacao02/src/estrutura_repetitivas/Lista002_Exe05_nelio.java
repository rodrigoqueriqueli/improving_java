package estrutura_repetitivas;

import java.util.Scanner;

public class Lista002_Exe05_nelio {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 05
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
