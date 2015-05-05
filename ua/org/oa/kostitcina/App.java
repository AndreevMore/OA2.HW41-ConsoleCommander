package ua.org.oa.kostitcina;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {

		FileTools.fileCreate("c:\\\\43434.txt");
		FileTools.fileCreate("c:\\\\43434.txt");
		FileTools.fileCreate("c:\\\\434344.txt");
		FileTools.fileRename("c:\\\\43434.txt", "c:\\\\55.txt");
		FileTools.fileRename("c:\\\\434345.txt", "c:\\\\555.txt");
		FileTools.fileDelete("c:\\\\55.txt");
		FileTools.fileDelete("c:\\\\555.txt");
	}
}