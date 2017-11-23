package Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.Flight;
import models.FlightList;

public class FlightListTest {
	
	FlightList list;
	Flight flight;

//	@Before
	public void setUp() throws Exception {
		FlightList list = new FlightList();
	}
	
//	@Test
	public void testLoadXMLData() {
		FlightList list = new FlightList();
		// list.loadXMLData();	XML loaded automatically when instanciate the FlightList object
		int records=0;
		
		Iterator<Flight> iterator = list.listFlights().iterator();
		while (iterator.hasNext()) {
			Flight current = iterator.next();
//			System.out.println(current.getFlightNo());
//			System.out.print(current.getDestination());
//			System.out.println(current.getDepartureDate());
			records++;
		}
		assertTrue(records ==49);
	}

// 	@Test
	public void testFlightList() {
		FlightList list = new FlightList();
		list.showDepartures();
	}
	
//	@Test
	public void checkNumberOfFlights() {
		FlightList list = new FlightList();
		int count1=list.listFlights().size();
		list.cancelAllFlights();
		int count2=list.listFlights().size();
		
		// System.out.println(count1);	Check full listing compared
		// System.out.println(count2);	with an empty list
		
		assertTrue((count1-49) == count2);
		//cancelAllFlights
	}
	
//	@Test
	public void testExtractJustAFlight() {
		int count = 0;
		FlightList list = new FlightList();
		List<Flight> flightList = new ArrayList<>();
		
		// flightList = list.listFlights("SK4835");
		flightList = list.listFlightsWithAirlineCode("SK4835");
		
		for (Flight nextFlight : flightList) {
			System.out.println(nextFlight.getFlightNo() + " " + nextFlight.getDestination());
			count++;
		}
		assertTrue(count==1);
	}
	
//	@Test
	public void testExtractedList() {
		LocalDate today = LocalDate.now();
		System.out.println("Show departures");
		list.showDepartures(today);
		List newList = new ArrayList<>();
	}

	@Test
	public void testExtractedList2() {
		// LocalDate today = LocalDate.ofYearDay(2017,315);
		FlightList list = new FlightList();
		// list.showDepartures(today);
		list.showDeparturesToday();
		list.showDeparturesToday();
		System.out.print(list.getFlightById(1).getAirplane().getAirplaneName() +  "   ");
		System.out.print(list.getFlightById(1).getDestination() +  "   ");
		System.out.println(list.getFlightById(1).getFlightNo() +  "   ");
		
		
				
		// List newList = new ArrayList<>();
	}
}