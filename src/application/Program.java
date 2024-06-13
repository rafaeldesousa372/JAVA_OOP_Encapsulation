package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.setName(sc.nextLine());

		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());

		System.out.print("Quantity in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		System.out.println();
		System.out.println("Updated stock is: " + product.getQuantity());

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProdutcs(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated stock is: " + product.getQuantity());
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		System.out.println();

		sc.close();
	}

}
