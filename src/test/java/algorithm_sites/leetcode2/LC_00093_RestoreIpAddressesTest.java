package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class LC_00093_RestoreIpAddressesTest {

    private LC_00093_RestoreIpAddresses leet = new LC_00093_RestoreIpAddresses();

    @Test
    void solutionTest1() {
        List<String> results = leet.restoreIpAddresses("25525511135");

        assertThat(results)
            .hasSize(2)
            .containsExactly("255.255.11.135", "255.255.111.35");
    }

    @Test
    void solutionTest2() {
        List<String> results = leet.restoreIpAddresses("0000");

        assertThat(results)
            .hasSize(1)
            .containsExactly("0.0.0.0");
    }

    @Test
    void solutionTest3() {
        List<String> results = leet.restoreIpAddresses("101023");

        assertThat(results)
            .hasSize(5)
            .containsExactly("1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3");
    }

    @Test
    void stringBuilderSubstringTest() {
        StringBuilder sb = new StringBuilder("12345");

        assertThat(sb.length()).isEqualTo(5);
        assertThat(sb.substring(0,3)).isEqualTo("123");
        assertThat(sb.substring(0,sb.length())).isEqualTo("12345");
    }

}
