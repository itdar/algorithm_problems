package algorithm_sites.leetcode;

public class LeetCode_0509_FibonacciNumber {
    private int[] numPlate;

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        numPlate = new int[n+1];
        numPlate[0] = 0;
        numPlate[1] = 1;

        int sum = 0;
        for (int i = 2; i < n+1; ++i) {
            numPlate[i] = numPlate[i-1] + numPlate[i-2];
        }

        return numPlate[n];
    }

}
