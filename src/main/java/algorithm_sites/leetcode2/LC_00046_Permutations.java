package algorithm_sites.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC_00046_Permutations {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int r = nums.length;

        int[] output = new int [n];
        boolean[] visited = new boolean [n];

        permutation(nums, output, visited,0, n, r);

        return result;
    }

    private void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            List<Integer> intList = new ArrayList<>(output.length);
            for (int i : output) {
                intList.add(i);
            }

            result.add(intList);

//            result.add(Arrays.stream(output)
//                .boxed()
//                .collect(Collectors.toList()));
            return;
        }

        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                visited[i] = true;

                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r);

                visited[i] = false;;
            }
        }
    }

}
