package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public interface Player {
	List<Integer> numbers = new ArrayList<>();

	default List<Integer> sendToReferee() {
		return numbers;
	}
}
