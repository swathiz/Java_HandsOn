package exception;

public class thro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thro t = new thro();
		try {
			t.check(25);
		} catch (RuntimeException ec) {
			System.out.println(ec.getMessage());
		}

	}

	public void check(int marks) {
		if (marks > 90) {
			System.out.println("A");
		} else if (marks < 89 && marks > 74) {
			System.out.println("B");
		} else if (marks < 75 && marks > 54) {
			System.out.println("C");
		} else if (marks < 55 && marks > 29) {
			System.out.println("D");
		} else if (marks < 30) {
			throw new RuntimeException("Marks is too less you are failed");
		} else {
			System.out.println("..");
		}
	}

}
