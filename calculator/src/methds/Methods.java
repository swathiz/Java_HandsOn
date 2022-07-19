package methds;

public class Methods {
	//method defination
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Value of c:" + c);
	}
	
	void add(int a,int b, double c) {
		double x = a+b+c;
		System.out.println("Value of x:"+x);
	}
	
	public static void main(String[] args) {
		//creating the object of the class to call method add
		Methods m = new Methods();
		//call by value
		m.add(1,2);
		System.out.println();
		m.add(10,90,10.0);
	}

}
