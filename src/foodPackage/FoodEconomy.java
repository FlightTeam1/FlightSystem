package foodPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FoodEconomy  {
	//TODO implements Food

	public  double totalPrice;
	private double itemPrice;
	static boolean order = true;
	static Scanner input = new Scanner(System.in);

	public List<FoodItem> itemsList = new ArrayList<FoodItem>();
	public List<Food> menuItems = new ArrayList<>();

	public void getFood() {		

		System.out.println("**Economy Class Menu service** \n");
		System.out.println(" Welcome Aboard Lexicon Airlines \n ");
		System.out.println("********************\n");
		System.out.println(" All our meals are served with freshly baked bread and butter");
		System.out.println(" Enjoy with our complimentary Champagne,fine wine, spirits, beer, cocktails and soft drinks.\n");
		System.out.println("********************\n");		

		int menuOption = 0;
		executeOperation(menuOption);	

	}


	public void getList()
	{
		System.out.println("Select your choice of items \n");
		System.out.println("1. Select Items from the menu \n" );
		System.out.println("2. Print the list Menu\n ");		
		System.out.println("3. Exit \n");
		System.out.println("********************\n");

	}


	public void executeOperation(int menuOption) {
		int foodId = 0;
		input = new Scanner(System.in); 
		do{

			getList();
			menuOption = input.nextInt();    

			switch(menuOption){
			case 1: 
				addItem();
				break;			
			case 2:
				getAllItems();
				break;
			case 3:
				exit();
				break;      
			default:
				System.out.println("Invalid option.");
				getFood();

			}	
		} while(order); {
		}
	}

	public void foodMenu() {

		System.out.println("Enter index number\n");
		System.out.println("1. Chicken burger with choice of drink (SEK 50.00) \n");
		System.out.println("2. Kyckling File med Pommes (SEK 90.50)\n ");
		System.out.println("3. Beef Sandwich (SEK 75.00) \n");
		System.out.println("********************\n");

	}


	public void addItem() {
		Scanner scanner = new Scanner(System.in);
		foodMenu();
		System.out.println("Enter Index number u wish to add:\n");
		int foodId = scanner.nextInt();	
		itemsList.add(new FoodItem(foodId));
		itemPrice(foodId);
	}


	public double itemPrice(int foodId) {

		if (foodId == 1) {
			System.out.println("You've ordered a Chicken burger with choice of drink");
			itemPrice = 50.00;
		}
		if (foodId == 2) {
			System.out.println("You've ordered Kyckling File med Pommes");
			itemPrice = 90.50;
		}
		if (foodId == 3) {		
			System.out.println("You've ordered Beef Sandwich");
			itemPrice = 75.00;
		}
		quantity();
		System.out.println("\nDo you want to add one more food Item (Yes/No):\n");
		String oneMore = input.next();
		if("yes".equalsIgnoreCase(oneMore.toLowerCase())) {
			addItem();
		} else {
			System.out.println("TotalPrice for food " +totalPrice);
			executeOperation(foodId);
		} 	
		return itemPrice;

	}


	public double quantity() {
		System.out.println("Enter quantity");       
		double quantity = input.nextDouble();
		calculatePrice(quantity, itemPrice);
		return quantity;

	}


	public double calculatePrice(double quantity, double itemPrice) {
		double calculatePrice = quantity*itemPrice;
		System.out.println("Subtotal: "+ calculatePrice);
		totalPrice += calculatePrice;
		return calculatePrice;
	}


	public void getAllItems() {	

		if(itemsList!=null && !itemsList.isEmpty()){
			for (FoodItem item : itemsList){
				if(item!=null){
					System.out.println("\nFoodList:" + item.getFoodId());
					System.out.println("********************\n");
				}
			}
			System.out.println("TotalPrice for food " +totalPrice);
		} else {
			System.out.println("No Data Found");
		}				


	}	

	public void exit(){
		order = false;
		System.out.println("Thank You\n");
		System.out.println("Enjoy your meal in flight ");
	}






	public static void main(String[] args) {

		FoodEconomy p = new FoodEconomy();
		p.getFood();


	}
}

