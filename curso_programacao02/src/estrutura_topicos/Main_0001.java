package estrutura_topicos;

import java.util.Scanner;

public class Main_0001 {

	public static void main(String[] args) {
		// Exercicio01 aula 56 - bitwise
		
		/*int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;
		int n = sc.nextInt();
		
		//testar se o sexto bit é verdadeiro (vale 1)
		if ((n & mask) !=0 ) {
			System.out.println("6th bit is true!");
		}
		else{
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}
