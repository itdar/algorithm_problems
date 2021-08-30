package algorithm_sites.programmers;

// Process
// 1. Input
// 2. Find all length of empty
// 3. Get need count
// 4. Return count

public class DeployNetworkCenter {
    static int length;

    public static int solution(int n, int[] stations, int w) {
        if (n < 1) {
            return 0;
        }

        int result = 0;
        length = (w * 2 + 1);

        if (stations.length < 1) {
            return calcCountNeeded(n);
        }

        result += calcCountNeeded(stations[0] - w - 1);
        for (int i = 1; i < stations.length; ++i) {
            result += calcCountNeeded((stations[i] - w) - (stations[i-1] + w) - 1);
        }
        result += calcCountNeeded(n - (stations[stations.length-1] + w));

        return result;
    }

    private static int calcCountNeeded(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n % length == 0) {
            return n / length;
        } else {
            return n / length + 1;
        }
    }

    public static void main(String args[]) {
        int result = solution(11, new int[]{4, 11}, 1);
        System.out.println("Result should be 3 and was : " + result + "\n");

        result = solution(16, new int[]{9}, 2);
        System.out.println("Result should be 3 and was : " + result + "\n");

        result = solution(11, new int[]{}, 1);
        System.out.println("Result should be 4 and was : " + result + "\n");

        result = solution(16, new int[]{9, 14}, 2);
        System.out.println("Result should be 2 and was : " + result);
    }

}
