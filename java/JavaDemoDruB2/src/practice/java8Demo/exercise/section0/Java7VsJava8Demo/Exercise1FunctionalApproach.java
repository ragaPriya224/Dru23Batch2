package main.exercise.section0.Java7VsJava8Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.entity.Person;
import main.repository.PersonRepository;

//1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people
public class Exercise1FunctionalApproach {

	public static void main(String[] args) {

		Exercise1FunctionalApproach ex = new Exercise1FunctionalApproach();
//		ex.peopleAgeLessThan18();
//		ex.findFirst10People();
	}

	//1. Find people aged less or equal 18
	public void peopleAgeLessThan18() {
		List<Person> personList = PersonRepository.getAllPersons();
		List<Person>youngPeopleList = personList.stream()
		.filter(person -> person.getAge() <=18)
		.collect(Collectors.toList());
	youngPeopleList.forEach(System.out::println);
	}
	
	// 2. find first 10 people
	public void findFirst10People() {
		List<Person> personList = PersonRepository.getAllPersons();
		List<Person>youngPeopleList = personList.stream()
		.filter(person -> person.getAge() <=18)
		.limit(10)
		.collect(Collectors.toList());
	youngPeopleList.forEach(System.out::println);
	
	
	}
}