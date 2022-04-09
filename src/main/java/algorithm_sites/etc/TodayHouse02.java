package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TodayHouse02 {

    public String solution(String call) {
        int half = call.length() / 2;

        String originCall = call;
        call = call.toLowerCase();

        List<Pattern> patterns = new ArrayList<>();

        boolean foundSame;
        for (int i = 1; i <= half; ++i) {
            for (int j = 0; j <= half; ++j) {

                String patternString = call.substring(j, j + i);
                foundSame = false;
                for (int k = 0; k < patterns.size(); ++k) {
                    Pattern pattern = patterns.get(k);
                    if (pattern.isSamePattern(patternString)) {
                        foundSame = true;
                        pattern.plusCount();
                        break;
                    }
                }

                if (!foundSame) {
                    patterns.add(new Pattern(patternString));
                }
//                System.out.println("call.substring(j, j+i) = " + call.substring(j, j+i));
            }
        }

        List<String> maxPattern = new LinkedList<>();

        for (Pattern pattern : patterns) {
            System.out.println("pattern = " + pattern);
        }

        return originCall;
    }

    static class Pattern {
        String pattern;

        @Override
        public String toString() {
            return "Pattern{" +
                "pattern='" + pattern + '\'' +
                ", count=" + count +
                '}';
        }

        int count = 1;

        public Pattern(String pattern) {
            this.pattern = pattern;
        }

        public boolean isSamePattern(String patternString) {
            return this.pattern.equals(patternString);
        }

        public void plusCount() {
            ++count;
        }
    }

}
