package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Graph_01Test {

    private Programmers_Graph_01 programmers_graph_01 = new Programmers_Graph_01();

    @Test
    void solutionTest1() {
        int n = 6;
        int[][] vertex = new int[][] {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        int result = programmers_graph_01.solution(n, vertex);

        assertThat(result).isEqualTo(3);
    }

}
