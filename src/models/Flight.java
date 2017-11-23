package models;
import java.time.LocalDate;
import java.time.LocalDateTime;

import bookingTicket.Customer;

public class Flight {
	private static int flightID=0;
	//private Airplane airplane = new Airplane("Airbus 380",5,5);
	private String airplane;
	private String flightNo;
	private String origin;
	private String destination;
	private int priceFirst=20000;
	private int priceEconomy =5000;
	private LocalDateTime departureDate;

	
	public Flight() {
		super();
	}

	public Flight(String airplane, String flightNo, String origin,  String destination, int priceFirst, int priceEconomy,
			LocalDateTime departureDate) {
		
		this.flightID = flightID++;
		this.airplane = airplane;
		this.flightNo = flightNo;
		this.origin = origin;
		this.destination = destination;
		this.priceFirst = priceFirst;
		this.priceEconomy = priceEconomy;
		this.departureDate = departureDate;
		
	}

	public int getFlightID() {
		return flightID;
	}

	public String getAirplane() {
		return airplane;
	}

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPriceFirst() {
		return priceFirst;
	}

	public void setPriceFirst(int priceFirst) {
		this.priceFirst = priceFirst;
	}

	public int getPriceEconomy() {
		return priceEconomy;
	}

	public void setPriceEconomy(int priceEconomy) {
		this.priceEconomy = priceEconomy;
	}

	public LocalDateTime getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}

	public String getOrigin() {
		return origin;
	}

	@Override
	public String toString() {
		return flightID + "         " + 
				airplane+ "        " + 
				origin + "         " + 
				destination ;
	}
	
}
