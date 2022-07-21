package multithreading;

public class multithread_thread extends Thread {

	public static void main(String[] args) {
		
		multithread_thread mt = new multithread_thread();
		mt.start();
		
		for (int j=1; j<=200; j++) {
			System.out.print("j: " + j + "\t");
		}
	}
	@Override
	public void run() {
	
		for (int i=1; i<=200; i++) {
			System.out.print("i: " + i + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}