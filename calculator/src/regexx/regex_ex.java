package regexx;

import java.util.regex.*;

public class regex_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Way -1
		//create a pattern
		Pattern p = Pattern.compile(".m");//represents a single character
		
		Matcher m = p.matcher("Am");//creating a object to find in which we have to match
		
		boolean b = m.matches();//to find the result of match
		
		System.out.println(b);
		
		//Way - 2
		boolean b3 = Pattern.matches(".s", "am");  //there is no s in the string "am" so it results in false
		
		System.out.println(b3);
		
		System.out.println(Pattern.matches("[ms]", "s"));//m or s is ter in string
		
		//matching a number
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
	}

}
