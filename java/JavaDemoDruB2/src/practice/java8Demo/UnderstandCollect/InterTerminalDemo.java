package practice.java8Demo.UnderstandCollect;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8Demo.entity.Car;
import practice.java8Demo.repository.CarRepository;

public class InterTerminalDemo {

	public static void main(String[] args) {
		InterTerminalDemo d = new InterTerminalDemo();
		d.m1();
	}
	public void m1() {
		List<Car> carList = CarRepository.getAllCars();
		carList.stream()
		.filter(car ->{
			System.out.println("filtering car" +car);
			return car.getPrice() >1000;
		}) //condition
		.map(car ->{
			System.out.println("mapping car" +car);
			return car.getPrice();
		}) //transformation, manipulation
		.map(price ->{
				System.out.println("mapping price" +price);
				return price +(price +1);
		});
//		.collect(Collectors.toList());
		System.out.println("---------");
//		System.out.println(carList);
}
}
