package practice.java8Demo.Java7VsJava8Demo;

import java.util.ArrayList;
import java.util.List;

import practice.java8Demo.entity.Person;
import practice.java8Demo.repository.PersonRepository;

//1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people
public class Exercise1ImperativeApproach {

	public static void main(String[] args) {

		Exercise1ImperativeApproach ex = new Exercise1ImperativeApproach();
//		ex.peopleAgeLessThan18();
		ex.findFirst10People();
	}

	//1. Find people aged less or equal 18
	public void peopleAgeLessThan18() {
		List<Person> personList = PersonRepository.getAllPersons();
		List<Person> youngPeopleList = new ArrayList<Person>();
		for(Person person : personList) {
			if(person.getAge()<= 18) {
				youngPeopleList.add(person);
			}
		}
		for(Person youngPeople : youngPeopleList) {
			System.out.println(youngPeople);
		}
	}
	
	// 2. find first 10 people
	public void findFirst10People() {
		List<Person> personList = PersonRepository.getAllPersons();

		final int limit = 10;
		int counter = 0;

		List<Person> youngPeopleList = new ArrayList<Person>();
		for(Person person : personList) {
			if(person.getAge()<= 18) {
				youngPeopleList.add(person);
				counter++;
				if(counter == limit) {
					break;
				}
			}
		}
		for(Person youngPeople : youngPeopleList) {
			System.out.println(youngPeople);
		}
	}
}