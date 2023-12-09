package baseball.controller;

import baseball.domain.PlayOption;
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
