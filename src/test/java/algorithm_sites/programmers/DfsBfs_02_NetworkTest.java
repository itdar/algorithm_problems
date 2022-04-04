package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DfsBfs_02_NetworkTest {

    private DfsBfs_02_Network network = new DfsBfs_02_Network();

    @Test
    void solutionTest_1() {
        int result = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest_2() {
        int result = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest_3() {
        int result = network.solution(3, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});

        assertThat(result).isEqualTo(3);
    }

}