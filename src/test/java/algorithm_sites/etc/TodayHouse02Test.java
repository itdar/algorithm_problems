package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TodayHouse02Test {

    private TodayHouse02 th = new TodayHouse02();

    @Test
    void solutionTest0() {
        String result = th.solution("abcab");

        assertThat(result).isEqualTo("c");
    }

    @Test
    void solutionTest1() {
        String result = th.solution("abcabcdefabc");

        assertThat(result).isEqualTo("def");
    }

    @Test
    void solutionTest2() {
        String result = th.solution("abxdeydeabz");

        assertThat(result).isEqualTo("xyz");
    }

    @Test
    void solutionTest3() {
        String result = th.solution("abcabca");

        assertThat(result).isEqualTo("bcbc");
    }

    @Test
    void solutionTest4() {
        String result = th.solution("ABCabcA");

        assertThat(result).isEqualTo("BCbc");
    }

}