package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class thros {

	public static void main(String[] args) {
		thros ce = new thros();
		try {
		ce.reafFile();
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}

	}
	void reafFile() throws FileNotFoundException{
		FileInputStream fi = new FileInputStream("E:\\test.txt");
	}

}
