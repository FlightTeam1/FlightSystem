package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import models.Flight;

public class FlightList {

	private static int flightDuration =1;
	
	List<Flight> listOfFlights = new ArrayList<>();
	
	public void addFlight(Flight flight) {
		listOfFlights.add(flight);
	}
	
	public List<Flight> listFlights()
	{
		return listOfFlights;
	}
	
	public void showDepartures() {
//		LocalDateTime date= LocalDateTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
//		String text = date.format(formatter);
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM dd HH:mm");
	    String out = date.format(format);
	    
		System.out.println("Tiden: " + date.toString());
		
		System.out.println("		      WELCOME TO FLIGHTSYSTEM");
		System.out.println("");
		System.out.println("List of all flights:                        "+out);
		System.out.println("");
		System.out.println("AIRLINES        FROM            DEPARTURE DATE/TIME     TO              ARRIVAL DATE/TIME");
		System.out.println("------------------------------------------------------------------------------------------");
		
		for (Flight nextFilght : listOfFlights) {
			// String text = nextFilght.getDepartureDate();
			printRow(nextFilght.getAirplane().getAirplaneName(),16);
			printRow(nextFilght.getOrigin(),16);
			printRow(nextFilght.getDepartureDate().format(format),24);
			printRow(nextFilght.getDestination(),16);
			printRow(nextFilght.getDepartureDate().plusHours(flightDuration).format(format),20);
			System.out.println();
		}
	}
	
	public void printRow(String str, Integer length) {
		  System.out.print(str + String.format("%" + (length - str.length()) + "s", ""));
		}

	@Override
	public String toString() {
		return "FlightList [listOfFlights=" + listOfFlights + "]";
	}
	
	

	
}
