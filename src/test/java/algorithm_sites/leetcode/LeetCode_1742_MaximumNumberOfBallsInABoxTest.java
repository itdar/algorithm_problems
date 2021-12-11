package algorithm_sites.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode_1742_MaximumNumberOfBallsInABoxTest {

    @Test
    public void countBallsTest() {
        LeetCode_1742_MaximumNumberOfBallsInABox test = new LeetCode_1742_MaximumNumberOfBallsInABox();

        Assertions.assertThat(test.countBalls(1, 10)).isEqualTo(2);
        Assertions.assertThat(test.countBalls(5, 15)).isEqualTo(2);
        Assertions.assertThat(test.countBalls(19, 28)).isEqualTo(2);
    }

}
