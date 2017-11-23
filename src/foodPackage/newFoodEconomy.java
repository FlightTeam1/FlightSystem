package foodPackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class newFoodEconomy implements newFood {
	List<newMenu> food = new ArrayList<>();
	public  double totalPrice;
	private double itemPrice;
	static boolean order = true;
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		newFoodEconomy p = new newFoodEconomy();
		p.getFood();
	}
	
	public newFoodEconomy() {
		// TODO Auto-generated constructor stub
		// Autogenerate menu 
		newMenu meny1 = new newMenu("Chicken burger with choice of drink",2.00); 
		newMenu meny2 = new newMenu("Kyckling File med Pommes",1.50);
		newMenu meny3 = new newMenu("Beef Sandwich",1.00);
		
		food.add(meny1);
		food.add(meny2);
		food.add(meny3);
	}
	
	public void getFood() {
		Messages msg = new Messages();
		System.out.println("**Economy Class Menu service** \n");
		System.out.println(msg.getStaticMenuInfo());

		int menuOption = 0;
		executeOperation(menuOption);
	}

	public void executeOperation(int menuOption) {
		int foodItem = 0;
		Scanner input = new Scanner(System.in); 
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

	@Override
	public void foodMenu() {
		// TODO Auto-generated method stub
		System.out.println("Select your choice of items \n");
		int count = 1;
		
		NumberFormat formatter = new DecimalFormat("$0.00");
		
		for (newMenu nextFood : food) {
			System.out.println(count + "." + nextFood.getFoodName() + "     " + formatter.format(nextFood.getPrice()));
			count++;
		}
		System.out.println("4. Exit \n");
		System.out.println("********************\n");
	}

	@Override
	public double itemPrice(int foodItem) {
		// TODO Auto-generated method stub
		if (foodItem>=1 && foodItem <=3) {
			System.out.println("You ordered a " + food.get(foodItem-1).getFoodName());
			itemPrice = food.get(foodItem-1).getPrice();

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
		return foodItem;
	}

	@Override
	public double quantity() {
		// TODO Auto-generated method stub
		System.out.println("Enter quantity");       
		double quantity = input.nextDouble();
		calculatePrice(quantity, itemPrice);
		return quantity;
	}

	@Override
	public double calculatePrice(double quantity, double itemPrice) {
		// TODO Auto-generated method stub
		double calculatePrice = quantity*itemPrice;
		System.out.println("Subtotal: "+ calculatePrice);
		totalPrice += calculatePrice;
		return calculatePrice;
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		order = false;
		System.out.println("TotalPrice for food " +totalPrice);
		System.out.println("Enjoy your meal in flight ");
	}

	@Override
	public List<newMenu> returnMenu() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
