package baseball.service;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberManager {

	public static List<Integer> createRandomNumbers() {
		return pickRandomNumbers();
	}

	public static List<Integer> validateUserNumbers(String inputNumbers) {
		final int MAX_DIGIT = 3;
		List<Integer> numbers = new ArrayList<>();

		System.out.println(inputNumbers.length());
		if (inputNumbers.length() != MAX_DIGIT || !inputNumbers.matches("[1-9]+")) {
			throw new IllegalArgumentException("[ERROR] 1~9 사이의 3자리 숫자만 입력해주세요.");
		}

		for (int i = 0; i < MAX_DIGIT; i++) {
			numbers.add(Integer.valueOf(inputNumbers.split("")[i]));
		}

		return numbers;
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

	// public void

	public void calculateGameResult() {

		// while (게임 결과 == 3 스트라이크)
	}
}
