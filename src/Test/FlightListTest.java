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
		// list.loadXMLData();
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
//
//	@Test
//	public void testAddFlight() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testListFlights() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testShowDepartures() {
//		fail("Not yet implemented");
//	}
}
