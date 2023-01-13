package algorithm_sites.programmers.kit202212;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Programmers_ExhaustiveSearch_03 {

    private Set<Integer> set = new LinkedHashSet<>();

    public int solution(String numbers) {
        for (int i = 1; i <= numbers.length(); ++i) {
            permutationString(numbers, new boolean[numbers.length()], 1, i, new char[i]);
        }

        Integer max = set.stream()
            .max(Comparator.comparingInt(o -> o)).get();
        createSieve(max);

        int count = 0;
        for (Integer integer : set) {
            if (!sieve[integer]) {
                ++count;
            }
        }

        return count;
    }

    private void permutationString(String input, boolean[] visited, int depth, int length, char[] result) {
        if (depth > length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; ++i) {
                sb.append(result[i]);
            }
            set.add(Integer.parseInt(sb.toString()));
            return;
        }

        for (int i = 0; i < input.length(); ++i) {
            if (!visited[i]) {
                visited[i] = true;

                result[depth-1] = input.charAt(i);
                permutationString(input, visited, depth+1, length, result);

                visited[i] = false;
            }
        }
    }

    boolean[] sieve;
    private void createSieve(int number) {
        sieve = new boolean[number+1];
        sieve[0] = true;
        sieve[1] = true;

        for (int i = 2; i*i <= number; ++i) {
            if (!sieve[i]) {
                for (int j = i*i; j <= number; j += i) {
                    sieve[j] = true;
                }
            }
        }
    }

}
