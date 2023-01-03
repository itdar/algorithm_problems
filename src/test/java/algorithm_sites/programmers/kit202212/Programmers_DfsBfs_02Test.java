package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_DfsBfs_02Test {


    private Programmers_DfsBfs_02 programmers_dfsBfs_02 = new Programmers_DfsBfs_02();

    @Test
    void solutionTest1() {
        int[][] map = new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int result = programmers_dfsBfs_02.solution(map);
        assertThat(result).isEqualTo(11);
    }
    @Test
    void solutionTest2() {
        int[][] map = new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        int result = programmers_dfsBfs_02.solution(map);
        assertThat(result).isEqualTo(-1);
    }

}
