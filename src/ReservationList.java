import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReservationList {
	List<Reservation> list = new ArrayList<Reservation>();
	
	public ReservationList() {
			//Iterator<Reservation> it = list.iterator();
			//while(it.hasNext()) {
			//Reservation rs = it.next();
			addList(new Reservation(1, "khalid" , "abbasi" , "abc@yahoo.com", "12338843" , "1 hight street" , Gender.MALE, 123, "abc123", 1212.23));
			addList(new Reservation(2, "khalid" , "abbasi" , "abc@yahoo.com", "12338843" , "1 hight street" , Gender.MALE, 124, "abc123", 1212.23));
			}
			
		//}


	public List<Reservation> getList(){
		return list;
	}
	

	public void addList(Reservation reservation) {
		
		list.add(reservation);
	}
	
	public void setList(List<Reservation> list){
		this.list = list;
	}
	
	public void printAll() {
		Iterator<Reservation> it = list.iterator();
		
		while(it.hasNext()) {
			Reservation  reserve = it.next();
			
			System.out.println(reserve);
		}
	}
	public void cancelTicket(int ticketID) {
		Iterator<Reservation> it = list.iterator();
		
		while(it.hasNext()) {
			Reservation rs = it.next();
			if(rs.getTicketID()==ticketID) {
				it.remove();
			}
			
			
	}
	}
	

}
