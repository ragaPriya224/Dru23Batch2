package practice.multithreadingDemo.YieldDemo;

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("*********");
		Thread.currentThread().yield();
		for(int i = 0; i<= 10; i++) {
			System.out.println("child"+Thread.currentThread().getPriority());
		}
	}
}
