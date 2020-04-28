package estrutura_repetitivas;

import java.util.Scanner;

public class Lista002_Exe02 {

	public static void main(String[] args) {
		// Capitulo Estrutura repetitiva Aula 52 exer. resolvido 02
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um número: ");
		int x = sc.nextInt();
		
		System.out.println("Inpute " + x + " números: ");
		
		int in=0, out=0;
		for (int i=0; i<x; i++) {
			int number = sc.nextInt();
			if (number >=10 && number <=20 ) {
				in++;
			}
			else
				out++;
		}
		
		System.out.println(in +" In");
		System.out.println(out + " Out");
		sc.close();
	}

}
