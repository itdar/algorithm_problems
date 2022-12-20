package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class LC_00015_3SumTest {

    private LC_00015_3Sum lc = new LC_00015_3Sum();

    @Test
    public void threeSumTest1() {
        List<List<Integer>> lists = lc.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertThat(lists.get(0)).contains(-1,-1,2);
        assertThat(lists.get(1)).contains(-1,0,1);
    }

    @Test
    public void threeSumTest2() {
        List<List<Integer>> lists = lc.threeSum(new int[]{});

        assertThat(lists).isEmpty();
    }

    @Test
    public void threeSumTest3() {
        List<List<Integer>> lists = lc.threeSum(new int[]{0});

        assertThat(lists).isEmpty();
    }

}
