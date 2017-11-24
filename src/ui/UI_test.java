package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import bookingTicket.Customer;
import bookingTicket.Reservation;
import bookingTicket.ReservationList;
import exceptions.ExceptionSeatIsOccupied;
import foodPackage.Food;
import foodPackage.FoodList;
import foodPackage.newFoodEconomy;
import foodPackage.newFoodFirst;
import models.Flight;
import models.FlightList;
public class UI_test {
	
	FlightList listFlight = new FlightList();
	FoodList foodList = new FoodList();
	Random passengerRef = new Random();
	
	double total=0;
	
	public static String  MSG_SELECT_FLIGHT = "Select which flight you like to book";
	
	Flight selectedFlight;
	Food selectedFood;
	Customer selectedCustomer;
	
	ReservationList reservationList =  new ReservationList(); 
	
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
		int seatClass=0;
		
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
				if (seatClass <2) {
					newFoodFirst start = new newFoodFirst();
					total += start.getFood();
				}
				else
				{
					newFoodEconomy start = new newFoodEconomy();
					total += start.getFood();
				}
				break;
			case 4:
				selectedCustomer=returnCustomer();
				break;
			case 5:
				if (selectedCustomer !=null) {
					createPayment();
					total=0;
				}
				else
				{
					System.out.println("Please, select or enter a new customer!");
				}
				
				break;
			case 11:
				try {
					seat = selectedFlight.getAirplane().reserveFirstAvailableSeat("First");
				} catch (ExceptionSeatIsOccupied e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("First class selected Seat =" + Integer.toString(seat));
				seatClass = 1;
				menuType=0;
				total=selectedFlight.getPriceFirst();
				break;
			case 12:
				try {
					seat = selectedFlight.getAirplane().reserveFirstAvailableSeat("Economy");
				} catch (ExceptionSeatIsOccupied e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Economy class selected Seat =" + Integer.toString(seat));
				seatClass = 2;
				menuType=0;
				total=selectedFlight.getPriceEconomy();
				break;
			case 21:
			
			default:
				// System.out.println(menuButton+10*menuType);
			}
		}
		sc.close();
	}
	
	public Customer returnCustomer() {
		Customer customer = new Customer();
		Scanner newScanner = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Enter the Firstname");
		String firstName =newScanner.nextLine();
		customer.setFirstName(firstName);
		
		System.out.println("Enter the Surname");
		String surname =newScanner.nextLine();
		customer.setSurName(surname);
		
		System.out.println("Enter the Email");
		String email=newScanner.nextLine();
		customer.setEmail(email);
		
		System.out.println("Enter the Address");
		String address=newScanner.nextLine();
		customer.setAddress(address);
		
		return customer;
	}
	
	
	public void createPayment() {
		Customer customer = new Customer();
		
		Reservation reserv = new Reservation(selectedCustomer, selectedFlight, selectedFood, 0);
		reserv.setTotalPrice(total);

		reservationList.addList(reserv);
		printTicket(reserv);
	}
	
	public void printTicket(Reservation reserv) {
		System.out.println("**************************");
		System.out.println("*   BOARDINGPASS         *");
		System.out.println("* Origin: " + reserv.getFlight().getOrigin() );
		System.out.println("* Destin: " + reserv.getFlight().getDestination());
		System.out.println("*                        *");
		System.out.println("* Ticketid: " + reserv.getTicketID()+passengerRef.nextInt(999999));
		System.out.println("* Fistname  " + reserv.getCustomer().getFirstName());
		System.out.println("* Surname   " + reserv.getCustomer().getSurName());
		System.out.println("* Flight No " + reserv.getFlight().getFlightNo());
		System.out.println("* Price     " + reserv.getTotalPrice());
		System.out.println("*                        *"); 
		System.out.println("*                        *"); 
		System.out.println("**************************");
	}
	
	public void ListFood(int selection) {
		List<Food> currentList = new ArrayList<Food>();
		switch (selection) {
		
		case 1:
			currentList=foodList.getfoodFirst();
			break;
			
		case 2:
			currentList=foodList.getfoodEconomy(); 
			break;
		}
				
		for (int i=0;i <currentList.size();i++ ) {
			System.out.print( returnFixedLength(currentList.get(i).getFoodname(),70));
			System.out.println(currentList.get(i).getPrice());
		}
		
		System.out.println("Enter your choice of food (1-" + currentList.size() +")");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		selectedFood = currentList.get(choice-1);
		total=total +(int) currentList.get(choice-1).getPrice();
	}
	
	public String returnFixedLength(String input, int length) {
		return input + String.format("%" + (length - input.length()) + "s", "");
	}
	
	public String listMenu(int selectMenu) {
		String[] menu = new String[10];
		menu[0]="Welcome to FlightSystem\n\n1.List Flights (Today)\n" + "2.Book Flight\n" + "3.Select Food\n"+ "4.Select Customer\n" + "5.Payment";
		menu[1]="Select First (1) or (2) Economy";
		menu[2]="Select payment method Cash (1) or Credit (2)";
		menu[3]="Select food your choice of food";
		
		return menu[selectMenu]; 
	}
}
