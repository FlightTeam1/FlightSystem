package foodPackage;
import java.util.Scanner;
public class FoodFirst implements Food {

	public  double totalPrice;
	private double itemPrice;
	static boolean order = true;
	static Scanner input = new Scanner(System.in);

	public void foodMenu() {

		System.out.println("Select your choice of items \n");
		System.out.println("1. Crispy fried chicken with Potato smash and Vanilla Fruit icecream ($5.00) \n");
		System.out.println("2. Steam Fish Fillet with Garlic sauce and Strawberry smoothie ($6.50)\n ");
		System.out.println("3. Beef Burrito with Lemon Tart ($7.00) \n");
		System.out.println("4. Exit \n");
		System.out.println("********************\n");

	}

	public double itemPrice(int foodItem) {
		if (foodItem == 1) {
			//burger= $2.00
			System.out.println("You've ordered Crispy fried chicken with Potato smash and Vanilla Fruit icecream \n");
			itemPrice = 2.00;
		}
		if (foodItem == 2) {
			//fries = $1.50
			System.out.println("You've ordered Steam Fish Fillet with Garlic sauce and Strawberry smoothie \n ");
			itemPrice = 1.50;
		}
		if (foodItem == 3) {
			//soda = $1.00
			System.out.println("You've ordered Beef Burrito with Lemon Tart \n");
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
		System.out.println("Enter how much quantity you wish to order");       
		double quantity = input.nextDouble();
		calculatePrice(quantity, itemPrice);
		return quantity;

	}


	public double calculatePrice(double quantity, double itemPrice) {
		double calculatePrice = quantity*itemPrice;
		System.out.println("Price: "+ calculatePrice);
		totalPrice += calculatePrice;
		return calculatePrice;
	}


	public void exit(){
		order = false;
		System.out.println("Total Price for food " +totalPrice);
		System.out.println("Enjoy your meal in flight ");
		
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

	public void getFood() {	
		
		System.out.println("**First Class Menu service** \n");		
		System.out.println(" Welcome Aboard Lexicon Airlines \n ");
		System.out.println("********************\n");
		System.out.println(" All our meals are served with freshly baked bread and butter");
		System.out.println(" Enjoy with our complimentary Champagne,fine wine, spirits, beer, cocktails and soft drinks.\n");
		System.out.println("********************\n");

		int menuOption = 0;
		executeOperation(menuOption);	

	}

	public static void main(String[] args) {
		FoodFirst p = new FoodFirst();
		p.getFood();


	}
}


