package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	//criando construtor vazio
	public Order() {
		
	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status; //atributo do tipo orderstatus
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	//gerando um to string padrão
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
