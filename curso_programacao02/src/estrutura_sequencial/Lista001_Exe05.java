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
		
		
		System.out.println("Digite o c�digo da pe�a: ");
		cod_01 = sc.nextInt();
		
		System.out.println("Digite a qtde de pe�as: ");
		qtde01 = sc.nextInt();
		
		System.out.println("Digite o valor da pe�a: ");
		pr01 = sc.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a: ");
		cod_02 = sc.nextInt();
		
		System.out.println("Digite a qtde de pe�as: ");
		qtde02 = sc.nextInt();
		
		System.out.println("Digite o valor da pe�a: ");
		pr02 = sc.nextDouble();
		
		conta = (qtde01 * pr01) + (qtde02 * pr02);
		
		System.out.printf("O valor a ser pago �: R$ %.2f %n ", conta );
		
		sc.close();
		
		
	}

}
