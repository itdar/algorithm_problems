package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00242_ValidAnagramTest {

    private LC_00242_ValidAnagram lc_00242_validAnagram = new LC_00242_ValidAnagram();

    @Test
    void solutionTest1() {
        boolean result = lc_00242_validAnagram.isAnagram("anagram", "nagaram");

        assertThat(result).isTrue();
    }
    @Test
    void solutionTest2() {
        boolean result = lc_00242_validAnagram.isAnagram("rat", "car");

        assertThat(result).isFalse();
    }

}
