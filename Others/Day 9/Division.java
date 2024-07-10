/*
 * This java file is a Demo Java program which depicts 
 *  DivideExceptionDemo class.
 */
public class Division {
		   /**
	 * @param dividend
	 * @param divisor
	 * Description
	 */
	public void divide(int dividend, int divisor) {
		System.out.println("Computing Division.");  
		 int quotient  = -1;
		try{
		  quotient = dividend / divisor; 
		  System.out.println("Quotient : "+ quotient);
		}catch(ArithmeticException e){
    			System.out.println("Exception Occured: " + e);
		
    		}finally{
			if(quotient != -1){
				System.out.println("Finally Block Executes");
			}else{
				System.out.println("Finally Block Executes : " + "Exception Occurred");
			}
			
		}
		System.out.println("Exiting divide method");
		


	}
}
