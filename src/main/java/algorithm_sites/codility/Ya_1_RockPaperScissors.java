package algorithm_sites.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ya_1_RockPaperScissors {

    private static Set<Character> set = new HashSet<>();
    static {
        set.add('R');
        set.add('P');
        set.add('S');
    }

    public int solution(String G) {

        List<Integer> sumList = new ArrayList<>(3);
        int scoreSum;

        char fran;
        for (Character gio : set) {
            scoreSum = 0;

            for (int i = 0; i < G.length(); ++i) {
                fran = G.charAt(i);

                scoreSum += play(gio, fran);
            }

            sumList.add(scoreSum);
        }

        return Collections.max(sumList);
    }

    private int play(Character giovanni, Character franco) {
        if (giovanni.equals(franco)) {
            return 1;
        }

        if (franco.equals('R') && giovanni.equals('P')
            || franco.equals('S') && giovanni.equals('R')
            || franco.equals('P') && giovanni.equals('S')) {
            return 2;
        }

        return 0;
    }

}
