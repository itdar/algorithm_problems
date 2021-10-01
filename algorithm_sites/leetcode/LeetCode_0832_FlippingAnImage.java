package algorithm_sites.leetcode;

public class LeetCode_0832_FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        if (image.length < 1 || image[0].length < 1) {
            return image;
        }

        int[][] result = new int[image.length][image[0].length];

        int m = 0;
        for (int i = 0; i < image.length; ++i) {
            int n = 0;
            for (int j = image[i].length - 1; j >= 0; --j) {
                if (image[i][j] == 1) {
                    result[m][n] = 0;
                } else {
                    result[m][n] = 1;
                }

                ++n;
            }
            ++m;
        }

        return result;
    }

}
