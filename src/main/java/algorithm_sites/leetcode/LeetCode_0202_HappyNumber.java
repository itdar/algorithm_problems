package algorithm_sites.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_0202_HappyNumber {

    boolean isHappy(int n) {
        int sumOfSquaresOfDigits = n;

        Set<Integer> set = new HashSet<>();

        while (sumOfSquaresOfDigits != 1 && !set.contains(sumOfSquaresOfDigits)) {
            set.add(sumOfSquaresOfDigits);

            sumOfSquaresOfDigits = getSumOfSquaresOfDigits(sumOfSquaresOfDigits);
        }

        return (sumOfSquaresOfDigits == 1);
    }

    private int getSumOfSquaresOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += Math.pow((number % 10), 2);
            number /= 10;
        }

        return sum;
    }

}
