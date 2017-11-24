package ui;

import java.util.Scanner;

public class UI_test {

	public UI_test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public void run() {
		
		System.out.println(listMenu());
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
				
				addCustomer(sc);
				break;
			case 'D':
				// delete by id
				System.out.println("Please enter ticke id to cancel ticke");
				newList.cancelTicket(getNumber(sc));
				break;
			case 'H':
				toPrintMenu();
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
	
	public String listMenu() {
		return "1.List Flights (Today)\n" + "2.Book Flight\n" + "3.Select Food\n" + "4.Payment\n";
	}

}
