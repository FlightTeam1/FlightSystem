package foodPackage;

public interface Food {
	public double itemPrice(int foodItem);
	public double quantity();
	public double calculatePrice(double quantity, double itemPrice);
	public void done();

}
