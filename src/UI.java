
public class UI {
	
	public void printHeader() {
		
		System.out.println("*****************************************************************************************************");
		System.out.println("           			Flight Reservation System");
		System.out.println("*****************************************************************************************************");
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
	
	public void printAll(Reservation reservation , Customer customer) {
	System.out.println(fixLengthString(customer.getId(),5)+ " |"+ fixLengthString(customer.getFirstName(),10) +"  |   "+
			fixLengthString(customer.getsurtName(),10)+" | "+fixLengthString(customer.getEmail(),10) +"   | "+
			fixLengthString(customer.getPhoneNo(),10) + "    | " +
			fixLengthString(customer.getAddress(),10)+ "    | " +
			fixLengthString("Male",6)+ "    |   " +
			fixLengthString(reservation.getTicketID(),10)+ "      |        " +
			fixLengthString(reservation.getTicketID(),10)+ "      |     " +			
			fixLengthString(reservation.getTicketID(),10)
			);
	
	}
	
	

}
