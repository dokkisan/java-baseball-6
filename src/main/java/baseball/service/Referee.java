package baseball.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseball.domain.Computer;
import baseball.domain.User;

public class Referee {
	private Map<String, Integer> gameResult = new HashMap<>();

	public Referee() {
		gameResult.put("스트라이크", 0);
		gameResult.put("볼", 0);
		gameResult.put("낫싱", 0);
	}

	// 게임 결과 판단
	public void calculateGameResult(User user, Computer computer) {
		List<Integer> userNumbers = user.sendToReferee();
		List<Integer> computerNumbers = computer.sendToReferee();
		System.out.println(is3Strike(userNumbers, computerNumbers));
	}

	// private int countBall() {
	//
	// }
	//R
	//
	// private boolean isNothing() {
	// 	return false;
	// }
	//
	// private boolean isBall() {
	// 	return false;
	// }
	//
	private boolean is3Strike(List<Integer> userNumbers, List<Integer> computerNumbers) {
		return userNumbers.equals(computerNumbers);
	}
}
