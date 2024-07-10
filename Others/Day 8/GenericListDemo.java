/*
   This java file is a demo Java program which explains the use of 
   generics.   
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class GenericListDemo {

         public static void main(String [] args) {

            ArrayList<String> myList=new ArrayList<String>();
            myList.add("Mysore");
            myList.add("Bangalore");
            myList.add("12");
          //  myList.add(12); // compilation Error
         //   myList.add(new Integer(12)); //compilation error
  
           for (String s: myList)
                System.out.println(s);
       }
}      
