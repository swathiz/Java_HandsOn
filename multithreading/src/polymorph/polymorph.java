package polymorph;

public class polymorph {
	void mul(int a, int b) {
		int re = a*b;
		System.out.println(re);
	}
	
	float mul(float a, int b) {
		float re = a*b;
		return re;
	}
	void mul(int a, int b ,int c) {
		int re = a*b*c;
		System.out.println(re);
	}

	public static void main(String[] args) {
		
		polymorph t = new polymorph();
		t.mul(1,10,20);
		
	}

}
