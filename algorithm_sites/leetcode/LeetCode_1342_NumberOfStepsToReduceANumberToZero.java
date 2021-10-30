package algorithm_sites.leetcode;

public class LeetCode_1342_NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {

            num = reduceNumber(num);
            ++count;
        }

        return count;
    }

    private int reduceNumber(int num) {
        if (num % 2 == 0) {
            num /= 2;
        } else {
            num -= 1;
        }

        return num;
    }

}
