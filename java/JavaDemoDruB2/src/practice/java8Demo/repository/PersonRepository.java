package practice.java8Demo.repository;

import java.util.Arrays;
import java.util.List;

import practice.java8Demo.entity.Person;

public class PersonRepository {
	public static List<Person> getAllPersons() {
		
		Person p1 = new Person(1,"captain","america","hmarling1@moonfruit.com","Male",55);
		Person p2 = new Person(2,"thor","odinson","thor.a@abc.com","Female", 5);
		Person p3 = new Person(333,"spider", "man","spidy.bb@aaa.com", "Male",88);
		Person p4 = new Person(4,"wonder","woman","wonder.w@zz.com",  "Female", 10);
		Person p5 = new Person(6,"baahu","bali","bhubali.a@www.com", "Female", 6);
		Person p6 = new Person(7,"great","hulk","hulk.r@aa.com", "Male",77 );
		Person p7 = new Person(888,"power","rangers","rangers@pow.com","Male", 5);
		Person p8 = new Person(99,"abc","def","rangers@pow.com","Male", 2);
		Person p9 = new Person(1000,"ghi","jkl","rangers@pow.com","Male", 4);
		Person p10 = new Person(420,"squid","game","fox@a.com","Male", 7);
		Person p11 = new Person(821,"julia","elizabeth","lion@b.com","Female",9);
		Person p12 = new Person(33,"selvi","g","wolf@c.com","Female", 3);
		Person p13 = new Person(891,"ramu","prakash","tiger@q.com","Male", 1);
		Person p14 = new Person(666,"john","abraham","cat@c.com","Male", 4);

		
		
		
		
		return Arrays.asList(p1, p2, p3, p4, p5, p6, p7,p8,p9,p10,p11,p12,p13,p14);
	}
//
//	public static Person getPerson() {
//		return new Person("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
//	}
//	
//	public static Optional<Person> getPersonOptional() {
//		Person per = getPerson();
//		per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20047)));
//		return Optional.of(per);
//	}
}