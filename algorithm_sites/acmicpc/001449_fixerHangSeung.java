package algorithm_sites.acmicpc;

import java.util.*;

// Process
// 1. Input 새는곳개수N, 테이프길이L, 새는 위치들(좌측으로부터의)
// 2. 새는 위치들 정렬한다.
// 3. 새는 곳들 전체 반복한다.
//  3.1. 테이프 길이로 최대 덮을 수 있는 범위에 포함되지 않으면, 테이프를 추가하며 센다.
// 4. 센 개수 반환한다.

class FixerHangSeung {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] locs = new int[n];
        for (int i = 0; i < n; ++i) {
            locs[i] = sc.nextInt();
        }

        Arrays.sort(locs);

        int count = 1;

        int current = locs[0] + l;
        for (int i = 1; i < locs.length; ++i) {
            if (current <= locs[i]) {
                current = locs[i] + l;
                ++count;
            } 
        }

        System.out.println(count);

        sc.close();
    }

}
