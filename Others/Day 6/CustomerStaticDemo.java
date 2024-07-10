/*
 * This java file is a Demo Java program which depicts Customer class.
 */

public class CustomerStaticDemo {
	private String customerID;
	private String customerName;
	private String address;
	private int pinCode;

	public static int count;
	/**
	 * Description: Blank Constructor
	 */
	public CustomerStaticDemo() {
		count++;
	}

	/**
	 * @return Returns the count.
	 */
	public static int getCount() {
		//int i = pinCode;
		return count;
	}

	/**
	 * @return Returns the address.
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address The address to set.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return Returns the customerID.
	 */
	public String getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID The customerID to set.
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return Returns the customerName.
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName The customerName to set.
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return Returns the pinCode.
	 */
	public int getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode The pinCode to set.
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
