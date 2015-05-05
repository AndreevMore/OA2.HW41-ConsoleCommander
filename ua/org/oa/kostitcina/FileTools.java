package ua.org.oa.kostitcina;

import java.io.File;
import java.io.IOException;

public class FileTools {

	public static void fileRename(String oldFilename, String newFilename) {
		try {

			File oldFile = new File(oldFilename);
			if (oldFile.renameTo(new File(newFilename))) {
				System.out.println("File renamed");
			} else {
				System.out.println("Nothing to Rename!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void fileDelete(String path) {

		try {

			File file = new File(path);

			if (file.delete()) {
				System.out.println("File deleted");
			} else {
				System.out
						.println("Nothing to delete!!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileCreate(String path) {

		File file = new File(path);

		{
			if (!file.exists()) {
				try {
					file.createNewFile();
					System.out.println("File created");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {  
			    System.out.println("File is exist!!!");  
			   }  
		}
	}
}