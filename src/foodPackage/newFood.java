package foodPackage;

import java.util.List;

public interface newFood {
	public void foodMenu();
	public String foodName="";
	public double itemPrice(int foodItem);
	public double quantity();
	public double calculatePrice(double quantity, double itemPrice);
	public void exit();
	
	List<newMenu> returnMenu();
}
