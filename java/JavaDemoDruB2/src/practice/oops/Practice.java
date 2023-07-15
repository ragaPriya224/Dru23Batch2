package practice.oops;

public class Practice {
	String a ;

	public  static void main(String[] data) {
		try {
			System.out.println("hi"); //s1
			int a = 10/0;  //s2
			System.out.println("*************"); //s3
		}catch(Exception e) {
			System.out.println(e.);
			System.out.println("a");//s4
		}finally {
			System.out.println("finally block");
		}
		System.out.println("bye"); //s5

	}

}
