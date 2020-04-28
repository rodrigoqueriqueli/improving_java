package estrutura_repetitivas;

import java.util.Scanner;

public class Lista001_Exe01 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 47 exer. resolvido 01

		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida! ");
			//System.out.println("Tente novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido ");
		
		sc.close();
		
	}

}
