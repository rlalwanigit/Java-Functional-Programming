package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printAllNumbersInListStructured(List.of(12, 9, 13, 4, 3, 2));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (Integer i : numbers) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

}
