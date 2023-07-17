package practice.oops;

import java.util.List;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();//
		c.m1();
		c.m2();
		Parent p = new Child();
		p.m1();
//		p.m2
	}
	public void m2() {
		System.out.println("m2");
	}
	
	Object m4(){
		
	
}
