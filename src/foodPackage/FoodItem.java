package foodPackage;

public class FoodItem {
    
    
    private int foodId;
    private String foodName;
    private double price;
    private double quantity;
    //private static int id = 0;
    
    public FoodItem(int foodId,String foodName,double price,double quantity){
         this.foodId = foodId;
         this.foodName = foodName;
         this.price = price;
         this.quantity = quantity;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getFoodId() {
        return foodId;
    }
    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }
    
    

}
