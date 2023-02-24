package algorithm_sites.leetcode2;

public class LC_00121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int max = 0;

        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                max = Math.max(max, prices[right] - prices[left]);
                ++right;
                continue;
            }

            left = right;
            ++right;
        }

        return max;
    }

}
