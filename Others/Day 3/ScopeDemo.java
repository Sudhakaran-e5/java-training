public class ScopeDemo{
	private static double interestRate = .04; // class variable
	private int count = 100; // instance variables
	

	public static void main(String a[]){
		int i=10;
		{
			int nestedValue = 100;//nestedValue has block scope
			System.out.println("nestedValue is "+nestedValue);
		}
		// System.out.println("nestedValue is "+nestedValue); // nestedValue is not visible here

		System.out.println("value of i is :"+i);
		
	}
	public void calculateSum() {  
   		int a = 5; // local variable , initialisation is mandatory
   		int b = 10; // local variable  ,  initialisation is mandatory
   		int sum = a + b;  
   		System.out.println("The sum is: " + sum);  
	} // a, b, and sum go out of scope here  so can be garbage Collected

	public void printName(String name) { // name is a method parameter  , name has method scope or local scope
   		System.out.println("Hello, " + name + "!");  
	}  

}
