/*
 * This java file is a Demo Java program which depicts usage of Method Overloading.
 */


public class MethodOverloadDemo {

	public static void main(String[] args) {
		MobilePlan mobilePlan = new MobilePlan("1001","Post Paid Plan 525",4071160, "xyz","Element 5");
		mobilePlan.setInterCircleCharge(2.40);
		mobilePlan.setIntraCircleCharge(0.50);
		mobilePlan.setInternationalCallCharge(4.5);
		mobilePlan.setLocalSmsCharge(0.99);
		mobilePlan.setNationalSmsCharge(1.8);
		mobilePlan.setInternationalSmsCharge(5);
		
		double callCharges=0;

		//Calculate Call Charges for 10 intra cicrcle calls  
		callCharges = mobilePlan.calculateCallCharges(10);
		System.out.println("Call charges for 10 Intracircle calls: Rs." +  callCharges);
       //Calculate Call Charges for 10 intra circle and 5 intercircle    calls 
		callCharges = mobilePlan.calculateCallCharges(10, 5);
		System.out.println("Call charges for 10 Intracircle &" +" 5 intercircle calls: Rs."+  callCharges);
		
	}
}
