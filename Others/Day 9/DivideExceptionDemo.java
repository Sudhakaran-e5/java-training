/*
 * This java file is a Demo Java program which depicts 
 *  DivideExceptionDemo class.
 */
public class DivideExceptionDemo {
     public static void main(String[] args) {
		
		Division division = new Division();
     		division.divide(100,4);		// Line 1
    		division.divide(100,0);        // Line 2    
       		System.out.println("Exit main().");    
	 }
}
