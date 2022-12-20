package algorithm_sites.etc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProgrammersLineGlo3Test {

    private ProgrammersLineGlo3 glo3 = new ProgrammersLineGlo3();

    @Test
    void solutionTest1() {
        int result = glo3.solution(10, new int[]{8, 4, 2, 5, 3, 7});

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest2() {
        int result = glo3.solution(10, new int[]{1,2,3,3,3,8});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest3() {
        int result = glo3.solution(10, new int[]{9});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest4() {
        int result = glo3.solution(3, new int[]{2,1,3});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest5() {
        int result = glo3.solution(10, new int[]{1,1,5,8});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest6() {
        int result = glo3.solution(10, new int[]{1,2,2,7,8});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest7() {
        int result = glo3.solution(5, new int[]{1,1,2,3,3});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest8() {
        int result = glo3.solution(10, new int[]{1,2,2,7,8,1,2,2,7,8,10,10,10});

        assertThat(result).isEqualTo(7);
    }

}
