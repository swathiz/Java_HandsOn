package email_val;

import java.util.ArrayList;
import java.util.regex.*;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> maillist = new ArrayList<String>();  
		maillist.add("varun.singh@gmail.com");
		maillist.add("swara@pesu.co.in");
		maillist.add("@varun.in");
		maillist.add("sonasingh@yahoo.com");	
		
		
		Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		
		for(String email : maillist){  
            //Create instance of matcher   
            Matcher matcher = p.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
		

	}

}
