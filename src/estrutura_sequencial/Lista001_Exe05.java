package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Lista001_Exe05 {

	public static void main(String[] args) {
		// Capitulo Estrutura sequencial Aula 28 exer. resolvido 05
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_01, cod_02, qtde01, qtde02;
		double pr01, pr02, conta;
		
		
		System.out.println("Digite o código da peça: ");
		cod_01 = sc.nextInt();
		
		System.out.println("Digite a qtde de peças: ");
		qtde01 = sc.nextInt();
		
		System.out.println("Digite o valor da peça: ");
		pr01 = sc.nextDouble();
		
		System.out.println("Digite o código da peça: ");
		cod_02 = sc.nextInt();
		
		System.out.println("Digite a qtde de peças: ");
		qtde02 = sc.nextInt();
		
		System.out.println("Digite o valor da peça: ");
		pr02 = sc.nextDouble();
		
		conta = (qtde01 * pr01) + (qtde02 * pr02);
		
		System.out.printf("O valor a ser pago é: R$ %.2f %n ", conta );
		
		sc.close();
		
		
	}

}
