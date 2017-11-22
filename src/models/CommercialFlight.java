package models;

import java.util.List;

import exceptions.ExceptionSeatIsOccupied;

public interface CommercialFlight {

	
	int reserveFirstAvailableSeat(String classSeat) throws ExceptionSeatIsOccupied;

	int reserveSpecificSeat(int seat, String classSeat)
			throws exceptions.ExceptionSeatNotInRange, ExceptionSeatIsOccupied;

	List<String> returnSeating();

	void printSeating();

	int getAvailableSeats();

	int getAvailableSeats(String classSeat);

	String getAirplaneName();

	String getStatus();

	void fillTank();

	void unReserve(String flightID);

	void reserve(String flightID);

	void takeOff(String flightID);

	void landed(String flightID);

	int getSeatFirst();

	int getSeatEconomy();

	String getReservedFlight();

	String toString();

}