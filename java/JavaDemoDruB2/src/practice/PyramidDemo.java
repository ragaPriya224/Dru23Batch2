package practice;

public class PyramidDemo {

	public static void main(String[] args) {
		for(int i = 1; i<6; i++) { //rows
			for(int j = 1; j<=i; j++) { //column
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
