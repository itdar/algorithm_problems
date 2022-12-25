package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Sort_03Test {

    private Programmers_Sort_03 programmers_sort_03 = new Programmers_Sort_03();

    @Test
    void solutionTest1() {
        int[] citations = new int[] {3,0,6,1,5};

        int result = programmers_sort_03.solution(citations);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest2() {
        int[] citations = new int[] {3,0,6,1,5,5,6};

        int result = programmers_sort_03.solution(citations);

        assertThat(result).isEqualTo(4);
    }

}
