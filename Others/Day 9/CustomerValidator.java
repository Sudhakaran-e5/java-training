/*
 * This java file is a Demo Java program which depicts 
 *  Customervalidator class.
 */
public class CustomerValidator {
	public static void main(String[] args) {
		try{
//			boolean status = validateCustomer("1005"); // Normal Flow
			boolean status = validateCustomer("1006"); // throws the exception 
			if(status==true){
				System.out.println("Valid Customer");
			}
		}catch(InvalidCustomerException exception){
			System.out.println("Exception occured: "
					+ exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public static boolean validateCustomer(String customerID)throws InvalidCustomerException{
		boolean status = false;
		
		//Existing CustomerIDs
		String[] validCustomerIDs = 
			{"1001","1002","1003","1004","1005"};
		for(int i=0;i<validCustomerIDs.length;i++){
			if(validCustomerIDs[i].equals(customerID)){
				status = true;
			}
		}
		if(status!=true) {
			InvalidCustomerException e = new InvalidCustomerException();
			throw e;
			//throw new InvalidCustomerException();
		}
		return status;
	}
}
