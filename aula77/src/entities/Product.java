package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name; //pegar o name que veio de parametro e atribuir para o name do objeto
		this.price = price; //pegar o price que veio de parametro e atribuir para o preço do objeto
		this.quantity = quantity; //pegar a qtde que veio de parametro e atribuir pra qtde do objeto
	}
	
	//exemplo de sobrecarga, outro método construtor porém com entradas de parametros diferentes
	public Product(String name, double price) {
		this.name = name; 
		this.price = price; 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//não vai criar o método set do quantidade para proteger objeto produto de alterações inconsistentes na qtde dele
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", totalValueInStock());
				
	}
}
