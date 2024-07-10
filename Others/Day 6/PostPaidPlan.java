/*
 * This java file is a Demo Java program which depicts 
 *  MobilePlan class.
 */

public final class PostPaidPlan extends MobilePlan   {
	private final double SECURITYDEPOSIT = 500;
	private final double CREDITLIMIT = 1500;
	private final double MONTHLYRENTAL = 399;

	private double intraCircleCalls;
	private double interCircleCalls; 
	private double internationalCalls; 
	private int localSmsSent;
	private int nationalSmsSent; 
	private int internationalSmsSent;

   public final int calculateCharges(){
		return 1;
	}

   /**
	 * @param planID
	 * @param description
	 * @param callingNumber
	 * @param userID
	 * @param password
	 */
	public PostPaidPlan(String planID, String description, long 
		callingNumber, String userID, String password) {
		
		//Calling the superclass constructor
      super(planID, description, callingNumber, userID, password);
		
	}

   /**
	 * @return the credit limit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}
	/**
	 * @return Inter Circle Call's duration
	 */
	public double getInterCircleCalls() {
		return interCircleCalls;
	}
	/**
	 * @param interCircleCalls
	 */
	public void setInterCircleCalls(double interCircleCalls) {
		this.interCircleCalls = interCircleCalls;
	}
	/**
	 * @return International Call's duration
	 */
	public double getInternationalCalls() {
		return internationalCalls;
	}
	/**
	 * @param internationalCalls
	 */
	public void setInternationalCalls(double internationalCalls) {
		this.internationalCalls = internationalCalls;
	}
	/**
	 * @return International Sms Sent by the customer
	 */
	public int getInternationalSmsSent() {
		return internationalSmsSent;
	}
	/**
	 * @param internationalSmsSent
	 */
	public void setInternationalSmsSent(int internationalSmsSent) {
		this.internationalSmsSent = internationalSmsSent;
	}
	/**
	 * @return Intra Circle Call's duration
	 */
	public double getIntraCircleCalls() {
		return intraCircleCalls;
	}
	/**
	 * @param intraCircleCalls
	 */
	public void setIntraCircleCalls(double intraCircleCalls) {
		this.intraCircleCalls = intraCircleCalls;
	}
	/**
	 * @return Local Sms Sent by the customer
	 */
	public int getLocalSmsSent() {
		return localSmsSent;
	}
	/**
	 * @param localSmsSent
	 */
	public void setLocalSmsSent(int localSmsSent) {
		this.localSmsSent = localSmsSent;
	}
	/**
	 * @return Monthly Rental
	 */
	public double getMonthlyRental() {
		return monthlyRental;
	}
	/**
	 * @return national Sms Sent by the customer
	 */
	public int getNationalSmsSent() {
		return nationalSmsSent;
	}
	/**
	 * @param nationalSmsSent
	 */
	public void setNationalSmsSent(int nationalSmsSent) {
		this.nationalSmsSent = nationalSmsSent;
	}
	/**
	 * @return Security Deposit
	 */
	public double getSecurityDeposit() {
		return securityDeposit;
	}
/**
	 * @return the calculated amount
	 */

public final double calculateCallCharges() {
	
	double amount = intraCircleCalls* getIntraCircleCharge() + interCircleCalls* getInterCircleCharge() + internationalCalls * getInternationalCallCharge() +localSmsSent * getLocalSmsCharge() +nationalSmsSent * getNationalSmsCharge() +internationalSmsSent * getInternationalSmsCharge() ;
	return amount;
}
}
