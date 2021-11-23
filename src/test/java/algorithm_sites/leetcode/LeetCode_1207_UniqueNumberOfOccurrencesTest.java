package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LeetCode_1207_UniqueNumberOfOccurrencesTest {

    @Test
    @DisplayName("Test")
    public void 테스트() {
        LeetCode_1207_UniqueNumberOfOccurrences test = new LeetCode_1207_UniqueNumberOfOccurrences();
        boolean answer = test.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});

        assertThat(answer).isEqualTo(true);
    }

}
