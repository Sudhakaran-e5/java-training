/*
 * This java file is a Demo Java program which depicts 
 *  CheckedExceptionDemo class.
 */
import java.io.File;
import java.io.IOException;
public class CheckedExceptionDemo {
	/**
	 * @param args
	 * Description
	 */
	public static void main(String[] args) {
		
		try{
			File file = new File("c://abc.txt");	
			if(file.exists()){
				System.out.println("File Exists");
			}else{
				file.createNewFile();
				System.out.println("File does not exist so created it");
			}	
		}catch(IOException e){}
		System.out.println("proceeding:");

	}
}

/*try{
	//FileReaderDemo fileReader = new FileReaderDemo();		
	fileReader.readFile("c://abc.txt");
			
		}catch(IOException ioe){
			System.out.println("Exception occured: " + ioe);
		}catch(FileNotFoundException exception){
			System.out.println("Exception occured: " + exception);
		}*/
