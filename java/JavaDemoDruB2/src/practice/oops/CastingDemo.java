package practice.oops;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Dog d =(Dog)  new Animal();
		//		d.name();
		//		
		//		Rabbit r =(Rabbit)  new Animal();
		//		r.name();
		//parent class ref refers to child class obj
		Animal p1 = new Dog();
		//explicitly cast
		Dog d = (Dog) p1;
		d.name();

		//parent class ref refers to child class obj
		Animal p2 = new Rabbit();
		//explicitly cast sup class ref to sub class type
		Rabbit r = (Rabbit) p2;
		r.name();
	}

}
