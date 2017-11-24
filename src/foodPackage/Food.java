package foodPackage;

public class Food {
	//implements newFood 
	String foodname;
	double price;
	double quantity;

	public Food(String foodName, double price, double quantity) {
		this.foodname=foodName;
		this.price =price;
		this.quantity=quantity;
		
		// TODO Auto-generated constructor stub
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	

//	@Override
//	public void foodMenu() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public double itemPrice(int foodItem) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double quantity() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void exit() {
//		// TODO Auto-generated method stub
//
//	}

}
