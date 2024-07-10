/*
 * This java file is a Demo Java program which depicts 
 * how to create an interface.
 */


 public interface MobileBiller {

	double calculateCallCharges() ;
     double calculateCallCharges(int intraCircleCallUnits);
     double calculateCallCharges(int intraCircleCallUnits, int interCircleCallUnits);
     double calculateCallCharges(int intraCircleCallUnits, int interCircleCallUnits, int internationalCallUnits);
     double calculateSmsCharges(int localSmsUnits);
     double calculateSmsCharges(int localSmsUnits, 	int nationalSmsUnits);
     double calculateSmsCharges(int localSmsUnits, int nationalSmsUnits, int internationalSmsUnits);
   
} 

