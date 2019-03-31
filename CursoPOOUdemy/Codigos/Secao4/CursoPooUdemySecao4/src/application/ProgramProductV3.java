package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductV3;

public class ProgramProductV3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		

		ProductV3 product = new ProductV3(name, price);
		
		//Metodos getters e setters
		product.setName("Computer");
		System.out.println("Updated Name: "+product.getName());
		product.setPrice(1200);
		System.out.printf("Updated Price: %.2f%n",product.getPrice());

		
		
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
		sc.close();
	}
}