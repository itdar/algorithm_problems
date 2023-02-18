package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class LC_00022_GenerateParenthesesTest {

    private LC_00022_GenerateParentheses lc = new LC_00022_GenerateParentheses();

    @Test
    void solutionTest1() {
        List<String> strings = lc.generateParenthesis(3);

        assertThat(strings).contains("((()))","(()())","(())()","()(())","()()()");
    }
    @Test
    void solutionTest2() {
        List<String> strings = lc.generateParenthesis(1);

        assertThat(strings).contains("()");
    }

}
