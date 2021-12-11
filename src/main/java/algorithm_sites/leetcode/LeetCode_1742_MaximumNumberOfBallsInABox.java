package algorithm_sites.leetcode;

/**
 * Written by Gin (thesockerr@gmail.com) on 2021/12/11.
 */
public class LeetCode_1742_MaximumNumberOfBallsInABox {
    int[] boxes = new int[10 * 100000];

    // Process
    // 1. Input low high limits
    // 2. Iterate low to high (num)
    //  2.1. Get digitSum of num
    //  2.2. Put digitSum in boxNumber
    // 3. Get maxBoxNumber
    // 4. Return
    public int countBalls(int lowLimit, int highLimit) {
        // 2.
        fillTheBoxes(lowLimit, highLimit);

        // 3. / 4.
        return findMaxNumberOfMaxCountBox();
    }

    private void fillTheBoxes(int lowLimit, int highLimit) {
        for (int i = lowLimit; i <= highLimit; ++i) {
            ++boxes[digitSum(i)];
        }
    }

    private int findMaxNumberOfMaxCountBox() {
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
