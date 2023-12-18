package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.PlayOption;
import baseball.domain.User;
import baseball.service.RandomNumberManager;
import baseball.service.Referee;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
	private final InputView inputView;
	private final OutputView outputView;

	public GameController() {
		this.inputView = new InputView();
		this.outputView = new OutputView();
	}

	public void run() {
		PlayOption playOption = PlayOption.PLAY;
		while (playOption.equals(PlayOption.PLAY)) {
			try {
				// 사용자 숫자 입력
				User user = new User(RandomNumberManager.validateUserNumbers(inputView.inputNumbers()));
				// 심사 결과 출력
				Referee referee = new Referee();
				referee.calculateGameResult(user, new Computer());
				playOption = replay();
			} catch (IllegalArgumentException e) {
				outputView.printOneLineMessage(e.getMessage());
			}
		}
	}

	public PlayOption replay() {
		return PlayOption.convertToKey(inputView.inputReplayKey());
	}
}
