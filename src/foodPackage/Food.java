package foodPackage;

public interface Food {
	public void foodMenu();
	public double itemPrice(int foodItem);
	public double quantity();
	public double calculatePrice(double quantity, double itemPrice);
	public void exit();

}
