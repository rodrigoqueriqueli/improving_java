package estrutura_sequencial;

import java.util.Scanner;

public class Main_0005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); 
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		//nextline é pra ler a todas as palavras da linha, se é só next pega só a primeira
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
