package filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File fo = new File("D:\\FileHandling\\xyz.txt");
		
		if (fo.delete())
		{
			System.out.println(fo.getName() + " file is deleted successfully");
		}
		else
		{
			System.out.println("file has already been deleted");
		}

	}

}
