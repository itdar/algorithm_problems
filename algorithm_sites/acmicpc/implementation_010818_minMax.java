package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

class MinMax {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numCount = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        long min = +1000000;
        long max = -1000000;
        long temp;
        for (int i = 0; i < numCount; ++i) {
            temp = Long.parseLong(tokenizer.nextToken());
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println(min + " " + max);
    }
}