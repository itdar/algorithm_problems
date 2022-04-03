package algo_lib;

import java.util.LinkedList;
import java.util.List;

public class Factor {

    public List<Integer> factorsOf(int number) {
        int length = (int) Math.sqrt(number);

        List<Integer> factors = new LinkedList<>();

        for (int i = 1; i < length; ++i) {
            if (number % i == 0) {
                if (i*i != number) {
                    factors.add(i);
                }
            }
        }

        return factors;
    }

    public long sumOfSumOfFactor(int number) {
        long sum = 0;

        for (int i = 1; i <= number; ++i) {
            sum += (i * (number / i));
        }

        return sum;
    }

}
