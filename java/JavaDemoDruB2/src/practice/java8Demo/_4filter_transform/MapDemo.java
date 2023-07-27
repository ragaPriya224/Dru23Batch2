package practice.java8Demo._4filter_transform;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import practice.java8Demo.entity.Car;
import practice.java8Demo.entity.Person;
import practice.java8Demo.entity.PersonDTO;
import practice.java8Demo.repository.CarRepository;
import practice.java8Demo.repository.PersonRepository;


//map operation allows us to simply transform one data to another, just like it
public class MapDemo {

		public static void main(String[] args) {
			MapDemo mD = new MapDemo();
			mD.ourFirstMapping();
			mD.m1();
		}
		
		public void m1() {
			List<Car> carList = CarRepository.getAllCars();
			List<String> output = carList.stream()
			.map(s -> s.getModel().toUpperCase())
			.collect(Collectors.toList());
			System.out.println(output);

		}
		
		public void functionDemo() {
			Function<String, Integer> func = x -> x.length();

			Integer apply = func.apply("hello");   // 5

			System.out.println(apply);

		}
		
		
		public void ourFirstMapping() {
			List<Person> personList = PersonRepository.getAllPersons();
			//trying to transfer from Person to PersonDTO

			//1.way
			List<PersonDTO> dtos = personList.stream()
					.map(person->{
						PersonDTO dto = new PersonDTO(person.getId(),
								person.getFirstName(), person.getAge());
						return dto;
					})
					.collect(Collectors.toList());
			dtos.forEach(System.out::println);
			
			//optimised code - 1
			List<PersonDTO> a = personList.stream()
					.map(person-> new PersonDTO(person.getId(),
								person.getFirstName(), person.getAge()))
					.collect(Collectors.toList());
			
			//optimised code - 2
			Function<Person,PersonDTO> personDtoFunction = person ->
			new PersonDTO(person.getId(),
					person.getFirstName(),
					person.getAge());
			List<PersonDTO> b = personList.stream()
					.map(personDtoFunction)
					.collect(Collectors.toList());
			
			//optimised code -3
			List<PersonDTO> personDtoList = personList.stream()
					.map(PersonDTO :: mapData)
					.collect(Collectors.toList());
			
		}

	}
