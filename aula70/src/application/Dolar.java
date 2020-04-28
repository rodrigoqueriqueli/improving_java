package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double dollar = sc.nextDouble();
		System.out.print("How much dollars will be guy? ");
		double amountDollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.inReais(dollar, amountDollar));

		sc.close();
	}

}
