package com.bmpl.filehandling;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPaste2 {

	public static void main(String[] args) throws IOException {
		
		File src = new File("D://image.jpg");
		
		File destination = new File("D://image2.jpg");
		
		// write the data
		FileOutputStream fout = new FileOutputStream(destination);
		
		// read the data
		FileInputStream fin = new FileInputStream(src);

		int i = 0;
		System.out.println("Copy Begin");
		while((i = fin.read())!=-1){
			
			fout.write(i);
			
		}
		
		System.out.println("Copy Ends");
		
		Desktop.getDesktop().open(destination);
		
		fin.close();
		fout.close();
		
	}

}
