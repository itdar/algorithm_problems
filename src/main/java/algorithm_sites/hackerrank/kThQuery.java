package algorithm_sites.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class kThQuery {

    private static final int NO_INDEX = -1;

    public static List<Integer> solution(int X, List<Integer> arr, List<Integer> indexes) {

        List<Integer> arrXIndexes = new ArrayList<>();
        for (int i = 0; i < arr.size(); ++i) {
            if (arr.get(i) == X) {
                arrXIndexes.add(i+1);
            }
        }

        List<Integer> results = new ArrayList<>();
        for (Integer index : indexes) {
            if (index > arrXIndexes.size()) {
                results.add(NO_INDEX);
                continue;
            }

            results.add(arrXIndexes.get(index - 1));
        }

        return results;
    }

}
