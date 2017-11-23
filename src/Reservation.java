import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reservation{
	private int ticketID;
	//private Flight flight;
	//private Food food;
	private String bookingRef;
	private double totalPrice;
	private Customer customer;

	public Reservation() {
		super();
		
	}

	public Reservation(int customerID, String firstName, String surName, String email, String phone, String address,
			Gender gender , int ticketID, String bookingRef, double totalPrice) {
		
		this.customer = new Customer(customerID, firstName, surName, email, phone, address, gender);
		
		this.ticketID = ticketID;
//		this.flight = flight;
//		this.food = food;
		this.bookingRef = bookingRef;
		this.totalPrice = totalPrice;

	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public String getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.customer.toString() + " " + ticketID + " " + bookingRef + " " + totalPrice;
	}
	
	
}//end of class reservation