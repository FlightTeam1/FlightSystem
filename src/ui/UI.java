package ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import bookingTicket.Customer;
import bookingTicket.Reservation;
import bookingTicket.ReservationList;
import foodPackage.FoodEconomy;
import models.A380;
import models.Airplane;
import models.CommercialFlight;
import models.Flight;
import models.FlightList;

public class UI {
	Flight reservedFlight;
	Customer reservedCustomer;
	ReservationList newList = new ReservationList();

	public void printHeader() {
		
		System.out.println("                 *************************************************************************************************");
		System.out.println("           			                                      Flight Reservation System");
		System.out.println("                 *************************************************************************************************");
		System.out.println("CustID     First Name         SurName           email              phone   	      Address   	  Gender         TicketId         Airplane        Origin        Destination  totalPrice");
		
	}
	
	
	public void run() {

		Scanner sc = new Scanner(System.in);
       
		boolean newAction = true;

		Character menuButton = 'H';
		while (newAction) {
			switch (menuButton) {
			case 'P':
				// to read the list
				printHeader();
				newList.printAll();
				break;
			case 'A':
				// add
				reservedCustomer=createCustomer(sc);
			case 'B':
				FoodEconomy food = new FoodEconomy();
				Reservation reserv = new Reservation(reservedCustomer, reservedFlight, food );
				
				break;
			case 'D':
				// delete by id
				System.out.println("Please enter ticke id to cancel ticke");
				newList.cancelTicket(getNumber(sc));
				break;
			case 'H':
				toPrintMenu();
				break;
				
			case 'S':
				reservedFlight = selectFlight(sc);
				break;
    
			case 'Q':
				newAction = false;
				System.out.println();
				System.out.println(".........");
				break;
			default:
				// read again
				break;
			}

			if (newAction) {
				menuButton = getMenuButton(sc);
			}
		}
		sc.close();
	}


		private void toPrintMenu() {
			System.out.println ("MENU:");			
			System.out.println ("(P) - to print the list");			
			System.out.println ("(A) - to add an customer");
			System.out.println ("(D) - to deleate customer");			
		
		
		}
		
		public Flight selectFlight(Scanner sc) {
			FlightList list = new FlightList();
			list.showDeparturesToday();
			System.out.println("Select flight by id");
			int id = getNumber(sc);
			
			return list.getFlightById(id);
		}
		

		public Customer createCustomer(Scanner sc) {
			//int input = 0;
			Customer newCustomer =new Customer();;
			int customerID = 1 + (int)(Math.random() * 5000+1); 
			System.out.println("Select from the list");
			
			//int airplane = getNumber(sc);
	
			
			System.out.println("Input first name");
			String fName = getText(sc);
			newCustomer.setFirstName(fName);
			
			System.out.println("Input sur name");
			String sName = getText(sc);
			newCustomer.setSurName(sName);

			System.out.println("Input first email");
			String email = getText(sc);
			newCustomer.setEmail(email);

			System.out.println("Input first phone");
			String phone = getText(sc);
			newCustomer.setPhone(phone);

			System.out.println("Input first address");
			String address = getText(sc);
			newCustomer.setAddress(address);

			System.out.println("Input enter gender");
			String gender = genderText(sc);
			newCustomer.setGender(gender);
		
			LocalDateTime date =LocalDateTime.now();
			
			return newCustomer;
//			newList.addList(new Reservation(customerID, fName,sName, email, phone ,address ,gender,
//					getFlight.getAirplane(),132.343));
		}
		
		private LocalDate getDate(Scanner sc) {

			LocalDate date = null;
			while (date == null) {

				String dateFormat = "yyyy-MM-dd";
				System.out.println("Input the date to perform to ( " + dateFormat + " ):");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
				String dateStr = "";

				try {
					if (sc.hasNextLine()) {
						dateStr = sc.nextLine();
						date = LocalDate.parse(dateStr, formatter);
					}
				} catch (Exception e) {
				} // any exception
			}

			return date;
		}
		
		private Character getMenuButton(Scanner sc) {
			Character menuButton = 'L'; //

			String inpStr = "";
			System.out.println();
			System.out.println("MenuButton:");

			try {
				if (sc.hasNext()) {				
					inpStr = sc.nextLine(); // for whole line reading including space-
				}
			} catch (Exception e) {
			} // any exception

			if (inpStr != null && inpStr.length() != 0) {
				menuButton = inpStr.toUpperCase().charAt(0);
			}

			return menuButton;
		}
		private String getText(Scanner sc) {
			String text = "";
			while (text.length() == 0) {
				try {
					if (sc.hasNextLine()) {
						text = sc.nextLine();
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				} // any exception
			}

			return text;
		}
		
	
		private String genderText(Scanner sc) {
			String text = "";
			text = sc.nextLine();
			if(text.equalsIgnoreCase(Gender.MALE.toString())) {
				text = Gender.MALE.toString();
						
			}else {
				

			 text = Gender.FEMALE.toString();
		}
			return text;
		}



		
		public int getNumber(Scanner sc) {
			int id = 0;
			while (id == 0) {
				try {				
					 if (sc.hasNextLine()) {
						   id = Integer.parseInt(sc.nextLine());						
					}
				} catch (Exception e) {
				} // any exception

			}
			return id;
		}
	
	
		

//	System.out.println(fixLengthString(reservation.getId(),5)+ " |"+ fixLengthString(reservation.getFirstName(),10) +"  |   "+
//			fixLengthString(reservation.getsurtName(),10)+" | "+fixLengthString(reservation.getEmail(),10) +"   | "+
//			fixLengthString(reservation.getPhoneNo(),10) + "    | " +
//			fixLengthString(reservation.getAddress(),10)+ "    | " +
//			//fixLengthString(reservation.getGender().MALE,6)+ "    |   " +
//			fixLengthString(reservation.getTicketID(),5)+ "      |        " +
//			fixLengthString(reservation.getTotalPrice(),5));
//		
//	}
	
	
	

}

