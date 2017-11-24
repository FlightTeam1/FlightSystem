package foodPackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class newFoodFirst implements newFood {
	List<newMenu> food = new ArrayList<>();
	Random passengerRef = new Random();
	public  double totalPrice;
	private double itemPrice;
	private double subTotal;
	static boolean order = true;
	static Scanner input = new Scanner(System.in);
	
	List<newMenu> orderList = new ArrayList<>();
	
	public static void main(String[] args) {
		newFoodFirst p = new newFoodFirst();
		p.getFood();
	}
	
	public newFoodFirst() {
		// TODO Auto-generated constructor stub
		// Autogenerate menu 
		newMenu meny1 = new newMenu("Crispy fried chicken with Potato smash and Vanilla Fruit icecream",5.00,0); 
		newMenu meny2 = new newMenu("Steam Fish Fillet with Garlic sauce and Strawberry smoothie",6.50,0);
		newMenu meny3 = new newMenu("Beef Burrito with Lemon Tart",7.00,0);
		
		food.add(meny1);
		food.add(meny2);
		food.add(meny3);
	}
	
	public void getFood() {
		Messages msg = new Messages();
		System.out.println("**First Class Menu service** \n");
		System.out.println(msg.getStaticMenuInfo());

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
            	//orderList.clear();
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

    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        foodMenu();
        System.out.println("Enter Index number u wish to add:\n");
        int foodItem = scanner.nextInt(); 
        itemPrice(foodItem);
    }
    
    
    
    
	@Override
	public void foodMenu() {
		// TODO Auto-generated method stub
		System.out.println("Select your choice of items \n");
		int count = 1;
		
		NumberFormat formatter = new DecimalFormat("SEK 0.00");
		
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
		if (foodItem>0 && foodItem <= food.size()) {
			String selectedFood = food.get(foodItem-1).getFoodName();
			
			System.out.println("You ordered a " + selectedFood);
			itemPrice = food.get(foodItem-1).getPrice();
			
			double quantity = quantity();	// calculate sum
			newMenu orderedFood = new newMenu(selectedFood,itemPrice,quantity);
			
			orderList.add(orderedFood);
			
			System.out.println("\nDo you want to add one more food Item (Y/N):\n");
			String oneMore = input.next();
			if("y".equalsIgnoreCase(oneMore.toLowerCase())) {
				addItem();
			} else {
				
				executeOperation(foodItem);
			} 	
			return itemPrice;

		}
		return foodItem;
	}

	@Override
	public double quantity() {
        System.out.println("Enter how much quantity you wish to order");       
        double quantity = input.nextDouble();       
        subTotal = itemPrice * quantity; 
        System.out.println("\n Sub Total: SEK "+subTotal);              
        totalPrice += subTotal;
        
		return quantity;        
    }
	public void getAllItems() { 
        if(orderList!=null && !orderList.isEmpty()){
        	for (newMenu item : orderList){
                if(item!=null){
                    System.out.println(getString( " Item Name: "+item.getFoodName(),60) + " " + " Sub Total: "+item.getPrice() * item.getQuantity() );   
                }
            }
        	System.out.println("=================================");
            System.out.println("TotalPrice for food " +totalPrice);
        } else {
            System.out.println("No Data Found");
        }            
    }
	
	private String getString(String input, int length) {
		String output =input + String.format("%" + (length - input.length()) + "s", "");
		return output;
	}
	
	

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		order = false;		
		System.out.println("TotalPrice for food        :" +totalPrice+"\nPassenger Reference number :"+passengerRef.nextInt(999999));
		System.out.println("Enjoy your meal in flight ");
	}

	

	

	
	
}
