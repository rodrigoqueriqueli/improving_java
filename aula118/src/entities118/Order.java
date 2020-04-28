package entities118;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enttities118.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client = new Client(); //duvida se precisa ou nao do new Client
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for (OrderItem item : orderItem ) {
			sum += item.subTotal();
		}	
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double sum=0;
		sb.append("Order Moment: " );
		sb.append(sdf.format(moment)+ "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Items: \n");
		for (OrderItem item : orderItem) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
