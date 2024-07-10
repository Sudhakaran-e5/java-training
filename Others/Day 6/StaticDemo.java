/*
 * This java file is a Demo Java program which depicts StaticDemo class.
 */
public class StaticDemo {

	public static void main(String[] args) {
		//System.out.println("No. of customer objects initially: "+ 
		//	CustomerStaticDemo.getCount());
		int i = CustomerStaticDemo.count;
		int j = CustomerStaticDemo.getCount();
		//System.out.println("value of count is: "+ i);

		CustomerStaticDemo customer1 = new CustomerStaticDemo();
		CustomerStaticDemo customer2 = new CustomerStaticDemo();
		CustomerStaticDemo customer3 = new CustomerStaticDemo();
		System.out.println("No. of customer objects currently: "+ 
			CustomerStaticDemo.getCount());
	}
}
