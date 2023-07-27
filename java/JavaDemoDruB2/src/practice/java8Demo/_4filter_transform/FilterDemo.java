package practice.java8Demo._4filter_transform;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import practice.java8Demo.entity.Car;
import practice.java8Demo.repository.CarRepository;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilterDemo d = new FilterDemo();
		d.underStandingFilter();
	}

	public void underStandingFilter()   {
		List<Car> carList = CarRepository.getAllCars();
		List<Car> filteredList = carList.stream()
				.filter(cars -> cars.getPrice() >10000) //predicate
				.collect(Collectors.toList());
		filteredList
		.forEach(System.out::println);
		Predicate<Car> carPredicate = car -> car.getPrice() <2000;
//		in line 21, in filter, carPredicate can be passed as argument
	}

}