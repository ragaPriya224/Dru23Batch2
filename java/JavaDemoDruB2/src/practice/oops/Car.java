package practice.oops;

public class Car {

	String name;
	String fuelType;
	
	Car(){
	this.fuelType = "petrol";	
	}

	Car(String name){
	this.name = name;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();
		bmw.name = "bmw";
//		bmw.fuelType ="petrol";
		System.out.println(bmw.name);
		System.out.println(bmw.fuelType);

		Car audi = new Car();
		audi.name = "audi";
		audi.fuelType ="gas";
		System.out.println(audi.name);
		System.out.println(audi.fuelType);
		
		Car tata = new Car("tatanexon");
		System.out.println(tata.name);

	}

}
