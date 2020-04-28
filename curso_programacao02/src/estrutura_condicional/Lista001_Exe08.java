package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Lista001_Exe08 {

	public static void main(String[] args) {
		// Capitulo Estrutura condicional Aula 35 exer. resolvido 08

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double imposto;
		
		System.out.println("Digite o seu salário");
		double salario = sc.nextDouble();
		
		if (salario>0.00 && salario<2000.00) {
			imposto = 0.00;
		}
		else if (salario<3000.00) {
			imposto = (salario-2000.00) * 0.08; 
		}
		else if (salario<4500.00) {
			imposto = (salario-3000.0)*0.18 + (1000)*0.08;
		}
		else {
			imposto = (salario - 4500.0)* 0.28 + 1500.0 * 0.18 + 1000.0 *0.08;
		}
		
		if (imposto ==0) {
			System.out.println("A pessoa está isenta de imposto! ");
		}
		else {
			System.out.printf("A pessoa terá que pagar R$ %.2f de imposto.", imposto);
		}
	
		sc.close();
	}

}
