package algorithm_sites.codility;

import java.util.HashMap;
import java.util.Map;

public class KkoMoProblem03 {

    /**
     * 가장 긴 switching 길이를 반환한다. switching 이란,
     * 모든 짝수번째 값이 같고, 모든 홀수번째 값이 같은 것을 말한다.
     *
     * 1. 원래 전체 조합(콤비네이션) + switching 확인(맵 사용 홀짝 별도 반복문으로 최적화)
     * 2. 윈도우슬라이딩 + switching 확인(맵 사용 홀짝 별도 반복문)
     * 3. 한방향으로 가면서 memoization (맵을 사용함)
     */
    public static int solution(int[] A) {
        if (A.length == 0) return 0;
        if (A.length == 1) return 1;

        int max = 2;
        Map<String, Integer> map = new HashMap<>();
        map.put("even", A[0]);
        map.put("odd", A[1]);

        int oddSize = 1;
        int evenSize = 1;
        for (int i = 2; i < A.length; ++i) {
            if (i % 2 == 0) {
                if (!map.get("even").equals(A[i])) {
                    map.put("even", A[i]);
                    max = Math.max(max, oddSize + evenSize);
                    evenSize = 1;
                } else {
                    ++evenSize;
                }
            } else {
                if (!map.get("odd").equals(A[i])) {
                    map.put("odd", A[i]);
                    max = Math.max(max, oddSize + evenSize);
                    oddSize = 1;
                } else {
                    ++oddSize;
                }
            }
        }

        return Math.max(max, oddSize + evenSize);
    }

    private static boolean isSwitching(int[] array) {
        if (array.length <= 1) return true;

        Map<String, Integer> map = new HashMap<>();
        map.put("odd", array[0]);
        map.put("even", array[1]);

        for (int i = 2; i < array.length; i = i+2) {
            if (!map.get("odd").equals(array[i])) {
                return false;
            }
        }
        for (int i = 3; i < array.length; i = i+2) {
            if (!map.get("even").equals(array[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int result1 = solution(new int[] {3,2,3,2,3});
        System.out.println("result: " + result1 + " == 5");

        int result2 = solution(new int[] {7,4,-2,4,-2,-9});
        System.out.println("result: " + result2 + " == 4");

        int result3 = solution(new int[] {7,-5,-5,-5,7,-1,7});
        int result4 = solution(new int[] {4});
        int result5 = solution(new int[] {});
        int result6 = solution(new int[] {3,2,3,2});
        int result7 = solution(new int[] {3,2,3});
        int result8 = solution(new int[] {3,2});

        System.out.println("result: " + result3 + " == 3");
        System.out.println("result: " + result4 + " == 1");
        System.out.println("result: " + result5 + " == 0");
        System.out.println("result: " + result6 + " == 4");
        System.out.println("result: " + result7 + " == 3");
        System.out.println("result: " + result8 + " == 2");

//        System.out.println(isSwitching(new int[]{3,2,3,2,3}));
//        System.out.println(isSwitching(new int[]{7,4,-2,4,-2,-9}));
//        System.out.println(isSwitching(new int[]{7,-5,-5,-5,7,-1,7}));
//        System.out.println(isSwitching(new int[]{4}));
//        System.out.println(isSwitching(new int[]{}));
//        System.out.println(isSwitching(new int[]{3,2,3,2}));
//        System.out.println(isSwitching(new int[]{3,2,3}));
//        System.out.println(isSwitching(new int[]{3,2}));
    }
}
