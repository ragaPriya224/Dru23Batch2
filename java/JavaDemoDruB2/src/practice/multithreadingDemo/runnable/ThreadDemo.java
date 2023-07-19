package practice.multithreadingDemo.runnable;


public class ThreadDemo {

	//main threads
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();//create my runnable object
		Thread t = new Thread(r);//target runnable
		t.start();
		for(int i = 0; i<= 10; i++) {
			System.out.println("main thread"+ Thread.currentThread().getName());
		}
		
		
		
//		t.start();
//		Thread.currentThread().setPriority(22);
		System.out.println("main priority: "+Thread.currentThread().getPriority());

	}

}

