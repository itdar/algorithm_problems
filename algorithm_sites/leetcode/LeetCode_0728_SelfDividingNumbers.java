package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0728_SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<>();

        while (left <= right) {
            if (isSelfDividingNumber(left)) {
                numbers.add(left);
            }

            ++left;
        }

        return numbers;
    }

    private boolean isSelfDividingNumber(int number) {
        int origin = number;

        while (number > 0) {
            int remainder = number % 10;
            number /= 10;

            if (remainder == 0) {
                return false;
            }

            if (origin % remainder != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

    }

}
