package exception;

public class nullpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s = null;
		System.out.println("String Length: " + s.length());
		}catch(NullPointerException e) {
			System.out.println("oops ter is an exception \n"+e);
		}

	}

}
