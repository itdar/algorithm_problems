package algorithm_sites.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeetCode_0389_FindTheDifferenceTest {

    @Test
    public void findTheDifferenceTest() {
        LeetCode_0389_FindTheDifference test = new LeetCode_0389_FindTheDifference();

        Assertions.assertThat(test.findTheDifference("abcd", "abcde")).isEqualTo('e');
        Assertions.assertThat(test.findTheDifference("", "y")).isEqualTo('y');
        Assertions.assertThat(test.findTheDifference("aa", "aa")).isEqualTo('a');
        Assertions.assertThat(test.findTheDifference("ae", "aea")).isEqualTo('a');
    }

}
