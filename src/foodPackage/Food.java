package foodPackage;

public interface Food {
	public void foodMenu();
	public double itemPrice(int foodItem, double itemPrice);
	public double quantity();
	public double calculatePrice(double quantity, double itemPrice);
	public void exit();
	//Food[] listFood = new Food[3];
	

}
