package algo_lib;

public class MaximumSliceProblem {

    public int maxSlice(int[] a) {
        int maxEnding = 0;
        int maxSlice = 0;

        for (int i = 0; i < a.length; ++i) {
            maxEnding = Math.max(0, maxEnding + a[i]);
            maxSlice = Math.max(maxSlice, maxEnding);
        }

        return maxSlice;
    }

    public int maxSliceQuadratic(int[] a) {
        int n = a.length;
        int result = 0;
        int sum;

        for (int i = 0; i < n; ++i) {
            sum = 0;
            for (int j = i; j < n; ++j) {
                sum += a[j];
                result = Math.max(result, sum);
            }
        }

        return result;
    }

    public SliceIndexes maxSliceIndexes(int[] a) {
        int n = a.length;
        int result = 0;
        int sum;

        for (int i = 0; i < n; ++i) {
            sum = 0;
            for (int j = i; j < n; ++j) {
                sum += a[j];
                result = Math.max(result, sum);
            }
        }

        return new SliceIndexes(0, 0);
    }

    static class SliceIndexes {
        int startIndex;
        int endIndex;

        public SliceIndexes(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

}
