package practice.oops;

public class OverridingDemo extends Demo{

	public  String name ="hello";
	OverridingDemo(){
		super(11);
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingDemo d = new OverridingDemo();
		d.m1();
//		super.
		//		Demo d = new OverridingDemo();
		//		d.m1();
		//		OverridingDemo odemo= (Demo)d;
	}
	
	@Override
	public void m1() {
		//		name = "changed";
//		super.m1();
		super.m2();
		System.out.println(super.name);
		System.out.println("child");
	}

}
