package estrutura_sequencial;

import java.util.Scanner;

public class Main_0004 {

	public static void main(String[] args) {

		/* Comentei pra rodar o exercecicio que est� abaixo, mais est� rodando normal
		 
		Scanner sc = new Scanner (System.in);
		
		int x;
		x = sc.nextInt();
		
		System.out.println("O n�mero digitado foi: " + x);
		
		sc.close();
		
		*/
		
		
		
		/*Scanner sc = new Scanner (System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("O n�mero digitado foi: %.2f %n", x);
		
		sc.close();
		*/
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
				
		System.out.println("Voc� digitou: " + x);
		
		sc.close();
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.1f", z);
		
		sc.close();
		
	}

}
