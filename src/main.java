import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
	
		UI ui = new UI();	
//		ui.run();
		ReservationList newList = new ReservationList();
//		Customer customer = new Customer(1," MAttias", "abbasi" ,"abc@yahoo.com" , "2343434" , "10 hight Street" ,Gender.MALE);
//		Customer customer2 = new Customer(2," khalid", "abbasi" ,"abc@yahoo.com" , "2343434" , "10 hight Street" ,Gender.MALE);
		
		
		newList.printAll();
		newList.cancelTicket(124);
		System.out.println("After REmove ~~~~~~~~~~~~~~~~");
		newList.printAll();
		
//		ui.printHeader();
//		ui.printAll();
////		System.out.println(reservation.bookTicket(customer));
//		
//		//reservation.cancelTicket(2);
//		
//		System.out.println("*****************AFTER REMOVE***************");
//		
//		();
//		
		
		
		

	}
	
	public String getText(Scanner sc) {

		String text = "";
		while (text.length() == 0) {
			try {
				if (sc.hasNextLine()) {
					text = sc.nextLine();
				}
			} catch (Exception e) {
			} // any exception
		}

		return text;
	}
	

}
