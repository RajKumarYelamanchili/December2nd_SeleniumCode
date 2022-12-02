package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		
		try {
			FileWriter fwrite = new FileWriter("D:\\FileHandling\\xyz.txt");
			fwrite.write("I am very passionate on automation testing");
			fwrite.close();
		} 
		
		
		catch (IOException e) {
			System.out.println("some error");
		}

	}

}
