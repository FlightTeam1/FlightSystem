package foodPackage;

public class FoodItem {
	
	private int foodId;
	private String foodName;
	private int price;
	
	//private static int id = 0;
	
	public FoodItem(int foodId){
		 this.foodId = foodId;
		//this.foodName = foodName;
		//this.price = price;
	
	}


	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	
	
}
