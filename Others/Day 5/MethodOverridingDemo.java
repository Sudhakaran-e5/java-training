 /*
 * This java file is a Demo Java program which depicts 
 *  MethodOverridingDemo class.
 */


 public class MethodOverridingDemo {

	public static void main(String[] args) {
		MobilePlan mobilePlan = new MobilePlan("1001","Post Paid Plan525",4071160, "xyz","E5");
		mobilePlan.setInterCircleCharge(2.40);
		mobilePlan.setIntraCircleCharge(0.50);
		mobilePlan.setInternationalCallCharge(4.5);
		mobilePlan.setLocalSmsCharge(0.99);
		mobilePlan.setNationalSmsCharge(1.8);
		mobilePlan.setInternationalSmsCharge(5);
		System.out.println("Use of Method Overriding!!!");
		//Calling overriden method
		mobilePlan.displayPlanDetails();
		System.out.println("Super class reference pointing to sub classobject");
		Plan plan = new MobilePlan();
		//Dynamic polymorphism
		plan.displayPlanDetails();	
	}
} 
