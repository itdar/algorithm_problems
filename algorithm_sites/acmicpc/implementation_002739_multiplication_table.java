package algorithm_sites.acmicpc;

import java.io.*;
import java.util.*;

class MultiplicationTable {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 9; ++i) {
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
