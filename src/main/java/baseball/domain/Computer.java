package baseball.domain;

import java.util.List;

import baseball.service.RandomNumberManager;

public class Computer implements Player {
	private final List<Integer> numbers;

	public Computer() {
		this.numbers = RandomNumberManager.createRandomNumbers();
	}

	@Override
	public List<Integer> sendToReferee() {
		return numbers;
	}
}
