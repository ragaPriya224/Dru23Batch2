package practice.java8Demo._7_statistics;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import practice.java8Demo.entity.Car;
import practice.java8Demo.entity.Person;
import practice.java8Demo.repository.CarRepository;
import practice.java8Demo.repository.PersonRepository;

public class StatisticsDemo {

	public static void main(String[] args) {
		StatisticsDemo d = new StatisticsDemo();
		d.count();
		d.max();
		d.min();
		d.average();
		d.statistics();
	}
	public void count()   {
		List<Person> personList = PersonRepository.getAllPersons();

		long count = personList
				.stream()
				.filter(person -> person.getGender().equalsIgnoreCase("female"))
				.count();
		System.out.println(count);
	}
	
//find minimum price of car which is colour yellow
	public void min(){
		List<Car> carList = CarRepository.getAllCars();
		double min = carList
				.stream()
				.filter(car -> car.getColor().equalsIgnoreCase("yellow"))
				.mapToDouble(Car::getPrice)
				.min()
				.orElse(0);
		System.out.println(min);
	}

	public void max()   {
		List<Car> carList = CarRepository.getAllCars();

		double max = carList
				.stream()
				.filter(car -> car.getColor().equalsIgnoreCase("yellow"))
				.mapToDouble(Car::getPrice)
				.max()
				.orElse(0);
		System.out.println(max);
	}


	public void average()   {
		List<Car> carList = CarRepository.getAllCars();
		double averagePrice = carList.stream()
				.mapToDouble(Car::getPrice)
				.average()
				.orElse(0);
		System.out.println(averagePrice);

	}

	public void sum()   {
		List<Car> carList = CarRepository.getAllCars();
		double sum = carList.stream()
				.mapToDouble(Car::getPrice)
				.sum();
		BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
		System.out.println(sum);
		System.out.println(bigDecimalSum);

	}

	public void statistics()   {
		List<Car> carList = CarRepository.getAllCars();
		DoubleSummaryStatistics statistics = carList.stream()
				.mapToDouble(Car::getPrice)
				.summaryStatistics();
		System.out.println(statistics);
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getSum());
	}

}
