package practice.java8Demo.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = null;
//		name.toLowerCase();
		
		String[] name = new String[10];
		name[2] = "hello";
		Optional<String> checkNull = Optional.ofNullable(name[2]);
		System.out.println(checkNull);
//		System.out.println(checkNull.get());
//		if(checkNull.isPresent()) {
//			String word = name[2].toLowerCase();
//			System.out.println(word);
//		}else {
//			System.out.println("else block");
//		}
		if(checkNull.isEmpty()) {
			System.out.println("value not there");
		}
	}
	public void m2() {
		
	}

}
