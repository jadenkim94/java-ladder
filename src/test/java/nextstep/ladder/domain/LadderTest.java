package nextstep.ladder.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * @author han
 */
class LadderTest {

    @Test
    void create() {
        Users users = Users.createByString(UsersTest.NAMES);
        Height height = new Height(5);
        Results results = Results.createByString(ResultsTest.RESULTS);
        assertDoesNotThrow(() -> Ladder.from(users, height, results));
    }
}