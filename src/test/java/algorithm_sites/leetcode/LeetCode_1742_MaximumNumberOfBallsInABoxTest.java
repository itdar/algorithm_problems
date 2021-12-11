package algorithm_sites.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode_1742_MaximumNumberOfBallsInABoxTest {

    private LeetCode_1742_MaximumNumberOfBallsInABox test = new LeetCode_1742_MaximumNumberOfBallsInABox();

    @Test
    public void countBallsTest() {
        Assertions.assertThat(test.countBalls(1, 10)).isEqualTo(2);
        Assertions.assertThat(test.countBalls(5, 15)).isEqualTo(2);
        Assertions.assertThat(test.countBalls(19, 28)).isEqualTo(2);
    }

    @Test
    public void digitSumTest() {
        Assertions.assertThat(test.digitSum(12)).isEqualTo(3);
        Assertions.assertThat(test.digitSum(312)).isEqualTo(6);
        Assertions.assertThat(test.digitSum(4572)).isEqualTo(18);
        Assertions.assertThat(test.digitSum(9380)).isEqualTo(20);
        Assertions.assertThat(test.digitSum(0)).isEqualTo(0);
        Assertions.assertThat(test.digitSum(1)).isEqualTo(1);
        Assertions.assertThat(test.digitSum(990)).isEqualTo(18);
    }

}
