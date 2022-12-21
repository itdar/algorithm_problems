package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Sort_01Test {

    private Programmers_Sort_01 programmers_sort_01 = new Programmers_Sort_01();

    @Test
    void solutionTest1() {
        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] results = programmers_sort_01.solution(array, commands);

        assertThat(results).containsExactly(5,6,3);
    }

}
