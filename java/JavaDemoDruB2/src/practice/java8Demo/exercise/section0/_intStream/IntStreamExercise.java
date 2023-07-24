package main.exercise.section0._intStream;

import java.util.List;
import java.util.stream.IntStream;

import main.entity.Person;
import main.repository.PersonRepository;

//loop through people using IntStream  and print the each object.
//Think whether  you need to use range or range close.
//Estimated completion time: 2 to 3 minutes.
public class IntStreamExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStreamExercise a = new IntStreamExercise();
		a.m1();
	}
	public void m1() {
		List<Person> personList = PersonRepository.getAllPersons();
		//java, list index starts from 0
		
		IntStream.range(0, personList.size())
		.forEach(index ->
		System.out.println(personList.get(index)));
		//rangeClosed  na arrayIndexoutofbound exception

		//without int stream
//		personList.forEach(System.out::println);
	}

}
