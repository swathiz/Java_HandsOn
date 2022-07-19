package cons;

public class Child extends Parent {
	Child(){
		System.out.println("child no - org constructor");
	}
	
	Child(int x){
		super(x);
		System.out.println("child one arg constructor");
	}
}
