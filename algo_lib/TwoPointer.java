package algo_lib;

/**
 * 투포인터 특정 합을 갖는 부분 연속수열
 */
public class TwoPointer {
    public static int n = 5;    // 데이터 개수 n
    public static int m = 10;    // 찾으려는 부분합 m
    public static int[] arr = {2,5,3,2,5};  // 전체 수열

    public static void main(String args[]) {
        int count = 0, intervalSum = 0, end = 0;

        for (int start = 0; start < n; ++start) {
            while (intervalSum < m && end < n) {
                intervalSum += arr[end];
                end += 1;
            }

            if (intervalSum == m) {
                ++count;
            }

            intervalSum -= arr[start];
        }

        System.out.println(count);
    }

}
