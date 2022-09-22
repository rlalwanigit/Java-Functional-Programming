package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCubeEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 3, 8, 2));
		printSquareAllNumbersInListFunctional(List.of(12, 9, 13, 4, 3, 8, 2));
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 3, 8, 2));
		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Cloud");
		courses.stream().map(i -> i.length()).forEach(System.out::println);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(System.out::println);
	}

	private static void printSquareAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().map(i -> i * i).forEach(System.out::println);
	}

	private static void printCubeEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 == 0).map(i -> i * i * i).forEach(System.out::println);
	}

}
