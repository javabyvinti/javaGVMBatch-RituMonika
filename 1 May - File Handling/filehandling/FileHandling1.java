package com.bmpl.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		
		// File
	
//		File file = new File("E://a//b//c//file.txt");
//		System.out.println("Dir created = " + file.getParentFile().mkdirs());
//		System.out.println("File created  = " + file.createNewFile());
//		
//		FileWriter  fw = new FileWriter(file);
//		
//		fw.write("Write this data into file");
//		fw.close();
//		
//		// Directory must be empty before its deletion
//		
//		file = new File("E://a//b//c"); //
//		
//		System.out.println("File deleted = " + file.delete());
//		
		File file = new File("C://Program Files//Common Files//SpeechEngines//Microsoft//TTS20//en-US//enu-dsk");
		System.out.println(file.isDirectory());
		System.out.println("Can Read = " + file.canRead());
		System.out.println("Can Read = " + file.canWrite());
		Date date = new Date(file.lastModified());
		System.out.println("Last Modified = " + date);
		System.out.println("File AbsolutePath = " + file.getAbsolutePath());
		System.out.println("File Canconical Path = " + file.getCanonicalPath());
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int value = sc.nextInt();

		System.out.printf("%-15s%03d %n", name, value);
		

	}

}








