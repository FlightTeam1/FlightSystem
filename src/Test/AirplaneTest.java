package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.ExceptionSeatIsOccupied;
import exceptions.ExceptionSeatNotInRange;
import models.Airplane;

public class AirplaneTest {

	@Before
	public void setUp() throws Exception {
	}


//	@Test
//	public void testReserveFirstAvailableSeat() throws ExceptionSeatIsOccupied {
//		Airplane testPlane  = new Airplane("Airbus 380",5,5);
//	
//		int seat = testPlane.reserveFirstAvailableSeat("first");
//		System.out.println("Seat First:" + seat);
//	
//		seat = testPlane.reserveFirstAvailableSeat("eco");
//		System.out.println("Seat Eco:" + seat);
//	}
	
	//	@Test(expected = ExceptionSeatIsOccupied.class)
	//	public void bookMoreSeatsThanAvailable() throws ExceptionSeatIsOccupied, ExceptionSeatNotInRange {
	//
	//		Airplane testPlane  = new Airplane("Airbus 380",5,5);
	//		System.out.println(testPlane.getAirplaneName() + " " +  testPlane.getStatus()+ " " + testPlane.getairplaneId());
	//
	//		int x= testPlane.reserveFirstAvailableSeat("First");
	//		System.out.println("Firstclass Seat no:" + x);
	//
	//		x= testPlane.reserveFirstAvailableSeat("First");
	//		System.out.println("Firstclass Seat no:" + x);
	//
	//		x= testPlane.reserveFirstAvailableSeat("First");
	//		System.out.println("Firstclass Seat no:" + x);
	//
	//		x=testPlane.reserveSpecificSeat(4, "First");
	//		System.out.println("Firstclass Seat no:" + x);


	//		@Test
	//		public void checkStatus() {
	//			// Available, Fueled, Reserved, Take-off, Landed,
	//			Airplane testPlane  = new Airplane("Airbus 380",5,5);
	//			System.out.println(testPlane.getAirplaneName() + " " +  testPlane.getStatus()+ " " + testPlane.getairplaneId());
	//
	//			Airplane testPlane2  = new Airplane("Airbus 380",5,5);
	//			System.out.println(testPlane2.getAirplaneName() + " " +  testPlane2.getStatus()+ " " + testPlane2.getairplaneId());
	//
	//		}
	//	}
	// }

	@Test(expected = ExceptionSeatIsOccupied.class)
	public void bookMoreSeatsThanAvailable() throws ExceptionSeatIsOccupied, ExceptionSeatNotInRange {

		Airplane testPlane  = new Airplane("Airbus 380",5,5);
		System.out.println(testPlane.getAirplaneName() + " " +  testPlane.getStatus()+ " " + testPlane.getairplaneId());
		
		int x=testPlane.reserveSpecificSeat(7, "Economy");
		System.out.println("Economy Seat no:" + x);

		x=testPlane.reserveSpecificSeat(9, "Economy");
		System.out.println("Economy Seat no:" + x);
		
		x=testPlane.reserveSpecificSeat(1, "First");
		System.out.println("First Seat no:" + x);

		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Economy Seat no:" + x);

		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Economy Seat no:" + x);
		
		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Economy Seat no:" + x);
		
		testPlane.printSeating();
		
		x= testPlane.reserveFirstAvailableSeat("Economy");
		System.out.println("Economy Seat no:" + x);
		
		

		
	}
	
	}