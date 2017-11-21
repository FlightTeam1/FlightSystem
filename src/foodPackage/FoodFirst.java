package foodPackage;
import java.util.Scanner;
public class FoodFirst implements Food {




	public  double runningTotal;
	private double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner(System.in);

	public void menu() {

		System.out.println("Select your choice of items \n");
		System.out.println("1. Chicken burger with choice of drink ($2.00) \n");
		System.out.println("2. Kyckling File med Pommes ($1.50)\n ");
		System.out.println("3. Beef Sandwich ($1.00) \n");
		System.out.println("4. Done \n");
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
			done();
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
		runningTotal += calculatePrice;
		return calculatePrice;
	}
	public void done(){
		ordering = false;
		System.out.println("TotalPrice for food " +runningTotal);
		System.out.println("Enjoy your meal in flight ");
	}

	public void executeOperation(int menuOption) {
		int foodItem = 0;
		input = new Scanner(System.in); 
		do{

			menu();
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
				done();
				break;      
			default:
				System.out.println("Invalid option.");
				chooseOperations();

			}	
		} while(ordering); {
		}
	}

	public void chooseOperations() {		
		System.out.println("Welcome to First_Class Food Menu \n ");
		System.out.println("********************\n");
		int menuOption = 0;
		executeOperation(menuOption);	

	}

	public static void main(String[] args) {
		FoodFirst p = new FoodFirst();
		p.chooseOperations();


	}
}


