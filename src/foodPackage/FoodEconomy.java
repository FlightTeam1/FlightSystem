package foodPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FoodEconomy implements Food{
    
    public  double totalPrice;
    private double itemPrice;
    static boolean order = true;
    static Scanner input = new Scanner(System.in);
    public List<FoodItem> itemsList = new ArrayList<FoodItem>();
    
    public static void main(String[] args) {
        FoodEconomy p = new FoodEconomy();
        p.getFood();
    }
    
    
    public void getFood() {
		Messages msg = new Messages();
		System.out.println("**Economy Class Menu service** \n");
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
        double quantity = quantity();
        itemPrice(foodId,quantity);
    }
    
    
    public double itemPrice(int foodId,double quantity) {
        if (foodId == 1) {
            
            System.out.println("You've ordered Chicken burger with choice of drink");
            itemsList.add(new FoodItem(foodId,"Chicken Burger",31,quantity));
            itemPrice =31;

        }
        if (foodId == 2) {
            System.out.println("You've ordered Kyckling File med Pommes");
            itemsList.add(new FoodItem(foodId,"Kyckling File med Pommes",32,quantity));
            itemPrice =32;

        }
        if (foodId == 3) {      
            System.out.println("You've ordered Beef Sandwich");
            itemsList.add(new FoodItem(foodId,"Beef Sandwich",33,quantity));
            itemPrice =33;
        }
        
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
        System.out.println("Enter how much quantity you wish to order");       
        double quantity = input.nextDouble();
        calculatePrice(quantity, itemPrice);
        return quantity;
    }
    
    
    public double calculatePrice(double quantity, double Price) {
        double calculatePrice = quantity*Price;
        System.out.println("Subtotal: "+ calculatePrice);
        totalPrice += calculatePrice;
        return calculatePrice;
    }
    
    
    public void getAllItems() { 
        if(itemsList!=null && !itemsList.isEmpty()){
            for (FoodItem item : itemsList){
                if(item!=null){
                    System.out.println("\n FoodList:" + item.getFoodId() +
                            "\n ItemName: "+item.getFoodName()+ 
                            "\n Sub Total: "+item.getPrice() * item.getQuantity());
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


	
    
    
   
}