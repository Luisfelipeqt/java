package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileTest02 {

	public static void main(String[] args) {
		
		File file = new File("file01.txt");
		
		try (FileWriter fw = new FileWriter(file, true)){
			fw.write("Laura Vitória Camepelo Rodrigues, Luis Felipe Rodrigues, Stella Sophia Campelo Rodrigues\n");
			fw.flush();
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
