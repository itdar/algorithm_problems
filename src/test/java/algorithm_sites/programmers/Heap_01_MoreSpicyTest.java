package algorithm_sites.programmers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Heap_01_MoreSpicyTest {

    private Heap_01_MoreSpicy moreSpicy = new Heap_01_MoreSpicy();

    @Test
    void solutionTest1() {
        int result = moreSpicy.solution(new int[]{1, 2, 3, 9, 12}, 7);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest2() {
        int result = moreSpicy.solution(new int[]{12, 9, 3, 2, 1}, 7);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void solutionTest3() {
        int result = moreSpicy.solution(new int[]{6, 4, 1, 4, 7, 8, 3, 2}, 2);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest4() {
        int result = moreSpicy.solution(new int[]{4, 5, 4, 6, 4, 7}, 3);

        assertThat(result).isEqualTo(0);
    }

}