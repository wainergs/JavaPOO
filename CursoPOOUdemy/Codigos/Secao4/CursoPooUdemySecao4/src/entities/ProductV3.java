package entities;

public class ProductV3 {
	private String name;
	private double price;
	private int quantity;
	
	public ProductV3() {
		
	}
	
	public ProductV3(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	public ProductV3(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
		
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



	public double totalValueInStock() {
		return getPrice() * getQuantity();
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