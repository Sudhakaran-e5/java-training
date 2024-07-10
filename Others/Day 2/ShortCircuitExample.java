public class ShortCircuitExample {
	public static void main (String[] args) {
		int a=5; int b=10;
		if (a++ > 2 && b-- > 5) //before if a=5 , b=10 , after if a=6 , b=9
			System.out.println("&& is true , values are a="+ a +" b=" +b); // 
		else
			System.out.println("&& is false , values are a="+ a +" b=" +b);

		if (a++ > 2 || b-- > 5)//before if a=6 , b=9 , after if a=7 , b=8
			System.out.println("|| is true , values are a="+ a +" b=" +b);
		else
			
			System.out.println("|| is false , values are a="+ a +" b=" +b);

   	}
}
