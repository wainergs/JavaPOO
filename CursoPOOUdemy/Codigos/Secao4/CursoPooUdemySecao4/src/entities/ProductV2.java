package entities;

public class ProductV2 {
	public String name;
	public double price;
	public int quantity;
	
	public ProductV2() {
		
	}
	
	public ProductV2(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	public ProductV2(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
		
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
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}