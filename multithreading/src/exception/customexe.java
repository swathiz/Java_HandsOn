package exception;

public class customexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		if(age<18) {
			throw new votelimit("You are not elegible to vote");
		}else {
			System.out.println("eligible");
		}
	}

}
