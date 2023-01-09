package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Greedy_02Test {

    private Programmers_Greedy_02 programmers_greedy_02 = new Programmers_Greedy_02();

    @Test
    void solutionTest1() {
        int result = programmers_greedy_02.solution("JEROEN");
        assertThat(result).isEqualTo(56);
    }
    @Test
    void solutionTest2() {
        int result = programmers_greedy_02.solution("JAN");
        assertThat(result).isEqualTo(23);
    }
    @Test
    void solutionTest3() {
        int result = programmers_greedy_02.solution("A");
        assertThat(result).isEqualTo(0);
    }
    @Test
    void solutionTest4() {
        int result = programmers_greedy_02.solution("AA");
        assertThat(result).isEqualTo(0);
    }
    @Test
    void solutionTest5() {
        int result = programmers_greedy_02.solution("AB");
        assertThat(result).isEqualTo(2);
    }
    @Test
    void solutionTest6() {
        int result = programmers_greedy_02.solution("BBAABAAAAB");
        assertThat(result).isEqualTo(10);
    }
    @Test
    void solutionTest7() {
        int result = programmers_greedy_02.solution("BBAABAAAA");
        assertThat(result).isEqualTo(7);
    }
    @Test
    void solutionTest8() {
        int result = programmers_greedy_02.solution("BBAAB");
        assertThat(result).isEqualTo(6);
    }
    @Test
    void solutionTest9() {
        int result = programmers_greedy_02.solution("BBAABAA");
        assertThat(result).isEqualTo(7);
    }

    @Test
    void changeDiffCharTest1() {
        int result = programmers_greedy_02.countAToAnyUpper(0, "BBB");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void changeDiffCharTest2() {
        int result = programmers_greedy_02.countAToAnyUpper(0, "XXX");
        assertThat(result).isEqualTo(3);
    }

}
