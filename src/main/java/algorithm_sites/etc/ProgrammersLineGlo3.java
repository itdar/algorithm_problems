package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersLineGlo3 {

    private int count = 0;

    public int solution(int n, int[] bankbook) {
        Arrays.sort(bankbook);

        count = bankbook.length;
        int frontIndex = 0;
        for (int i = bankbook.length-1; i >= 0 && i > frontIndex; --i) {
            if (bankbook[frontIndex] + bankbook[i] <= n) {
                --count;
                ++i;
                ++frontIndex;
            }
        }

        return count;
    }

//    public int solution2(int n, int[] bankbook) {
//        if (bankbook.length == 1) {
//            return bankbook.length;
//        }
//
//        added = new boolean[bankbook.length];
//        for (int i = 0; i < bankbook.length; ++i) {
//            added[i] = true;
//            dfs(bankbook[i], n, bankbook, i);
//            added[i] = true;
//        }
//
//        int min = Integer.MAX_VALUE;
//        for (Integer result : results) {
//            min = Math.min(min, result);
//        }
//        return min;
//    }
//
//    private void dfs(int money, int max, int[] bankbook, int i) {
//        if (money > max || i >= bankbook.length) {
//            results.add(count);
//            return;
//        }
//
//        for (int j = 0; j < bankbook.length; ++j) {
//            if (!added[j] && i!=j && money + bankbook[j] <= max) {
//                added[j] = true;
//                dfs(money + bankbook[j], max, bankbook, j);
//                added[j] = false;
//            }
//        }
//    }

}
