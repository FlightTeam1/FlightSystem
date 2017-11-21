package foodPackage;
import java.util.Scanner;

public class FoodEconomy implements Food {


	public  double totalPrice;
	private double itemPrice;
	static boolean order = true;
	static Scanner input = new Scanner(System.in);

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


	public void executeOperation(int menuOption) {
		int foodItem = 0;
		input = new Scanner(System.in); 
		do{

			foodMenu();
			menuOption = input.nextInt();    

			switch(menuOption){
			case 1:
				foodItem = 1;
				itemPrice(foodItem);
				break;
			case 2:
				foodItem = 2;
				itemPrice(foodItem);
				break;
			case 3:
				foodItem = 3;
				itemPrice(foodItem);
				break;
			case 4:
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

		System.out.println("Select your choice of items \n");
		System.out.println("1. Chicken burger with choice of drink ($2.00) \n");
		System.out.println("2. Kyckling File med Pommes ($1.50)\n ");
		System.out.println("3. Beef Sandwich ($1.00) \n");
		System.out.println("4. Exit \n");
		System.out.println("********************\n");

	}

	public double itemPrice(int foodItem) {
		if (foodItem == 1) {
			//burger= $2.00
			System.out.println("You've ordered a Chicken burger with choice of drink");
			itemPrice = 2.00;
		}
		if (foodItem == 2) {
			//fries = $1.50
			System.out.println("You've ordered Kyckling File med Pommes");
			itemPrice = 1.50;
		}
		if (foodItem == 3) {
			//soda = $1.00
			System.out.println("You've ordered Beef Sandwich");
			itemPrice = 1.00;
		}
		quantity();
		System.out.println("\nDo you want to add one more food Item (Yes/No):\n");
		String oneMore = input.next();
		if("yes".equalsIgnoreCase(oneMore.toLowerCase())) {
			executeOperation(foodItem);
		} else {
			exit();
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
	
	
	public void exit(){
		order = false;
		System.out.println("TotalPrice for food " +totalPrice);
		System.out.println("Enjoy your meal in flight ");
	}
	
	
	public static void main(String[] args) {
		FoodEconomy p = new FoodEconomy();
		p.getFood();


	}
}

