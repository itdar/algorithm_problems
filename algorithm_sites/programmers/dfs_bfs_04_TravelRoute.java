package algorithm_sites.programmers;

import java.util.*;

// Process
// 1. Input tickets
// 2. DFS from ICN
// 3. Return order of cities

class dfs_bfs_04_TravelRoute {

    public static void main(String[] args) {

        String[][] input = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};

        solution(input);
        
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < tickets.length; ++i) {
            String from = tickets[i][0];
            String to = tickets[i][1];

            if (!map.containsKey(from)) {
                map.put(from, new LinkedList<>());
            }

            map.get(from).add(to);
        }

        Iterator<List<String>> it = map.values().iterator();
        while (it.hasNext()) {
            Collections.sort(it.next());
        }

        Iterator<String> keyIt = map.keySet().iterator();
        it = map.values().iterator();
        while (keyIt.hasNext()) {
            String tempKey = keyIt.next();
            System.out.print(tempKey + " ");

            List<String> tempValue = map.get(tempKey);
            for (int i = 0; i < tempValue.size(); ++i) {
                System.out.print(tempValue.get(i) + " ");
            }
            System.out.println("");
        }

        
        return answer;
    }

}
