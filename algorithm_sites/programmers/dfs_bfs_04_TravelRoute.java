package algorithm_sites.programmers;

import java.util.*;

// DFS 문제에서 backtracking인 것은 알았는데, stack으로 푸려다가 며칠간 고통받다가 그냥 재귀로 품

// Process
// 1. Input tickets, make map<공항이름, 연결된 공항이름들 리스트>
// 2. Sort adjacents (알파벳순으로 들러서 먼저 나오는 것을 찾아가도록)
// 3. DFS, backtracking. Start from ICN
// 4. Return order of cities

class dfs_bfs_04_TravelRoute {

    public static void main(String[] args) {

        // String[][] input = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        // String[][] input = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"},
        //                     {"ATL", "ICN"}, {"ATL", "SFO"} };

        String[][] input = {{"ICN", "COO"}, {"ICN", "BOO"}, {"COO", "ICN"}, {"BOO", "DOO"}};

        String[] answer = solution(input);

        System.out.println("");
        for (int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i] + " ");
        }System.out.println("");
        
    }

    static int totalCount;
    static Map<String, List<String>> map = new HashMap<>();

    public static String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];

        totalCount = tickets.length;
        
        for (int i = 0; i < tickets.length; ++i) {
            String from = tickets[i][0];
            String to = tickets[i][1];

            if (!map.containsKey(from)) {
                map.put(from, new ArrayList<>());
            }
            if (!map.containsKey(to)) {
                map.put(to, new ArrayList<>());
            }
            map.get(from).add(to);
        }

        Iterator<List<String>> iter = map.values().iterator();
        while (iter.hasNext()) {
            Collections.sort(iter.next());
        }
        
        List<String> order = new ArrayList<>();
        dfs("ICN", order, 1);

        for (int i = 0; i < order.size(); ++i) {
            answer[i] = order.get(i);
        }
        return answer;
    }

    public static boolean dfs(String from, List<String> order, int depth) {
        order.add(from);

        if (order.size() == totalCount+1) {
            // System.out.println("=========Found");
            return true;
        }

        List<String> adjacents = map.get(from);
        for (int i = 0; i < adjacents.size(); ++i) {
            String temp = adjacents.remove(i);

            if (!dfs(temp, order, depth+1)) {
                adjacents.add(i, temp);
                order.remove(order.size()-1);
            } else {
                return true;
            }
        }
        return false;
    }

}
