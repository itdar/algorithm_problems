package algorithm_sites.programmers.kit202212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_DfsBfs_05 {

    private List<String> results = new ArrayList<>();
    private boolean[] used;

    public String[] solution(String[][] tickets) {
        used = new boolean[tickets.length];

        dfs("ICN", "ICN", tickets, 0);

        Collections.sort(results);

        return results.get(0).split(" ");
    }

    private void dfs(String current, String path, String[][] tickets, int depth) {
        if (tickets.length == depth) {
            results.add(path);
            return;
        }

        for (int i = 0; i < tickets.length; ++i) {
            if (!used[i] && tickets[i][0].equals(current)) {
                used[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, depth+1);
                used[i] = false;
            }
        }
    }

}
