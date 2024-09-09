package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Example05MinAndMax {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numbers.add(new Random().nextInt(100));
		}
		
		System.out.println(numbers);
		
		System.out.println("Max value: " + Collections.max(numbers));
		System.out.println("Max value: " + Collections.min(numbers));
		
	}

}
