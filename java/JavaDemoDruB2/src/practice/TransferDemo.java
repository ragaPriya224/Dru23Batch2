package practice;

public class TransferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i<6; i++) { //rows
//			System.out.println("*");
//			if(i == 3) {
//				break; //out of the loop
//			}
//			System.out.println("hello" +i);
//		}
		
		for(int i = 1; i<6; i++) { //rows
			System.out.println("*");
			if(i == 3) {
				continue; //skip that iteration
			}
			System.out.println("hello" +i);
		}
	}

}
