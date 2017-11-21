package models;
import java.time.LocalDate;

public class Flight {
	private int flightID;
	private Airplane airplane = new Airplane("Airbus 380",5,5);
	private String flightNo;
	private String destination;
	private int priceFirst=20000;
	private int priceEconomy =5000;
	private LocalDate departureDate;

	public Flight(Airplane airplane, String flightNo, String destination, int priceFirst, int priceEconomy,
			LocalDate departureDate) {
		super();
		this.flightID = flightID++;
		this.airplane = airplane;
		this.flightNo = flightNo;
		this.destination = destination;
		this.priceFirst = priceFirst;
		this.priceEconomy = priceEconomy;
		this.departureDate = departureDate;
	}

	public int getFlightID() {
		return flightID;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
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

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
}
