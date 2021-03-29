package acmicpc;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; ++i)
            times[i] = scanner.nextInt();
        
        int minTime = -1;
        int timeSpent;
        
        if (times.length > 0) {
            Arrays.sort(times);
            minTime = times[0];
            timeSpent = times[0];
            for (int i = 1; i < times.length; ++i) {
                timeSpent += times[i];
                minTime += timeSpent;
            }
        }
        
        System.out.println(minTime);
    }
}