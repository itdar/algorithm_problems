package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LeetCode_1021_RemoveOutermostParenthesesTest {

    @Test
    public void removeOuterParenthesesTest() {
        LeetCode_1021_RemoveOutermostParentheses test = new LeetCode_1021_RemoveOutermostParentheses();

        assertThat(test.removeOuterParentheses("(()())(())")).isEqualTo("()()()");
        assertThat(test.removeOuterParentheses("(()())(())(()(()))")).isEqualTo("()()()()(())");
        assertThat(test.removeOuterParentheses("()())")).isEqualTo("");
    }

}
