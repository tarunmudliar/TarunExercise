package misc.concepts;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MultiThread mt = new MultiThread();
		//mt.start();
		
		MultiThreadRunnable mtr = new MultiThreadRunnable();
		Thread th = new Thread(mtr);
		th.start();
		
		System.out.println("Main");
		
	}

}
