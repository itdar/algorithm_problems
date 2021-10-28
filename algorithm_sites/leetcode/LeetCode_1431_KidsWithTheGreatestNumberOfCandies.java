package algorithm_sites.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_1431_KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> results = new ArrayList<>();

        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                results.add(true);
            } else {
                results.add(false);
            }
        }

        return results;
    }

}
