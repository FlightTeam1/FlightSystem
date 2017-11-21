import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reservation {
	private List<Customer> list = new ArrayList<Customer>();
	private int ticketID;
	private Customer customer;
	//private Flight flight;
	//private Food food;
	private String bookingRef;
	private double totalPrice;
	
	public Reservation(int ticketID, Customer customer, String bookingRef, double totalPrice) {
		
		this.ticketID = ticketID;
		this.customer = customer;
//		this.flight = flight;
//		this.food = food;
		this.bookingRef = bookingRef;
		this.totalPrice = totalPrice;
	}
	
	
	public Customer bookTicket(Customer customer) {
		
		return customer;
		
	}
	
	public void cancelTicket(int customerID) {
		
		Iterator<Customer> it = list.iterator();
		
		while(it.hasNext()) {
		Customer customer = it.next();
		
		if(customer.getId()==customerID)
		System.out.println(customer.getId());
				it.remove();
			}
		}
	

	
	public double getTotalPrice() {

			return totalPrice;

}
	public int getTicketID() {
		return ticketID;
	}
	
	public Reservation printTicket(Reservation reserve) {
		
		return reserve;
		
	}
	
	public String toString() {
		return "Cusotmer :" + ticketID + " totalPrice " +totalPrice +
				"Booking Ref :" + bookingRef + " " + customer; 
	}
	
	
	
}//end of class reservation
