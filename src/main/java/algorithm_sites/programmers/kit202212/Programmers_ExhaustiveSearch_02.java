package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.List;

public class Programmers_ExhaustiveSearch_02 {

    public int[] solution(int[] answers) {
        int[] su1 = new int[] {1,2,3,4,5};
        int[] su2 = new int[] {2,1,2,3,2,4,2,5};
        int[] su3 = new int[] {3,3,1,1,2,2,4,4,5,5};

        List<Integer> hits = new ArrayList<>();
        hits.add(0);
        hits.add(0);
        hits.add(0);
        int su1Index = 0;
        int su2Index = 0;
        int su3Index = 0;
        for (int i = 0; i < answers.length; ++i) {
            if (su1[su1Index] == answers[i]) {
                hits.set(0, hits.get(0) + 1);
            }
            if (su2[su2Index] == answers[i]) {
                hits.set(1, hits.get(1) + 1);
            }
            if (su3[su3Index] == answers[i]) {
                hits.set(2, hits.get(2) + 1);
            }

            ++su1Index;
            if (su1Index >= su1.length) {
                su1Index = 0;
            }
            ++su2Index;
            if (su2Index >= su2.length) {
                su2Index = 0;
            }
            ++su3Index;
            if (su3Index >= su3.length) {
                su3Index = 0;
            }
        }

        int max = hits.stream()
            .mapToInt(value -> value)
            .max().orElse(0);

        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < hits.size(); ++i) {
            if (hits.get(i) == max) {
                results.add(i+1);
            }
        }

        return results.stream()
            .mapToInt(value -> value)
            .toArray();
    }

}
