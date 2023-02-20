package algorithm_sites.leetcode2;

public class LC_00704_BinarySearch {

    public int search(int[] nums, int target) {
        int front = 0;
        int rear = nums.length-1;
        int mid = (front + rear) / 2;

        while (front <= rear) {
            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                front = mid + 1;
                mid = (front + rear) / 2;
                continue;
            }

            if (target < nums[mid]) {
                rear = mid - 1;
                mid = (front + rear) / 2;
            }
        }

        return -1;
    }

}
