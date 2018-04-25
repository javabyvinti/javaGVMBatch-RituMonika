package com.bmpl.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPaste {

	public static void main(String[] args) throws IOException {
	
		File src = new File("D://TumHiho.mp3");
		
		File destination = new File("D://TumHihoCopy.mp3");
		
		FileReader fr = new FileReader(src);
		
		FileWriter fw = new FileWriter(destination);
		
		int data = 0;
		
		System.out.println("Copy Started");
		
		while((data=fr.read())!=-1){
			fw.write(data);
		}
		fw.close();
		System.out.println("Pasted");

	}

}
