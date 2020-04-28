package util;

public class Calculator_3 {
	
	// Terceira versão do exercício da aula 69 (Classe utilitaria)
	
	public static final double PI = 3.14159; //palavra final quer dizer que é constante, não muda
	

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
