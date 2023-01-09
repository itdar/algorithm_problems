package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DfsBfs_03Test {

    private  Programmers_DfsBfs_03 programmers_dfsBfs_03 = new Programmers_DfsBfs_03();

    @Test
    void solutionTest1() {
        int[][] computers = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int result = programmers_dfsBfs_03.solution(3, computers);
        assertThat(result).isEqualTo(2);
    }
    @Test
    void solutionTest2() {
        int[][] computers = new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int result = programmers_dfsBfs_03.solution(3, computers);
        assertThat(result).isEqualTo(1);
    }

}
