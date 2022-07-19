package strings;

public class string_stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";// define a string
		
		StringBuffer sb = new StringBuffer(); // creating a string buffer object
		sb.append(s+"\n");// converting the string to stringbuffer
		sb.append("Please read the instructions carefully");//appending another string to strinbuffer object
		
		System.out.println(sb);//displaying the string buffer object
	}

}
