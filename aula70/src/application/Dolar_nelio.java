package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverterNelio;

public class Dolar_nelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverterNelio.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		sc.close();

	}

}
