package multiinheritance;

public class MultiInheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.f1();
		c.f2();
		Parent p = new Parent();
		p.f1();
		//p.f2(); // we geterror stating that there is no method f2
		// because parent class has no access to child class methods
	}
}
