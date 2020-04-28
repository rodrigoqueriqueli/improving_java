package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_2;;

public class Program_2 {

 	
	public static void main(String[] args) {
		// Segunda versão do exercício da aula 69

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator_2 calc = new Calculator_2();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
	
}
