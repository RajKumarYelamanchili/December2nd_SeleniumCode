package filehandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File fo = new File("D:\\FileHandling\\abcd.txt");
		
		if (fo.exists())
		{
		System.out.println("name of the file is : " +fo.getName());
		 System.out.println("absolute path of the file is:  " + fo.getAbsolutePath());
		   System.out.println("Is the file writeable: ? " + fo.canWrite());
		  System.out.println("Is the file readable: ? " + fo.canRead());
		  System.out.println("Size of the file in bytes: " + fo.length());
		}

	}

}
