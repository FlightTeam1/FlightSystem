package models;

import java.util.List;

public class Airplane {
	private static int airplaneId;
	String airplaneName;
	int seatFirst;
	int setEconomy;
	String reservedFlight="";
	
	String status;
	// Available, Fueled, Reserved, Take-off, Landed, 
	
	public Airplane(String airplaneName, int seatFirst, int setEconomy) {
		super();
		this.airplaneName = airplaneName;
		this.seatFirst = seatFirst;
		this.setEconomy = setEconomy;
		this.status = "Available";
		this.airplaneId =airplaneId; 
		airplaneId++;
	}
	
	public String reserveSeatEco() {
		return null;
	}
	
	public String reserveSeatFirst() {
		return null;
	}
	
	private List<String> listAvailableSeats(){
		return null;
	}

	public String getAirplaneName() {
		return airplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	public int getSeatFirst() {
		return seatFirst;
	}

	public void setSeatFirst(int seatFirst) {
		this.seatFirst = seatFirst;
	}

	public int getSetEconomy() {
		return setEconomy;
	}

	public void setSetEconomy(int setEconomy) {
		this.setEconomy = setEconomy;
	}

	public static int getairplaneId() {
		return airplaneId;
	}

	public String getStatus() {
		return status;
	}
	
	public void fillTank() {
		if (status.equals("Available"))
			status="Fueled";
	}
	
	public void unReserve(String flightID) {
		if (status.equals("Reserved") )
			reservedFlight="";
	}
	
	public void reserve(String flightID) {
		if (status.equals("Fueled") && reservedFlight =="")
			status="Reserved";
			reservedFlight=flightID;
	}
}
