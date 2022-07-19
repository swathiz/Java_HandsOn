package innerclass;

class Greet{
	class SayHello{
		SayHello(){
			System.out.println("Welcome to India");
		}
		void ask() {
			System.out.println("please say the 'namaste' ");
		}
	}
}

public class innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greet g = new Greet();
		//g.ask();
		//this gives a error because ask() method is in inner class
		
		Greet.SayHello gs = new Greet().new SayHello();//creating object of inner class
		gs.ask();//like this we can access the inner class methods
		

	}

}
