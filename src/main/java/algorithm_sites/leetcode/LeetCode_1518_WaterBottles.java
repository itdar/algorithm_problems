package algorithm_sites.leetcode;

public class LeetCode_1518_WaterBottles {


    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;

        int availableBottles = numBottles;
        while (availableBottles > 0) {
            count += availableBottles;

            availableBottles = numBottles / numExchange;

            numBottles = availableBottles + (numBottles % numExchange);
        }

        return count;
    }
}
