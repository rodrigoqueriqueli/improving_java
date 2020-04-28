package estrutura_condicional;

import java.util.Scanner;

public class Main_0003 {

	public static void main(String[] args) {
		// Exercicio01 aula 38 - Expressao condicional ternaria

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? (preco*0.1) : (preco*0.05); 
		
		System.out.println("O valor do desconto é: R$ " + desconto);
		sc.close();
	}

}
