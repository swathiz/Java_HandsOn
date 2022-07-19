package overriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		System.out.println(bike.fuel());
		
		
		car c = new car();
		System.out.println(c.fuel());
//here car and bike overriding the fuel method where in Veh it says "CNG"
	}

}
