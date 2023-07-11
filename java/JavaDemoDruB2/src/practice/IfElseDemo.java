package practice;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 10;
		int parkerPen = 150;
		int ballPen= 10;
		if(money >= parkerPen) {
			System.out.println("bought parker pen");
		}else if(money >= ballPen) {
			System.out.println("bought ball pen");
		}else {
			System.out.println("go home");
		}
	}

}
