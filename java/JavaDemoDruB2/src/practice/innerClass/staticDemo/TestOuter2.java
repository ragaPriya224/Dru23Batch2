package practice.innerClass.staticDemo;

/**
 * A static class is a class that is created inside a class, is called a static nested class in Java. It cannot access non-static data members and methods. It can be accessed by outer class name.
 * It can access static data members of the outer class, including private.
 * The static nested class cannot access non-static (instance) data members or
 */
public class TestOuter2{  
	
	  static int data=30; 
	  
	  static class Inner{
		  
	   static void msg(){
		   System.out.println("data is "+data);
		   }  
	  }  
	  
	  public static void main(String args[]){ 
		  
	  TestOuter2.Inner.msg();//no need to create the instance of static nested class  
	 
	  }  
	}  

//If you have the static member inside the static nested class, you don't need to create an instance of the static nested class.

