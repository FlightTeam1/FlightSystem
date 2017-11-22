package comparator;

import java.util.Comparator;

import models.Flight;
import models.FlightList;

public class FlightComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		// TODO Auto-generated method stub
		if (o1.getDepartureDate().isBefore(o2.getDepartureDate()))
		{
			return -1;
		}
		else 
		{
			return 1;
		}
	}
}


