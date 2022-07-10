package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00205_IsomorphicStringsTest {

    private LC_00205_IsomorphicStrings isomorphicStrings = new LC_00205_IsomorphicStrings();

    @Test
    void isIsomorphicStringsTest1() {
        boolean result = isomorphicStrings.isIsomorphic("egg", "add");

        assertThat(result).isTrue();
    }

    @Test
    void isIsomorphicStringsTest2() {
        boolean result = isomorphicStrings.isIsomorphic("foo", "bar");

        assertThat(result).isFalse();
    }

    @Test
    void isIsomorphicStringsTest3() {
        boolean result = isomorphicStrings.isIsomorphic("paper", "title");

        assertThat(result).isTrue();
    }

    @Test
    void isIsomorphicStringsTest4() {
        boolean result = isomorphicStrings.isIsomorphic("badc", "baba");

        assertThat(result).isFalse();
    }

}
