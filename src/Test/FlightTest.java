package Test;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import exceptions.ExceptionSeatIsOccupied;
import models.Airplane;
import models.Flight;
import models.FlightList;

public class FlightTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws ExceptionSeatIsOccupied {
		Airplane newPlane = new Airplane("Airbus A380",5,5);
		newPlane.fillTank();
		newPlane.reserve("SK771");

		System.out.println(newPlane);

		newPlane.reserveFirstAvailableSeat("Economy");
		newPlane.reserveFirstAvailableSeat("Economy");
		newPlane.reserveFirstAvailableSeat("Economy");
		newPlane.reserveFirstAvailableSeat("Economy");

		newPlane.reserveFirstAvailableSeat("First");
		newPlane.reserveFirstAvailableSeat("First");
		newPlane.reserveFirstAvailableSeat("First");

		newPlane.printSeating();

		Flight flight =  new Flight(newPlane,"SK775","Stockholm","New York",20000,5000,LocalDateTime.now().plusHours(1));

		FlightList list = new FlightList();
		list.addFlight(flight);
		list.addFlight(flight);
		list.addFlight(flight);
		list.addFlight(flight);
		list.addFlight(flight);

		list.showDepartures();
		System.out.println(flight.toString());
	}
}


