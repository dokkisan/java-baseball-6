package baseball.domain;

import java.util.List;

public class User implements Player {
	private final List<Integer> numbers;

	public User(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public List<Integer> sendToReferee() {
		return numbers;
	}
}
