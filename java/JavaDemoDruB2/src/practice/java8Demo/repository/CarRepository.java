package practice.java8Demo.repository;

import java.util.Arrays;
import java.util.List;

import practice.java8Demo.entity.Car;
	
public class CarRepository {
	public static List<Car> getAllCars() {
		


		Car p1 = new Car(1,"toyota","highlander","blue",2008,20000.55);
		Car p2 = new Car(2,"toyota","solara","blue",2009,5000.55);
		Car p3 = new Car(333,"ford", "expedition","white",2022,500000.70);
		Car p4 = new Car(55,"bmw", "expedition","white",2022,4000.70);
//		Car p5 = new Car(6,"baahu","bali","bhubali.a@www.com", "Female", 6);
//		Car p6 = new Car(7,"great","hulk","hulk.r@aa.com", "Male",77 );
//		Car p7 = new Car(888,"power","rangers","rangers@pow.com","Male", 5);
//		Car p8 = new Car(99,"abc","def","rangers@pow.com","Male", 2);
//		Car p9 = new Car(1000,"ghi","jkl","rangers@pow.com","Male", 4);
//		Car p10 = new Car(420,"squid","game","fox@a.com","Male", 7);
		return Arrays.asList
				(p1, p2, p3, p4);
	}
}