package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_ExhaustiveSearch_01Test {

    private Programmers_ExhaustiveSearch_01 programmers_exhaustiveSearch_01 = new Programmers_ExhaustiveSearch_01();

    @Test
    void solutionTest1() {
        int[][] sizes = new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int result = programmers_exhaustiveSearch_01.solution(sizes);

        assertThat(result).isEqualTo(4000);
    }
    @Test
    void solutionTest2() {
        int[][] sizes = new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int result = programmers_exhaustiveSearch_01.solution(sizes);

        assertThat(result).isEqualTo(120);
    }
    @Test
    void solutionTest3() {
        int[][] sizes = new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        int result = programmers_exhaustiveSearch_01.solution(sizes);

        assertThat(result).isEqualTo(133);
    }

}
