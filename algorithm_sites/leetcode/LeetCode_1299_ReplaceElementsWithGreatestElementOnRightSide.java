package algorithm_sites.leetcode;

public class LeetCode_1299_ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int[] results = new int[arr.length];

        int currentIndex = 0;
        for (int i = 0; i < arr.length; ++i) {
            results[i] = -1;

            for (int j = 0; j < currentIndex; ++j) {
                if (results[j] < arr[i]) {
                    results[j] = arr[i];
                }
            }

            ++currentIndex;
        }

        return results;
    }

}
