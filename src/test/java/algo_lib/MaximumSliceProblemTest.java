package algo_lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MaximumSliceProblemTest {

    private MaximumSliceProblem slicer = new MaximumSliceProblem();

    @Test
    void maxSliceTest_1() {
        int maxSlice = slicer.maxSlice(new int[]{5, -7, 3, 5, -2, 4, -1});

        assertThat(maxSlice).isEqualTo(10);
    }

    @Test
    void maxSliceQuadraticTest_1() {
        int maxSlice = slicer.maxSliceQuadratic(new int[]{5, -7, 3, 5, -2, 4, -1});

        assertThat(maxSlice).isEqualTo(10);
    }

}