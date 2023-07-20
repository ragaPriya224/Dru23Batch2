package practice.multithreadingDemo;

public class MyThread extends Thread{
	//other thread 
	public void run() {
		for(int i = 0; i<= 10; i++) {
			//			Thread.currentThread().setName("Another thread ");
			System.out.println(Thread.currentThread().getName() +"child thread");
		}
//		System.out.println(Thread.currentThread().set

	}
	public void run(int i) {
		System.out.println("hello");
	}
}
