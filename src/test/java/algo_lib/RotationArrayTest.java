package algo_lib;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RotationArrayTest {
    private RotationArray rotationArray = new RotationArray();

    @Test
    void rotationInt1DArray0() {
        int[] result = rotationArray.rightRotation1D(new int[]{3, 8, 9, 7, 6}, 3);

        assertThat(result).containsExactly(9,7,6,3,8);
    }

    @Test
    void rotationInt1DArray1() {
        int[] result = rotationArray.rightRotation1D(new int[]{3, 8, 9, 7, 6}, 1);

        assertThat(result).containsExactly(6,3,8,9,7);
    }

    @Test
    void rotationInt1DArray2() {
        int[] result = rotationArray.rightRotation1D(new int[]{1,2,3,4}, 4);

        assertThat(result).containsExactly(1,2,3,4);
    }

    @Test
    void rotationInt1DArray3() {
        int[] result = rotationArray.rightRotation1D(new int[]{0,0,0}, 2);

        assertThat(result).containsExactly(0,0,0);
    }

    @Test
    void rotationInt1DArray4() {
        int[] result = rotationArray.rightRotation1D(new int[]{}, 4);

        assertThat(result).containsExactly();
    }

    @Test
    void rotationInt2DArray1() {
        int[][] input = new int[][] {{1,2},
                                     {3,4}};

        int[][] result = rotationArray.rightRotation2D(input, 1);

        assertThat(result[0][0]).isEqualTo(3);
        assertThat(result[0][1]).isEqualTo(1);
        assertThat(result[1][0]).isEqualTo(4);
        assertThat(result[1][1]).isEqualTo(2);
    }

    @Test
    void rotationInt2DArray2() {
        int[][] input = new int[][] {{1,2},
                                    {3,4}};

        int[][] result = rotationArray.rightRotation2D(input, 2);

        assertThat(result[0][0]).isEqualTo(4);
        assertThat(result[0][1]).isEqualTo(3);
        assertThat(result[1][0]).isEqualTo(2);
        assertThat(result[1][1]).isEqualTo(1);
    }

    @Test
    void rotationInt2DArray3() {
        int[][] input = new int[][] {{1,2},
                                    {3,4}};

        int[][] result = rotationArray.rightRotation2D(input, 3);

        assertThat(result[0][0]).isEqualTo(2);
        assertThat(result[0][1]).isEqualTo(4);
        assertThat(result[1][0]).isEqualTo(1);
        assertThat(result[1][1]).isEqualTo(3);
    }

    @Test
    void rotationInt2DArray4() {
        int[][] input = new int[][] {{1,2},
                                    {3,4}};

        int[][] result = rotationArray.rightRotation2D(input, 4);

        assertThat(result[0][0]).isEqualTo(1);
        assertThat(result[0][1]).isEqualTo(2);
        assertThat(result[1][0]).isEqualTo(3);
        assertThat(result[1][1]).isEqualTo(4);
    }

    @Test
    void rotationInt2DArray5() {
        int[][] input = new int[][] {{1,2,3},
                                    {3,4,5}};

        int[][] result = rotationArray.rightRotation2D(input, 4);

        assertThat(result[0][0]).isEqualTo(1);
        assertThat(result[0][1]).isEqualTo(2);
        assertThat(result[0][2]).isEqualTo(3);
        assertThat(result[1][0]).isEqualTo(3);
        assertThat(result[1][1]).isEqualTo(4);
        assertThat(result[1][2]).isEqualTo(5);
    }

    @Test
    void rotationInt2DArray6() {
        int[][] input = new int[][] {{1,2},
                                    {3,4},
                                    {5,6}};

        int[][] result = rotationArray.rightRotation2D(input, 4);

        assertThat(result[0][0]).isEqualTo(1);
        assertThat(result[0][1]).isEqualTo(2);
        assertThat(result[1][0]).isEqualTo(3);
        assertThat(result[1][1]).isEqualTo(4);
        assertThat(result[2][0]).isEqualTo(5);
        assertThat(result[2][1]).isEqualTo(6);
    }

    @Test
    void rotationInt2DArray7() {
        int[][] input = new int[][] {{1,2,0},
                                    {0,3,4},
                                    {5,0,6}};

        int[][] result = rotationArray.rightRotation2D(input, 2);

        assertThat(result[0][0]).isEqualTo(6);
        assertThat(result[0][1]).isEqualTo(0);
        assertThat(result[0][2]).isEqualTo(5);
        assertThat(result[1][0]).isEqualTo(4);
        assertThat(result[1][1]).isEqualTo(3);
        assertThat(result[1][2]).isEqualTo(0);
        assertThat(result[2][0]).isEqualTo(0);
        assertThat(result[2][1]).isEqualTo(2);
        assertThat(result[2][2]).isEqualTo(1);
    }

}