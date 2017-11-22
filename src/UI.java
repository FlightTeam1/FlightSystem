import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UI {

  
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

