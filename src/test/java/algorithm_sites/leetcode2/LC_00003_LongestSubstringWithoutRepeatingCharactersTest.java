package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00003_LongestSubstringWithoutRepeatingCharactersTest {

    private LC_00003_LongestSubstringWithoutRepeatingCharacters lc = new LC_00003_LongestSubstringWithoutRepeatingCharacters();

    @Test
    void solutionTest1() {
        assertThat(lc.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }
    @Test
    void solutionTest2() {
        assertThat(lc.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }
    @Test
    void solutionTest3() {
        assertThat(lc.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }
    @Test
    void solutionTest4() {
        assertThat(lc.lengthOfLongestSubstring("aab")).isEqualTo(2);
    }
    @Test
    void solutionTest5() {
        assertThat(lc.lengthOfLongestSubstring("dvdf")).isEqualTo(3);
    }
    @Test
    void solutionTest6() {
        assertThat(lc.lengthOfLongestSubstring("aabaab!bb")).isEqualTo(3);
    }
    @Test
    void solutionTest7() {
        assertThat(lc.lengthOfLongestSubstring("bpfbhmipx")).isEqualTo(7);
    }

}
