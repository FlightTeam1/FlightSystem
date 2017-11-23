package models;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Flight {
	
	private CommercialFlight airplane = new A380();
	
	//Airplane("Airbus 380",5,5);
	
	private static int counter = 0;
	private int flightId;
	private String flightNo;
	private String origin;
	private String destination;
	private int priceFirst=20000;
	private int priceEconomy =5000;
	private LocalDateTime departureDate;

	public Flight(CommercialFlight airplane, String flightNo, String origin,  String destination, int priceFirst, int priceEconomy,
			LocalDateTime departureDate) {
		super();
		
		this.airplane = airplane;
		this.flightNo = flightNo;
		this.origin = origin;
		this.destination = destination;
		this.priceFirst = priceFirst;
		this.priceEconomy = priceEconomy;
		this.departureDate = departureDate;
		this.flightId = Flight.counter;
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}

	public int getFlightID() {
		return flightId;
	}

	public CommercialFlight getAirplane() {
		return airplane;
	}

	public void setAirplane(CommercialFlight airplane) {
		this.airplane = airplane;
	}

	public String getFlightNo() {
		return flightNo;
	}
	
	public void setFlightId(int id) {
		this.flightId = id;
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
		return "Flight [flightID=" + flightId + ", airplane=" + airplane;
	}
}
