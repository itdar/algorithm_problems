package algorithm_sites.leetcode2;

public class LC_00167_TwoSum2_InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int frontIndex = 0;
        int rearIndex = numbers.length-1;
        int[] results = new int[2];

        boolean isFound = false;
        while (!isFound) {
            if (numbers[frontIndex] + numbers[rearIndex] == target) {
                return new int[] {frontIndex+1, rearIndex+1};
            }

            if (numbers[frontIndex] + numbers[rearIndex] > target) {
                --rearIndex;
                continue;
            }

            if (numbers[frontIndex] + numbers[rearIndex] < target) {
                ++frontIndex;
            }
        }

        return null;
    }

}
