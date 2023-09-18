package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.NotPerishable;
import entity.Perishable;
import implement.Products;

public class ProductUtils {

	public static StringBuilder showProductList(List<Products> productList, String nombreCliente) {
		StringBuilder mensaje = new StringBuilder();
		mensaje = mensaje.append("Hello! ").append(nombreCliente).append("\n");
		mensaje.append("this week we have the following offers for you:\n");

		for (Products obj : productList) {
			mensaje.append("- ").append(obj.getDescription()).append("\nBefore:").append("$" + obj.getPrice() + "\n");
			mensaje.append("After: $" + obj.calculateInventoryPrice() + "\n");
			mensaje.append("is the product " + obj.getProductTipe());
		}
		return mensaje;

	}

	public static List<Products> createProducts() {
		Scanner read = new Scanner(System.in);
		Boolean repeat = false;
		List<Products> listProducts = new ArrayList<>();

		do {
			System.out.println("¿What product do you want to create?");
			System.out.println("Perishable | Not Perishable");
			String tipeProduct = read.next();

			if (tipeProduct.equalsIgnoreCase("perishable")) {

				System.out.println("Enter name to product perishable");
				String name = read.next();
				System.out.println("Enter price");
				Double price = read.nextDouble();
				System.out.println("Enter products amount");
				Integer amount = read.nextInt();
				System.out.println("Enter the days remaining to expire");
				Integer expirationDays = read.nextInt();

				Products perishable = new Perishable(name, price, amount, expirationDays);
				listProducts.add(perishable);

			} else if (tipeProduct.equalsIgnoreCase("Not perishable")) {
				System.out.println("Enter description to product perishable");
				String description = read.nextLine();
				System.out.println("Enter price");
				Double price = read.nextDouble();
				System.out.println("Enter products amount");
				Integer amount = read.nextInt();
				
				Products notPerishable = new NotPerishable(description, price, amount, description);
				listProducts.add(notPerishable);

			} else {
				System.out.println("Incorrect Answer. Try Again");
				repeat = true;
			}
		} while (repeat);

		return listProducts;

	}

}
