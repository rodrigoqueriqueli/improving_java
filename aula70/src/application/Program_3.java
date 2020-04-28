package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_3;;

public class Program_3 {

 	
	public static void main(String[] args) {
		// Terceira versão do exercício da aula 69

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator_3.circumference(radius);
		
		double v = Calculator_3.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator_3.PI);
		
		sc.close();
	}
	
}
