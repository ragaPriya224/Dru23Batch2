package practice;

public class SwitchDemo {

	public static void main(String[] args) {
		int day = 100;
		String name = "hello";
		switch (name) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "hello":
			System.out.println("Wednesday");
			break;
			//		  case 4:
			//		    System.out.println("Thursday");
			////		    break;
			//		  case 5:
			//		    System.out.println("Friday");
			////		    break;
			//		  case 6:
			//		    System.out.println("Saturday");
			//		    break;
			//		  case 7:
			//		    System.out.println("Sunday");
			//		    break;
		default:
			System.out.println("try again");
			break;
		}
		int a = 1,b=2,c=3;

		switch(a+b+c) {

		}
//byte, short, char, int, string , enums
		//wrapper classes
		
//	boolean, long, float, double -> not allowed
	
		int[] mark = new int[10];
//		mark[5]
		
//		heterogenous
	}

}
