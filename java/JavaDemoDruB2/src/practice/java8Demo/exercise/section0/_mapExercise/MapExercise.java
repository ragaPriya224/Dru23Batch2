package practice.java8Demo.exercise.section0._mapExercise;

import java.util.List;

import practice.java8Demo.entity.Car;
import practice.java8Demo.repository.CarRepository;


///1. Calculate the average car price
//HINT: use .mapToDouble(...) after getting all car prices 
//then use .average() to calulate the average price
//Est. time: 2-3 mins
public class MapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapExercise mE = new MapExercise();
		mE.averageCarPrice();
	}
	
	public void averageCarPrice() {
		List<Car> carList = CarRepository.getAllCars();
		double average = carList.stream()
				.mapToDouble(car -> car.getPrice())//(Car::getPrice)
				//transforming a car to double
				.average()
				.orElse(0);// or get bcoz optional
		System.out.println(average);
	}

}
