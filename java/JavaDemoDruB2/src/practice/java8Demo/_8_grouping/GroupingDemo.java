package practice.java8Demo._8_grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import practice.java8Demo.entity.Car;
import practice.java8Demo.repository.CarRepository;

public class GroupingDemo {

	public static void main(String[] args) {
		GroupingDemo d = new GroupingDemo();
		d.simpleGrouping();
	}
	public void simpleGrouping() {
		List<Car> carList = CarRepository.getAllCars();
		Map<String, List<Car>> grouping =  carList
				.stream()
				.collect(Collectors.groupingBy(Car::getMake));

		grouping.forEach((make, cars) -> { //biconsumer -> takes 2 arguments and produces what we need
			System.out.println(make);
			cars.forEach(System.out::println);
		});
	}

	public void groupingAndCountingEg1()   {
		List<String> nameList = Arrays.asList
				(
						"John",
						"John",
						"Mariam",
						"Alex",
						"Mohammado",
						"Mohammado",
						"Vincent",
						"Alex",
						"Alex"
						);

		Map<String, Long> counting = nameList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		counting.forEach((name, count) -> System.out.println(name + " > " + count));
	}

	public void groupingAndCounting() {
		List<String> cityList = Arrays.asList("chennai","tokyo","berlin","berlin","tokyo","mumbai");
		Map<String, Long> output = cityList.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		output.forEach((name,count) -> System.out.println(name + "  " +count));
	}

}
