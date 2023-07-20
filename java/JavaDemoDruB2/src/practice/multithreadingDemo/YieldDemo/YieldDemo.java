package practice.multithreadingDemo.YieldDemo;

public class YieldDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().join();//deadlock scenario 
		System.out.println("hiiiiii");
		
		MyThread t = new MyThread();
		t.start();//2nd very
		System.out.println(Thread.currentThread().getName()+"name");
		for(int i = 0; i<= 10; i++) {
			System.out.println("main");
		}
	}
}
