package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Ya_3_pairwiseDistinctTest {

    private Ya_3_pairwiseDistinct ya = new Ya_3_pairwiseDistinct();

    @Test
    void solutionTest1() {
        int result = ya.solution(new int[]{1, 2, 1});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest2() {
        int result = ya.solution(new int[]{2,1,4,4});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest3() {
        int result = ya.solution(new int[]{6,2,3,5,6,3});

        assertThat(result).isEqualTo(4);
    }

    @Test
    void solutionTest4() {
        int result = ya.solution(new int[]{6,2,3,5,6,3});

        assertThat(result).isEqualTo(4);
    }
}
