package algo_lib.permutation_combination;

public class CombinationExample {

    static int num = 0;

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        int r = 2;

        int[] output = new int [n];
        boolean[] visited = new boolean [n];

        //조합 (순서 중요하지 않음, (1,2 == 2,1) )
        System.out.println("*** 조합(1,2,3) 중 r ***");
        combination(arr, output, visited, 0, n, r, 0);

        num = 0;

        //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
        System.out.println("*** 중복조합(1,2,3) 중 r ***");
        reCombination(arr, output, 1, n, r, 0);
    }

    //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
    private static void reCombination(int[] arr, int[] output, int start, int n, int r, int depth) {
        if (depth == r) {
            for(int i = 0 ; i < r; ++i) {
                System.out.print(output[i]+" ");
            }
            ++num;
            System.out.println(": " + num + "번째");

            return;
        }

        for (int i = start-1; i < n; ++i) {
            output[depth] = arr[i];
            reCombination(arr, output, i + 1, n, r, depth +1);
        }
    }

    //조합 (순서관심없고 뽑은 유무만 생각)
    private static void combination(int[] arr, int[] output, boolean[] visited, int start, int n, int r, int depth) {
        if (depth == r) {
            for(int i = 0 ; i < r; ++i) {
                System.out.print(output[i]+" ");
            }
            ++num;
            System.out.println(": " + num + "번째");

            return;
        }

        for (int i = start; i < n; ++i) {
            if (!visited[i]) {
                visited[i] = true;

                output[depth] = arr[i];
                combination(arr, output, visited, i + 1, n, r, depth +1);

                visited[i] = false;;
            }
        }
    }

}
