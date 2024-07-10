public class SystemExample{
	public static void main(String a[]){
		System.out.println("simple message");  
		System.err.println("error message");  
		try{
			int i=System.in.read();//returns ASCII code of 1st character  
			System.out.println((char)i);
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
}