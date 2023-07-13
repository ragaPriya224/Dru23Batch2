package practice.oops;

public class Demo {
	Demo(){
		System.out.println(" p constructor");

	}
	Demo(int a){
		System.out.println("arg p constructor");
	}
	public  String name ="demo";

	public  void m1() {
		System.out.println("parent");
	}
	public static void m2() {
		System.out.println("parent static");
	}

}
