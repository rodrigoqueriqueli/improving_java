package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// Exericio 01 dos propostos aula 68
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f",rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f",rectangle.diagonal()));
		
		//Outra possibilidade de fazer os prints:
		/* System.out.printf("AREA = %.2f%n", rect.area());   
		 * System.out.printf("PERIMETER  = %.2f%n", rect.perimeter());   
		 * System.out.printf("DIAGONAL  = %.2f%n", rect.diagonal());  
		 */
		
		sc.close();
	}

}
