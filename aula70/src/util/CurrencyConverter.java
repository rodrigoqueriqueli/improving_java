package util;

public class CurrencyConverter {
	
	public static double dollar;
	public static double amountDollar;

	
	public static double inReais(double dollar, double amountDollar) {
		return ((amountDollar * dollar)* 1.06);	
	}
		
	
}
