package models;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import comparator.FlightComparator;
import models.Flight;

public class FlightList {
	private static int FLIGHTDURATION =1;
	private static String ORIGIN ="Arlanda";
	private static int FIXED_FIRSTCLASS_PRICE=20000;
	private static int FIXED_ECONOMY_PRICE=5000;
	
	List<Flight> listOfFlights = new ArrayList<>();
	
	public FlightList() {
		loadXMLData();
	}
	
	public void addFlight(Flight flight) {
		listOfFlights.add(flight);
	}
	
	public List<Flight> listFlights()
	{
		return listOfFlights;
	}
	
	public void showDepartures() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	    String out = date.format(format);
	    
	    System.out.println("");
		System.out.println("                                   WELCOME TO FLIGHTSYSTEM");
		System.out.println("==========================================================================================");
		System.out.println("List of all flights:                        "+out);
		System.out.println("");
		System.out.println("AIRLINES        FROM            DEPARTURE DATE/TIME     TO              ARRIVAL DATE/TIME");
		System.out.println("==========================================================================================");
		
		
		Collections.sort(listOfFlights, new FlightComparator());
		
		for (Flight nextFilght : listOfFlights) {
			// String text = nextFilght.getDepartureDate();
			printRow(nextFilght.getAirplane().getAirplaneName(),16);
			printRow(nextFilght.getOrigin(),16);
			printRow(nextFilght.getDepartureDate().format(format),24);
			printRow(nextFilght.getDestination(),16);
			printRow(nextFilght.getDepartureDate().plusHours(FLIGHTDURATION).format(format),20);
			System.out.println();
		}
	}
	
	public void loadXMLData() {
		try {
			Airplane justOneAirplane = new Airplane("SAS Boeing A380" , 5 , 5);

			File fXmlFile = new File("Depatures.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			// System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("Depatures");

			// System.out.println("----------------------------");
			listOfFlights.clear();
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				// System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					long extraDays = (long) (Math.random()*10);
					long extraHours = (long) (Math.random()*12);
					
					Element eElement = (Element) nNode;
										
					String time = eElement.getElementsByTagName("Time").item(0).getTextContent();
					String destination = eElement.getElementsByTagName("Destination").item(0).getTextContent();
					String flight = eElement.getElementsByTagName("Flight").item(0).getTextContent();
					
					LocalDateTime date = LocalDateTime.now();
					
					date= date.plusDays(extraDays);
					date= date.plusHours(extraHours);

					Flight loadFlight = new Flight (justOneAirplane,flight,ORIGIN, destination,FIXED_FIRSTCLASS_PRICE,FIXED_ECONOMY_PRICE,date);
					listOfFlights.add(loadFlight);
					
//					System.out.print(eElement.getElementsByTagName("Time").item(0).getTextContent());
//					System.out.print(" " +  eElement.getElementsByTagName("Destination").item(0).getTextContent());
//					System.out.println(" " + eElement.getElementsByTagName("Flight").item(0).getTextContent());
				}
			}
		    } catch (Exception e) {
			e.printStackTrace();
		    }
	}
	
	private void printRow(String str, Integer length) {
		  System.out.print(str + String.format("%" + (length - str.length()) + "s", ""));
		}
	
}
