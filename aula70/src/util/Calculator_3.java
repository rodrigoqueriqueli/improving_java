package util;

public class Calculator_3 {
	
	// Terceira vers�o do exerc�cio da aula 69 (Classe utilitaria)
	
	public static final double PI = 3.14159; //palavra final quer dizer que � constante, n�o muda
	

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
