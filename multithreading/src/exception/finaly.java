package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class finaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fi = new FileInputStream("E:\\test.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}finally {
			System.out.println("finally");
		}

	}

}
