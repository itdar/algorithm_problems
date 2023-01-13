package algorithm_sites.programmers.kit202212;

public class Programmers_Greedy_03 {

    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int needLength = number.length()-k;
        int currentIndex = 0;
        int maxIndex = 0;
        while (sb.length() != number.length()-k) {
            String substring = number.substring(currentIndex, number.length()+1 - needLength);

            int index = currentIndex;
            int max = -1;
            for (int i = 0; i < substring.length(); ++i) {
                if (substring.charAt(i)-48 > max) {
                    max = substring.charAt(i)-48;
                    maxIndex = i;
                }
            }

            --needLength;
            currentIndex = index + maxIndex + 1;
            sb.append(max);
        }

        return sb.toString();
    }

}
