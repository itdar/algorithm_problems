package algorithm_sites.programmers.kit202212;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Programmers_StackQueue_05Test {

    private Programmers_StackQueue_05 programmers_stackQueue_05 = new Programmers_StackQueue_05();

    @Test
    void solutionTest1() {
        int bridgeLength = 2;
        int weight = 10;
        int[] truckWeights = new int[] {7,4,5,6};

        int result = programmers_stackQueue_05.solution(bridgeLength, weight, truckWeights);

        assertThat(result).isEqualTo(8);
    }
    @Test
    void solutionTest2() {
        int bridgeLength = 100;
        int weight = 100;
        int[] truckWeights = new int[] {10};

        int result = programmers_stackQueue_05.solution(bridgeLength, weight, truckWeights);

        assertThat(result).isEqualTo(101);
    }
    @Test
    void solutionTest3() {
        int bridgeLength = 100;
        int weight = 100;
        int[] truckWeights = new int[] {10,10,10,10,10,10,10,10,10,10};

        int result = programmers_stackQueue_05.solution(bridgeLength, weight, truckWeights);

        assertThat(result).isEqualTo(110);
    }

}
