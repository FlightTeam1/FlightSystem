package Test;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import models.Flight;
import models.FlightList;

public class FlightListTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
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

	@Test
	public void testFlightList() {
		FlightList list = new FlightList();
		list.showDepartures();
	}
	
	@Test
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
}
