package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
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
			+ String.format("%.2f", totalValueInStock())	;
				
	}

}
