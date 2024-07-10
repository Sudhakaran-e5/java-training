/*
 * This java file is a Demo Java program which depicts Customer and 
 * CustomerDemo class with a main method inside CustomerDemo to create 
 * Customer oject.
 */


class Customer{
	String customerID;
	String customerName;
	String address;
	int pinCode;
}
/**
 * This class is used to create Customer Object. 
 * @author E&R Dept, Infosys Technologies Limited
 * @version 1.0
 */

public class CustomerDemo{

	/**
	* This method creates an object of Customer Class and sets its     
	* instance variables and display the same.
	* @param args The command line arguments
	*/

	public static void main (String [] args){
			Customer customer = new Customer();
			customer.customerID = "1234";
			customer.customerName = "ABCD";
			customer.address = "E5,Chennai";
			customer.pinCode = 600050;
			System.out.println("Customer ID " + customer.customerID);
			System.out.println("Customer Name " + customer.customerName);
			System.out.println("Customer Address " + customer.address);
			System.out.println("Customer Pin Code " + customer.pinCode);
			
		}
}
