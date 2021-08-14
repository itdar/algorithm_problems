package codility;

public class PrefixSum {
    public static int solution1(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < A.length; ++i) {
            if (A[i] == 0) {
                int sum = 0;
                for (int j = i; j < A.length; ++j) {
                    sum += A[j];
                }
                count += sum;
            }
        }

        return count;
    }

    public static int solution2(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int count = 0;

        int[] buffer = new int[A.length+1];

        for (int i = 1; i < A.length+1; ++i) {
            buffer[i] = buffer[i-1] + A[i-1];
        }

        for (int i = 0; i < buffer.length; ++i) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < A.length; ++i) {
            if (A[i] == 0) {
                count += buffer[A.length] - buffer[i];
            }

            if (count > 1000000000) {
                return -1;
            }
        }

        return count;
    }

    public static void main(String args[]) {
//        int result = solution1(new int[]{0, 1, 0, 1, 1});
        int result = solution2(new int[]{0, 1, 0, 1, 1});
//        int result = solution2(new int[]{0, 1, 1});

        System.out.println(result);
    }
}
