package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// Aula 112 - Enum

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED; //instanciando objeto (os1) do tipo orderstatus com o valor ordersatus.delivered
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //instanciando objeto (os1) do tipo orderstatus com o valor ordersatus.delivered
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
