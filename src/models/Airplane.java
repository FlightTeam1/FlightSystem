package models;

import java.util.ArrayList;
import java.util.List;

import exceptions.ExceptionSeatIsOccupied;
import exceptions.ExceptionSeatNotInRange;

public abstract class Airplane implements CommercialFlight {
	private static int airplaneId;
	String airplaneName;
	int seatFirst;
	int seatEconomy;
	String reservedFlight="";

	List<String> seatLayout = new ArrayList<>();		
	String status;
	// Available, Fueled, Reserved, Take-off, Landed, 

	public  Airplane(String airplaneName, int seatFirst, int seatEconomy) {
		super();
		this.airplaneName = airplaneName;
		this.seatFirst = seatFirst;
		this.seatEconomy = seatEconomy;
		this.status = "Available";
		this.airplaneId =airplaneId;
		
		for (int i=0;i<(seatFirst+seatEconomy);i++) {
			if (i<seatFirst)
				seatLayout.add("AF");		// Available Firstclass
			else
				seatLayout.add("AE");		// Available Economy
		}
		airplaneId++;
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#reserveFirstAvailableSeat(java.lang.String)
	 */
	@Override
	public int reserveFirstAvailableSeat(String classSeat) throws ExceptionSeatIsOccupied {
		String seatType;
		if (classSeat.equalsIgnoreCase("FIRST"))
			seatType="AF";
		else
			seatType="AE";
		int index = seatLayout.indexOf(seatType);
		
		if (index==-1){
			throw new ExceptionSeatIsOccupied();
		}
		else
		{
			seatLayout.set(index, "R");
			return ++index;
		}
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#reserveSpecificSeat(int, java.lang.String)
	 */
	@Override
	public int reserveSpecificSeat(int seat, String classSeat) throws exceptions.ExceptionSeatNotInRange, ExceptionSeatIsOccupied {
		String seatType;
		if (seat <1 || seat >(seatEconomy + seatFirst)){
			throw new ExceptionSeatNotInRange();
		}
		if (classSeat.equalsIgnoreCase("FIRST"))
			seatType="AF";
		else
			seatType="AE";
		
		if (seatLayout.get(seat-1).equals(seatType)){
			seatLayout.set(seat-1, "R");
			return seat;
		}
		else
		{
			throw new ExceptionSeatIsOccupied();
		}
	}
	/* (non-Javadoc)
	 * @see models.ComercialFlight#returnSeating()
	 */
	@Override
	public List<String> returnSeating(){
		return seatLayout;
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#printSeating()
	 */
	@Override
	public void printSeating() {
		int row=1;
		String out = "";
		
		for (String seat : seatLayout) {
			System.out.print("Row " + row + ": Seat=");
			switch (seat) {
			case "R":
				out ="Reserved";
				break;

			case "AF":
				out = "Available Firstclass";
				break;
			case "AE":
				out = "Available Economy";
			}
			System.out.println(out);
			row++;
		}
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#getAvailableSeats()
	 */
	@Override
	public int getAvailableSeats() {
		int available=0;
		for (String nextSeat :  seatLayout) {
			if (nextSeat.startsWith("A"))
					available++;
		}
		return available;
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#getAvailableSeats(java.lang.String)
	 */
	@Override
	public int getAvailableSeats(String classSeat) {
		int available=0;
		String seatType;
		if (classSeat.equalsIgnoreCase("FIRST"))
			seatType="AF";
		else
			seatType="AE";
		
		for (String nextSeat :  seatLayout) {
			if (nextSeat.startsWith(seatType))
					available++;
		}
		return available;
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#getAirplaneName()
	 */
	@Override
	public String getAirplaneName() {
		return airplaneName;
	}

//  Remove, maybe not a good idea to be able to change the name after instanciation
//	public void setAirplaneName(String airplaneName) {
//		this.airplaneName = airplaneName;
//	}

	public static int getairplaneId() {
		return airplaneId;
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#getStatus()
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#fillTank()
	 */
	@Override
	public void fillTank() {
		if (status.equals("Available"))
			status="Fueled";
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#unReserve(java.lang.String)
	 */
	@Override
	public void unReserve(String flightID) {
		if (status.equals("Reserved") )
			reservedFlight="";
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#reserve(java.lang.String)
	 */
	@Override
	public void reserve(String flightID) {
		if (status.equals("Fueled") && reservedFlight =="") {
			status="Reserved";
			reservedFlight=flightID;
		}
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#takeOff(java.lang.String)
	 */
	@Override
	public void takeOff(String flightID) {
		if (status.equals("Reserved") && reservedFlight !="") {
			status="Take-off";
		}
	}
	
	/* (non-Javadoc)
	 * @see models.ComercialFlight#landed(java.lang.String)
	 */
	@Override
	public void landed(String flightID) {
		if (status.equals("Take-off") ) {
			status="Landed";
		}
	}

	public static int getAirplaneId() {
		return airplaneId;
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#getSeatFirst()
	 */
	@Override
	public int getSeatFirst() {
		return seatFirst;
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#getSeatEconomy()
	 */
	@Override
	public int getSeatEconomy() {
		return seatEconomy;
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#getReservedFlight()
	 */
	@Override
	public String getReservedFlight() {
		return reservedFlight;
	}

	/* (non-Javadoc)
	 * @see models.ComercialFlight#toString()
	 */
	@Override
	public String toString() {
		return "Airplane [airplaneName=" + airplaneName + ", seatFirst=" + seatFirst + ", seatEconomy=" + seatEconomy
				+ ", reservedFlight=" + reservedFlight + ", status=" + status + "]";
	}
}
