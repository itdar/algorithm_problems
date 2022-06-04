package algorithm_sites.programmers;

public class KkoBlind2018_SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < answer.length; ++i) {
            StringBuilder sb = new StringBuilder();
            String arr1String = String.format("%0" + n + "d", Long.parseLong(Long.toString(arr1[i], 2)));
            String arr2String = String.format("%0" + n +"d", Long.parseLong(Long.toString(arr2[i], 2)));

            for (int j = 0; j < arr1String.length(); ++j) {
                if (arr1String.charAt(j) == '1' || arr2String.charAt(j) == '1') {
                    sb.append("#");
                    continue;
                }

                sb.append(" ");

            }
            answer[i] = sb.toString();
        }

        return answer;
    }

}
