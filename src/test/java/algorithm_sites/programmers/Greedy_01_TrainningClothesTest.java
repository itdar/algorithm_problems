package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Greedy_01_TrainningClothesTest {

    private Greedy_01_TrainningClothes test;

    @BeforeEach
    void setUp() {
        test = new Greedy_01_TrainningClothes();
    }

    @Test
    void solutionTest1() {
        int result = test.solution(5, new int[]{2, 4}, new int[]{1, 3, 4});

        assertThat(result).isEqualTo(5);
    }

    @Test
    void solutionTest2() {
        int result = test.solution(5, new int[]{2,4}, new int[]{3});

        assertThat(result).isEqualTo(4);
    }

    @Test
    void solutionTest3() {
        int result = test.solution(3, new int[]{3}, new int[]{1});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest4() {
        int result = test.solution(3, new int[]{1}, new int[]{3});

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest5() {
        int result = test.solution(5, new int[]{1,2,3}, new int[]{4,5});

        assertThat(result).isEqualTo(3);
    }

}