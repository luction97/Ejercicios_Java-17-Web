package implement;

public class Products {
	protected final String productTipe;
	protected Integer id;
	protected String description = null;
	protected Double price = null;
	protected Integer inventoryAmount = null;

	public Products(String description, Double price, Integer inventoryAmount, String productTipe) {
		this.productTipe = productTipe;
		this.description = description;
		this.price = price;
		this.inventoryAmount = inventoryAmount;
	}

	public String getProductTipe() {
		return productTipe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double calculateInventoryPrice() {

		if (this.productTipe.equalsIgnoreCase("perishable")) {
			Double priceDiscount = calculateOffer(30);// offer of 30%
			Double totalPriceInventoryDiscount = priceDiscount * inventoryAmount;
			return totalPriceInventoryDiscount;
		} else {
			Double totalPriceInventory = this.price * inventoryAmount;
			return totalPriceInventory;
		}
	}

	public Double calculateOffer(int percentageOffer) {
		Double percentageOfferTotal = (double) (percentageOffer / 100);
		Double total = this.price - (this.price * percentageOfferTotal);
		this.price = total;
		return total;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(Integer inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	@Override
	public String toString() {
		return "Products [description=" + description + ", price=" + price + ", inventoryAmount=" + inventoryAmount
				+ "]";
	}

}
