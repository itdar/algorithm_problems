package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_00001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int numI;
        for (int i = 0; i < nums.length; ++i) {
            numI = nums[i];

            if (map.containsKey(target - numI)) {
                return new int[] {map.get(target-numI), i};
            }

            map.put(numI, i);
        }

        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; ++i) {
            for (int j = i+1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        class Num {
            private final int index;
            private final int num;

            public Num(int index, int num) {
                this.index = index;
                this.num = num;
            }
        }

        List<Num> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            numList.add(new Num(i, nums[i]));
        }

        Collections.sort(numList, Comparator.comparingInt(v -> v.num));

        Num numI;
        Num numJ;
        int temp;
        for (int i = numList.size()-1; i >= 0; --i) {
            numI = numList.get(i);
            temp = target - numI.num;
            for (int j = 0; j < i; ++j) {
                numJ = numList.get(j);
                if (temp > numJ.num) continue;

                if (numJ.num == (target - numI.num)) {
                    return new int[] {numJ.index, numI.index};
                }
            }
        }

        return null;
    }

}
