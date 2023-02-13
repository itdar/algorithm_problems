package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00125_ValidPalindromeTest {

    private LC_00125_ValidPalindrome lc = new LC_00125_ValidPalindrome();

    @Test
    void solutionTest1() {
        assertThat(lc.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }
    @Test
    void solutionTest2() {
        assertThat(lc.isPalindrome("race a car")).isFalse();
    }
    @Test
    void solutionTest3() {
        assertThat(lc.isPalindrome(" ")).isTrue();
    }

}
