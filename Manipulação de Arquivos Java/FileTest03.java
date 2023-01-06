package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class FileTest03 {

	public static void main(String[] args) {
		
		File file = new File("file01.txt");
		
		try(BufferedReader fr = new BufferedReader(new FileReader(file))) {
			String line = fr.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = fr.readLine();
			}
			
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
