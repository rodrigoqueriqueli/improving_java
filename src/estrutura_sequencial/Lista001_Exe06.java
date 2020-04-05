package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Lista001_Exe06 {

	public static void main(String[] args) {
		// Capitulo Estrutura sequencial Aula 28 exer. resolvido 06
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		System.out.println("Digite o lado A, B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = (A * C)/2;
		circulo = pi * (C * C);
		trapezio = ((A + B)*C)/2;
		quadrado = B * B;
		retangulo = A * B;
				
		System.out.printf("A �rea do tri�gulo �: %.2f %n", triangulo);
		System.out.printf("A �rea do circulo �: %.2f %n", circulo);
		System.out.printf("A �rea do trap�zio �: %.2f %n", trapezio);
		System.out.printf("A �rea do quadrado �: %.2f %n", quadrado);
		System.out.printf("A �rea do ret�ngulo �: %.2f %n", retangulo);
		
		
	    sc.close();

	}

}
