package algo_lib;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public static void main(String args[]) {
        List<List<Integer>> combs = new ArrayList<>();

        int[] arr = new int[] {1,2,3,4,5};
        boolean[] visited = new boolean[arr.length];
        int r = 2;

        combination(arr, visited, 2, arr.length, r, combs);

        for (int i = 0; i < combs.size(); ++i) {
            for (int j = 0; j < combs.get(i).size(); ++j) {
                System.out.print(combs.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r, List<List<Integer>> comb) {
        if (r == 0) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    temp.add(arr[i]);
                }
            }
            comb.add(temp);
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, comb);
            visited[i] = false;
        }
    }
}
