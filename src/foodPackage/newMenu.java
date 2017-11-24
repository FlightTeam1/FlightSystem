package foodPackage;

public class newMenu {
	private String foodName;
	private double price;
	private double quantity;
	
	public newMenu(String foodName, double price, double quantity) {
		this.foodName=foodName;
		this.price = price;
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getFoodName() {
		return foodName;
	}

	public double getPrice() {
		return price;
	}

	public String getCalculatePrice() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
