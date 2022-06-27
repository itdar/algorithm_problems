package algorithm_sites.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class soccerScore {
    private static class Berona {
        private int score;
        private int index;
        private int count;

        public Berona(int score, int index) {
            this.score = score;
            this.index = index;
        }
    }

    public static List<Integer> solution(List<Integer> teamK, List<Integer> teamB) {
        int kIndex = 0;
        int bIndex = 0;

        List<Berona> beronas = new ArrayList<>();
        for (int i = 0; i < teamB.size(); ++i) {
            beronas.add(new Berona(teamB.get(i), i));
        }

        Collections.sort(teamK);
        Collections.sort(beronas, Comparator.comparingInt(o -> o.score));

        int accumulatedCount = 0;
        int currentCount = 0;

        while (bIndex < beronas.size()) {
            Berona berona = beronas.get(bIndex);

            if (kIndex >= teamK.size()) {
                accumulatedCount += currentCount;
                berona.count = accumulatedCount;
                currentCount = 0;
                ++bIndex;
                continue;
            }

            int bScore = berona.score;
            int kScore = teamK.get(kIndex);

            if (kScore <= bScore) {
                ++currentCount;
                ++kIndex;
                continue;
            }

            accumulatedCount += currentCount;
            berona.count = accumulatedCount;
            currentCount = 0;
            ++bIndex;
        }

        Collections.sort(beronas, Comparator.comparingInt(value -> value.index));
        return beronas.stream()
            .map(berona -> berona.count)
            .collect(Collectors.toList());
    }

    public static List<Integer> solution2(List<Integer> teamK, List<Integer> teamB) {
        List<Integer> results = new ArrayList<>();

        int count;
        for (Integer bScore : teamB) {
            count = 0;
            for (Integer kScore : teamK) {
                if (bScore >= kScore) {
                    ++count;
                }
            }

            results.add(count);
        }

        return results;
    }

}
