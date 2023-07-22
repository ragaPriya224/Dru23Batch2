package practice.innerClass.NonStaticDemo.AnonymousInner.ByInterf;

 interface Eatable{  
	void eat();  
}  
 public class TestAnnonymousInner1{  
	public static void main(String args[]){  
		Eatable e=new Eatable(){  
			public void eat(){System.out.println("nice fruits");}  
		};  
		e.eat();  
	}  
}  