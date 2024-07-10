public class MultipleCatchExample{
  public static void main(String argx[])  {
  	try{
	  argx=null;
	  int e=argx.length;
	  int f=20/e;
	  int g[]={1};
      	  g[20]=81;
  	}
  	catch(ArithmeticException ae) {
    		System.out.println("Divided by zero"+ae);
  	}
  	catch(ArrayIndexOutOfBoundsException oe)  {
  		System.out.println("Array index out of bound"+oe);
  	}
	catch(Exception ne)  {
  		System.out.println("Exception:"+ne);
  	}

  	System.out.println("After Try and Catch blocks"); 
    }
}
