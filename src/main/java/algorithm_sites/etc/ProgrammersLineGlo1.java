package algorithm_sites.etc;

public class ProgrammersLineGlo1 {

    public int solution(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

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
