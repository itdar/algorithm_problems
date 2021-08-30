package algorithm_sites.etc;

public class Trenbe_01 {

    // 1. Input
    // 2. 두수의 합 abs 가장 작은 쌍
    // 3. 반환

    public static int[] solution(int[] a) {
        if (a.length < 2) {
            return null;
        }

        int first = a[0];
        int second = a[1];
        int result = Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i < a.length-1; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                temp = Math.abs(a[i] + a[j]);

                if (temp < result){
                    first = a[i];
                    second = a[j];

                    result = temp;
                }
            }
        }

        return new int[]{first, second};
    }

    public static void main(String args[]) {
        // testcase
        int[] result1 = solution(new int[]{-92, -20, -10, 40, 91});
//        int[] result2 = solution(new int[]{-92, -20});
//        int[] result3 = solution(new int[]{});
//        int[] result4 = solution(new int[]{-20,-10,10,20});

        //  -92, 91
        for (int i = 0; i< result1.length; ++i) {
            System.out.print(result1[i] + " ");
        }
    }

}
