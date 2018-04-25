package com.bmpl.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		// (D:// song1.mp3 src)mp3 read and write destination(E://copy.mp3)
		
		// Read and Write
		
		File file = new File("D://copy.mp3");
		
		System.out.println("File Created = " + file.createNewFile());
		
		// Writing data in File
		
		System.out.println("Enter data to write in file:");
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();

		System.out.println("Enter data again:");

		String data2 = sc.nextLine();
		
		
		// text --> Reader and Writer
		// byte --> Stream
		
		FileWriter fw = new FileWriter(file);	//
		
		fw.write(data + data2);
		fw.close();
		System.out.println("Data written");
		
		
		
		//Reading data from file
	
		FileReader fr = new FileReader(file);
		
		int value = 0;
		
		while((value = fr.read())!=-1){
			System.out.print(value);
		}
	
		//System.out.println(fr.read());
		
	}

}
