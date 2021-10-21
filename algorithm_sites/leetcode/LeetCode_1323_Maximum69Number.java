package algorithm_sites.leetcode;

public class LeetCode_1323_Maximum69Number {

    // refactoring 정리
    public int maximum69Number (int num) {
        int maxNum = num;

        StringBuilder number = new StringBuilder(Integer.toString(num));

        for (int i = 0; i < number.length(); ++i) {
            if (number.charAt(i) == '6') {
                number.setCharAt(i, '9');
            } else {
                number.setCharAt(i, '6');
            }

            if (Integer.parseInt(number.toString()) > maxNum) {
                maxNum = Integer.parseInt(number.toString());
            }

            if (number.charAt(i) == '6') {
                number.setCharAt(i, '9');
            } else {
                number.setCharAt(i, '6');
            }
        }

        return maxNum;
    }

}
