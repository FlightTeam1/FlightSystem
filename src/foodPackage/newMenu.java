package foodPackage;

public class newMenu {
	private String foodName;
	private double price;
	
	public newMenu(String foodName, double price) {
		this.foodName=foodName;
		this.price = price;
	}

	public String getFoodName() {
		return foodName;
	}

	public double getPrice() {
		return price;
	}
}
