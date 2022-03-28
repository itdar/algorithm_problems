package algorithm_sites.programmers;

public class Greedy_02_MakeBiggestNumber {

    public String solution(String number, int k) {
        if (number == null || number.isEmpty()) {
            return number;
        }

        if (number.length() <= k) {
            return "";
        }

        int startIndex = 0;
        int endIndex = number.length() - (number.length() - k);
        StringBuilder sb = new StringBuilder();

        while (sb.length() != number.length() - k) {
            if (endIndex >= number.length()) {
                endIndex = number.length();
            }

            String substring = number.substring(startIndex, endIndex+1);

            int maxIndex = maximumIntIndexInString(substring);

            sb.append(substring.charAt(maxIndex));

            startIndex = startIndex + maxIndex + 1;
            ++endIndex;
        }

        return sb.toString();
    }

    private int maximumIntIndexInString(String string) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < string.length(); ++i) {
            if (max < Character.getNumericValue(string.charAt(i))) {
                max = Character.getNumericValue(string.charAt(i));
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
