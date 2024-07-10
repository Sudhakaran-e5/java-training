import java.io.FileInputStream;  
public class FileReader {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("C:\\Users\\praveenraj.s\\Desktop\\WorkSpace\\Java\\Java-Training\\Others\\Day 10\\Main.java");    
            int i=fin.read();  
            System.out.print((char)i);    
	    while((i = fin.read() )!= -1){
		System.out.print((char)i);  
	    }
            fin.close();    
          }catch(Exception e){
		System.out.println(e);
	  }    
         }    
        } 