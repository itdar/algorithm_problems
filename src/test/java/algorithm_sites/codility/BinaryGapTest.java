package algorithm_sites.codility;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

    private BinaryGap binaryGap = new BinaryGap();

    @Test
    void binaryGapTest1() {
        int result = binaryGap.solution(9);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void binaryGapTest2() {
        int result = binaryGap.solution(15);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void binaryGapTest3() {
        int result = binaryGap.solution(1041);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void binaryGapTest4() {
        int result = binaryGap.solution(529);

        assertThat(result).isEqualTo(4);
    }

    @Test
    void binaryGapTest5() {
        int result = binaryGap.solution(328);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void binaryGapTest6() {
        int result = binaryGap.solution(51712);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void binaryGapTest7() {
        int result = binaryGap.solution(1610612737);

        assertThat(result).isEqualTo(28);
    }

}