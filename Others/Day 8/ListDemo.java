/*
   This java file is a demo Java program which explains the use of 
   List Interface.   
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;



public class ListDemo {

     public static void main(String [] args) {

            ArrayList myList=new ArrayList();
            myList.add("Mysore");
            myList.add("Bangalore");
            myList.add("NewYork");
           myList.add(new Integer(12));
                                    
            System.out.println(myList);

            Iterator i=myList.iterator();
            System.out.println("Printing element by element");
			int count = 1;
            while(i.hasNext()){
			
				if(count < 4){
					String str=(String)i.next(); // Line 1
				    System.out.println(str);
					count++;
				}else{
					Integer integerObj =(Integer)i.next(); // Line 1
				    System.out.println(integerObj);
				}
			  }
      }
}
