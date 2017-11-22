package models;

import java.util.ArrayList;
import java.util.List;

public class AirplaneList {

	List<Airplane> airplaneList = new ArrayList<>();
	
	public AirplaneList() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAirplane(CommercialFlight plane) {
		airplaneList.remove(plane);
	}
	
	public void RemoveAirplane(Airplane plane) {
		airplaneList.add(plane);
	}
	
	public void RemoveAirplane(int id) {
		airplaneList.remove(id);
	}
	
	public List getAllPlanes() {
		return airplaneList;
	}
}
