package algorithm_sites.leetcode;

import java.util.*;

public class LC_00001_TowSum {

    public int[] twoSum_1(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0,1};
        }

        for (int i = 0; i < nums.length-1; ++i) {
            for (int j = i+1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    public int[] twoSum_2(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0,1};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target-nums[i])) {
                if (map.get(target-nums[i]) != i) {
                    return new int[] {map.get(target-nums[i]), i};
                }
            }
        }

        return null;
    }

    public int[] twoSum_3(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0,1};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target-nums[i])) {
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String args[]) {
        LC_00001_TowSum lc = new LC_00001_TowSum();

        int[] result = lc.twoSum_3(new int[]{3, 2, 4}, 6);

        for (int i = 0; i < result.length; ++i) {
            System.out.print(result[i] + " ");
        }
    }

}

