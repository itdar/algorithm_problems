package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DfsBfs_01Test {

    private Programmers_DfsBfs_01 programmers_dfsBfs_01 = new Programmers_DfsBfs_01();

    @Test
    void solutionTest1() {
        int[] number = new int[] {1,1,1,1,1};
        int target = 3;

        int result = programmers_dfsBfs_01.solution(number, target);

        assertThat(result).isEqualTo(5);
    }
    @Test
    void solutionTest2() {
        int[] number = new int[] {4,1,2,1};
        int target = 4;

        int result = programmers_dfsBfs_01.solution(number, target);

        assertThat(result).isEqualTo(2);
    }

}
