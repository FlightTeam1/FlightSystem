package bookingTicket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Airplane;
import models.Flight;
import ui.Gender;

public class Reservation{
	
	private int ticketID;	
	//private Food food;
//	private String bookingRef;
	private double totalPrice;
	private Customer customer;
	private Flight flight;

	public Reservation() {
		super();
		
	}
	
// my original constructor
//	public Reservation(int customerID, String firstName, String surName, String email, String phone, String address,
//			Gender gender , int ticketID,  double totalPrice) {
		
		

	
	
		public Reservation(int customerID, String firstName, String surName, String email, String phone, String address,
				String gender , int ticketID, String airplane ,String flightNo, String origin, String destination, 
				int priceFirst, int priceEconony, LocalDateTime departureDate, double totalPrice) {
		
		this.customer = new Customer(customerID, firstName, surName, email, phone, address, gender);
		this.flight = new Flight(airplane,flightNo, origin, destination, priceFirst, priceEconony, departureDate);
		
		this.ticketID = ticketID;
//		this.flight = flight;
//		this.food = food;
//		this.bookingRef = bookingRef;
		this.totalPrice = totalPrice;
		

	}

	
	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

//	public String getBookingRef() {
//		return bookingRef;
//	}
//
//	public void setBookingRef(String bookingRef) {
//		this.bookingRef = bookingRef;
//	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.customer.toString() + " " +customer.fixLengthString(ticketID, 17) + " " + 
		customer.fixLengthString((int)(totalPrice), 17) + " " + this.flight.toString();
	}
	
	
}//end of class reservation
