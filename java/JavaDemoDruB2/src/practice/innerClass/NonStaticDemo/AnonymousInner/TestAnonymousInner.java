package practice.innerClass.NonStaticDemo.AnonymousInner;

abstract class Person{  
	abstract void eat();
	void speak() {
		System.out.println("speaking");
	}
}  
class TestAnonymousInner{  
	public static void main(String args[]){  
		Person p=new Person(){  
			void eat(){
				System.out.println("nice fruits");
			speak();	
			}  
			public void speak() {
				System.out.println("person");
			}
			
		};  
		p.eat();  
	}  
}  

//internal working

//Person p=new Person(){  
//	void eat(){System.out.println("nice fruits");}  
//}

//1.class is created, but its name is decided by the compiler, which extends the Person class 
//   and provides the implementation of the eat() method.
//2.An object of the Anonymous class is created that is referred to by 'p,' a reference variable of Person type