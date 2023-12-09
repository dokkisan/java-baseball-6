package baseball.service;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberManager {

	public static List<Integer> createRandomNumbers() {
		return pickRandomNumbers();
	}

	private static List<Integer> pickRandomNumbers() {
		final int MAX_DIGIT = 3;

		List<Integer> numbers = new ArrayList<>();
		while (numbers.size() < MAX_DIGIT) {
			int randomNumber = pickRandomNumber();
			if (!numbers.contains(randomNumber)) {
				numbers.add(randomNumber);
			}
		}

		return numbers;
	}

	private static int pickRandomNumber() {
		return Randoms.pickNumberInRange(1, 9);
	}
}
