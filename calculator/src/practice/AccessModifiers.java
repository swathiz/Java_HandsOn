package practice;

import practice2.AccessModifiers2;

//In default access modifier within same package we can access methods directly

class One{
	void show() {
		System.out.println("practice package -- class one -- method show ");
	}
}

class Two{
	private void greet() {
		System.out.println("practice package -- class two -- method greet");
	}
}
public class AccessModifiers extends AccessModifiers2 {

	public static void main(String[] args) {
		//Demonstration of accessing default access modifier
		System.out.println("Default Access Modifier");
		One o = new One();
		o.show();
		System.out.println();
		//Demonstration of accessing private access modifier
		System.out.println("Private Access Modifier");
		Two t = new Two();
		//t.greet();
		//when we give t.greet() it states that greet is not visible as it is a private method
		System.out.println();
		//Demonstration of accessing protected access modifier
		System.out.println("Protected Access Modifier");
		AccessModifiers a = new AccessModifiers();
		a.name();
		//By extending the Accessmodifiers2 class we can access the methods in it
		System.out.println();
		//Demonstration of accessing public access modifier
		System.out.println("Public Access Modifier");
		AccessModifiers2 b = new AccessModifiers2();
		b.three(); 
		//public methods we can directly access by creating that class
	}

}
