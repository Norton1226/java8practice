package self.education;

import java.util.Objects;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		MethodUtilityClass methodUtilityClass = new MethodUtilityClass();
		Converter<String, String> startConverter = methodUtilityClass::startWith;		
		System.out.println("Method reference of object: " + startConverter.convert("hello"));
		
		Converter<String, String> endConverter = MethodUtilityClass::endWith;
		System.out.println("Method reference of static class: " + endConverter.convert("hello"));
		
		PersonFactory<Person> personFactory = Person::new;
		System.out.println("Method reference for constructor: " + personFactory.create("Norbert", "Toth"));
		
		Integer add = 5;
		Converter<String, Integer> intToString = (string) -> Integer.valueOf(string + add);
		//add = 10; //This have to be final or effectively final
		System.out.println(intToString.convert("5"));
		
		Predicate<String> predicate = (s) -> s.length() > 0;
		predicate.test("foo");              // true
		predicate.negate().test("foo");     // false
		
		Predicate<Object> isNull = Objects::isNull;
		Object nullObject = null;
		System.out.println("Null check: " + isNull.test(nullObject));
	}

}
