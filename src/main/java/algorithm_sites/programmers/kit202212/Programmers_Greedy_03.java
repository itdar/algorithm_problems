package algorithm_sites.programmers.kit202212;

public class Programmers_Greedy_03 {

    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int stdLength = number.length()-k;
        int currentIndex = 0;
        while (sb.length() < number.length()-k) {
            String substring = number.substring(currentIndex, number.length() - stdLength+1);

            int max = -1;
            for (int i = 0; i < substring.length(); ++i) {
                if (number.charAt(i) - 48 > max) {
                    currentIndex = currentIndex+i+1;
                    max = number.charAt(i) - 48;
                }
            }

            sb.append(max);
        }

        return sb.toString();
    }

}
