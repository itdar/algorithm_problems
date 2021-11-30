package algorithm_sites.leetcode;

import static java.lang.Math.pow;

public class LeetCode_1837_SumOfDigitsInBaseK {

    public int sumBase(int n, int k) {
        String sumBaseString = convertBaseFromDecimal(n, k);

        int sum = 0;
        for (int i = 0; i < sumBaseString.length(); ++i) {
            sum += Character.getNumericValue(sumBaseString.charAt(i));
        }

        return sum;
    }

    protected String convertBaseFromDecimal(int decimal, int newBase) {
        StringBuilder sb = new StringBuilder();

        // 1. find maximum pow value
        int powValue = findMaximumPowValue(decimal, newBase);

        // 2. iterate, while (decimal >= newBase)
        //  if (decimal >= pow(newBase, powValue))
        //   decimal -= pow(newBase, powValue)
        //   sb += powValue
        //  else
        //   sb += 0;
        int numberOfMutiply;
        while (decimal >= newBase) {
            int pow = (int) pow(newBase, powValue);

            if (decimal >= pow) {
                numberOfMutiply = findNumberOfPowValue(decimal, pow);

                decimal -= (pow * numberOfMutiply);
                sb.append(numberOfMutiply);

                --powValue;
                continue;
            }

            --powValue;
            sb.append(0);
        }

        // 3. sb += decimal
        sb.append(decimal);

        return sb.toString();
    }

    protected int findNumberOfPowValue(int decimal, int powValue) {
        return decimal / powValue;
    }

    protected int findMaximumPowValue(int decimal, int newBase) {
        int mul = newBase;
        int pow = 0;

        while (decimal >= mul) {
            mul *= newBase;
            ++pow;
        }

        return pow;
    }
}
