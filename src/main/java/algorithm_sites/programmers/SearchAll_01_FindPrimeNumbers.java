package algorithm_sites.programmers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SearchAll_01_FindPrimeNumbers {

    private Set<Integer> primeSet = new HashSet<>();

    public int solution(String numbers) {

        boolean[] visited = new boolean[numbers.length()];
        char[] output = new char[numbers.length()];

        for (int i = 1; i <= numbers.length(); ++i) {
            permutation(numbers, output, visited, 0, numbers.length(), i);
        }

        Integer max = primeSet.stream().max(Comparator.comparingInt(o -> o)).get();

        createSieve(max);

        int count = 0;
        for (Integer integer : primeSet) {
            if (!sieve[integer]) {
                ++count;
            }
        }

        return count;
    }

    private void permutation(String arr, char[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            StringBuilder sb = new StringBuilder();

            for (char c : output) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }

            primeSet.add(Integer.parseInt(sb.toString()));

            return;
        }

        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                visited[i] = true;

                output[depth] = arr.charAt(i);
                permutation(arr, output, visited, depth + 1, n, r);

                visited[i] = false;;
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
