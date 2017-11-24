package foodPackage;

import java.util.ArrayList;
import java.util.List;

public class FoodList {
	List<Food> foodListFirst= new ArrayList<>();
	List<Food> foodListEconomy= new ArrayList<>();
	
	
	public FoodList() {
		// TODO Auto-generated constructor stub
		Food newFood1 = new Food("Crispy fried chicken with Potato smash and Vanilla Fruit icecream",5.00,0);
		Food newFood2 = new Food("Steam Fish Fillet with Garlic sauce and Strawberry smoothie",6.50,0);
		Food newFood3 = new Food("Beef Burrito with Lemon Tart",7.00,0);
		
		foodListFirst.add(newFood1);
		foodListFirst.add(newFood2);
		foodListFirst.add(newFood3);
		
		Food newFood4 = new Food("Chicken burger with choice of drink",2.00,0);
		Food newFood5 = new Food("Kyckling File med Pommes",1.50,0);
		Food newFood6 = new Food("Beef Sandwich",1.00,0);
 
		foodListEconomy.add(newFood4);
		foodListEconomy.add(newFood5);
		foodListEconomy.add(newFood6);
		
	}
	
	public void addFoodEconomy(Food food) {
		foodListEconomy.add(food);
	}
	
	public void foodListFirst(Food food) {
		foodListFirst.add(food);
	}
	
	public List<Food> getfoodFirst(){
		return foodListFirst;
	}
	
	public List<Food> getfoodEconomy(){
		return foodListEconomy;
	}

}
