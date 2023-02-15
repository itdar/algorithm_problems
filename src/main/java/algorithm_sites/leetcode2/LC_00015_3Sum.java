package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_00015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int front;
        int rear;
        for (int i = 0; i < nums.length-2; ++i) {
            if (i == 0 || (nums[i] != nums[i - 1])) {
                front = i+1;
                rear = nums.length-1;

                while (front < rear) {
                    if (nums[i] + nums[front] + nums[rear] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[front]);
                        temp.add(nums[rear]);
                        result.add(temp);
                        while (front < rear && nums[front] == nums[front+1]) {
                            ++front;
                        }
                        while (front < rear && nums[rear] == nums[rear-1]) {
                            --rear;
                        }
                        ++front;
                        --rear;
                        continue;
                    }

                    if (nums[i] + nums[front] + nums[rear] > 0) {
                        --rear;
                    }

                    if (nums[i] + nums[front] + nums[rear] < 0) {
                        ++front;
                    }
                }
            }
        }

        return result;
    }

}
