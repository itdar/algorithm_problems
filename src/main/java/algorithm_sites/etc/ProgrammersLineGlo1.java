package algorithm_sites.etc;

public class ProgrammersLineGlo1 {

    public int solution(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        /**
         * z || a 일 때, 이전의 a || z (서로 다른 것 z|a) 의 사이에 z,a 가 없는 쌍의 개수
         * z ~ a 또는 a ~ z 까지의 선을 1개로 카운팅 하기 때문에, 점의 개수에서 -1 해준다.
         */

        int count = 0;
        char prevChar = '0';
        for (int i = 0; i < s.length(); ++i) {
            if ((s.charAt(i) == 'z' || s.charAt(i) == 'a')) {
                if (s.charAt(i) != prevChar) {
                    ++count;
                }
                prevChar = s.charAt(i);
            }
        }

        return count-1;
    }

}
