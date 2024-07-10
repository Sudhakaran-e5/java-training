/*
 * This java file is a demo Java program which depicts a class
 * with a main method inside and necessary instance variables
 */


public class Customer {

	String customerID;
	String customerName;
	String address;
	int pinCode;

	/**
	 * This method creates an object of Customer Class and sets its
	 *instance variable and display the same.
	 * @param  args The command line arguments
	 */

	public static void main (String [] args){
			Customer customer = new Customer();
			customer.customerID = "1234";
			customer.customerName = "ABCD";
			customer.address = "Element5 , Chennai";
			customer.pinCode = 600015;
			System.out.println("Customer ID " + customer.customerID);
			System.out.println("Customer Name " + customer.customerName);
			System.out.println("Customer Address " + customer.address);
			System.out.println("Customer Pin Code " + customer.pinCode);
			
		}
}
