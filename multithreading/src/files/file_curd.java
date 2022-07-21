package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class file_curd {
	public static void main(String[] args) throws IOException {
		//TO CREATE A FILE
		
//	    try {
//	      File myObj = new File("new.txt");
//	      if (myObj.createNewFile()) {
//	        System.out.println("File created: " + myObj.getName());
//	      } else {
//	        System.out.println("File already exists.");
//	      }
//	    } catch (IOException e) {
//	      System.out.println("An error occurred.");
//	      e.printStackTrace();
//	    }
	    
		
		//TO WRITE INTO A FILE
	    FileWriter myWriter = new FileWriter("new.txt");
	      myWriter.write("Welcome to file handling");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");

	      
	      //TO READ FROM FILE
	
	try {
	      File myObj = new File("new.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	
	
	//TO UPDATE TO A EXISTING FILE
	Writer output = null;
	   File file = new File("new.txt");
	   output = new BufferedWriter(new FileWriter(file,true));
	    output.write("how are you happy");
	    output.close();
}
}