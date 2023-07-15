package practice.ExceptionDemo;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		//		System.out.println("hello");
	}
	public static   void m1() {
		throw new ArithmeticException("/0");
	}

}
