package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_Sort_02Test {

    private Programmers_Sort_02 programmers_sort_02 = new Programmers_Sort_02();

    @Test
    void solutionTest1() {
        int[] numbers = new int[] {6, 10, 2};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("6210");
    }
    @Test
    void solutionTest2() {
        int[] numbers = new int[] {3, 30, 34, 5, 9};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("9534330");
    }
    @Test
    void solutionTest3() {
        int[] numbers = new int[] {3, 30, 34, 34441, 344445};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("3444453444134330");
    }
    @Test
    void solutionTest4() {
        int[] numbers = new int[] {1,2,3,4,5,11};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("5432111");
    }
    @Test
    void solutionTest5() {
        int[] numbers = new int[] {1,2,3,4,5,0,0,2};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("54322100");
    }
    @Test
    void solutionTest6() {
        int[] numbers = new int[] {0,0,0,0};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("0");
    }
    @Test
    void solutionTest7() {
        int[] numbers = new int[] {0,0,0,0,1};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("10000");
    }
    @Test
    void solutionTest8() {
        int[] numbers = new int[] {809,908};

        String result = programmers_sort_02.solution(numbers);

        assertThat(result).isEqualTo("908809");
    }

}
