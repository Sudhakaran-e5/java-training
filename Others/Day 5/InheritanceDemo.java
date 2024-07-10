/*
 * This java file is a Demo Java program which depicts Customer class.
 */
/**
 * This class InheritanceDemo is used to illustrate the concept of 
 *	inheritance 
 */
public class InheritanceDemo {

	public static void main(String[] args) {
		// Creating Mobile Plan Object
		MobilePlan mobilePlan = new MobilePlan("1001","Post Paid Plan 525",4071160, "ABCD","Google");
		mobilePlan.setInterCircleCharge(2.40);
		mobilePlan.setIntraCircleCharge(0.50);
		mobilePlan.setInternationalCallCharge(4.5);
		mobilePlan.setLocalSmsCharge(0.99);
		mobilePlan.setNationalSmsCharge(1.8);
		mobilePlan.setInternationalSmsCharge(5);
		
		System.out.println("Mobile Plan Details");
		System.out.println("Plan ID: "+mobilePlan.getPlanID());
		System.out.println("Plan Description:"+mobilePlan.getDescription());
		System.out.println("Calling Number:"+mobilePlan.getCallingNumber());
		System.out.println("User ID: "+mobilePlan.getUserID());
		System.out.println("password: "+mobilePlan.getPassword());
		System.out.println("InterCircle Charge: "+mobilePlan.getInterCircleCharge());
		System.out.println("IntraCicle Charge: 	"+mobilePlan.getIntraCircleCharge());
		System.out.println("International Call Charge: "+mobilePlan.getInternationalCallCharge());
		System.out.println("Local SMS Charge: "+mobilePlan.getLocalSmsCharge());
		System.out.println("National SMS Charge: "+mobilePlan.getNationalSmsCharge());
		System.out.println("International SMS Charge: "+mobilePlan.getInternationalSmsCharge());

		MobilePlan mobilePlan1 = new MobilePlan();
		//Plan mobilePlan1 = new MobilePlan(); // Runtime Polymorphism 
		mobilePlan1.displayPlanDetails();
			
	}
}
