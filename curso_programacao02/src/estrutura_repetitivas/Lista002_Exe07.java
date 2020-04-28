package estrutura_repetitivas;

import java.util.Scanner;

public class Lista002_Exe07 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 07
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			System.out.println(i+" "+i*i+" "+i*i*i);
		}

		sc.close();
	}

}
