package practice.ExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static   void m1() throws IOException {
		File x = new File("abc.txt");
		FileInputStream m = new FileInputStream(x);
	}

}
