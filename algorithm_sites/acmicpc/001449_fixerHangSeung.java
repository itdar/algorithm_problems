package algorithm_sites.acmicpc;

import java.util.*;

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
