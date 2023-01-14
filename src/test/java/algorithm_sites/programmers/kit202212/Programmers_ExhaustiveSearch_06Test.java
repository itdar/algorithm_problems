package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_06Test {

    private Programmers_ExhaustiveSearch_06 programmers_exhaustiveSearch_06 = new Programmers_ExhaustiveSearch_06();

    @Test
    void solutionTest1() {
        int n = 9;
        int[][] wires = new int[][] {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        int result = programmers_exhaustiveSearch_06.solution(n, wires);
        assertThat(result).isEqualTo(3);
    }
    @Test
    void solutionTest2() {
        int n = 4;
        int[][] wires = new int[][] {{1,2},{2,3},{3,4}};
        int result = programmers_exhaustiveSearch_06.solution(n, wires);
        assertThat(result).isEqualTo(0);
    }
    @Test
    void solutionTest3() {
        int n = 7;
        int[][] wires = new int[][] {{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
        int result = programmers_exhaustiveSearch_06.solution(n, wires);
        assertThat(result).isEqualTo(1);
    }

}
