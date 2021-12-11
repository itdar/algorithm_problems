package algorithm_sites.leetcode;

/**
 * Written by Gin (thesockerr@gmail.com) on 2021/12/11.
 */
public class LeetCode_1742_MaximumNumberOfBallsInABox {

    // Process
    // 1. Input low high limits
    // 2. Iterate low to high (num)
    //  2.1. Get digitSum of num
    //  2.2. Put digitSum in boxNumber
    // 3. Get maxBoxNumber
    // 4. Return
    public int countBalls(int lowLimit, int highLimit) {

        int maxBoxIndex = 0;
        int[] boxes = new int[10 * 100000];

        // 2.
        for (int i = lowLimit; i <= highLimit; ++i) {
            ++boxes[digitSum(i)];
        }

        // 3.
        int max = 0;
        for (int i = 0; i < boxes.length; ++i) {
            if (max < boxes[i]) {
                max = boxes[i];
            }
        }

        return max;
    }

    protected int digitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }
}
