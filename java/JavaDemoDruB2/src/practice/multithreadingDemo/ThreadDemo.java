package practice.multithreadingDemo;

public class ThreadDemo {
	//main thread
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//2nd very
//		t.start();//illegal thread state exception
//t.run();
		for(int i = 0; i<= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "main thread");
		}
	}

}
