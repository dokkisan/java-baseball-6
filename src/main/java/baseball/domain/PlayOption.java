package baseball.domain;

public enum PlayOption {
	PLAY(1),
	QUIT(2);

	private final int key;

	PlayOption(int key) {
		this.key = key;
	}

	public static PlayOption convertToKey(String inputKey) {
		return validateKey(Integer.parseInt(inputKey));
	}

	private static PlayOption validateKey(int inputKey) {
		PlayOption key = findByKey(inputKey);
		if (key == null) {
			throw new IllegalArgumentException("[ERROR] 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		}

		return key;
	}

	private static PlayOption findByKey(int inputKey) {
		for (PlayOption playOption : PlayOption.values()) {
			if (playOption.key == inputKey) {
				return playOption;
			}
		}

		return null;
	}
}
