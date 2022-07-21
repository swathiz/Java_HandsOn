package diamondprob;


//Diamond Problem is that when 2 classes have same name and method signature and if multiple inheritance is allowed then 
interface demo1{
	public default void display() {
		System.out.println("This method is invoked by demo1 intefrace");
	}
}

interface demo2{
	public default void display() {
		System.out.println("This method is invoked by demo1 intefrace");
	}
}

public class diamond_prob implements demo1,demo2 {
	public void display() {
		demo1.super.display();
		demo2.super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diamond_prob p = new diamond_prob();
		p.display();
		

	}

}
