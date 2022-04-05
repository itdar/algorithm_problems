package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StoneWallTest {

    private StoneWall stoneWall = new StoneWall();

    @Test
    void solutionTest1() {
        int result = stoneWall.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});

        assertThat(result).isEqualTo(7);
    }

    @Test
    void solutionTest2() {
        int result = stoneWall.solution(new int[]{3,2,1});

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest3() {
        int result = stoneWall.solution(new int[]{1});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest4() {
        int result = stoneWall.solution(new int[]{1,2,3,2,1});

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest5() {
        int result = stoneWall.solution(new int[]{1,9,1,9,1});

        assertThat(result).isEqualTo(3);
    }

    @Test
    void solutionTest6() {
        int result = stoneWall.solution(new int[]{1,1,1,1});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionTest7() {
        int result = stoneWall.solution(new int[]{2, 5, 1, 4, 6, 7, 9, 10, 1});

        assertThat(result).isEqualTo(8);
    }

}