package nextstep.ladder.view;

import nextstep.ladder.domain.Height;
import nextstep.ladder.domain.Results;
import nextstep.ladder.domain.Users;

import java.util.Scanner;

/**
 * @author han
 */
public class InputView {
    private static final String INPUT_USER_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INPUT_RESULTS = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String INPUT_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";

    private final static Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static Users inputUserNames() {
        System.out.println(INPUT_USER_NAMES);
        String line = scanner.nextLine();
        return Users.createByString(line);
    }

    public static Results inputResults() {
        System.out.println(INPUT_RESULTS);
        String line = scanner.nextLine();
        return Results.createByString(line);

    }

    public static Height inputLadderHeight() {
        System.out.println(INPUT_LADDER_HEIGHT);
        String line = scanner.nextLine();
        return new Height(Integer.parseInt(line));
    }
}
