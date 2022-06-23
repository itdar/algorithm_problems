package algo_lib.permutation_combination;

public class PermutationExample {
    static int num = 0;

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        int r = 4;

        int[] output = new int [n];
        boolean[] visited = new boolean [n];

        //순열 (순서가 중요함, 순서가 영향을 끼침 (1,2 != 2,1) )
        System.out.println("*** 배열 중에 r 개 순열 ***");
        permutation(arr, output, visited, 0, n, r);

        num = 0;

        //중복순열 (순서있게 배열 + 자기자신도 포함)
        System.out.println("*** 배열 중에 r 개 중복순열 ***");
        rePermutation(arr, output, 0, n, r);
    }

    //중복순열 (순서있게 배열 + 자기자신도 포함)
    private static void rePermutation(int[] arr, int[] output, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0 ; i < r; ++i) {
                System.out.print(output[i] + " ");
            }
            ++num;
            System.out.println(": " + num + "번째");

            return;
        }

        for (int i = 0; i < n; ++i) {
            output[depth] = arr[i];
            rePermutation(arr, output, depth + 1, n, r);
        }
    }

    //순열 (순서있게 배열, 자기자신 중복금지)
    private static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0 ; i < r; ++i) {
                System.out.print(output[i] + " ");
            }
            ++num;
            System.out.println(": " + num + "번째");

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
