package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Greedy_05_ConnectIslandTest {

    @Test
    void solutionTest_01() {
        Greedy_05_ConnectIsland test = new Greedy_05_ConnectIsland();
        int result = test.solution(4,
            new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}});

        assertThat(result).isEqualTo(4);
    }

//    @Test
//    void solutionTest_02() {
//        Greedy_05_ConnectIsland test = new Greedy_05_ConnectIsland();
//        int result = test.solution(4,
//            new int[][]{{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}});
//
//        assertThat(result).isEqualTo(4);
//    }

}