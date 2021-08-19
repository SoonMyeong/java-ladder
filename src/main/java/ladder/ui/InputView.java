package ladder.ui;

import java.util.Scanner;

public class InputView {

    private static final String PLAYERS_NAME = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String AWARDS_NAMES = "\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String LADDER_HEIGHT = "\n최대 사다리 높이는 몇 개인가요?";
    private static final String WANTED_PLAYER = "\n결과를 보고 싶은 사람은?";
    private static final Scanner scanner = new Scanner(System.in);


    private InputView() {
        throw new IllegalStateException();
    }

    public static String inputPlayersName() {
        System.out.println(PLAYERS_NAME);
        return scanner.nextLine();
    }

    public static String inputAwardsName() {
        System.out.println(AWARDS_NAMES);
        return scanner.nextLine();
    }

    public static int inputLadderHeight() {
        System.out.println(LADDER_HEIGHT);
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputWantedPlayerName() {
        System.out.println(WANTED_PLAYER);
        return scanner.nextLine();
    }
}
