import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reservation {
	private List<Customer> list = new ArrayList<Customer>();
	public List<Customer> getList() {
		return list;
	}


	public void setList(List<Customer> list) {
		this.list = list;
	}

	public void addCustomerToReservation(Customer customer) {
		list.add(customer);
	}
	
	private int ticketID;
	//private Flight flight;
	//private Food food;
	private String bookingRef;
	private double totalPrice;
	
	public Reservation(int ticketID, String bookingRef, double totalPrice) {
		
		this.ticketID = ticketID;
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
				it.remove();
			}
		}
	
//	public int findCustomer(int customerID) {
//		Iterator<Customer> it = list.iterator();
//		int id=0;
//		while(it.hasNext()) {
//		Customer customer = it.next();
//		if(customer.getId()== customerID) {
//			id += customer.getId();
//		}
//		
//		
//		}
//		return id;
//		
//	}
	
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
				"Booking Ref :" + bookingRef + " " + list; 
	}
	
	
	
}//end of class reservation
