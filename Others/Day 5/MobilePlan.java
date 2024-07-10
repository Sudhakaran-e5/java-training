/*
 * This java file is a Demo Java program which depicts MobilePlan class.
 */

public class MobilePlan extends Plan {
	
	private double interCircleCharge;
	private double intraCircleCharge;
	private double internationalCallCharge;
	private double localSmsCharge;
	private double nationalSmsCharge;
	private double internationalSmsCharge;
	
	
	public MobilePlan(){
		//super();
	}
	/**
	 * @param planID
	 * @param description
	 * @param callingNumber
	 * @param userID
	 * @param password
	 */
	public MobilePlan(String planID, String description, long 
		callingNumber,String userID, String password) {
		
		//Calling the superclass constructor
      		super(planID, description, callingNumber, userID, password);
		
	}
	/**
	 * @return Returns the interCircleCharge.
	 */
	public double getInterCircleCharge() {
		return interCircleCharge;
	}
	/**
	 * @param interCircleCharge The interCircleCharge to set.
	 */
	public void setInterCircleCharge(double interCircleCharge) {
		this.interCircleCharge = interCircleCharge;
	}
	/**
	 * @return Returns the internationalCallCharge.
	 */
	public double getInternationalCallCharge() {
		return internationalCallCharge;
	}
	/**
	 * @param internationalCallCharge The internationalCallCharge to 
	 * set.
	 */
	public void setInternationalCallCharge(double 
	internationalCallCharge) {
		this.internationalCallCharge = internationalCallCharge;
	}
	/**
	 * @return Returns the internationSmsCharge.
	 */
	public double getInternationalSmsCharge() {
		return internationalSmsCharge;
	}
	/**
	 * @param internationSmsCharge The internationSmsCharge to set.
	 */
	public void setInternationalSmsCharge(double 
			internationalSmsCharge) {
		this.internationalSmsCharge = internationalSmsCharge;
	}
	/**
	 * @return Returns the intraCircleCharge.
	 */
	public double getIntraCircleCharge() {
		return intraCircleCharge;
	}
	/**
	 * @param intraCircleCharge The intraCircleCharge to set.
	 */
	public void setIntraCircleCharge(double intraCircleCharge) {
		this.intraCircleCharge = intraCircleCharge;
	}
	/**
	 * @return Returns the localSmsCharge.
	 */
	public double getLocalSmsCharge() {
		return localSmsCharge;
	}
	/**
	 * @param localSmsCharge The localSmsCharge to set.
	 */
	public void setLocalSmsCharge(double localSmsCharge) {
		this.localSmsCharge = localSmsCharge;
	}
	/**
	 * @return Returns the nationalSmsCharge.
	 */
	public double getNationalSmsCharge() {
		return nationalSmsCharge;
	}
	/**
	 * @param nationalSmsCharge The nationalSmsCharge to set.
	 */
	public void setNationalSmsCharge(double nationalSmsCharge) {
		this.nationalSmsCharge = nationalSmsCharge;
	}

/************************* For Method Overloading -- Start **********************************/
	
	public double calculateCallCharges(int intraCircleCallUnits) {
		double callCharges=0;
		callCharges = intraCircleCharge * intraCircleCallUnits;
		return callCharges;
	}
	
	public double calculateCallCharges(int intraCircleCallUnits, int interCircleCallUnits) {
			double callCharges=0;
			callCharges = (interCircleCharge * interCircleCallUnits) + 	(intraCircleCharge * intraCircleCallUnits); 
			return callCharges;
	} 
/************************* For Method Overloading -- End **********************************/
	


/**************** Method Overriding - Start ***********************/


	
public void displayPlanDetails() {
		super.displayPlanDetails();
		System.out.println("*******Method in Subclass *****");
		System.out.println("InterCircle Charge: "+ 	getInterCircleCharge());
		System.out.println("IntraCicle Charge: 	"+getIntraCircleCharge());
		System.out.println("International Call Charge: "+	getInternationalCallCharge());
		System.out.println("Local SMS Charge: "+ getLocalSmsCharge());
		System.out.println("National SMS Charge: "+ 	getNationalSmsCharge());
		System.out.println("International SMS Charge: "+ 		getInternationalSmsCharge());
	}

/**************** Method Overriding - End ***********************/
}
