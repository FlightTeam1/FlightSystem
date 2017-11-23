
import java.util.Scanner;

public class UI {
	ReservationList newList = new ReservationList();
  
	public void printHeader() {
		
		System.out.println("*************************************************************************************************");
		System.out.println("           			Flight Reservation System");
		System.out.println("*************************************************************************************************");
		System.out.println("CustID| First Name |	SurName   | email        | phone   	 | Address   	 | Gender    | TicketId Flight   |	Food bookingRef   |	totalPrice");
	}
	
	public String fixLengthString(String start , int length) {
		
		if(start.length()>= length) {
			return start.substring(0, length);
		}
		else
		{
			while(start.length()<length) {
				start+=" ";
			}
			return start;
		}
		
	}
	
	public String fixLengthString(int start, int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}
	
	public String fixLengthString(double start, int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}
	
	
//	public void run() {
//			
//			System.out.println("please choose option");
//			Scanner sc = new Scanner(System.in);
//			String t = sc.next();
//			boolean newAction = true;
//	
////			String menuButton =t;
////			while (newAction) {
//				switch (t) {
//				case "p":
//					// to read the list
//					newList.printAll();
//					break;
//				case "a":
//					// add
//					addEvent(sc);
//					break;
//				case "d":
//					// delete by id
//					newList.cancelTicket(1);
//					break;
//			
//					
//				
//				default:
//					// read again
//					break;
//				}
//
//				sc.close();
//			}
//			
////	}
//
//		private void toPrintMenu() {
//			System.out.println ("MENU:");
//			
//			
//			System.out.println ("<P> - to print the list");
//		
//			
//			System.out.println ("<A> - to add an item");
//			System.out.println ("<D> - to deleate an item");			
//		
//		
//		}
//
//		public void addEvent(Scanner sc) {
//
//
//			System.out.println("input firsname sur name email:");
//			String fn = getText(sc);
//			String sn = getText(sc);
//			String em = getText(sc);
//			
//			
//			newList.addList(new Reservation(1, fn,sn, em,"12338843" ,"1 hight street" ,Gender.MALE,123,"abc123",1212.23));
//		}
//		
//	
//		
//
//		private String getText(Scanner sc) {
//
//			String text = "";
//			while (text.length() == 0) {
//				try {
//					if (sc.hasNextLine()) {
//						text = sc.nextLine();
//					}
//				} catch (Exception e) {
//				} // any exception
//			}
//
//			return text;
//		}
//
//		
//		public int getNumber(Scanner sc) {
//
//			int id = 0;
//			while (id == 0) {
//				try {				
//					 if (sc.hasNextLine()) {
//						   id = Integer.parseInt(sc.nextLine());						
//					}
//				} catch (Exception e) {
//				} // any exception
//
//			}
//			return id;
//		}
//	
//
//	
//	
//	
//	
	
		
//	public void printAll(Reservation reservation) {
////		Iterator<Customer> it = reservation.getList().iterator();
////		while(it.hasNext()) {
////		Customer c = it.next();
////		for(Customer c: reservation.getList()) {
//	
//	System.out.println(fixLengthString(reservation.getId(),5)+ " |"+ fixLengthString(reservation.getFirstName(),10) +"  |   "+
//			fixLengthString(reservation.getsurtName(),10)+" | "+fixLengthString(reservation.getEmail(),10) +"   | "+
//			fixLengthString(reservation.getPhoneNo(),10) + "    | " +
//			fixLengthString(reservation.getAddress(),10)+ "    | " +
//			//fixLengthString(reservation.getGender().MALE,6)+ "    |   " +
//			fixLengthString(reservation.getTicketID(),5)+ "      |        " +
//			fixLengthString(reservation.getTotalPrice(),5));
//		
//	}
	
	
	

}