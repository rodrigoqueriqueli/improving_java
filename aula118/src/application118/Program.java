package application118;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities118.Client;
import entities118.Order;
import entities118.OrderItem;
import entities118.Product;
import enttities118.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// Aula 118 - Exercicio de Fixação
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());  
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=1; i <=n; i++) {
			System.out.println("Enter #"+i+" item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduto = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			Product produto = new Product(nameProduto, price);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			
			OrderItem itemPedido = new OrderItem(quantity, price, produto);
			order.addItem(itemPedido);		
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);	
		
		sc.close();
	}

}
