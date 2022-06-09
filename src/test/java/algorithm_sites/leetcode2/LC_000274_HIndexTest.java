package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_000274_HIndexTest {

    @Test
    void hIndexTest1() {
        LC_000274_HIndex hIndex = new LC_000274_HIndex();

        int result = hIndex.hIndex(new int[]{3, 0, 6, 1, 5});

        assertThat(result).isEqualTo(3);
    }

    @Test
    void hIndexTest2() {
        LC_000274_HIndex hIndex = new LC_000274_HIndex();

        int result = hIndex.hIndex(new int[]{1,3,1});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void hIndexTest3() {
        LC_000274_HIndex hIndex = new LC_000274_HIndex();

        int result = hIndex.hIndex(new int[]{100});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void hIndexTest4() {
        LC_000274_HIndex hIndex = new LC_000274_HIndex();

        int result = hIndex.hIndex(new int[]{0});

        assertThat(result).isEqualTo(0);
    }

    @Test
    void hIndexTest5() {
        LC_000274_HIndex hIndex = new LC_000274_HIndex();

        int result = hIndex.hIndex(new int[]{1});

        assertThat(result).isEqualTo(1);
    }

    @Test
    void hIndexTest6() {
        LC_000274_HIndex hIndex = new LC_000274_HIndex();

        int result = hIndex.hIndex(new int[]{11,15});

        assertThat(result).isEqualTo(2);
    }

}
