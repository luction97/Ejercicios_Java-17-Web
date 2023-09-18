import java.util.List;

import entity.Customer;
import entity.Document;
import entity.Perishable;
import implement.Products;
import services.ProductUtils;

public class Main {

	public static void main(String[] args) {
		
		//Create customer
		Customer customer = new Customer("Lucas", "Siano", new Document("DNI", "40515240"));
		//Create listProducts
		List<Products> listProducts = ProductUtils.createProducts();
		//Show product List
		StringBuilder showListProducts = ProductUtils.showProductList(listProducts, customer.getNombre());
		System.out.println(showListProducts);

	}

}
