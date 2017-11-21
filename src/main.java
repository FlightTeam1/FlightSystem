
public class main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1," MAttias", "abbasi" ,"abc@yahoo.com" , "2343434" , "10 hight Street" ,Gender.MALE);
		Customer customer2 = new Customer(2," khalid", "abbasi" ,"abc@yahoo.com" , "2343434" , "10 hight Street" ,Gender.MALE);
		
		Reservation reservation = new Reservation(123232, "this is referecen", 121);
		reservation.addCustomerToReservation(customer);
		
		
		
		//System.out.println(reserve.printTicket(reserve))
		
		UI ui = new UI();
		ui.printHeader();
		ui.printAll(reservation);
//		System.out.println(reservation.bookTicket(customer));
		
		reservation.cancelTicket(1);
		
		System.out.println("*****************AFTER REMOVE***************");
		
		ui.printAll(reservation);
		
		
		
		

	}
	
	

}
