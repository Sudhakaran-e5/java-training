/*
 * This java file is a Demo Java program which depicts 
 * how to implement an interface.
 */



 public class MobileBillerDemo implements MobileBiller {

   	private double intraCircleCalls=100.0;
	private double interCircleCalls=50.0; 
	private double internationalCalls=10.0; 

	private int	localSmsSent=200;
	private int	nationalSmsSent=20; 
	private int	internationalSmsSent=5;

   	private double interCircleCharge=0.99;
	private double intraCircleCharge=0.50;
	private double internationalCallCharge=7.50;

	private double localSmsCharge=1.0;
	private double nationalSmsCharge=2.0;
	private double internationalSmsCharge=5.0;
	
	public static void main (String[] args) {
       		MobileBillerDemo mobileBillerDemo=new MobileBillerDemo();
       		System.out.println("Amount is " +  mobileBillerDemo.calculateCallCharges());

		/* Interface can not be instantiated. So following line will not compile.
		MobileBiller mobileBiller = new MobileBiller();
      		*/

      		 //Dynamic Polymorphism
       		MobileBiller mobileBiller=new MobileBillerDemo();
		/* Dog dogObj = new Dog(); //Pet interface
		Cat catObj = new Cat(); //Pet interface
		Pet petRef = catObj;
		petRef.play(); //cat's play method
		petRef = dogObj;
		petRef.play();//dog's play method */
		
       		System.out.println("Amount is " +  mobileBiller.calculateCallCharges());
   	}

	 public double calculateCallCharges() {
         	double amount = intraCircleCalls * intraCircleCharge +
				interCircleCalls * interCircleCharge +
				internationalCalls * internationalCallCharge +
				localSmsSent * localSmsCharge +
				nationalSmsSent * nationalSmsCharge +
				internationalSmsSent * internationalSmsCharge;
	  	return amount;
	}
     
   /**
	 * @param intercircleCallUnits
	 * @return callCharges
	 * Description: Calculate call charges
	 */

	public double calculateCallCharges(int intraCircleCallUnits){
		double callCharges=0;
		callCharges = intraCircleCharge * intraCircleCallUnits;
		return callCharges;
	}
	/**
	 * @param intercircleCallUnits
	 * @param intraCircleCallUnits
	 * @return callCharges
	 * Description: Calculate call charges
	 */
	public double calculateCallCharges(int intraCircleCallUnits, 
	int interCircleCallUnits){
			double callCharges=0;
			callCharges = (interCircleCharge * interCircleCallUnits) + 
			(intraCircleCharge * intraCircleCallUnits); 
			return callCharges;
	}
	/**
	 * @param intercircleCallUnits
	 * @param intraCircleCallUnits
	 * @param internationalCallUnits
	 * @return callCharges
	 * Description: Calculate call charges
	 */
	public double calculateCallCharges(int intraCircleCallUnits, 
		int interCircleCallUnits, int internationalCallUnits) {
		double callCharges=0;
		callCharges = (interCircleCharge * interCircleCallUnits) + 
				(intraCircleCharge * intraCircleCallUnits) + 
				(internationalCallCharge * internationalCallUnits);
		return callCharges;
	}
	
	/**
	 * @param localSmsUnits
	 * @return smsCharges
	 * Description : Calculate SMS charges
	 */
	public double calculateSmsCharges(int localSmsUnits) {
		double smsCharges=0;
		smsCharges = localSmsCharge * localSmsUnits;
		
		return smsCharges;
	}
	
	/**
	 * @param localSmsUnits
	 * @param nationalSmsUnits
	 * @return smsCharges
	 * Description: Calculate SMS charges
	 */
	public double calculateSmsCharges(int localSmsUnits, 
		int nationalSmsUnits) {
			double smsCharges=0;
			smsCharges = (localSmsCharge * localSmsUnits) + 
				     (nationalSmsCharge * nationalSmsUnits);
			return smsCharges;
	}
	/**
	 * @param localSmsUnits
	 * @param nationalSmsUnits
	 * @param internationalSmsUnits
	 * @return smsCharges
	 * Description : Calculate SMS charges
	 */
	public double calculateSmsCharges(int localSmsUnits, 
			int nationalSmsUnits, int internationalSmsUnits) {
		double smsCharges=0;
		smsCharges = (localSmsCharge * localSmsUnits) + 
			     (nationalSmsCharge * nationalSmsUnits) + 
			     (internationalSmsCharge * internationalSmsUnits);
		return smsCharges;
	}		
   
} 
