package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Wwb_4_BugFixSmallestSameValueTest {

    private Wwb_4_BugFixSmallestSameValue ww = new Wwb_4_BugFixSmallestSameValue();

    @Test
    void solutionTest1() {
        int result = ww.solution(new int[]{1, 3, 2, 1}, new int[]{4, 2, 5, 3, 2});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest2() {
        int result = ww.solution(new int[]{2, 1}, new int[]{3,3});

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void solutionTest3() {
        int result = ww.solution(new int[]{2}, new int[]{3});

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void solutionTest4() {
        int result = ww.solution(new int[]{2}, new int[]{2});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest5() {
        int result = ww.solution(new int[]{}, new int[]{3,3});

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void solutionTest6() {
        int result = ww.solution(new int[]{2,2}, new int[]{});

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void solutionTest7() {
        int result = ww.solution(new int[]{}, new int[]{});

        assertThat(result).isEqualTo(-1);
    }

    @Test
    void solutionTest8() {
        int result = ww.solution(new int[]{3,2,1}, new int[]{3,2,1});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest9() {
        int result = ww.solution(null, new int[]{3,2,1});

        assertThat(result).isEqualTo(-1);
    }

}
