package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Lista001_Exe04 {

	public static void main(String[] args) {
		// Capitulo Estrutura sequencial Aula 28 exer. resolvido 04

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numfun, qtdehora;
		double valorhora,salario;
		
		
		System.out.println("Digite o n�mero do funcion�rio: ");
		numfun = sc.nextInt();
		
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		qtdehora = sc.nextInt();

		System.out.println("Digte o valor recebido por hora: ");
		valorhora = sc.nextDouble();
		
		salario = qtdehora * valorhora;
		
		System.out.println("O n�mero do funcion�rio �: " + numfun);
		System.out.printf("O sal�rio a ser recebido pelo funcion�rio �: R$ %.2f %n", salario);
		
		sc.close();
	}

}
