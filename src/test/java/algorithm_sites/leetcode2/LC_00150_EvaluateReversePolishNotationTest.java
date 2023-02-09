package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00150_EvaluateReversePolishNotationTest {

    private LC_00150_EvaluateReversePolishNotation lc = new LC_00150_EvaluateReversePolishNotation();

    @Test
    void solutionTest1() {
        int result = lc.evalRPN(new String[]{"2", "1", "+", "3", "*"});

        assertThat(result).isEqualTo(9);
    }

    @Test
    void solutionTest2() {
        int result = lc.evalRPN(new String[]{"4","13","5","/","+"});

        assertThat(result).isEqualTo(6);
    }

    @Test
    void solutionTest3() {
        int result = lc.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});

        assertThat(result).isEqualTo(22);
    }

}
