package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00020_ValidParenthesesTest {

    @Test
    void isValidTest1() {
        LC_00020_ValidParentheses vp = new LC_00020_ValidParentheses();

        boolean result = vp.isValid("()");

        assertThat(result).isTrue();
    }

    @Test
    void isValidTest2() {
        LC_00020_ValidParentheses vp = new LC_00020_ValidParentheses();

        boolean result = vp.isValid("()[]{}");

        assertThat(result).isTrue();
    }

    @Test
    void isValidTest3() {
        LC_00020_ValidParentheses vp = new LC_00020_ValidParentheses();

        boolean result = vp.isValid("{]");

        assertThat(result).isFalse();
    }

}