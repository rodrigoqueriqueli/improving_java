package estrutura_condicional;

public class Main_0004 {

	public static void main(String[] args) {
		// Exercicio01 aula 39 - Escopo
		
		double price = 400.00;
		
		double discount = 10.00;
		
		if (price < 200.00) {
			discount = price * 0.1;	
		}
		else {
			discount = 0;
		}
		System.out.println(discount);
		
	}

}
