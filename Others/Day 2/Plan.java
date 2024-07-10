/*
 * This java file is a Demo Java program which depicts Plan class.
 */

public class Plan {
	
	private String planID;
	private String description;
	private long callingNumber;
	private String userID;
	private String password;
	
	/**
	 * Description: Blank Constructor
	 */
	public Plan(){
		
	}
	
	/**
	 * @param planID
	 * @param description
	 * @param callingNumber
	 * @param userID
	 * @param password
	 * Description: Parametrized Constructor
	 */
	public Plan(String planID, String description, long callingNumber,
			String userID, String password) {
		this.planID = planID;
		this.description = description;
		this.callingNumber = callingNumber;
		this.userID = userID;
		this.password = password;
	}
	/**
	 * @return Returns the callingNumber.
	 */
	public long getCallingNumber() {
		return callingNumber;
	}
	/**
	 * @param callingNumber The callingNumber to set.
	 */
	public void setCallingNumber(long callingNumber) {
		this.callingNumber = callingNumber;
	}
	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return Returns the password.
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password The password to set.
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return Returns the planID.
	 */
	public String getPlanID() {
		return planID;
	}
	/**
	 * @param planID The planID to set.
	 */
	public void setPlanID(String planID) {
		this.planID = planID;
	}
	/**
	 * @return Returns the userID.
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID The userID to set.
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
public static void main(String[] args) {

   	//Using the blank Constructor to create Plan Object
		Plan planBlank = new Plan();
	
	//Displaying the details of plan object
		System.out.println("Using the Blank Constructor...");
		System.out.println("Plan ID: "+ planBlank.getPlanID());
		System.out.println("Plan Description: "+ 
						planBlank.getDescription());
		System.out.println("Calling Number: "+ 
						planBlank.getCallingNumber());
		System.out.println("UserID: "+ planBlank.getUserID());
		System.out.println("Password: "+ planBlank.getPassword());


	//Using the parametrized Constructor to create Plan Object
     		 Plan plan = new Plan("1001","Home500", 4071160, 
					"Sandeep","Element5");
	
    	//Displaying the details of plan object
		System.out.println("Using the Parameterized Constructor...");
		System.out.println("Plan ID: "+ plan.getPlanID());
		System.out.println("Plan Description: "+ plan.getDescription());
		System.out.println("Calling Number: "+ plan.getCallingNumber());
		System.out.println("UserID: "+ plan.getUserID());
		System.out.println("Password: "+ plan.getPassword());

		
	}
}
