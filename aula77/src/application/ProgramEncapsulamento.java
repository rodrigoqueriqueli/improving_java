package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramEncapsulamento {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
				
			//Product product = new Product(); N�o � precio mais istanciar no come�o, s� depois q recebo os valores
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			Product product = new Product(name, price);
			
			product.setName("Computer");
			System.out.println("Updated name: " + product.getName());
			product.setPrice(1200.00);
			System.out.println("Updated price: " + product.getPrice());
			
			System.out.println();
			System.out.println("Product data: " + product);
			
			System.out.println();
			System.out.print("Enter the number of products to be added in stock: ");
			int quantity = sc.nextInt();
			product.addProducts(quantity);	
			
			System.out.println();
			System.out.println("Updated data: " + product);
			
			System.out.println();
			System.out.print("Enter the number of products to be removed from stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: " + product);
			
			
			//System.out.println(product.name+" , "+product.price+" , "+product.quantity);
			
			sc.close();	

		}

}
