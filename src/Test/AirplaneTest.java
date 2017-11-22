package Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import exceptions.ExceptionSeatIsOccupied;
import exceptions.ExceptionSeatNotInRange;
import models.A380;
import models.Airplane;
import models.CommercialFlight;

public class AirplaneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = ExceptionSeatIsOccupied.class)
	public void bookMoreSeatsThanAvailable() throws ExceptionSeatIsOccupied, ExceptionSeatNotInRange {

		Airplane testPlane  = new A380(); 
		// Airplane("Airbus 380",5,5);
		
		System.out.println(testPlane.getAirplaneName() + " " +  testPlane.getStatus()+ " Planeid=" + testPlane.getairplaneId());
		
		int x=testPlane.reserveSpecificSeat(7, "Economy");
		System.out.println("Reserve a specific seat in Economy   Seat no:" + x);

		x=testPlane.reserveSpecificSeat(9, "Economy");
		System.out.println("Reserve a specific seat in Economy   Seat no:" + x);
		
		x=testPlane.reserveSpecificSeat(1, "First");
		System.out.println("Reserve a specific seat in First     Seat no:" + x);

		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Reserve first available seat in Eco, Seat no:" + x);

		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Reserve first available seat in Eco, Seat no:" + x);

		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Reserve first available seat in Eco, Seat no:" + x);
		
		testPlane.printSeating();
		System.out.println("Book another Economy seat...");
		
		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Economy Seat no:" + x);
	}
	
	@Test
	public void checkAvailableSeats() throws ExceptionSeatIsOccupied {
		CommercialFlight testPlane = new A380();
		//Airplane("Airbus 380",5,5);
		
		int x=0;
		x= testPlane.reserveFirstAvailableSeat("Economy");
		x= testPlane.reserveFirstAvailableSeat("Economy");
		x= testPlane.reserveFirstAvailableSeat("Economy");
		x= testPlane.reserveFirstAvailableSeat("First");
		x= testPlane.reserveFirstAvailableSeat("First");
		x= testPlane.reserveFirstAvailableSeat("First");
		
		System.out.println(testPlane.getAvailableSeats());
		int sum1 =testPlane.getAvailableSeats("First");
		int sum2 =testPlane.getAvailableSeats("Economy");
		assertTrue(sum1 == sum2);
	}
}
