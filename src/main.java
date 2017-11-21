
public class main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1," khalid", "abbasi" ,"abc@yahoo.com" , "2343434" , "10 hight Street" ,Gender.MALE);
		Customer customer2 = new Customer(2," khalid", "abbasi" ,"abc@yahoo.com" , "2343434" , "10 hight Street" ,Gender.MALE);
		
		Reservation reservation = new Reservation(123232 , customer, "this is referecen", 121);
		//System.out.println(reserve.printTicket(reserve))
		
		UI ui = new UI();
		ui.printHeader();
		ui.printAll(reservation, customer);
		
		reservation.cancelTicket(2);
		System.out.println(customer.getId());
		
		ui.printAll(reservation, customer);
		
		
		

	}
	
	

}
