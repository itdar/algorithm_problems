package algorithm_sites.codility;

public class Eleventh_01 {

    // 1. Input
    // 2. Get sum of digits
    // 3. Find after one
    // 4. Return that
    public static int solution(int N) {
        int digitSum = getSumOfDigit(N);

        while (N <= 50000) {
            if (digitSum == getSumOfDigit(++N)) {
                return N;
            }
        }

        return -1;
    }

    private static int getSumOfDigit(int n) {
        int sum = 0;

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int result1 = solution(1);
        System.out.println("10 == " + result1);

        int result2 = solution(28);
        System.out.println("37 == " + result2);

        int result3 = solution(734);
        System.out.println("743 == " + result3);

        int result4 = solution(1990);
        System.out.println("2089 == " + result4);

        int result5 = solution(1000);
        System.out.println("10000 == " + result5);
    }
}
