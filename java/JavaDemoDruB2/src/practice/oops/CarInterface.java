package practice.oops;

public interface CarInterface {

	 void m1();
//	 void m2();
	 default void m2() {
		 System.out.println("logic");
	 }
	 default void m3() {
		 System.out.println("logic");
	 }
	 
//	 default void m3() {
//		 System.out.println("logic");
//	 }
//	public void m2() {
//		
//	}
//	default void m3() {
//		
//	}
//	static void m4() {
//		
//	}
}
// all methods are considered as abstract public