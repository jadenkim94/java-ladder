package nextstep.ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author han
 */
public class Results {

    private static final String COMMA = ",";
    private final List<Result> result;

    private Results(List<Result> result) {
        this.result = result;
    }

    public static Results createByString(String line) {
        return new Results(Arrays.stream(line.split(COMMA))
            .map(result -> new Result(result))
            .collect(Collectors.toList()));
    }

    public List<Result> getResult() {
        return result;
    }
}
