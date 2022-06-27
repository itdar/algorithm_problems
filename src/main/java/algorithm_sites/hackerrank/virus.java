package algorithm_sites.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class virus {

    public static int solution2(int n, List<Integer> infectedHouses) {
        List<Integer> counts = new ArrayList<>();

        boolean[] infected = new boolean[n];
        for (Integer index : infectedHouses) {
            infected[index-1] = true;
        }

        while (isAll(infected)) {
            Set<Integer> newInfected = new HashSet<>();

            for (int i = 0; i < infectedHouses.size(); ++i) {
                Integer infectedIndex = infectedHouses.get(i);

                if (infectedIndex > 1 && !infected[infectedIndex-2]) {
                    newInfected.add(infectedIndex-1);
                    infected[infectedIndex-2] = true;
                }
                if (infectedIndex < n && !infected[infectedIndex]) {
                    newInfected.add(infectedIndex+1);
                    infected[infectedIndex] = true;
                }

            }
        }

        long result = 1;
        for (Integer count : counts) {
            result *= permCountOf(count, count);
        }

        return (int) result % (1_000_000_000 + 7);
    }

    public static int solution(int n, List<Integer> infectedHouses) {
        List<Integer> counts = new ArrayList<>();

        boolean[] infected = new boolean[n];
        for (Integer index : infectedHouses) {
            infected[index-1] = true;
        }

        while (infectedHouses.size() < n) {
            Set<Integer> newInfected = new HashSet<>();
//            List<Integer> founds = new ArrayList<>();

            for (int i = 0; i < infectedHouses.size(); ++i) {
                Integer infectedIndex = infectedHouses.get(i);

                if (infectedIndex > 1 && !infected[infectedIndex-2]) {
                    newInfected.add(infectedIndex-1);
                    infected[infectedIndex-2] = true;
                }
                if (infectedIndex < n && !infected[infectedIndex]) {
                    newInfected.add(infectedIndex+1);
                    infected[infectedIndex] = true;
                }

//                founds.add(i);
            }

//            for (int i = founds.size()-1; i >= 0; --i) {
//                infectedHouses.remove(founds.get(i).intValue());
//            }

            if (newInfected.size() > 0) {
                counts.add(newInfected.size());
                infectedHouses.addAll(newInfected);
            }
        }

        long result = 1;
        for (Integer count : counts) {
            result *= permCountOf(count, count);
        }

        return (int) result % (7);
    }

    public static boolean isAll(boolean[] infected) {
        for (boolean infect : infected) {
            if (infect) {
                return false;
            }
        }
        return true;
    }

    public static long permCountOf(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; ++i) {
            result *= n;
            n -= 1;
        }

        return result;
    }

}
