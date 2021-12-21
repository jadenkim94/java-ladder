package nextstep.ladder;

import nextstep.ladder.domain.Height;
import nextstep.ladder.domain.Ladder;
import nextstep.ladder.domain.Results;
import nextstep.ladder.domain.Users;
import nextstep.ladder.view.InputView;
import nextstep.ladder.view.ResultView;

/**
 * @author han
 */
public class Main {

    public static void main(String[] args) {

        Users users = InputView.inputUserNames();
        Results results = InputView.inputResults();
        Height height = InputView.inputLadderHeight();
        Ladder ladder = Ladder.from(users, height, results);
        ResultView.print(ladder);
    }
}
