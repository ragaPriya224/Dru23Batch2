package practice.oops;

public class FinallyVsReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}
	public static int m1() {
		int a= 0;
		try {
			a = 10;
			System.out.println("********");
			System.exit(0);
			System.out.println("1111111111");

			return 111;
		}catch(Exception e) {
			return 222;
		}finally {
			a = 333;
			return 333;
		}
//		return a;
	}
//final >return
}
