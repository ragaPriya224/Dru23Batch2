package practice.oops;

public class OverLoadingDemo {

	public static void main(String[] args) {
		//		add(10.5,5);
		add(5.6f,10.5f);

	}
	static void add(int a, int b) {
		System.out.println("1");
	}
	static void add(float a, float b) {
		System.out.println("2");
	}
	static void add(float a, double b) {
		System.out.println("3");
	}
	static void add(float a, int b) {
		System.out.println("4");

	}

}
