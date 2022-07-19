package cons;

public class Parent {
	
    int x;

	Parent(){
		this(25);
		System.out.println("No -org pareent constructor");
		
	}

	Parent(int x){
		//to call a no-org constructor in another constructor 
		//this(); -- call to no-org constructor
		this.x=x;
		System.out.println("One-org parent constructor");
	}
	

}
