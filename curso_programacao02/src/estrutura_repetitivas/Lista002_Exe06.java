package estrutura_repetitivas;

import java.util.Scanner;

public class Lista002_Exe06 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 06
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		for (int div=1 ; div <= n; div++) {
			if (n % div == 0)
				System.out.println(div);
		}
		sc.close();
	}

}
