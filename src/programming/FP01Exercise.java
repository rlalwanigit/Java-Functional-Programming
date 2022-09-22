package programming;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 3, 8, 2));
		printOddNumbersInListFunctional(List.of(12, 9, 13, 4, 3, 8, 2));

		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Cloud");
		//courses.stream().forEach(System.out::println);
		//courses.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
		courses.stream().filter(s->s.length()>=4).forEach(System.out::println);

	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}
}
