package algorithm_sites.leetcode2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LC_00121_BestTimeToBuyAndSellStockTest {

    private LC_00121_BestTimeToBuyAndSellStock lc = new LC_00121_BestTimeToBuyAndSellStock();

    @Test
    void solutionTest1() {
        assertThat(lc.maxProfit(new int[] {7,1,5,3,6,4})).isEqualTo(5);
    }
    @Test
    void solutionTest2() {
        assertThat(lc.maxProfit(new int[] {7,6,4,3,1})).isEqualTo(0);
    }

}
