package practice.ExceptionDemo;

public class TraceDemo {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		m2();
		System.out.println(10/0);
	}
	public static void m2() {
		System.out.println("hello");
	}

}
