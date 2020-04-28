package util;

public class Calculator_2 {

	// Segunda versão do exercício da aula 69 (Classe utilitaria)
	
	public final double PI = 3.14159; //palavra final quer dizer que é constante, não muda
	

	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
