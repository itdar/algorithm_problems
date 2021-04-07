package algorithm_sites.acmicpc;

import java.util.*;

class DotStart2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; ++i) {
            for (int j = 0; j < N-i; ++j) {
                System.out.print(" ");
            }
            for (int j = N-i; j < N; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}