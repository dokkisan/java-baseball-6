package baseball.constants;

public enum Operation {
	GAME_START("숫자 야구 게임을 시작합니다."),
	INPUT_NUMBERS("숫자를 입력해주세요 :"),
	ALL_MATCH("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
	INPUT_PLAY_OPTION("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
	;

	private String message;

	Operation(String message) {
		this.message = message;
	}
}
