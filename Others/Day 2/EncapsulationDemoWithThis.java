/*
 * This java file is a Demo Java program which depicts Customer class.
 */

class Customer {
	private String customerID;
	private String customerName;
	private String address;
	private int pinCode;
	/**
	 * @return Returns the address.
	 */
	public String getAddress() {
		return this.address;
	}
	/**
	 * @param myAddress The address to set.
	 */
	public void setAddress(String myAddress) {
		this.address = myAddress;
	}
	/**
	 * @return Returns the customerID.
	 */
	public String getCustomerID() {
		return this.customerID;
	}
	/**
	 * @param myCustomerID The customerID to set.
	 */
	public void setCustomerID(String myCustomerID) {
		this.customerID = myCustomerID;
	}
	/**
	 * @return Returns the customerName.
	 */
	public String getCustomerName() {
		return this.customerName;
	}
	/**
	 * @param myCustomerName The customerName to set.
	 */
	public void setCustomerName(String myCustomerName) {
		this.customerName = myCustomerName;
	}
	/**
	 * @return Returns the pinCode.
	 */
	public int getPinCode() {
		return this.pinCode;
	}
	/**
	 * @param myPinCode The pinCode to set.
	 */
	public void setPinCode(int myPinCode) {
		this.pinCode = myPinCode;
	}
}
/*
 * This java file is a Demo Java program which depicts                   
 * EncapsulationDemo class with a main method inside it to create 
 * Customer class object.
 */


public class EncapsulationDemoWithThis {
 /**
 * This method creates an object of Customer Class and sets its     
 * instance variable and displays the same.
 * @param  args The command line arguments
 */

     public static void main (String[] args) {
       // Creating object of Customer Class
		Customer customer = new Customer(); 

	   // customer.customerID = "1234"; //1ine 1 	

       /* Calling setter methods for setting the values of instance 
          variables */
		customer.setCustomerID("1234");
		customer.setCustomerName("ABCD");
		customer.setAddress("E5,Chennai");
		customer.setPinCode(600050);
		/* Calling getter methods for printing the values of instance 
	      variables */

		System.out.println("Customer ID " + customer.getCustomerID());
		System.out.println("Customer Name " + 
            customer.getCustomerName());
		System.out.println("Customer Address " + customer.getAddress());
		System.out.println("Customer Pin Code " + 
            customer.getPinCode());
		
	}
}
