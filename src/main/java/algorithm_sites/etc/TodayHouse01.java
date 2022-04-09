package algorithm_sites.etc;

import java.util.ArrayList;
import java.util.List;

public class TodayHouse01 {

    public String[] solution(String path) {
        if (path.length() < 3 || path.length() > 100)
            return null;

        List<Navi> navis = new ArrayList<>();
        for (int i = 0; i < path.length(); ++i) {
            char directionChar = path.charAt(i);

            if (i == 0) {
                navis.add(new Navi(directionChar, 1));
                continue;
            }

            if (navis.get(navis.size()-1).directionChar != directionChar) {
                navis.add(new Navi(directionChar, 1));
                continue;
            }

            ++navis.get(navis.size()-1).count;
        }

        String[] results = new String[navis.size()-1];

        int time = 0;
        for (int i = 0; i < navis.size()-1; ++i) {
            Navi navi = navis.get(i);
            if (navi.count > 5) {
                time += (navi.count - 5);
                navi.count = 5;
            }

//            if (i == 0) {
//                results[i] = String.format("Time %s: Go straight %sm and turn %s"
//                    , time, (navi.count*100), findDirection(navi.directionChar, navis.get(i+1).directionChar));
//                time += navi.count;
//                continue;
//            }

            results[i] = String.format("Time %s: Go straight %sm and turn %s"
                , time, (navi.count*100), findDirection(navi.directionChar, navis.get(i+1).directionChar));
            time += navi.count;
        }

        return results;
    }

    class Navi {

        private final char directionChar;
        private int count;

        public Navi(char directionChar, int count) {
            this.directionChar = directionChar;
            this.count = count;
        }
    }

    private String findDirection(char direction, char newDirection) {
        if (direction == 'E') {
            if (newDirection == 'S') {
                return "RIGHT";
            } else {
                return "LEFT";
            }
        } else if (direction == 'S') {
            if (newDirection == 'W') {
                return "RIGHT";
            } else {
                return "LEFT";
            }
        } else if (direction == 'W') {
            if (newDirection == 'N') {
                return "RIGHT";
            } else {
                return "LEFT";
            }
        } else { // (direction.equals("N")) {
            if (newDirection == 'E') {
                return "RIGHT";
            } else {
                return "RIGHT";
            }
        }
    }

}
