package practice.innerClass.NonStaticDemo.LocalInnerDemo;

public class LocalInner1{  
	private int data=30;//instance variable  
	void display(){  
		class Local{  
			void msg(){System.out.println(data);}  
		}  
		Local l=new Local();  
		l.msg();  
	}  
	public static void main(String args[]){  
		LocalInner1 obj=new LocalInner1();  
		obj.display();  
	}  
}  

//RULES:
//	1.Local variables can't be private, public, or protected.
//	 2.Local inner class cannot be invoked from outside the method.
