package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programmers_Greedy_06 {

    public int solution(int[][] routes) {
        List<Route> routeList = new ArrayList<>();
        for (int i = 0; i < routes.length; ++i) {
            routeList.add(new Route(routes[i][0], routes[i][1]));
        }
        routeList.sort(Comparator.comparingInt(o -> o.out));

        int count = 0;

        int currentIn = Integer.MIN_VALUE;
        for (int i = 0; i < routeList.size(); ++i) {
            int in = routeList.get(i).in;
            if (currentIn < in) {
                ++count;
                currentIn = routeList.get(i).out;
            }
        }

        return count;
    }

    private static class Route {
        private int in;
        private int out;

        public Route(int in, int out) {
            this.in = in;
            this.out = out;
        }
    }

}
