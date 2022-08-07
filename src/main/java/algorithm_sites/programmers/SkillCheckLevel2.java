package algorithm_sites.programmers;

import java.util.Arrays;

public class SkillCheckLevel2 {

    public String solution1(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] words = s.split(" ");
        for (String word : words) {
            int anInt = Integer.parseInt(word);
            max = Math.max(max, anInt);
            min = Math.min(min, anInt);
        }

        return min + " " + max;
    }

    public int[] solution2(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        int idx = 0;

        long length = right - left;
        for (long i = left; i <= left+length; ++i) {
            int x = (int)(i / n);
            int y = (int)(i % n);

            if (x <= y) {
                answer[idx] = y+1;
            } else {
                answer[idx] = x+1;
            }

            ++idx;
        }

//        for (int i = 0; i < n; ++i) {
//            for (int j = 0; j < n; ++j) {
//                if (i*n + j >= left && i*n + j <= right) {
//                    if (i <= j) {
//                        answer[idx] = j+1;
//                    } else {
//                        answer[idx] = i+1;
//                    }
//                    ++idx;
//                }
//            }
//        }

        return answer;
    }

}
