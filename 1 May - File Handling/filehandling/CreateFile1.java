package com.bmpl.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {

	public static void main(String[] args) {
		// step-1: Create file
		
		//String pathOfFile = "E://firstfolder//secondfolder//thirdfolder//fourthfolder";
		
		String filePath = "E://firstfolder//secondfolder//thirdfolder//fourthfolder//file.doc";
		
		//File file = new File(pathOfFile);
		File file2 = new File(filePath);
		//File dDrive = new File("D://");
		
		try {
			// getParentFile() --> return the complete path except last index
			System.out.println("Folder Created = " + file2.getParentFile().mkdirs());
			System.out.println("File Created = " + file2.createNewFile());
			
			
			//System.out.println("Folder created ="+ file.mkdirs());
			
//			if(file.exists()){
//				
//				System.out.println("File deleted = " + file.delete());
//			}
//			
//				boolean created = file2.createNewFile();
//				System.out.println("File created = " + created);	
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
