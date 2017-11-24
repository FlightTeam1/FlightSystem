package bookingTicket;
// import foodPackage.Food;
import models.A380;
import models.CommercialFlight;
import models.Flight;

public class Reservation{
	private int ticketID;	
	private double totalPrice;
	private Customer customer;
	private Flight flight;
	// private Food food;

	public Reservation(Customer customer, Flight flight, Food food ) {
		this.customer=customer;
		this.flight=flight;
		this.food=food;
	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public double getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public Flight getFlight() {
		return flight;
	}



	public void setFlight(Flight flight) {
		this.flight = flight;
	}



	public Food getFood() {
		return food;
	}



	public void setFood(Food food) {
		this.food = food;
	}



}