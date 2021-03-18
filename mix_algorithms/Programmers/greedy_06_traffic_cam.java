// Process
// 1. Input routes (in, out) array
// 2. Make routeList and sort using out position
// 3. Iterate all
//  3.1. Check if i's in position is before current picked out position
//   3.1.1. If not -> change out position to i's out position, and add cameraCount
// 4. Return cameraCount

import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int cameraCount = 0;
        
        // 2.
        List<Route> routesList = new ArrayList<>();
        for (int i = 0; i < routes.length; ++i)
            routesList.add(new Route(routes[i][0], routes[i][1]));
        Collections.sort(routesList);

        // 3.
        int out = -30000;
        for (int i = 0; i < routesList.size(); ++i) {
            if (routesList.get(i).in > out) {
                ++cameraCount;
                out = routesList.get(i).out;
            }
        }

        return cameraCount;
    }
}

class Route implements Comparable<Route> {
    int in;
    int out;

    public Route(int in, int out) {
        this.in = in;
        this.out = out;
    }

    @Override
    public int compareTo(Route cmp) {
        if (this.out > cmp.out)
            return 1;
        else
            return -1;
    }
}