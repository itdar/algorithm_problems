package algorithm_sites.leetcode;

public class LeetCode_0496_NextGreaterElement1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] results = new int[nums1.length];

        for (int i = 0; i < nums1.length; ++i) {
            int nextGreater = -1;
            int max = 0;
            int j = 0;

            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    max = nums2[j];
                    break;
                }
                ++j;
            }

            while (j < nums2.length) {
                if (nums2[j] > max) {
                    nextGreater = nums2[j];
                    break;
                }
                ++j;
            }

            results[i] = nextGreater;
        }

        return results;
    }

    public static void main(String args[]) {
        LeetCode_0496_NextGreaterElement1 obj = new LeetCode_0496_NextGreaterElement1();
        int[] input1 = new int[] {2,4};
        int[] input2 = new int[] {1,2,3,4};
        int[] results = obj.nextGreaterElement(input1, input2);

        for (int result : results) {
            System.out.println(result);
        }
    }

}
