package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int contaCorrente = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();	
		System.out.print("Is there an initial deposit value (Y/N)? ");
		char opcao = sc.next().charAt(0);
		
		
		if ((opcao == 'y') || (opcao == 'Y')){
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(contaCorrente, name, initialDeposit);
		}
		
		else {
			conta = new Conta(contaCorrente, name);
		}
		System.out.println();
		System.out.println("Acount data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
