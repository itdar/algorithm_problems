package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Greedy_05Test {

    private Programmers_Greedy_05 programmers_greedy_05 = new Programmers_Greedy_05();

    @Test
    void solutionTest1() {
        int n = 4;
        int[][] costs = new int[][] {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        int result = programmers_greedy_05.solution(n, costs);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void solutionTest2() {
        int n = 5;
        int[][] costs = new int[][] {{0, 1, 5}, {1, 2, 3}, {2, 3, 3}, {3, 1, 2}, {3, 0, 4}, {2, 4, 6}, {4, 0, 7}};
        int result = programmers_greedy_05.solution(n, costs);
        assertThat(result).isEqualTo(15);
    }

}
