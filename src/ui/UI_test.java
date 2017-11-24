package ui;

import java.util.Scanner;

import bookingTicket.Customer;
import bookingTicket.Reservation;
import exceptions.ExceptionSeatIsOccupied;
import foodPackage.newMenu;
import models.Flight;
import models.FlightList;
public class UI_test {
	
	FlightList listFlight = new FlightList();
	public static String  MSG_SELECT_FLIGHT = "Select which flight you like to book";
	
	Flight selectedFlight;
	newMenu selectedMenu = new newMenu("Hamburger", 1.00,2.00);
	// Food selectedFood;
	
	public UI_test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		boolean newAction = true;
		boolean listAvailable = false;

		int menuButton = 0;
		int menuType = 0;
		int seat=0;
		
		while (newAction) {
			System.out.println(listMenu(menuType));
			sc.hasNext();
			menuButton=sc.nextInt();

			switch (menuButton+10*menuType) {
			case 1:
				listFlight.showDeparturesToday();
				break;
			case 2:
				int count = listFlight.getListOfLastResult().size();
				if (count>0) {
					System.out.println("Select the flight to book");
					System.out.println("\n" + MSG_SELECT_FLIGHT +" (1-"+count+")");
					menuButton=sc.nextInt();
				}
				selectedFlight = listFlight.getListOfLastResult().get(menuButton-1);
				System.out.println("Do you like to choose First (1) or Economy Class (2)");
				menuType=1;

				break;
			case 3:
				// Select Food
				break;
			case 4:
				createPayment();
				return;
			case 11:
				
				try {
					seat = selectedFlight.getAirplane().reserveFirstAvailableSeat("First");
				} catch (ExceptionSeatIsOccupied e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("First class selected Seat =" + Integer.toString(seat));
				menuType=0;
				break;
			case 12:
				try {
					seat = selectedFlight.getAirplane().reserveFirstAvailableSeat("Economy");
				} catch (ExceptionSeatIsOccupied e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("First class selected Seat =" + Integer.toString(seat));
				menuType=0;
				break;
				
			case 21:
				
			
			default:
				System.out.println(menuButton+10*menuType);
			}
		
		}
		sc.close();
	}
	public void createPayment() {
		Customer customer = new Customer();
		Reservation newReservation = new Reservation(customer, selectedFlight, selectedFood); 
	}
	
	public String listMenu(int selectMenu) {
		String[] menu = new String[10];
		menu[0]="Welcome to FlightSystem\n\n1.List Flights (Today)\n" + "2.Book Flight\n" + "3.Select Food\n" + "4.Payment\n";
		menu[1]="Select First (1) or (2) Economy";
		menu[2]="Select payment method Cash (1) or Credit (2)";
		return menu[selectMenu]; 
	}
}
