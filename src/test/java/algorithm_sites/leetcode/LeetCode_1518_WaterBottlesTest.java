package algorithm_sites.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LeetCode_1518_WaterBottlesTest {

    @Test
    public void waterBottlesTest() {
        LeetCode_1518_WaterBottles test = new LeetCode_1518_WaterBottles();

        assertThat(test.numWaterBottles(9, 3)).isEqualTo(13);
        assertThat(test.numWaterBottles(15, 4)).isEqualTo(19);
        assertThat(test.numWaterBottles(5, 5)).isEqualTo(6);
        assertThat(test.numWaterBottles(2, 3)).isEqualTo(2);
    }

}
