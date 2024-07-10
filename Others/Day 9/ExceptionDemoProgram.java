public class ExceptionDemoProgram{
	public static void main(String[] args){
		try{
			int i=Integer.parseInt(args[0]);
			int c=i/i;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException:"+e);
		}
		finally{
			System.out.println("inside finally");
		}
		System.out.println("End Statement");
	}
}
