package practice.multithreadingDemo.runnable;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("hello");
		}
	//		for(int i = 0; i<= 10; i++) {
	//			System.out.println("child thread");
	//		}
	//		System.out.println("child priority: "+Thread.currentThread().getPriority());

}

}
