package entity;

import implement.Products;

public class NotPerishable extends Products {
	
	private static Integer id;
	
	
	public NotPerishable(String description, Double price, Integer inventoryAmount, String productTipe) {
		super(description, price, inventoryAmount, "Not perishable");
		this.id = ++id;
	}

	@Override
	public String toString() {
		return "NotPerishable []";
	}

}
