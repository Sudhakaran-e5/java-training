 /*
 * This java file is a Demo Java program which depicts 
 *  FileReaderDemo class.
 */

import java.io.FileNotFoundException;
import java.io.File;
public class FileReaderDemo {
	/**
	 * @param fileName
	 * Description
	 */
	public  void readFile(String fileName) throws FileNotFoundException{
		//Code to open the file
		//Explicitly throwing the exception
		File file = new File(fileName);
		if(file.exists()){
			System.out.println("File Exists");
		}else{
			throw new FileNotFoundException();
		}
	}
}
