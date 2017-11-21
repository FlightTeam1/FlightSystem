
public class Customer {

	private int customerID;
	private String firstName;
	private String surName;
	private String email;
	private String phone;
	private String address;
	private Gender gender;
	public Customer(int customerID, String firstName, String surName, String email, String phone, String address, Gender gender) {
		
		this.customerID = customerID;
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		
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

	public Gender getGender() {
		return gender;
	}
  public String toString() {
	  return "Customer id = " +customerID + " Name :" + firstName + " Email :" + email + " phone :" + phone; 
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
