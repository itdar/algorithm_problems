package algorithm_sites.acmicpc;

import java.util.*;
import java.io.*;

class Dot {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < i+1; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}