package bookingTicket;
import ui.Gender;

public class Customer {

	private int customerID;
	private String firstName;
	private String surName;
	private String email;
	private String phone;
	private String address;
	//private Gender gender;
	private String gender;
	
	public Customer() {
		super();
	}
	public Customer(int customerID, String firstName, String surName, String email, String phone, String address, String gender) {
		
		this.customerID = customerID;
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		
	}

	public int getId() {
		return customerID;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getsurtName() {
		return firstName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNo() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}
  public String toString() {
	  return fixLengthString(customerID ,10) + " " + fixLengthString(firstName ,18) + " " +fixLengthString(surName  ,17)+ " " + 
			  fixLengthString(email,17) + "  " +fixLengthString(phone,17) + " " + fixLengthString(address,17)+" "+
			  fixLengthString(gender,17)
			  
			  ;
			  
		  }
  
  
  public String fixLengthString(String start , int length) {		
		if(start.length() >= length) {
			return start.substring(0, length);
		}else {
			while(start.length() < length) {
				start += " ";
			}
			return start;		
	} //end if 
	} //end of printbook method
	
	
	public String fixLengthString(int start , int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + customerID;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (customerID != other.customerID)
		return false;
	return true;
}
  
  
  

}
