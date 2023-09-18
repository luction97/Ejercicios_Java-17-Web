package entity;

import implement.Products;

public class Perishable extends Products {
	private static Integer id;
	private Integer expirationDays;

	public Perishable(String description, Double price, Integer inventoryAmount, Integer expirationDays) {
		super(description, price, inventoryAmount, "Perishable");
		this.expirationDays = expirationDays;
		this.id = ++id;
	}


	public Integer getExpirationDays() {
		return expirationDays;
	}

	public void setExpirationDays(Integer expirationDays) {
		this.expirationDays = expirationDays;
	}

	@Override
	public String toString() {
		return "Perishable [expirationDays=" + expirationDays + "]";
	}

}
