package leetcode;

public class LeetCode_0852_PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int peakIndex = 0;
        int peak = -1;

        for (int i = 0; i < arr.length; ++i) {
            if (peak < arr[i]) {
                peak = arr[i];
                peakIndex = i;
            }

            if (peak > arr[i]) {
                break;
            }
        }

        return peakIndex;
    }

}
